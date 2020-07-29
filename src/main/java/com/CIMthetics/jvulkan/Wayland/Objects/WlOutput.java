/*
 * Copyright 2019-2020 Douglas Kaip
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

import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputMode;
import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputSubpixel;
import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputTransform;
import com.CIMthetics.jvulkan.Wayland.Handles.WlOutputHandle;

public class WlOutput extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlOutput.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();
    private AtomicBoolean dataUpdateComplete = new AtomicBoolean(false);
    private WlOutputData localData = new WlOutputData();

    public WlOutput(WlOutputHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    

    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        WlOutputEvents event = (WlOutputEvents)eventObject;

        log.debug("Processing {} event.", event.getEventType());
        switch(event.getEventType())
        {
            case GEOMETRY:
                localData.x                 = event.getOutputData().x;
                localData.y                 = event.getOutputData().y;
                localData.physicalWidth     = event.getOutputData().physicalWidth;
                localData.physicalHeight    = event.getOutputData().physicalHeight;
                localData.subpixel          = event.getOutputData().subpixel;
                localData.make              = event.getOutputData().make;
                localData.model             = event.getOutputData().model;
                localData.transform         = event.getOutputData().transform;
                dataUpdateComplete.set(false);
                break;
            case MODE:
                localData.flags     = event.getOutputData().flags;
                localData.width     = event.getOutputData().width;
                localData.height    = event.getOutputData().height;
                localData.refresh   = event.getOutputData().refresh;
                dataUpdateComplete.set(false);
                break;
            case DONE:
                dataUpdateComplete.set(true);
                break;
            case SCALE:
                localData.scaleFactor = event.getOutputData().scaleFactor;
                dataUpdateComplete.set(false);
                break;
            default:
                log.error("Unhandled case of {}." , event.getEventType().toString());
                break;
        }
    }

    public int getX()
    {
        return localData.x;
    }
    
    public int getY()
    {
        return localData.y;
    }
    
    public int getPhysicalWidth()
    {
        return localData.physicalWidth;
    }
    
    public int getPhysicalHeight()
    {
        return localData.physicalHeight;
    }
    
    public WlOutputSubpixel getSubpixel()
    {
        return localData.subpixel;
    }
    
    public String getMake()
    {
        return localData.make;
    }
    
    public String getModel()
    {
        return localData.model;
    }
    
    public WlOutputTransform getTransform()
    {
        return localData.transform;
    }
    
    public EnumSet<WlOutputMode> getFlags()
    {
        return localData.flags;
    }
    
    public int getWidth()
    {
        return localData.width;
    }
    
    public int getHeigth()
    {
        return localData.height;
    }
    
    public int getRefresh()
    {
        return localData.refresh;
    }
    
    public int getScaleFactor()
    {
        return localData.scaleFactor;
    }
    
    public boolean getDataUpdateComplete()
    {
        return dataUpdateComplete.get();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nWlOutput\n"));
        sb.append(String.format("    updateComplete:%b\n", dataUpdateComplete.get()));
        sb.append(String.format("    x:%d\n", localData.x));
        sb.append(String.format("    y:%d\n", localData.y));
        sb.append(String.format("    physicalWidth:%d\n", localData.physicalWidth));
        sb.append(String.format("    physicalHeight:%d\n", localData.physicalHeight));
        sb.append(String.format("    subpixel:%s\n", localData.subpixel == null ? "null" : localData.subpixel.toString()));
        sb.append(String.format("    make:%s\n", localData.make));
        sb.append(String.format("    model:%s\n", localData.model));
        sb.append(String.format("    transform:%s\n", localData.transform == null ? "null" : localData.transform.toString()));
        sb.append(String.format("    flags:%s\n", localData.flags == null ? "null" : localData.flags.toString()));
        sb.append(String.format("    width:%d\n", localData.width));
        sb.append(String.format("    height:%d\n", localData.height));
        sb.append(String.format("    refresh:%d\n", localData.refresh));
        sb.append(String.format("    scaleFactor:%d\n", localData.scaleFactor));
        
        return sb.toString();
    }
    
    @Override
    public WlOutputHandle getHandle()
    {
        return (WlOutputHandle)handle;
    }
}
