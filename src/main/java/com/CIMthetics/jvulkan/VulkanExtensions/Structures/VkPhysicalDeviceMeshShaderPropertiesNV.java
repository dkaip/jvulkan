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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import java.util.Arrays;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceMeshShaderPropertiesNV extends VulkanCreateInfoStructure
{
    private int     maxDrawMeshTasksCount;
    private int     maxTaskWorkGroupInvocations;
    private int[]   maxTaskWorkGroupSize;
    private int     maxTaskTotalMemorySize;
    private int     maxTaskOutputCount;
    private int     maxMeshWorkGroupInvocations;
    private int[]   maxMeshWorkGroupSize;
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

    public void setMaxTaskWorkGroupSize(int[] maxTaskWorkGroupSize)
    {
        this.maxTaskWorkGroupSize = maxTaskWorkGroupSize;
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

    public void setMaxMeshWorkGroupSize(int[] maxMeshWorkGroupSize)
    {
        this.maxMeshWorkGroupSize = maxMeshWorkGroupSize;
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

    @Override
    public String toString()
    {
        if (maxTaskWorkGroupSize == null)
            maxTaskWorkGroupSize = new int[0];
        
        if (maxMeshWorkGroupSize == null)
            maxMeshWorkGroupSize = new int[0];
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceMeshShaderPropertiesNV\n"));
        sb.append(String.format("    maxDrawMeshTasksCount:%d\n", maxDrawMeshTasksCount));
        sb.append(String.format("    maxTaskWorkGroupInvocations:%d\n", maxTaskWorkGroupInvocations));
        sb.append(String.format("    maxTaskWorkGroupSize:%s\n", Arrays.toString(maxTaskWorkGroupSize)));
        sb.append(String.format("    maxTaskTotalMemorySize:%d\n", maxTaskTotalMemorySize));
        sb.append(String.format("    maxTaskOutputCount:%d\n", maxTaskOutputCount));
        sb.append(String.format("    maxMeshWorkGroupInvocations:%d\n", maxMeshWorkGroupInvocations));
        sb.append(String.format("    maxMeshWorkGroupSize:%s\n", Arrays.toString(maxMeshWorkGroupSize)));
        sb.append(String.format("    maxMeshTotalMemorySize:%d\n", maxMeshTotalMemorySize));
        sb.append(String.format("    maxMeshOutputVertices:%d\n", maxMeshOutputVertices));
        sb.append(String.format("    maxMeshOutputPrimitives:%d\n", maxMeshOutputPrimitives));
        sb.append(String.format("    maxMeshMultiviewViewCount:%d\n", maxMeshMultiviewViewCount));
        sb.append(String.format("    meshOutputPerVertexGranularity:%d\n", meshOutputPerVertexGranularity));
        sb.append(String.format("    meshOutputPerPrimitiveGranularity:%d\n", meshOutputPerPrimitiveGranularity));
        
        return sb.toString();
    }
}
