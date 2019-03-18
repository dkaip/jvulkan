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

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkAccelerationStructureTypeNV;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkBuildAccelerationStructureFlagBitsNV;

public class VkAccelerationStructureInfoNV extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private VkAccelerationStructureTypeNV                   type;
    private EnumSet<VkBuildAccelerationStructureFlagBitsNV> flags = EnumSet.noneOf(VkBuildAccelerationStructureFlagBitsNV.class);
    private int                                             instanceCount;
    private Collection<VkGeometryNV>                        geometries;

    public VkAccelerationStructureInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkAccelerationStructureTypeNV getType()
    {
        return type;
    }

    public void setType(VkAccelerationStructureTypeNV type)
    {
        this.type = type;
    }

    public EnumSet<VkBuildAccelerationStructureFlagBitsNV> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkBuildAccelerationStructureFlagBitsNV> flags)
    {
        this.flags = flags;
    }

    public int getInstanceCount()
    {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount)
    {
        this.instanceCount = instanceCount;
    }

    public Collection<VkGeometryNV> getGeometries()
    {
        return geometries;
    }

    public void setGeometries(Collection<VkGeometryNV> geometries)
    {
        this.geometries = geometries;
    }

}
