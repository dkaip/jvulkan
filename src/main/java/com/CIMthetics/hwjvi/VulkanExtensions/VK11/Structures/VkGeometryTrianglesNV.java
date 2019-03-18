package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkIndexType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkGeometryTrianglesNV extends VulkanCreateInfoStructure
{
    private long        pNext;
    private VkBuffer    vertexData;
    private long        vertexOffset;
    private int         vertexCount;
    private long        vertexStride;
    private VkFormat    vertexFormat;
    private VkBuffer    indexData;
    private long        indexOffset;
    private int         indexCount;
    private VkIndexType indexType;
    private VkBuffer    transformData;
    private long        transformOffset;

    public VkGeometryTrianglesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkBuffer getVertexData()
    {
        return vertexData;
    }

    public void setVertexData(VkBuffer vertexData)
    {
        this.vertexData = vertexData;
    }

    public long getVertexOffset()
    {
        return vertexOffset;
    }

    public void setVertexOffset(long vertexOffset)
    {
        this.vertexOffset = vertexOffset;
    }

    public int getVertexCount()
    {
        return vertexCount;
    }

    public void setVertexCount(int vertexCount)
    {
        this.vertexCount = vertexCount;
    }

    public long getVertexStride()
    {
        return vertexStride;
    }

    public void setVertexStride(long vertexStride)
    {
        this.vertexStride = vertexStride;
    }

    public VkFormat getVertexFormat()
    {
        return vertexFormat;
    }

    public void setVertexFormat(VkFormat vertexFormat)
    {
        this.vertexFormat = vertexFormat;
    }

    public VkBuffer getIndexData()
    {
        return indexData;
    }

    public void setIndexData(VkBuffer indexData)
    {
        this.indexData = indexData;
    }

    public long getIndexOffset()
    {
        return indexOffset;
    }

    public void setIndexOffset(long indexOffset)
    {
        this.indexOffset = indexOffset;
    }

    public int getIndexCount()
    {
        return indexCount;
    }

    public void setIndexCount(int indexCount)
    {
        this.indexCount = indexCount;
    }

    public VkIndexType getIndexType()
    {
        return indexType;
    }

    public void setIndexType(VkIndexType indexType)
    {
        this.indexType = indexType;
    }

    public VkBuffer getTransformData()
    {
        return transformData;
    }

    public void setTransformData(VkBuffer transformData)
    {
        this.transformData = transformData;
    }

    public long getTransformOffset()
    {
        return transformOffset;
    }

    public void setTransformOffset(long transformOffset)
    {
        this.transformOffset = transformOffset;
    }
}
