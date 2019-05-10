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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceCooperativeMatrixFeaturesNV extends VulkanCreateInfoStructure
{
    private boolean cooperativeMatrix;
    private boolean cooperativeMatrixRobustBufferAccess;

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV);
    }

    public boolean isCooperativeMatrix()
    {
        return cooperativeMatrix;
    }

    public void setCooperativeMatrix(boolean cooperativeMatrix)
    {
        this.cooperativeMatrix = cooperativeMatrix;
    }

    public boolean isCooperativeMatrixRobustBufferAccess()
    {
        return cooperativeMatrixRobustBufferAccess;
    }

    public void setCooperativeMatrixRobustBufferAccess(
            boolean cooperativeMatrixRobustBufferAccess)
    {
        this.cooperativeMatrixRobustBufferAccess = cooperativeMatrixRobustBufferAccess;
    }

}
