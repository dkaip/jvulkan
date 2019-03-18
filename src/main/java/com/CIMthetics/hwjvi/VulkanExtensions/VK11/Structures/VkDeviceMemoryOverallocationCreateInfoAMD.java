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

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkMemoryOverallocationBehaviorAMD;

public class VkDeviceMemoryOverallocationCreateInfoAMD extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private VkMemoryOverallocationBehaviorAMD   overallocationBehavior;

    public VkDeviceMemoryOverallocationCreateInfoAMD()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkMemoryOverallocationBehaviorAMD getOverallocationBehavior()
    {
        return overallocationBehavior;
    }

    public void setOverallocationBehavior(
            VkMemoryOverallocationBehaviorAMD overallocationBehavior)
    {
        this.overallocationBehavior = overallocationBehavior;
    }

}
