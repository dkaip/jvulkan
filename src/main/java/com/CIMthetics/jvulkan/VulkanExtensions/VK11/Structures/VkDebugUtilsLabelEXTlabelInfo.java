package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDebugUtilsLabelEXTlabelInfo extends VulkanCreateInfoStructure
{
    private long    pNext;
    private String  labelName;
    private float[] color;
    
    public VkDebugUtilsLabelEXTlabelInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public String getLabelName()
    {
        return labelName;
    }

    public void setLabelName(String labelName)
    {
        this.labelName = labelName;
    }

    public float[] getColor()
    {
        return color;
    }

    public void setColor(float[] color)
    {
        this.color = color;
    }

}
