package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDebugUtilsLabelEXTlabelInfo extends VulkanCreateInfoStructure
{
    private String  labelName;
    private float[] color;
    
    public VkDebugUtilsLabelEXTlabelInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT);
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
