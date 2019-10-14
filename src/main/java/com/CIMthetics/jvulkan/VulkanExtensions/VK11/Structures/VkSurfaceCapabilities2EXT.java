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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkCompositeAlphaFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSurfaceTransformFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkSurfaceCounterFlagBitsEXT;

public class VkSurfaceCapabilities2EXT extends VulkanCreateInfoStructure
{
    private int                                     minImageCount;
    private int                                     maxImageCount;
    private VkExtent2D                              currentExtent;
    private VkExtent2D                              minImageExtent;
    private VkExtent2D                              maxImageExtent;
    private int                                     maxImageArrayLayers;
    private EnumSet<VkSurfaceTransformFlagBitsKHR>  supportedTransforms = EnumSet.noneOf(VkSurfaceTransformFlagBitsKHR.class);
    private VkSurfaceTransformFlagBitsKHR           currentTransform;
    private EnumSet<VkCompositeAlphaFlagBitsKHR>    supportedCompositeAlpha = EnumSet.noneOf(VkCompositeAlphaFlagBitsKHR.class);
    private EnumSet<VkImageUsageFlagBits>           supportedUsageFlags = EnumSet.noneOf(VkImageUsageFlagBits.class);
    private EnumSet<VkSurfaceCounterFlagBitsEXT>    supportedSurfaceCounters = EnumSet.noneOf(VkSurfaceCounterFlagBitsEXT.class);

    public VkSurfaceCapabilities2EXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT);
    }

    public int getMinImageCount()
    {
        return minImageCount;
    }

    public void setMinImageCount(int minImageCount)
    {
        this.minImageCount = minImageCount;
    }

    public int getMaxImageCount()
    {
        return maxImageCount;
    }

    public void setMaxImageCount(int maxImageCount)
    {
        this.maxImageCount = maxImageCount;
    }

    public VkExtent2D getCurrentExtent()
    {
        return currentExtent;
    }

    public void setCurrentExtent(VkExtent2D currentExtent)
    {
        this.currentExtent = currentExtent;
    }

    public VkExtent2D getMinImageExtent()
    {
        return minImageExtent;
    }

    public void setMinImageExtent(VkExtent2D minImageExtent)
    {
        this.minImageExtent = minImageExtent;
    }

    public VkExtent2D getMaxImageExtent()
    {
        return maxImageExtent;
    }

    public void setMaxImageExtent(VkExtent2D maxImageExtent)
    {
        this.maxImageExtent = maxImageExtent;
    }

    public int getMaxImageArrayLayers()
    {
        return maxImageArrayLayers;
    }

    public void setMaxImageArrayLayers(int maxImageArrayLayers)
    {
        this.maxImageArrayLayers = maxImageArrayLayers;
    }

    public EnumSet<VkSurfaceTransformFlagBitsKHR> getSupportedTransforms()
    {
        return supportedTransforms;
    }

    public void setSupportedTransforms(
            EnumSet<VkSurfaceTransformFlagBitsKHR> supportedTransforms)
    {
        this.supportedTransforms = supportedTransforms;
    }

    public VkSurfaceTransformFlagBitsKHR getCurrentTransform()
    {
        return currentTransform;
    }

    public void setCurrentTransform(VkSurfaceTransformFlagBitsKHR currentTransform)
    {
        this.currentTransform = currentTransform;
    }

    public EnumSet<VkCompositeAlphaFlagBitsKHR> getSupportedCompositeAlpha()
    {
        return supportedCompositeAlpha;
    }

    public void setSupportedCompositeAlpha(
            EnumSet<VkCompositeAlphaFlagBitsKHR> supportedCompositeAlpha)
    {
        this.supportedCompositeAlpha = supportedCompositeAlpha;
    }

    public EnumSet<VkImageUsageFlagBits> getSupportedUsageFlags()
    {
        return supportedUsageFlags;
    }

    public void setSupportedUsageFlags(
            EnumSet<VkImageUsageFlagBits> supportedUsageFlags)
    {
        this.supportedUsageFlags = supportedUsageFlags;
    }

    public EnumSet<VkSurfaceCounterFlagBitsEXT> getSupportedSurfaceCounters()
    {
        return supportedSurfaceCounters;
    }

    public void setSupportedSurfaceCounters(
            EnumSet<VkSurfaceCounterFlagBitsEXT> supportedSurfaceCounters)
    {
        this.supportedSurfaceCounters = supportedSurfaceCounters;
    }

}
