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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

public enum VkShaderFloatControlsIndependenceKHR
{
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR(0),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR(1),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR(2),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_BEGIN_RANGE_KHR(VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR.valueOf()),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_END_RANGE_KHR(VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR.valueOf()),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_RANGE_SIZE_KHR(VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR.valueOf() - VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR.valueOf() + 1),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkShaderFloatControlsIndependenceKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkShaderFloatControlsIndependenceKHR fromValue(int inputValue)
    {
        VkShaderFloatControlsIndependenceKHR result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR;
                break;
            case 1:
                result = VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR;
                break;
            case 2:
                result = VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR;
                break;
        }

        if (inputValue == (VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR.valueOf() - VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR.valueOf() + 1))
            result = VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_RANGE_SIZE_KHR;
        
        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
