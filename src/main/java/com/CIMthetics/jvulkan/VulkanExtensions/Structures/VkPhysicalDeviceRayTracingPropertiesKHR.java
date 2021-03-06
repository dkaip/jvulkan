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

public class VkPhysicalDeviceRayTracingPropertiesKHR extends VulkanCreateInfoStructure
{
    private int     shaderGroupHandleSize;
    private int     maxRecursionDepth;
    private int     maxShaderGroupStride;
    private int     shaderGroupBaseAlignment;
    private long    maxGeometryCount;
    private long    maxInstanceCount;
    private long    maxPrimitiveCount;
    private int     maxDescriptorSetAccelerationStructures;
    private int     shaderGroupHandleCaptureReplaySize;

    public VkPhysicalDeviceRayTracingPropertiesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_KHR);
    }

    public int getShaderGroupHandleSize()
    {
        return shaderGroupHandleSize;
    }

    public void setShaderGroupHandleSize(int shaderGroupHandleSize)
    {
        this.shaderGroupHandleSize = shaderGroupHandleSize;
    }

    public int getMaxRecursionDepth()
    {
        return maxRecursionDepth;
    }

    public void setMaxRecursionDepth(int maxRecursionDepth)
    {
        this.maxRecursionDepth = maxRecursionDepth;
    }

    public int getMaxShaderGroupStride()
    {
        return maxShaderGroupStride;
    }

    public void setMaxShaderGroupStride(int maxShaderGroupStride)
    {
        this.maxShaderGroupStride = maxShaderGroupStride;
    }

    public int getShaderGroupBaseAlignment()
    {
        return shaderGroupBaseAlignment;
    }

    public void setShaderGroupBaseAlignment(int shaderGroupBaseAlignment)
    {
        this.shaderGroupBaseAlignment = shaderGroupBaseAlignment;
    }

    public long getMaxGeometryCount()
    {
        return maxGeometryCount;
    }

    public void setMaxGeometryCount(long maxGeometryCount)
    {
        this.maxGeometryCount = maxGeometryCount;
    }

    public long getMaxInstanceCount()
    {
        return maxInstanceCount;
    }

    public void setMaxInstanceCount(long maxInstanceCount)
    {
        this.maxInstanceCount = maxInstanceCount;
    }

    public long getMaxPrimitiveCount()
    {
        return maxPrimitiveCount;
    }

    public void setMaxPrimitiveCount(long maxPrimitiveCount)
    {
        this.maxPrimitiveCount = maxPrimitiveCount;
    }

    public int getMaxDescriptorSetAccelerationStructures()
    {
        return maxDescriptorSetAccelerationStructures;
    }

    public void setMaxDescriptorSetAccelerationStructures(
            int maxDescriptorSetAccelerationStructures)
    {
        this.maxDescriptorSetAccelerationStructures = maxDescriptorSetAccelerationStructures;
    }

    public int getShaderGroupHandleCaptureReplaySize()
    {
        return shaderGroupHandleCaptureReplaySize;
    }

    public void setShaderGroupHandleCaptureReplaySize(int shaderGroupHandleCaptureReplaySize)
    {
        this.shaderGroupHandleCaptureReplaySize = shaderGroupHandleCaptureReplaySize;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceRayTracingPropertiesNV\n"));
        sb.append(String.format("    shaderGroupHandleSize:%d\n", shaderGroupHandleSize));
        sb.append(String.format("    maxRecursionDepth:%d\n", maxRecursionDepth));
        sb.append(String.format("    maxShaderGroupStride:%d\n", maxShaderGroupStride));
        sb.append(String.format("    shaderGroupBaseAlignment:%d\n", shaderGroupBaseAlignment));
        sb.append(String.format("    maxGeometryCount:%d\n", maxGeometryCount));
        sb.append(String.format("    maxInstanceCount:%d\n", maxInstanceCount));
        sb.append(String.format("    maxPrimitiveCount:%d\n", maxPrimitiveCount));
        sb.append(String.format("    maxDescriptorSetAccelerationStructures:%d\n", maxDescriptorSetAccelerationStructures));
        sb.append(String.format("    shaderGroupHandleCaptureReplaySize:%d\n", shaderGroupHandleCaptureReplaySize));
        
        return sb.toString();
    }
}
