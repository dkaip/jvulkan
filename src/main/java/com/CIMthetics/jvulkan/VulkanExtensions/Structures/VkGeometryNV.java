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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkGeometryFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkGeometryTypeKHR;

public class VkGeometryNV extends VulkanCreateInfoStructure
{
    private VkGeometryTypeKHR               geometryType;
    private VkGeometryDataNV                geometry;
    private EnumSet<VkGeometryFlagBitsKHR>  flags = EnumSet.noneOf(VkGeometryFlagBitsKHR.class);

    public VkGeometryNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GEOMETRY_NV);
    }

    public VkGeometryTypeKHR getGeometryType()
    {
        return geometryType;
    }

    public void setGeometryType(VkGeometryTypeKHR geometryType)
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

    public EnumSet<VkGeometryFlagBitsKHR> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkGeometryFlagBitsKHR> flags)
    {
        this.flags = flags;
    }
}
