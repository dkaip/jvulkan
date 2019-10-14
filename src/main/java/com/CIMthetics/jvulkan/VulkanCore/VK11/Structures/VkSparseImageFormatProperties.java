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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageAspectFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSparseImageFormatFlagBits;

public class VkSparseImageFormatProperties
{
    private EnumSet<VkImageAspectFlagBits>          aspectMask;
    private VkExtent3D                              imageGranularity;
    private EnumSet<VkSparseImageFormatFlagBits>    flags;
    
    public EnumSet<VkImageAspectFlagBits> getAspectMask()
    {
        return aspectMask;
    }
    
    public void setAspectMask(EnumSet<VkImageAspectFlagBits> aspectMask)
    {
        this.aspectMask = aspectMask;
    }
    
    public VkExtent3D getImageGranularity()
    {
        return imageGranularity;
    }
    
    public void setImageGranularity(VkExtent3D imageGranularity)
    {
        this.imageGranularity = imageGranularity;
    }
    
    public EnumSet<VkSparseImageFormatFlagBits> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkSparseImageFormatFlagBits> flags)
    {
        this.flags = flags;
    }
}
