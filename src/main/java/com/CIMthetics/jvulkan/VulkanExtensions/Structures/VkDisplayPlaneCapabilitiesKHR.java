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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkOffset2D;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDisplayPlaneAlphaFlagBitsKHR;

public class VkDisplayPlaneCapabilitiesKHR
{
    private EnumSet<VkDisplayPlaneAlphaFlagBitsKHR> supportedAlpha;
    private VkOffset2D                              minSrcPosition;
    private VkOffset2D                              maxSrcPosition;
    private VkExtent2D                              minSrcExtent;
    private VkExtent2D                              maxSrcExtent;
    private VkOffset2D                              minDstPosition;
    private VkOffset2D                              maxDstPosition;
    private VkExtent2D                              minDstExtent;
    private VkExtent2D                              maxDstExtent;
    
    public EnumSet<VkDisplayPlaneAlphaFlagBitsKHR> getSupportedAlpha()
    {
        return supportedAlpha;
    }
    
    public void setSupportedAlpha(
            EnumSet<VkDisplayPlaneAlphaFlagBitsKHR> supportedAlpha)
    {
        this.supportedAlpha = supportedAlpha;
    }
    
    public VkOffset2D getMinSrcPosition()
    {
        return minSrcPosition;
    }
    
    public void setMinSrcPosition(VkOffset2D minSrcPosition)
    {
        this.minSrcPosition = minSrcPosition;
    }
    
    public VkOffset2D getMaxSrcPosition()
    {
        return maxSrcPosition;
    }
    
    public void setMaxSrcPosition(VkOffset2D maxSrcPosition)
    {
        this.maxSrcPosition = maxSrcPosition;
    }
    
    public VkExtent2D getMinSrcExtent()
    {
        return minSrcExtent;
    }
    
    public void setMinSrcExtent(VkExtent2D minSrcExtent)
    {
        this.minSrcExtent = minSrcExtent;
    }
    
    public VkExtent2D getMaxSrcExtent()
    {
        return maxSrcExtent;
    }
    
    public void setMaxSrcExtent(VkExtent2D maxSrcExtent)
    {
        this.maxSrcExtent = maxSrcExtent;
    }
    
    public VkOffset2D getMinDstPosition()
    {
        return minDstPosition;
    }
    
    public void setMinDstPosition(VkOffset2D minDstPosition)
    {
        this.minDstPosition = minDstPosition;
    }
    
    public VkOffset2D getMaxDstPosition()
    {
        return maxDstPosition;
    }
    
    public void setMaxDstPosition(VkOffset2D maxDstPosition)
    {
        this.maxDstPosition = maxDstPosition;
    }
    
    public VkExtent2D getMinDstExtent()
    {
        return minDstExtent;
    }
    
    public void setMinDstExtent(VkExtent2D minDstExtent)
    {
        this.minDstExtent = minDstExtent;
    }
    public VkExtent2D getMaxDstExtent()
    {
        return maxDstExtent;
    }
    
    public void setMaxDstExtent(VkExtent2D maxDstExtent)
    {
        this.maxDstExtent = maxDstExtent;
    }

}
