package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCompositeAlphaFlagBitsKHR;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageUsageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSurfaceTransformFlagBitsKHR;

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
}
