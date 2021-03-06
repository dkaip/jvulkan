/*
 * Copyright 2019-2020 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCompositeAlphaFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSurfaceTransformFlagBitsKHR;

/**
 * This may need to move into a different package
 * @author Douglas Kaip
 *
 */
public class VkSurfaceCapabilitiesKHR
{
    private int                                     minImageCount;
    private int                                     maxImageCount;
    private VkExtent2D                              currentImageExtent;
    private VkExtent2D                              minImageExtent;
    private VkExtent2D                              maxImageExtent;
    private int                                     maxImageArrayLayers;
    private EnumSet<VkSurfaceTransformFlagBitsKHR>  supportedTransforms = EnumSet.noneOf(VkSurfaceTransformFlagBitsKHR.class);
    private VkSurfaceTransformFlagBitsKHR           currentTransform;
    private EnumSet<VkCompositeAlphaFlagBitsKHR>    supportedCompositeAlpha = EnumSet.noneOf(VkCompositeAlphaFlagBitsKHR.class);
    private EnumSet<VkImageUsageFlagBits>           supportedUsageFlags = EnumSet.noneOf(VkImageUsageFlagBits.class);
    
    void setMinImageCount(int minImageCount)
    {
        this.minImageCount = minImageCount;
    }
    
    void setMaxImageCount(int maxImageCount)
    {
        this.maxImageCount = maxImageCount;
    }
    
    void setCurrentImageExtent(VkExtent2D currentImageExtent)
    {
        this.currentImageExtent = currentImageExtent;
    }
    
    void setMinImageExtent(VkExtent2D minImageExtent)
    {
        this.minImageExtent = minImageExtent;
    }
    
    void setMaxImageExtent(VkExtent2D maxImageExtent)
    {
        this.maxImageExtent = maxImageExtent;
    }
    
    void setMaxImageArrayLayers(int maxImageArrayLayers)
    {
        this.maxImageArrayLayers = maxImageArrayLayers;
    }
    
    void setSupportedTransforms(
            EnumSet<VkSurfaceTransformFlagBitsKHR> supportedTransforms)
    {
        this.supportedTransforms = supportedTransforms;
    }
    
    void setCurrentTransform(
            VkSurfaceTransformFlagBitsKHR currentTransform)
    {
        this.currentTransform = currentTransform;
    }
    
    void setSupportedCompositeAlpha(
            EnumSet<VkCompositeAlphaFlagBitsKHR> supportedCompositeAlpha)
    {
        this.supportedCompositeAlpha = supportedCompositeAlpha;
    }
    
    void setSupportedUsageFlags(EnumSet<VkImageUsageFlagBits> supportedUsageFlags)
    {
        this.supportedUsageFlags = supportedUsageFlags;
    }
    
    public int getMinImageCount()
    {
        return minImageCount;
    }
    
    public int getMaxImageCount()
    {
        return maxImageCount;
    }
    
    public VkExtent2D getCurrentImageExtent()
    {
        return currentImageExtent;
    }
    
    public VkExtent2D getMinImageExtent()
    {
        return minImageExtent;
    }
    
    public VkExtent2D getMaxImageExtent()
    {
        return maxImageExtent;
    }
    
    public int getMaxImageArrayLayers()
    {
        return maxImageArrayLayers;
    }
    
    public EnumSet<VkSurfaceTransformFlagBitsKHR> getSupportedTransforms()
    {
        return supportedTransforms;
    }
    
    public VkSurfaceTransformFlagBitsKHR getCurrentTransform()
    {
        return currentTransform;
    }
    
    public EnumSet<VkCompositeAlphaFlagBitsKHR> getSupportedCompositeAlpha()
    {
        return supportedCompositeAlpha;
    }
    
    public EnumSet<VkImageUsageFlagBits> getSupportedUsageFlags()
    {
        return supportedUsageFlags;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkSurfaceCapabilitiesKHR\n"));
        sb.append(String.format("    minImageCount:%d\n", minImageCount));
        sb.append(String.format("    maxImageCount:%d\n", maxImageCount));
        sb.append(String.format("    currentImageExtent:%s\n", currentImageExtent == null ? "null" : currentImageExtent.toString()));
        sb.append(String.format("    minImageExtent:%s\n", minImageExtent == null ? "null" : minImageExtent.toString()));
        sb.append(String.format("    maxImageExtent:%s\n", maxImageExtent == null ? "null" : maxImageExtent.toString()));
        sb.append(String.format("    maxImageArrayLayers:%d\n", maxImageArrayLayers));
        sb.append(String.format("    supportedTransforms:%s\n", supportedTransforms == null ? "null" : supportedTransforms.toString()));
        sb.append(String.format("    currentTransform:%s\n", currentTransform == null ? "null" : currentTransform.toString()));
        sb.append(String.format("    supportedCompositeAlpha:%s\n", supportedCompositeAlpha == null ? "null" : supportedCompositeAlpha.toString()));
        sb.append(String.format("    supportedUsageFlags:%s\n", supportedUsageFlags == null ? "null" : supportedUsageFlags.toString()));

        
        return sb.toString();
    }
}
