package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkWaylandSurfaceCreateFlagsKHR;
import com.CIMthetics.hwjvi.Wayland.Handles.WlDisplay;
import com.CIMthetics.hwjvi.Wayland.Handles.WlSurface;

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
