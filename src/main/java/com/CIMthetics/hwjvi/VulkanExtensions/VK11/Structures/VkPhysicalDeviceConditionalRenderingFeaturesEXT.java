package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceConditionalRenderingFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean conditionalRendering;
    private boolean inheritedConditionalRendering;

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isConditionalRendering()
    {
        return conditionalRendering;
    }

    public void setConditionalRendering(boolean conditionalRendering)
    {
        this.conditionalRendering = conditionalRendering;
    }

    public boolean isInheritedConditionalRendering()
    {
        return inheritedConditionalRendering;
    }

    public void setInheritedConditionalRendering(
            boolean inheritedConditionalRendering)
    {
        this.inheritedConditionalRendering = inheritedConditionalRendering;
    }
}
