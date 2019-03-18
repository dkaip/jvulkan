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
