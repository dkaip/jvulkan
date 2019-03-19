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

public enum VkPhysicalDeviceType
{
    VK_PHYSICAL_DEVICE_TYPE_OTHER(0),
    VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU(1),
    VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU(2),
    VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU(3),
    VK_PHYSICAL_DEVICE_TYPE_CPU(4),
    VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE(VK_PHYSICAL_DEVICE_TYPE_OTHER.valueOf()),
    VK_PHYSICAL_DEVICE_TYPE_END_RANGE(VK_PHYSICAL_DEVICE_TYPE_CPU.valueOf()),
    VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE((VK_PHYSICAL_DEVICE_TYPE_CPU.valueOf() - VK_PHYSICAL_DEVICE_TYPE_OTHER.valueOf() + 1)),
    VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPhysicalDeviceType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
