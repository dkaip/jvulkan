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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPerformanceOverrideTypeINTEL;

public class VkPerformanceOverrideInfoINTEL extends VulkanCreateInfoStructure
{
    private VkPerformanceOverrideTypeINTEL  type;
    private boolean                         enable;
    private long                            parameter;
    
    public VkPerformanceOverrideInfoINTEL()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL);
    }

    public VkPerformanceOverrideTypeINTEL getType()
    {
        return type;
    }

    public void setType(VkPerformanceOverrideTypeINTEL type)
    {
        this.type = type;
    }

    public boolean isEnable()
    {
        return enable;
    }

    public void setEnable(boolean enable)
    {
        this.enable = enable;
    }

    public long getParameter()
    {
        return parameter;
    }

    public void setParameter(long parameter)
    {
        this.parameter = parameter;
    }
}
