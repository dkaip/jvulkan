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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkValidationFeatureDisableEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkValidationFeatureEnableEXT;

public class VkValidationFeaturesEXT extends VulkanCreateInfoStructure
{
    private Collection<VkValidationFeatureEnableEXT>    enabledValidationFeatures;
    private Collection<VkValidationFeatureDisableEXT>   disabledValidationFeatures;

    public VkValidationFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT);
    }

    public Collection<VkValidationFeatureEnableEXT> getEnabledValidationFeatures()
    {
        return enabledValidationFeatures;
    }

    public void setEnabledValidationFeatures(Collection<VkValidationFeatureEnableEXT> enabledValidationFeatures)
    {
        this.enabledValidationFeatures = enabledValidationFeatures;
    }

    public Collection<VkValidationFeatureDisableEXT> getDisabledValidationFeatures()
    {
        return disabledValidationFeatures;
    }

    public void setDisabledValidationFeatures(
            Collection<VkValidationFeatureDisableEXT> disabledValidationFeatures)
    {
        this.disabledValidationFeatures = disabledValidationFeatures;
    }

}
