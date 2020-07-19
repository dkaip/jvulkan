/*
 * Copyright 2019 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.Wayland.Objects;

import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceMove;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfacePong;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceResize;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceSetClass;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceSetFullscreen;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceSetMaximized;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceSetPopup;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceSetTitle;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceSetTopLevel;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellSurfaceSetTransient;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.EnumSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceFullscreenMethod;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceResize;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceTransientBehavior;
import com.CIMthetics.jvulkan.Wayland.Handles.WlOutputHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSeatHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellSurfaceHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlShellSurface extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlShellSurface.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();

    public WlShellSurface(WlShellSurfaceHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    

    public void pong(int serialNumber)
    {
        log.debug("Sending PONG response to PING.");
        wlShellSurfacePong((WlShellSurfaceHandle)getHandle(), serialNumber);
    }
    
    public void move(WlSeat seat, int serialNumber)
    {
        wlShellSurfaceMove((WlShellSurfaceHandle)getHandle(), (WlSeatHandle)seat.getHandle(), serialNumber);
    }
    
    public void resize(WlSeat seat, int serialNumber, WlShellSurfaceResize edges)
    {
        wlShellSurfaceResize((WlShellSurfaceHandle)getHandle(), (WlSeatHandle)seat.getHandle(), serialNumber, edges);
    }
    
    public void setTopLevel()
    {
        wlShellSurfaceSetTopLevel((WlShellSurfaceHandle)getHandle());
    }
    
    public void setTransient(WlSurface parentSurface, int x, int y, EnumSet<WlShellSurfaceTransientBehavior> flags)
    {
        wlShellSurfaceSetTransient(
                (WlShellSurfaceHandle)getHandle(),
                (WlSurfaceHandle)parentSurface.getHandle(),
                x,
                y,
                flags);
    }
    
    public void setFullScreen(WlShellSurfaceFullscreenMethod method, int framerate, WlOutput output)
    {
        if (output == null)
        {
            wlShellSurfaceSetFullscreen(
                    (WlShellSurfaceHandle)getHandle(),
                    method,
                    framerate,
                    null);
        }
        else
        {
            wlShellSurfaceSetFullscreen(
                    (WlShellSurfaceHandle)getHandle(),
                    method,
                    framerate,
                    (WlOutputHandle)output.getHandle());
        }
    }
    
    public void setMaximized(WlOutput output)
    {
        if (output == null)
        {
            wlShellSurfaceSetMaximized(
                    (WlShellSurfaceHandle)getHandle(),
                    null);
        }
        else
        {
            wlShellSurfaceSetMaximized(
                    (WlShellSurfaceHandle)getHandle(),
                    (WlOutputHandle)output.getHandle());
        }
    }
    
    public void setPopup(WlSeat seat, int serialNumber, WlSurface parentSurface, int x, int y, EnumSet<WlShellSurfaceTransientBehavior> flags)
    {
        wlShellSurfaceSetPopup(
                (WlShellSurfaceHandle)getHandle(),
                (WlSeatHandle)seat.getHandle(),
                serialNumber,
                (WlSurfaceHandle)parentSurface.getHandle(),
                x,
                y,
                flags);
    }
    
    public void setTitle(String title)
    {
        byte[] rawData = null;
        // Title must be UTF-8
        ByteBuffer utf8Data = StandardCharsets.UTF_8.encode(title);
        log.debug("utf8Data limit {}", utf8Data.limit());
        if (utf8Data.hasArray() == true)
        {
            rawData = utf8Data.array();
        }
        else
        {
            rawData = new byte[utf8Data.remaining()];
            utf8Data.get(rawData);
        }
        
        wlShellSurfaceSetTitle((WlShellSurfaceHandle)getHandle(), rawData);
    }
    
    public void setClass(String surfaceClass)
    {
        wlShellSurfaceSetClass((WlShellSurfaceHandle)getHandle(), surfaceClass);
    }
    
    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        WlShellSurfaceEvents event = (WlShellSurfaceEvents)eventObject;

        log.debug("Processing {} event.", event.getEventType());
        switch(event.getEventType())
        {
            case PING:
                int serialNumber = event.getSerialNumber();
                pong(serialNumber);
                break;
            case CONFIGURE:
                WlShellSurfaceResize edges = event.getEdges();
                int width = event.getWidth();
                int height = event.getHeight();
                log.debug("Configure event received. Edges {}, Width {}, Height {}", edges.toString(), width, height);
                break;
            case POPUP_DONE:
                log.debug("POPUP DONE");
                break;
            default:
                log.error("Unhandled case of {}." , event.getEventType().toString());
                break;
        }
    }
    
    @Override
    public WlShellSurfaceHandle getHandle()
    {
        return (WlShellSurfaceHandle)handle;
    }
}
