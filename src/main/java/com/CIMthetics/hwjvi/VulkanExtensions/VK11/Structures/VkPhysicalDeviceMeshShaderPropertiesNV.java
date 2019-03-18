package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

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
