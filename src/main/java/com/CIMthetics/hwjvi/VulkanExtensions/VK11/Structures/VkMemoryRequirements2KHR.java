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
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkMemoryRequirements;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkMemoryRequirements2KHR extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private VkMemoryRequirements    memoryRequirements;

    public VkMemoryRequirements2KHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkMemoryRequirements getMemoryRequirements()
    {
        return memoryRequirements;
    }

    public void setMemoryRequirements(VkMemoryRequirements memoryRequirements)
    {
        this.memoryRequirements = memoryRequirements;
    }
}
