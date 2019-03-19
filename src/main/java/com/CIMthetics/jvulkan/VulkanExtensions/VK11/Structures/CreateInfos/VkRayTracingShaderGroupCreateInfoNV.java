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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkRayTracingShaderGroupTypeNV;

public class VkRayTracingShaderGroupCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private VkRayTracingShaderGroupTypeNV   type;
    private int                             generalShader;
    private int                             closestHitShader;
    private int                             anyHitShader;
    private int                             intersectionShader;

    public VkRayTracingShaderGroupCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkRayTracingShaderGroupTypeNV getType()
    {
        return type;
    }

    public void setType(VkRayTracingShaderGroupTypeNV type)
    {
        this.type = type;
    }

    public int getGeneralShader()
    {
        return generalShader;
    }

    public void setGeneralShader(int generalShader)
    {
        this.generalShader = generalShader;
    }

    public int getClosestHitShader()
    {
        return closestHitShader;
    }

    public void setClosestHitShader(int closestHitShader)
    {
        this.closestHitShader = closestHitShader;
    }

    public int getAnyHitShader()
    {
        return anyHitShader;
    }

    public void setAnyHitShader(int anyHitShader)
    {
        this.anyHitShader = anyHitShader;
    }

    public int getIntersectionShader()
    {
        return intersectionShader;
    }

    public void setIntersectionShader(int intersectionShader)
    {
        this.intersectionShader = intersectionShader;
    }

}