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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkWaylandSurfaceCreateFlagsKHR;
import com.CIMthetics.jvulkan.Wayland.Handles.WlDisplay;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurface;

public class VkWaylandSurfaceCreateInfoKHR extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkWaylandSurfaceCreateFlagsKHR> flags = EnumSet.noneOf(VkWaylandSurfaceCreateFlagsKHR.class);
    private WlDisplay                               wlDisplay; // pointer to a wl_display
    private WlSurface                               wlSurface; // pointer to a wl_surface


    public VkWaylandSurfaceCreateInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR);
    }


    public long getpNext()
    {
        return pNext;
    }


    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }


    public EnumSet<VkWaylandSurfaceCreateFlagsKHR> getFlags()
    {
        return flags;
    }


    public void setFlags(EnumSet<VkWaylandSurfaceCreateFlagsKHR> flags)
    {
        this.flags = flags;
    }


    public WlDisplay getWlDisplay()
    {
        return wlDisplay;
    }


    public void setWlDisplay(WlDisplay wlDisplay)
    {
        this.wlDisplay = wlDisplay;
    }


    public WlSurface getWlSurface()
    {
        return wlSurface;
    }


    public void setWlSurface(WlSurface wlSurface)
    {
        this.wlSurface = wlSurface;
    }

}