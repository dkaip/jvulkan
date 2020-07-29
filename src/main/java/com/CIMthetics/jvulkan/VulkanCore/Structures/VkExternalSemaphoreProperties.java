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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalSemaphoreFeatureFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalSemaphoreHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkExternalSemaphoreProperties extends VulkanCreateInfoStructure
{
    private EnumSet<VkExternalSemaphoreHandleTypeFlagBits>  exportFromImportedHandleTypes;
    private EnumSet<VkExternalSemaphoreHandleTypeFlagBits>  compatibleHandleTypes;
    private EnumSet<VkExternalSemaphoreFeatureFlagBits>     externalSemaphoreFeatures;

    public VkExternalSemaphoreProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES);
    }

    public EnumSet<VkExternalSemaphoreHandleTypeFlagBits> getExportFromImportedHandleTypes()
    {
        return exportFromImportedHandleTypes;
    }

    public void setExportFromImportedHandleTypes(
            EnumSet<VkExternalSemaphoreHandleTypeFlagBits> exportFromImportedHandleTypes)
    {
        this.exportFromImportedHandleTypes = exportFromImportedHandleTypes;
    }

    public EnumSet<VkExternalSemaphoreHandleTypeFlagBits> getCompatibleHandleTypes()
    {
        return compatibleHandleTypes;
    }

    public void setCompatibleHandleTypes(
            EnumSet<VkExternalSemaphoreHandleTypeFlagBits> compatibleHandleTypes)
    {
        this.compatibleHandleTypes = compatibleHandleTypes;
    }

    public EnumSet<VkExternalSemaphoreFeatureFlagBits> getExternalSemaphoreFeatures()
    {
        return externalSemaphoreFeatures;
    }

    public void setExternalSemaphoreFeatures(
            EnumSet<VkExternalSemaphoreFeatureFlagBits> externalSemaphoreFeatures)
    {
        this.externalSemaphoreFeatures = externalSemaphoreFeatures;
    }

}
