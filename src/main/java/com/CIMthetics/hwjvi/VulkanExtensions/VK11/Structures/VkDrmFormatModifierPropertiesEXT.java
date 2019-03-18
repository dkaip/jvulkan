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
