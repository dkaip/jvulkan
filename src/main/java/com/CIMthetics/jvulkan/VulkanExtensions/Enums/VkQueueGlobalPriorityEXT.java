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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

public enum VkQueueGlobalPriorityEXT
{
    VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT(128),
    VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT(256),
    VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT(512),
    VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT(1024),
    VK_QUEUE_GLOBAL_PRIORITY_BEGIN_RANGE_EXT(VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT.valueOf()),
    VK_QUEUE_GLOBAL_PRIORITY_END_RANGE_EXT(VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT.valueOf()),
    VK_QUEUE_GLOBAL_PRIORITY_RANGE_SIZE_EXT((VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT.valueOf() - VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT.valueOf() + 1)),
    VK_QUEUE_GLOBAL_PRIORITY_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkQueueGlobalPriorityEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
