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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT extends VulkanCreateInfoStructure
{
    private boolean textureCompressionASTC_HDR;
    
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES_EXT);
    }

    public boolean isTextureCompressionASTC_HDR()
    {
        return textureCompressionASTC_HDR;
    }

    public void setTextureCompressionASTC_HDR(boolean textureCompressionASTC_HDR)
    {
        this.textureCompressionASTC_HDR = textureCompressionASTC_HDR;
    }

}
