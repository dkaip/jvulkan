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
