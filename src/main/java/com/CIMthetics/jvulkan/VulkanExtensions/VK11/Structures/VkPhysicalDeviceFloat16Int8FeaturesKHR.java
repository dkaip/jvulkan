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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceFloat16Int8FeaturesKHR extends VulkanCreateInfoStructure
{
    private boolean shaderFloat16;
    private boolean shaderInt8;
    
    public VkPhysicalDeviceFloat16Int8FeaturesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES_KHR);
    }

    public boolean isShaderFloat16()
    {
        return shaderFloat16;
    }

    public void setShaderFloat16(boolean shaderFloat16)
    {
        this.shaderFloat16 = shaderFloat16;
    }

    public boolean isShaderInt8()
    {
        return shaderInt8;
    }

    public void setShaderInt8(boolean shaderInt8)
    {
        this.shaderInt8 = shaderInt8;
    }

}
