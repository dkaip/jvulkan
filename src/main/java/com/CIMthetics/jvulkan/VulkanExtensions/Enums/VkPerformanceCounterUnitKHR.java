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

public enum VkPerformanceCounterUnitKHR
{
    VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR(0),
    VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR(1),
    VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR(2),
    VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR(3),
    VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR(4),
    VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR(5),
    VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR(6),
    VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR(7),
    VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR(8),
    VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR(9),
    VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR(10),
    VK_PERFORMANCE_COUNTER_UNIT_MAX_ENUM_KHR(0x7FFFFFFF);
    
    private int value;
    
    private VkPerformanceCounterUnitKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
