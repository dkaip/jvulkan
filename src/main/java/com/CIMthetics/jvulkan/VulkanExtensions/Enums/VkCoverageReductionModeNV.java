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

public enum VkCoverageReductionModeNV
{
    VK_COVERAGE_REDUCTION_MODE_MERGE_NV(0),
    VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV(1),
    VK_COVERAGE_REDUCTION_MODE_BEGIN_RANGE_NV(VK_COVERAGE_REDUCTION_MODE_MERGE_NV.valueOf()),
    VK_COVERAGE_REDUCTION_MODE_END_RANGE_NV(VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV.valueOf()),
    VK_COVERAGE_REDUCTION_MODE_RANGE_SIZE_NV(VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV.valueOf() - VK_COVERAGE_REDUCTION_MODE_MERGE_NV.valueOf() + 1),
    VK_COVERAGE_REDUCTION_MODE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkCoverageReductionModeNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
    
    static VkCoverageReductionModeNV fromValue(int inputValue)
    {
        VkCoverageReductionModeNV result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_COVERAGE_REDUCTION_MODE_MERGE_NV;
                break;
            case 1:
                result = VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV;
                break;
        }

        if (inputValue == (VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV.valueOf() - VK_COVERAGE_REDUCTION_MODE_MERGE_NV.valueOf() + 1))
            result = VK_COVERAGE_REDUCTION_MODE_RANGE_SIZE_NV;
        
        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
