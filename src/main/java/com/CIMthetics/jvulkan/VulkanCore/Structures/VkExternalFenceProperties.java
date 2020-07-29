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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalFenceFeatureFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalFenceHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkExternalFenceProperties extends VulkanCreateInfoStructure
{
    private EnumSet<VkExternalFenceHandleTypeFlagBits>  exportFromImportedHandleTypes = EnumSet.noneOf(VkExternalFenceHandleTypeFlagBits.class);
    private EnumSet<VkExternalFenceHandleTypeFlagBits>  compatibleHandleTypes = EnumSet.noneOf(VkExternalFenceHandleTypeFlagBits.class);
    private EnumSet<VkExternalFenceFeatureFlagBits>     externalFenceFeatures = EnumSet.noneOf(VkExternalFenceFeatureFlagBits.class);

    public VkExternalFenceProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES);
    }

    public EnumSet<VkExternalFenceHandleTypeFlagBits> getExportFromImportedHandleTypes()
    {
        return exportFromImportedHandleTypes;
    }

    public void setExportFromImportedHandleTypes(
            EnumSet<VkExternalFenceHandleTypeFlagBits> exportFromImportedHandleTypes)
    {
        this.exportFromImportedHandleTypes = exportFromImportedHandleTypes;
    }

    public EnumSet<VkExternalFenceHandleTypeFlagBits> getCompatibleHandleTypes()
    {
        return compatibleHandleTypes;
    }

    public void setCompatibleHandleTypes(
            EnumSet<VkExternalFenceHandleTypeFlagBits> compatibleHandleTypes)
    {
        this.compatibleHandleTypes = compatibleHandleTypes;
    }

    public EnumSet<VkExternalFenceFeatureFlagBits> getExternalFenceFeatures()
    {
        return externalFenceFeatures;
    }

    public void setExternalFenceFeatures(
            EnumSet<VkExternalFenceFeatureFlagBits> externalFenceFeatures)
    {
        this.externalFenceFeatures = externalFenceFeatures;
    }

}
