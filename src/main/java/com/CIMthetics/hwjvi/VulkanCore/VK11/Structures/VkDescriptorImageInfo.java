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
