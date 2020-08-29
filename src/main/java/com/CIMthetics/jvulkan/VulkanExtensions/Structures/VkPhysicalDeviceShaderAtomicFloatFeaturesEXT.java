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

public class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT extends VulkanCreateInfoStructure
{
    private boolean shaderBufferFloat32Atomics;
    private boolean shaderBufferFloat32AtomicAdd;
    private boolean shaderBufferFloat64Atomics;
    private boolean shaderBufferFloat64AtomicAdd;
    private boolean shaderSharedFloat32Atomics;
    private boolean shaderSharedFloat32AtomicAdd;
    private boolean shaderSharedFloat64Atomics;
    private boolean shaderSharedFloat64AtomicAdd;
    private boolean shaderImageFloat32Atomics;
    private boolean shaderImageFloat32AtomicAdd;
    private boolean sparseImageFloat32Atomics;
    private boolean sparseImageFloat32AtomicAdd;

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
    }

    public boolean isShaderBufferFloat32Atomics()
    {
        return shaderBufferFloat32Atomics;
    }

    public void setShaderBufferFloat32Atomics(boolean shaderBufferFloat32Atomics)
    {
        this.shaderBufferFloat32Atomics = shaderBufferFloat32Atomics;
    }

    public boolean isShaderBufferFloat32AtomicAdd()
    {
        return shaderBufferFloat32AtomicAdd;
    }

    public void setShaderBufferFloat32AtomicAdd(boolean shaderBufferFloat32AtomicAdd)
    {
        this.shaderBufferFloat32AtomicAdd = shaderBufferFloat32AtomicAdd;
    }

    public boolean isShaderBufferFloat64Atomics()
    {
        return shaderBufferFloat64Atomics;
    }

    public void setShaderBufferFloat64Atomics(boolean shaderBufferFloat64Atomics)
    {
        this.shaderBufferFloat64Atomics = shaderBufferFloat64Atomics;
    }

    public boolean isShaderBufferFloat64AtomicAdd()
    {
        return shaderBufferFloat64AtomicAdd;
    }

    public void setShaderBufferFloat64AtomicAdd(boolean shaderBufferFloat64AtomicAdd)
    {
        this.shaderBufferFloat64AtomicAdd = shaderBufferFloat64AtomicAdd;
    }

    public boolean isShaderSharedFloat32Atomics()
    {
        return shaderSharedFloat32Atomics;
    }

    public void setShaderSharedFloat32Atomics(boolean shaderSharedFloat32Atomics)
    {
        this.shaderSharedFloat32Atomics = shaderSharedFloat32Atomics;
    }

    public boolean isShaderSharedFloat32AtomicAdd()
    {
        return shaderSharedFloat32AtomicAdd;
    }

    public void setShaderSharedFloat32AtomicAdd(boolean shaderSharedFloat32AtomicAdd)
    {
        this.shaderSharedFloat32AtomicAdd = shaderSharedFloat32AtomicAdd;
    }

    public boolean isShaderSharedFloat64Atomics()
    {
        return shaderSharedFloat64Atomics;
    }

    public void setShaderSharedFloat64Atomics(boolean shaderSharedFloat64Atomics)
    {
        this.shaderSharedFloat64Atomics = shaderSharedFloat64Atomics;
    }

    public boolean isShaderSharedFloat64AtomicAdd()
    {
        return shaderSharedFloat64AtomicAdd;
    }

    public void setShaderSharedFloat64AtomicAdd(boolean shaderSharedFloat64AtomicAdd)
    {
        this.shaderSharedFloat64AtomicAdd = shaderSharedFloat64AtomicAdd;
    }

    public boolean isShaderImageFloat32Atomics()
    {
        return shaderImageFloat32Atomics;
    }

    public void setShaderImageFloat32Atomics(boolean shaderImageFloat32Atomics)
    {
        this.shaderImageFloat32Atomics = shaderImageFloat32Atomics;
    }

    public boolean isShaderImageFloat32AtomicAdd()
    {
        return shaderImageFloat32AtomicAdd;
    }

    public void setShaderImageFloat32AtomicAdd(boolean shaderImageFloat32AtomicAdd)
    {
        this.shaderImageFloat32AtomicAdd = shaderImageFloat32AtomicAdd;
    }

    public boolean isSparseImageFloat32Atomics()
    {
        return sparseImageFloat32Atomics;
    }

    public void setSparseImageFloat32Atomics(boolean sparseImageFloat32Atomics)
    {
        this.sparseImageFloat32Atomics = sparseImageFloat32Atomics;
    }

    public boolean isSparseImageFloat32AtomicAdd()
    {
        return sparseImageFloat32AtomicAdd;
    }

    public void setSparseImageFloat32AtomicAdd(boolean sparseImageFloat32AtomicAdd)
    {
        this.sparseImageFloat32AtomicAdd = sparseImageFloat32AtomicAdd;
    }
}
