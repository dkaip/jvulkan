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

import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlCompositorCreateSurface;
import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlCompositorCreateRegion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Handles.WlCompositorHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegionHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlCompositor extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlCompositor.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();

    public WlCompositor(WlCompositorHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    
    public WlSurface createSurface()
    {
        WlSurfaceHandle handle = wlCompositorCreateSurface((WlCompositorHandle)this.getHandle());
        return new WlSurface(handle);
    }
    
    public WlRegion createRegion()
    {
        WlRegionHandle handle = wlCompositorCreateRegion((WlCompositorHandle)this.getHandle());
        return new WlRegion(handle);
    }
    
    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        log.error("The compositor interface does not have any events.");
    }

}
