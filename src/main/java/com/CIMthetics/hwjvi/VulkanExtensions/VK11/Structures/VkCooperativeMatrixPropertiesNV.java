package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkComponentTypeNV;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkScopeNV;

public class VkCooperativeMatrixPropertiesNV extends VulkanCreateInfoStructure
{
    private long                pNext;
    private int                 mSize;
    private int                 nSize;
    private int                 kSize;
    private VkComponentTypeNV   aType;
    private VkComponentTypeNV   bType;
    private VkComponentTypeNV   cType;
    private VkComponentTypeNV   dType;
    private VkScopeNV           scope;

    public VkCooperativeMatrixPropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public int getmSize()
    {
        return mSize;
    }

    public void setmSize(int mSize)
    {
        this.mSize = mSize;
    }

    public int getnSize()
    {
        return nSize;
    }

    public void setnSize(int nSize)
    {
        this.nSize = nSize;
    }

    public int getkSize()
    {
        return kSize;
    }

    public void setkSize(int kSize)
    {
        this.kSize = kSize;
    }

    public VkComponentTypeNV getaType()
    {
        return aType;
    }

    public void setaType(VkComponentTypeNV aType)
    {
        this.aType = aType;
    }

    public VkComponentTypeNV getbType()
    {
        return bType;
    }

    public void setbType(VkComponentTypeNV bType)
    {
        this.bType = bType;
    }

    public VkComponentTypeNV getcType()
    {
        return cType;
    }

    public void setcType(VkComponentTypeNV cType)
    {
        this.cType = cType;
    }

    public VkComponentTypeNV getdType()
    {
        return dType;
    }

    public void setdType(VkComponentTypeNV dType)
    {
        this.dType = dType;
    }

    public VkScopeNV getScope()
    {
        return scope;
    }

    public void setScope(VkScopeNV scope)
    {
        this.scope = scope;
    }

}
