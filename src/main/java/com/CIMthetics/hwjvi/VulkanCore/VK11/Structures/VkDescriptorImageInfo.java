package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageLayout;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkImageView;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkSampler;

public class VkDescriptorImageInfo
{
    private VkSampler       sampler;
    private VkImageView     imageView;
    private VkImageLayout   imageLayout;
    
    public VkDescriptorImageInfo() {}
    
    public VkDescriptorImageInfo(VkSampler sampler, VkImageView imageView, VkImageLayout imageLayout)
    {
        this.sampler        = sampler;
        this.imageView      = imageView;
        this.imageLayout    = imageLayout;
    }

    public VkSampler getSampler()
    {
        return sampler;
    }

    public void setSampler(VkSampler sampler)
    {
        this.sampler = sampler;
    }

    public VkImageView getImageView()
    {
        return imageView;
    }

    public void setImageView(VkImageView imageView)
    {
        this.imageView = imageView;
    }

    public VkImageLayout getImageLayout()
    {
        return imageLayout;
    }

    public void setImageLayout(VkImageLayout imageLayout)
    {
        this.imageLayout = imageLayout;
    }
    
}
