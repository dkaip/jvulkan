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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceVulkan11Features extends VulkanCreateInfoStructure
{
    private boolean storageBuffer16BitAccess;
    private boolean uniformAndStorageBuffer16BitAccess;
    private boolean storagePushConstant16;
    private boolean storageInputOutput16;
    private boolean multiview;
    private boolean multiviewGeometryShader;
    private boolean multiviewTessellationShader;
    private boolean variablePointersStorageBuffer;
    private boolean variablePointers;
    private boolean protectedMemory;
    private boolean samplerYcbcrConversion;
    private boolean shaderDrawParameters;

    public VkPhysicalDeviceVulkan11Features()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES);
    }

    public boolean isStorageBuffer16BitAccess()
    {
        return storageBuffer16BitAccess;
    }

    public void setStorageBuffer16BitAccess(boolean storageBuffer16BitAccess)
    {
        this.storageBuffer16BitAccess = storageBuffer16BitAccess;
    }

    public boolean isUniformAndStorageBuffer16BitAccess()
    {
        return uniformAndStorageBuffer16BitAccess;
    }

    public void setUniformAndStorageBuffer16BitAccess(boolean uniformAndStorageBuffer16BitAccess)
    {
        this.uniformAndStorageBuffer16BitAccess = uniformAndStorageBuffer16BitAccess;
    }

    public boolean isStoragePushConstant16()
    {
        return storagePushConstant16;
    }

    public void setStoragePushConstant16(boolean storagePushConstant16)
    {
        this.storagePushConstant16 = storagePushConstant16;
    }

    public boolean isStorageInputOutput16()
    {
        return storageInputOutput16;
    }

    public void setStorageInputOutput16(boolean storageInputOutput16)
    {
        this.storageInputOutput16 = storageInputOutput16;
    }

    public boolean isMultiview()
    {
        return multiview;
    }

    public void setMultiview(boolean multiview)
    {
        this.multiview = multiview;
    }

    public boolean isMultiviewGeometryShader()
    {
        return multiviewGeometryShader;
    }

    public void setMultiviewGeometryShader(boolean multiviewGeometryShader)
    {
        this.multiviewGeometryShader = multiviewGeometryShader;
    }

    public boolean isMultiviewTessellationShader()
    {
        return multiviewTessellationShader;
    }

    public void setMultiviewTessellationShader(boolean multiviewTessellationShader)
    {
        this.multiviewTessellationShader = multiviewTessellationShader;
    }

    public boolean isVariablePointersStorageBuffer()
    {
        return variablePointersStorageBuffer;
    }

    public void setVariablePointersStorageBuffer(boolean variablePointersStorageBuffer)
    {
        this.variablePointersStorageBuffer = variablePointersStorageBuffer;
    }

    public boolean isVariablePointers()
    {
        return variablePointers;
    }

    public void setVariablePointers(boolean variablePointers)
    {
        this.variablePointers = variablePointers;
    }

    public boolean isProtectedMemory()
    {
        return protectedMemory;
    }

    public void setProtectedMemory(boolean protectedMemory)
    {
        this.protectedMemory = protectedMemory;
    }

    public boolean isSamplerYcbcrConversion()
    {
        return samplerYcbcrConversion;
    }

    public void setSamplerYcbcrConversion(boolean samplerYcbcrConversion)
    {
        this.samplerYcbcrConversion = samplerYcbcrConversion;
    }

    public boolean isShaderDrawParameters()
    {
        return shaderDrawParameters;
    }

    public void setShaderDrawParameters(boolean shaderDrawParameters)
    {
        this.shaderDrawParameters = shaderDrawParameters;
    }
}
