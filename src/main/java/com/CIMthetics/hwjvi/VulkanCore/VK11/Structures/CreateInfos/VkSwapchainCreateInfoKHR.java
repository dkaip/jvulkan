package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCompositeAlphaFlagBitsKHR;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageUsageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPresentModeKHR;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSharingMode;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSurfaceTransformFlagBitsKHR;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkSwapchainKHR;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkExtent2D;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkColorSpaceKHR;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkSwapchainCreateFlagBitsKHR;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Handles.VkSurfaceKHR;

public class VkSwapchainCreateInfoKHR extends VulkanCreateInfoStructure
{
    private long                            pNext;
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

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
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
