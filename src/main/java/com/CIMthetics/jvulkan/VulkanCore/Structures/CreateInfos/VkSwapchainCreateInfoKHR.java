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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCompositeAlphaFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPresentModeKHR;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSharingMode;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSurfaceTransformFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSwapchainKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkColorSpaceKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkSwapchainCreateFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkSurfaceKHR;

public class VkSwapchainCreateInfoKHR extends VulkanCreateInfoStructure
{
    private EnumSet<VkSwapchainCreateFlagBitsKHR> flags = EnumSet.noneOf(VkSwapchainCreateFlagBitsKHR.class);
    private VkSurfaceKHR                    surface;
    private int                             minImageCount;
    private VkFormat                        imageFormat;
    private VkColorSpaceKHR                 imageColorSpace;
    private VkExtent2D                      imageExtent;
    private int                             imageArrayLayers;
    private EnumSet<VkImageUsageFlagBits>   imageUsage = EnumSet.noneOf(VkImageUsageFlagBits.class);
    private VkSharingMode                   imageSharingMode;
    int[]                                   queueFamilyIndices;
    private VkSurfaceTransformFlagBitsKHR   preTransform;
    private VkCompositeAlphaFlagBitsKHR     compositeAlpha;
    private VkPresentModeKHR                presentMode;
    private boolean                         clipped;
    private VkSwapchainKHR                  oldSwapchain;
    
    public VkSwapchainCreateInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR);
    }

    public EnumSet<VkSwapchainCreateFlagBitsKHR> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkSwapchainCreateFlagBitsKHR> flags)
    {
        this.flags = flags;
    }

    public VkSurfaceKHR getSurface()
    {
        return surface;
    }

    public void setSurface(VkSurfaceKHR surface)
    {
        this.surface = surface;
    }

    public int getMinImageCount()
    {
        return minImageCount;
    }

    public void setMinImageCount(int minImageCount)
    {
        this.minImageCount = minImageCount;
    }

    public VkFormat getImageFormat()
    {
        return imageFormat;
    }

    public void setImageFormat(VkFormat imageFormat)
    {
        this.imageFormat = imageFormat;
    }

    public VkColorSpaceKHR getImageColorSpace()
    {
        return imageColorSpace;
    }

    public void setImageColorSpace(VkColorSpaceKHR imageColorSpace)
    {
        this.imageColorSpace = imageColorSpace;
    }

    public VkExtent2D getImageExtent()
    {
        return imageExtent;
    }

    public void setImageExtent(VkExtent2D imageExtent)
    {
        this.imageExtent = imageExtent;
    }

    public int getImageArrayLayers()
    {
        return imageArrayLayers;
    }

    public void setImageArrayLayers(int imageArrayLayers)
    {
        this.imageArrayLayers = imageArrayLayers;
    }

    public EnumSet<VkImageUsageFlagBits> getImageUsage()
    {
        return imageUsage;
    }

    public void setImageUsage(EnumSet<VkImageUsageFlagBits> imageUsage)
    {
        this.imageUsage = imageUsage;
    }

    public VkSharingMode getImageSharingMode()
    {
        return imageSharingMode;
    }

    public void setImageSharingMode(VkSharingMode imageSharingMode)
    {
        this.imageSharingMode = imageSharingMode;
    }

    public int[] getQueueFamilyIndices()
    {
        return queueFamilyIndices;
    }

    public void setQueueFamilyIndices(int[] queueFamilyIndices)
    {
        this.queueFamilyIndices = queueFamilyIndices;
    }

    public VkSurfaceTransformFlagBitsKHR getPreTransform()
    {
        return preTransform;
    }

    public void setPreTransform(VkSurfaceTransformFlagBitsKHR preTransform)
    {
        this.preTransform = preTransform;
    }

    public VkCompositeAlphaFlagBitsKHR getCompositeAlpha()
    {
        return compositeAlpha;
    }

    public void setCompositeAlpha(VkCompositeAlphaFlagBitsKHR compositeAlpha)
    {
        this.compositeAlpha = compositeAlpha;
    }

    public VkPresentModeKHR getPresentMode()
    {
        return presentMode;
    }

    public void setPresentMode(VkPresentModeKHR presentMode)
    {
        this.presentMode = presentMode;
    }

    public boolean getClipped()
    {
        return clipped;
    }

    public void setClipped(boolean clipped)
    {
        this.clipped = clipped;
    }

    public VkSwapchainKHR getOldSwapchain()
    {
        return oldSwapchain;
    }

    public void setOldSwapchain(VkSwapchainKHR oldSwapchain)
    {
        this.oldSwapchain = oldSwapchain;
    }

}
