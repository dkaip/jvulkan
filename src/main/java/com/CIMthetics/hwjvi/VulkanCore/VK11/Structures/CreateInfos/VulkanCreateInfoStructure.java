package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public abstract class VulkanCreateInfoStructure
{
    private VkStructureType sType;

    public VulkanCreateInfoStructure(VkStructureType sType)
    {
        this.sType = sType;
    }
    
    public VkStructureType getSType()
    {
        return sType;
    }
}
