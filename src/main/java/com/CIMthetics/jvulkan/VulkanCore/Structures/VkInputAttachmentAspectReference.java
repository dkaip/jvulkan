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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageAspectFlagBits;

public class VkInputAttachmentAspectReference
{
    private int                             subpass;
    private int                             inputAttachmentIndex;
    private EnumSet<VkImageAspectFlagBits>  aspectMask = EnumSet.noneOf(VkImageAspectFlagBits.class);
    
    public int getSubpass()
    {
        return subpass;
    }
    
    public void setSubpass(int subpass)
    {
        this.subpass = subpass;
    }
    
    public int getInputAttachmentIndex()
    {
        return inputAttachmentIndex;
    }
    
    public void setInputAttachmentIndex(int inputAttachmentIndex)
    {
        this.inputAttachmentIndex = inputAttachmentIndex;
    }
    
    public EnumSet<VkImageAspectFlagBits> getAspectMask()
    {
        return aspectMask;
    }
    
    public void setAspectMask(EnumSet<VkImageAspectFlagBits> aspectMask)
    {
        this.aspectMask = aspectMask;
    }

}
