package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormatFeatureFlagBits;

public class VkFormatProperties
{
    private EnumSet<VkFormatFeatureFlagBits>    linearTilingFeatures = EnumSet.noneOf(VkFormatFeatureFlagBits.class);
    private EnumSet<VkFormatFeatureFlagBits>    optimalTilingFeatures = EnumSet.noneOf(VkFormatFeatureFlagBits.class);
    private EnumSet<VkFormatFeatureFlagBits>    bufferFeatures = EnumSet.noneOf(VkFormatFeatureFlagBits.class);
    
    public EnumSet<VkFormatFeatureFlagBits> getLinearTilingFeatures()
    {
        return linearTilingFeatures;
    }
    
    public void setLinearTilingFeatures(
            EnumSet<VkFormatFeatureFlagBits> linearTilingFeatures)
    {
        this.linearTilingFeatures = linearTilingFeatures;
    }
    
    public EnumSet<VkFormatFeatureFlagBits> getOptimalTilingFeatures()
    {
        return optimalTilingFeatures;
    }
    
    public void setOptimalTilingFeatures(
            EnumSet<VkFormatFeatureFlagBits> optimalTilingFeatures)
    {
        this.optimalTilingFeatures = optimalTilingFeatures;
    }
    
    public EnumSet<VkFormatFeatureFlagBits> getBufferFeatures()
    {
        return bufferFeatures;
    }
    
    public void setBufferFeatures(EnumSet<VkFormatFeatureFlagBits> bufferFeatures)
    {
        this.bufferFeatures = bufferFeatures;
    }
}
