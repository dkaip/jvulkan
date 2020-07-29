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

public enum VkShaderFloatControlsIndependence
{
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY(0),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL(1),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE(2),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR(VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY.valueOf()),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR(VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL.valueOf()),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR(VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE.valueOf()),
    VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkShaderFloatControlsIndependence(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkShaderFloatControlsIndependence fromValue(int inputValue)
    {
        VkShaderFloatControlsIndependence result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY;
                break;
            case 1:
                result = VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL;
                break;
            case 2:
                result = VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
