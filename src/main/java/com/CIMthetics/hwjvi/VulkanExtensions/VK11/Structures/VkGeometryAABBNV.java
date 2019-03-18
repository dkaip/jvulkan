package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkGeometryAABBNV extends VulkanCreateInfoStructure
{
    private long        pNext;
    private VkBuffer    aabbData;
    private int         numAABBs;
    private int         stride;
    private long        offset;

    public VkGeometryAABBNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkBuffer getAabbData()
    {
        return aabbData;
    }

    public void setAabbData(VkBuffer aabbData)
    {
        this.aabbData = aabbData;
    }

    public int getNumAABBs()
    {
        return numAABBs;
    }

    public void setNumAABBs(int numAABBs)
    {
        this.numAABBs = numAABBs;
    }

    public int getStride()
    {
        return stride;
    }

    public void setStride(int stride)
    {
        this.stride = stride;
    }

    public long getOffset()
    {
        return offset;
    }

    public void setOffset(long offset)
    {
        this.offset = offset;
    }
}
