/*
 * Copyright 2020 Douglas Kaip
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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkGeometryInstanceFlagBitsKHR;

public class VkAccelerationStructureInstanceKHR
{
    private VkTransformMatrixKHR                    transform;
    private int                                     instanceCustomIndex;
    private int                                     mask;
    private int                                     instanceShaderBindingTableRecordOffset;
    private EnumSet<VkGeometryInstanceFlagBitsKHR>  flags;
    private long                                    accelerationStructureReference;
    
    public VkTransformMatrixKHR getTransform()
    {
        return transform;
    }
    
    public void setTransform(VkTransformMatrixKHR transform)
    {
        this.transform = transform;
    }
    
    public int getInstanceCustomIndex()
    {
        return instanceCustomIndex;
    }
    
    public void setInstanceCustomIndex(int instanceCustomIndex)
    {
        this.instanceCustomIndex = instanceCustomIndex;
    }
    
    public int getMask()
    {
        return mask;
    }
    
    public void setMask(int mask)
    {
        this.mask = mask;
    }
    
    public int getInstanceShaderBindingTableRecordOffset()
    {
        return instanceShaderBindingTableRecordOffset;
    }
    
    public void setInstanceShaderBindingTableRecordOffset(int instanceShaderBindingTableRecordOffset)
    {
        this.instanceShaderBindingTableRecordOffset = instanceShaderBindingTableRecordOffset;
    }
    
    public EnumSet<VkGeometryInstanceFlagBitsKHR> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkGeometryInstanceFlagBitsKHR> flags)
    {
        this.flags = flags;
    }

    public long getAccelerationStructureReference()
    {
        return accelerationStructureReference;
    }

    public void setAccelerationStructureReference(long accelerationStructureReference)
    {
        this.accelerationStructureReference = accelerationStructureReference;
    }
}
