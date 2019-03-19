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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

public enum VkDescriptorUpdateTemplateType
{
    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET(0),
    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR(1),
    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR(VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET.valueOf()),
    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_BEGIN_RANGE(VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET.valueOf()),
    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_END_RANGE(VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET.valueOf()),
    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_RANGE_SIZE((VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET.valueOf() - VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET.valueOf() + 1)),
    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkDescriptorUpdateTemplateType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
