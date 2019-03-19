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
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;

public class VkPhysicalDeviceTransformFeedbackFeaturesEXT extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private VkAccelerationStructureNV  accelerationStructure;
    private boolean                     transformFeedback;
    private boolean                     geometryStreams;
    
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkAccelerationStructureNV getAccelerationStructure()
    {
        return accelerationStructure;
    }

    public void setAccelerationStructure(
            VkAccelerationStructureNV accelerationStructure)
    {
        this.accelerationStructure = accelerationStructure;
    }

    public boolean isTransformFeedback()
    {
        return transformFeedback;
    }

    public void setTransformFeedback(boolean transformFeedback)
    {
        this.transformFeedback = transformFeedback;
    }

    public boolean isGeometryStreams()
    {
        return geometryStreams;
    }

    public void setGeometryStreams(boolean geometryStreams)
    {
        this.geometryStreams = geometryStreams;
    }

}
