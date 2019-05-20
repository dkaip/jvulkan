package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.WindowsSecurityAttributes;

public class VkExportFenceWin32HandleInfoKHR extends VulkanCreateInfoStructure
{
    private WindowsSecurityAttributes   attributes;
    private int                         dwAccess;
    private String                      name;
    
    public VkExportFenceWin32HandleInfoKHR(VkStructureType sType)
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR);
    }

    public WindowsSecurityAttributes getAttributes()
    {
        return attributes;
    }

    public void setAttributes(WindowsSecurityAttributes attributes)
    {
        this.attributes = attributes;
    }

    public int getDwAccess()
    {
        return dwAccess;
    }

    public void setDwAccess(int dwAccess)
    {
        this.dwAccess = dwAccess;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
