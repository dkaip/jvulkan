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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageAspectFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageLayout;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

public class VkAttachmentReference2KHR extends VulkanCreateInfoStructure
{
    private int                     attachment;
    private VkImageLayout           layout;
    private VkImageAspectFlagBits   aspectMask;

    public VkAttachmentReference2KHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR);
    }

    public int getAttachment()
    {
        return attachment;
    }

    public void setAttachment(int attachment)
    {
        this.attachment = attachment;
    }

    public VkImageLayout getLayout()
    {
        return layout;
    }

    public void setLayout(VkImageLayout layout)
    {
        this.layout = layout;
    }

    public VkImageAspectFlagBits getAspectMask()
    {
        return aspectMask;
    }

    public void setAspectMask(VkImageAspectFlagBits aspectMask)
    {
        this.aspectMask = aspectMask;
    }
    
}
