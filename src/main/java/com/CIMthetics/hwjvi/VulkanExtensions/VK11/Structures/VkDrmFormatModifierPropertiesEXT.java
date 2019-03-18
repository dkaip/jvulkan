package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormatFeatureFlagBits;

public class VkDrmFormatModifierPropertiesEXT
{
    private long drmFormatModifier;
    private int  drmFormatModifierPlaneCount;
    private EnumSet<VkFormatFeatureFlagBits>    drmFormatModifierTilingFeatures = EnumSet.noneOf(VkFormatFeatureFlagBits.class);
    public long getDrmFormatModifier()
    {
        return drmFormatModifier;
    }
    public void setDrmFormatModifier(long drmFormatModifier)
    {
        this.drmFormatModifier = drmFormatModifier;
    }
    public int getDrmFormatModifierPlaneCount()
    {
        return drmFormatModifierPlaneCount;
    }
    public void setDrmFormatModifierPlaneCount(int drmFormatModifierPlaneCount)
    {
        this.drmFormatModifierPlaneCount = drmFormatModifierPlaneCount;
    }
    public EnumSet<VkFormatFeatureFlagBits> getDrmFormatModifierTilingFeatures()
    {
        return drmFormatModifierTilingFeatures;
    }
    public void setDrmFormatModifierTilingFeatures(
            EnumSet<VkFormatFeatureFlagBits> drmFormatModifierTilingFeatures)
    {
        this.drmFormatModifierTilingFeatures = drmFormatModifierTilingFeatures;
    }
}
