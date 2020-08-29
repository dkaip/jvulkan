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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceRobustness2FeaturesEXT extends VulkanCreateInfoStructure
{
    private boolean robustBufferAccess2;
    private boolean robustImageAccess2;
    private boolean nullDescriptor;

    public VkPhysicalDeviceRobustness2FeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT);
    }

    public boolean isRobustBufferAccess2()
    {
        return robustBufferAccess2;
    }

    public void setRobustBufferAccess2(boolean robustBufferAccess2)
    {
        this.robustBufferAccess2 = robustBufferAccess2;
    }

    public boolean isRobustImageAccess2()
    {
        return robustImageAccess2;
    }

    public void setRobustImageAccess2(boolean robustImageAccess2)
    {
        this.robustImageAccess2 = robustImageAccess2;
    }

    public boolean isNullDescriptor()
    {
        return nullDescriptor;
    }

    public void setNullDescriptor(boolean nullDescriptor)
    {
        this.nullDescriptor = nullDescriptor;
    }
}
