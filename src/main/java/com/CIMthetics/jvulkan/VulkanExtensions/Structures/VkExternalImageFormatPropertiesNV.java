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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageFormatProperties;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkExternalMemoryFeatureFlagBitsNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkExternalMemoryHandleTypeFlagBitsNV;

public class VkExternalImageFormatPropertiesNV
{
    private VkImageFormatProperties                         imageFormatProperties;
    private EnumSet<VkExternalMemoryFeatureFlagBitsNV>      externalMemoryFeatures = EnumSet.noneOf(VkExternalMemoryFeatureFlagBitsNV.class);
    private EnumSet<VkExternalMemoryHandleTypeFlagBitsNV>   exportFromImportedHandleTypes = EnumSet.noneOf(VkExternalMemoryHandleTypeFlagBitsNV.class);
    private EnumSet<VkExternalMemoryHandleTypeFlagBitsNV>   compatibleHandleTypes = EnumSet.noneOf(VkExternalMemoryHandleTypeFlagBitsNV.class);

    public VkImageFormatProperties getImageFormatProperties()
    {
        return imageFormatProperties;
    }
    
    public void setImageFormatProperties(
            VkImageFormatProperties imageFormatProperties)
    {
        this.imageFormatProperties = imageFormatProperties;
    }
    
    public EnumSet<VkExternalMemoryFeatureFlagBitsNV> getExternalMemoryFeatures()
    {
        return externalMemoryFeatures;
    }
    
    public void setExternalMemoryFeatures(
            EnumSet<VkExternalMemoryFeatureFlagBitsNV> externalMemoryFeatures)
    {
        this.externalMemoryFeatures = externalMemoryFeatures;
    }
    
    public EnumSet<VkExternalMemoryHandleTypeFlagBitsNV> getExportFromImportedHandleTypes()
    {
        return exportFromImportedHandleTypes;
    }
    
    public void setExportFromImportedHandleTypes(
            EnumSet<VkExternalMemoryHandleTypeFlagBitsNV> exportFromImportedHandleTypes)
    {
        this.exportFromImportedHandleTypes = exportFromImportedHandleTypes;
    }
    
    public EnumSet<VkExternalMemoryHandleTypeFlagBitsNV> getCompatibleHandleTypes()
    {
        return compatibleHandleTypes;
    }
    
    public void setCompatibleHandleTypes(
            EnumSet<VkExternalMemoryHandleTypeFlagBitsNV> compatibleHandleTypes)
    {
        this.compatibleHandleTypes = compatibleHandleTypes;
    }
}
