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

import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlShellGetShellSurface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Handles.WlShellHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellSurfaceHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlShell extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlShell.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();

    public WlShell(WlShellHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    
    public WlShellSurface getShellSurface(WlSurface surface)
    {
        WlShellSurfaceHandle handle = wlShellGetShellSurface((WlShellHandle)this.getHandle(), (WlSurfaceHandle)surface.getHandle());
        return new WlShellSurface(handle);
    }
    

    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        log.error("The compositor interface does not have any events.");
    }
    
    @Override
    public WlShellHandle getHandle()
    {
        return (WlShellHandle)handle;
    }
}
