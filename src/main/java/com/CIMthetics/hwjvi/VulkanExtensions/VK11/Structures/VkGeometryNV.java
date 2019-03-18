package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkGeometryFlagBitsNV;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkGeometryTypeNV;

public class VkGeometryNV extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private VkGeometryTypeNV               geometryType;
    private VkGeometryDataNV               geometry;
    private EnumSet<VkGeometryFlagBitsNV>  flags = EnumSet.noneOf(VkGeometryFlagBitsNV.class);

    public VkGeometryNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GEOMETRY_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkGeometryTypeNV getGeometryType()
    {
        return geometryType;
    }

    public void setGeometryType(VkGeometryTypeNV geometryType)
    {
        this.geometryType = geometryType;
    }

    public VkGeometryDataNV getGeometry()
    {
        return geometry;
    }

    public void setGeometry(VkGeometryDataNV geometry)
    {
        this.geometry = geometry;
    }

    public EnumSet<VkGeometryFlagBitsNV> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkGeometryFlagBitsNV> flags)
    {
        this.flags = flags;
    }
}
