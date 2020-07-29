/*
 * Copyright 2020 Douglas Kaip
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

public enum VkPerformanceCounterScopeKHR
{
    VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR(0),
    VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR(1),
    VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR(2),
    VK_QUERY_SCOPE_COMMAND_BUFFER_KHR(VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR.valueOf()),
    VK_QUERY_SCOPE_RENDER_PASS_KHR(VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR.valueOf()),
    VK_QUERY_SCOPE_COMMAND_KHR(VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR.valueOf()),
    VK_PERFORMANCE_COUNTER_SCOPE_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkPerformanceCounterScopeKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
