package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

public class VkGeometryDataNV
{
    private VkGeometryTrianglesNV    triangles;
    private VkGeometryAABBNV         aabbs;
    
    public VkGeometryDataNV(VkGeometryTrianglesNV triangles, VkGeometryAABBNV aabbs)
    {
        this.triangles = triangles;
        this.aabbs     = aabbs;
    }
    
    public VkGeometryTrianglesNV getTriangles()
    {
        return triangles;
    }
    
    public void setTriangles(VkGeometryTrianglesNV triangles)
    {
        this.triangles = triangles;
    }
    
    public VkGeometryAABBNV getAabbs()
    {
        return aabbs;
    }
    
    public void setAabbs(VkGeometryAABBNV aabbs)
    {
        this.aabbs = aabbs;
    }
}
