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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalMemoryFeatureFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalMemoryHandleTypeFlagBits;

public class VkExternalMemoryProperties
{
    private EnumSet<VkExternalMemoryFeatureFlagBits>    externalMemoryFeatures;
    private EnumSet<VkExternalMemoryHandleTypeFlagBits> exportFromImportedHandleTypes;
    private EnumSet<VkExternalMemoryHandleTypeFlagBits> compatibleHandleTypes;
    
    public EnumSet<VkExternalMemoryFeatureFlagBits> getExternalMemoryFeatures()
    {
        return externalMemoryFeatures;
    }
    
    public void setExternalMemoryFeatures(
            EnumSet<VkExternalMemoryFeatureFlagBits> externalMemoryFeatures)
    {
       
        this.externalMemoryFeatures = externalMemoryFeatures;
    }
    public EnumSet<VkExternalMemoryHandleTypeFlagBits> getExportFromImportedHandleTypes()
    {
        return exportFromImportedHandleTypes;
    }
    
    public void setExportFromImportedHandleTypes(
            EnumSet<VkExternalMemoryHandleTypeFlagBits> exportFromImportedHandleTypes)
    {
        this.exportFromImportedHandleTypes = exportFromImportedHandleTypes;
    }
    
    public EnumSet<VkExternalMemoryHandleTypeFlagBits> getCompatibleHandleTypes()
    {
        return compatibleHandleTypes;
    }
    
    public void setCompatibleHandleTypes(
            EnumSet<VkExternalMemoryHandleTypeFlagBits> compatibleHandleTypes)
    {
        this.compatibleHandleTypes = compatibleHandleTypes;
    }


}
