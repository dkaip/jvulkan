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

public class VkAttachmentReference
{
    private int             attachment;
    private VkImageLayout   layout;
    
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
}
