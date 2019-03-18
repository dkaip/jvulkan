package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkValidationFeatureDisableEXT;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkValidationFeatureEnableEXT;

public class VkValidationFeaturesEXT extends VulkanCreateInfoStructure
{
    private long                                        pNext;
    private Collection<VkValidationFeatureEnableEXT>    enabledValidationFeatures;
    private Collection<VkValidationFeatureDisableEXT>   disabledValidationFeatures;

    public VkValidationFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public Collection<VkValidationFeatureEnableEXT> getEnabledValidationFeatures()
    {
        return enabledValidationFeatures;
    }

    public void setEnabledValidationFeatures(
            Collection<VkValidationFeatureEnableEXT> enabledValidationFeatures)
    {
        this.enabledValidationFeatures = enabledValidationFeatures;
    }

    public Collection<VkValidationFeatureDisableEXT> getDisabledValidationFeatures()
    {
        return disabledValidationFeatures;
    }

    public void setDisabledValidationFeatures(
            Collection<VkValidationFeatureDisableEXT> disabledValidationFeatures)
    {
        this.disabledValidationFeatures = disabledValidationFeatures;
    }

}
