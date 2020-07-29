/*
 * Copyright 2019-2020 Douglas Kaip
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

public enum VkQueryType
{
    VK_QUERY_TYPE_OCCLUSION(0),
    VK_QUERY_TYPE_PIPELINE_STATISTICS(1),
    VK_QUERY_TYPE_TIMESTAMP(2),
    VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT(1000028004),
    VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR(1000116000),
    VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR(1000165000),
    VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR(1000150000),
    VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL(1000210000),
    VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV(VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR.valueOf()),
    VK_QUERY_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkQueryType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
