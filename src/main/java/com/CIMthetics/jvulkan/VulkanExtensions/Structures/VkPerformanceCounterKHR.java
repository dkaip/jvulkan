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
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPerformanceCounterScopeKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPerformanceCounterStorageKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPerformanceCounterUnitKHR;

public class VkPerformanceCounterKHR extends VulkanCreateInfoStructure
{
    private VkPerformanceCounterUnitKHR       unit;
    private VkPerformanceCounterScopeKHR      scope;
    private VkPerformanceCounterStorageKHR    storage;
    private long[]                            uuid;

    public VkPerformanceCounterKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR);
    }

    public VkPerformanceCounterUnitKHR getUnit()
    {
        return unit;
    }

    public void setUnit(VkPerformanceCounterUnitKHR unit)
    {
        this.unit = unit;
    }

    public VkPerformanceCounterScopeKHR getScope()
    {
        return scope;
    }

    public void setScope(VkPerformanceCounterScopeKHR scope)
    {
        this.scope = scope;
    }

    public VkPerformanceCounterStorageKHR getStorage()
    {
        return storage;
    }

    public void setStorage(VkPerformanceCounterStorageKHR storage)
    {
        this.storage = storage;
    }

    public long[] getUuid()
    {
        return uuid;
    }

    public void setUuid(long[] uuid)
    {
        this.uuid = uuid;
    }
}
