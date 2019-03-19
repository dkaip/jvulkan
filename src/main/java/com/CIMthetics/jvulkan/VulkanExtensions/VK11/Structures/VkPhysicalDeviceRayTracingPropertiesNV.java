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

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceRayTracingPropertiesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private int     shaderGroupHandleSize;
    private int     maxRecursionDepth;
    private int     maxShaderGroupStride;
    private int     shaderGroupBaseAlignment;
    private long    maxGeometryCount;
    private long    maxInstanceCount;
    private long    maxTriangleCount;
    private int     maxDescriptorSetAccelerationStructures;

    public VkPhysicalDeviceRayTracingPropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
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

    public long getMaxTriangleCount()
    {
        return maxTriangleCount;
    }

    public void setMaxTriangleCount(long maxTriangleCount)
    {
        this.maxTriangleCount = maxTriangleCount;
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

}
