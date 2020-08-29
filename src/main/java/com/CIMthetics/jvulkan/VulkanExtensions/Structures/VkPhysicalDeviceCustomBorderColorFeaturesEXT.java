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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceCustomBorderColorFeaturesEXT extends VulkanCreateInfoStructure
{
    private boolean customBorderColors;
    private boolean customBorderColorWithoutFormat;
    
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT);
    }

    public boolean isCustomBorderColors()
    {
        return customBorderColors;
    }

    public void setCustomBorderColors(boolean customBorderColors)
    {
        this.customBorderColors = customBorderColors;
    }

    public boolean isCustomBorderColorWithoutFormat()
    {
        return customBorderColorWithoutFormat;
    }

    public void setCustomBorderColorWithoutFormat(boolean customBorderColorWithoutFormat)
    {
        this.customBorderColorWithoutFormat = customBorderColorWithoutFormat;
    }
}
