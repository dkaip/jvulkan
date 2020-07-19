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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkGeometryAABBNV extends VulkanCreateInfoStructure
{
    private VkBuffer    aabbData;
    private int         numAABBs;
    private int         stride;
    private long        offset;

    public VkGeometryAABBNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV);
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
