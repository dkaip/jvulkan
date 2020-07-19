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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

public enum VkAttachmentStoreOp
{
    VK_ATTACHMENT_STORE_OP_STORE(0),
    VK_ATTACHMENT_STORE_OP_DONT_CARE(1),
    VK_ATTACHMENT_STORE_OP_BEGIN_RANGE(VK_ATTACHMENT_STORE_OP_STORE.valueOf()),
    VK_ATTACHMENT_STORE_OP_END_RANGE(VK_ATTACHMENT_STORE_OP_DONT_CARE.valueOf()),
    VK_ATTACHMENT_STORE_OP_RANGE_SIZE((VK_ATTACHMENT_STORE_OP_DONT_CARE.valueOf() - VK_ATTACHMENT_STORE_OP_STORE.valueOf() + 1)),
    VK_ATTACHMENT_STORE_OP_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkAttachmentStoreOp(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
