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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceMeshShaderPropertiesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private int     maxDrawMeshTasksCount;
    private int     maxTaskWorkGroupInvocations;
    private int[]   maxTaskWorkGroupSize = new int[3];
    private int     maxTaskTotalMemorySize;
    private int     maxTaskOutputCount;
    private int     maxMeshWorkGroupInvocations;
    private int[]   maxMeshWorkGroupSize = new int[3];
    private int     maxMeshTotalMemorySize;
    private int     maxMeshOutputVertices;
    private int     maxMeshOutputPrimitives;
    private int     maxMeshMultiviewViewCount;
    private int     meshOutputPerVertexGranularity;
    private int     meshOutputPerPrimitiveGranularity;

    public VkPhysicalDeviceMeshShaderPropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public int getMaxDrawMeshTasksCount()
    {
        return maxDrawMeshTasksCount;
    }

    public void setMaxDrawMeshTasksCount(int maxDrawMeshTasksCount)
    {
        this.maxDrawMeshTasksCount = maxDrawMeshTasksCount;
    }

    public int getMaxTaskWorkGroupInvocations()
    {
        return maxTaskWorkGroupInvocations;
    }

    public void setMaxTaskWorkGroupInvocations(int maxTaskWorkGroupInvocations)
    {
        this.maxTaskWorkGroupInvocations = maxTaskWorkGroupInvocations;
    }

    public int[] getMaxTaskWorkGroupSize()
    {
        return maxTaskWorkGroupSize;
    }

    public int getMaxTaskTotalMemorySize()
    {
        return maxTaskTotalMemorySize;
    }

    public void setMaxTaskTotalMemorySize(int maxTaskTotalMemorySize)
    {
        this.maxTaskTotalMemorySize = maxTaskTotalMemorySize;
    }

    public int getMaxTaskOutputCount()
    {
        return maxTaskOutputCount;
    }

    public void setMaxTaskOutputCount(int maxTaskOutputCount)
    {
        this.maxTaskOutputCount = maxTaskOutputCount;
    }

    public int getMaxMeshWorkGroupInvocations()
    {
        return maxMeshWorkGroupInvocations;
    }

    public void setMaxMeshWorkGroupInvocations(int maxMeshWorkGroupInvocations)
    {
        this.maxMeshWorkGroupInvocations = maxMeshWorkGroupInvocations;
    }

    public int[] getMaxMeshWorkGroupSize()
    {
        return maxMeshWorkGroupSize;
    }

    public int getMaxMeshTotalMemorySize()
    {
        return maxMeshTotalMemorySize;
    }

    public void setMaxMeshTotalMemorySize(int maxMeshTotalMemorySize)
    {
        this.maxMeshTotalMemorySize = maxMeshTotalMemorySize;
    }

    public int getMaxMeshOutputVertices()
    {
        return maxMeshOutputVertices;
    }

    public void setMaxMeshOutputVertices(int maxMeshOutputVertices)
    {
        this.maxMeshOutputVertices = maxMeshOutputVertices;
    }

    public int getMaxMeshOutputPrimitives()
    {
        return maxMeshOutputPrimitives;
    }

    public void setMaxMeshOutputPrimitives(int maxMeshOutputPrimitives)
    {
        this.maxMeshOutputPrimitives = maxMeshOutputPrimitives;
    }

    public int getMaxMeshMultiviewViewCount()
    {
        return maxMeshMultiviewViewCount;
    }

    public void setMaxMeshMultiviewViewCount(int maxMeshMultiviewViewCount)
    {
        this.maxMeshMultiviewViewCount = maxMeshMultiviewViewCount;
    }

    public int getMeshOutputPerVertexGranularity()
    {
        return meshOutputPerVertexGranularity;
    }

    public void setMeshOutputPerVertexGranularity(
            int meshOutputPerVertexGranularity)
    {
        this.meshOutputPerVertexGranularity = meshOutputPerVertexGranularity;
    }

    public int getMeshOutputPerPrimitiveGranularity()
    {
        return meshOutputPerPrimitiveGranularity;
    }

    public void setMeshOutputPerPrimitiveGranularity(
            int meshOutputPerPrimitiveGranularity)
    {
        this.meshOutputPerPrimitiveGranularity = meshOutputPerPrimitiveGranularity;
    }
}
