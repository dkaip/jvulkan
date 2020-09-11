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

public class VkPhysicalDeviceRayTracingFeaturesKHR extends VulkanCreateInfoStructure
{
    private boolean rayTracing;
    private boolean rayTracingShaderGroupHandleCaptureReplay;
    private boolean rayTracingShaderGroupHandleCaptureReplayMixed;
    private boolean rayTracingAccelerationStructureCaptureReplay;
    private boolean rayTracingIndirectTraceRays;
    private boolean rayTracingIndirectAccelerationStructureBuild;
    private boolean rayTracingHostAccelerationStructureCommands;
    private boolean rayQuery;
    private boolean rayTracingPrimitiveCulling;

    public VkPhysicalDeviceRayTracingFeaturesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_FEATURES_KHR);
    }

    public boolean isRayTracing()
    {
        return rayTracing;
    }

    public void setRayTracing(boolean rayTracing)
    {
        this.rayTracing = rayTracing;
    }

    public boolean isRayTracingShaderGroupHandleCaptureReplay()
    {
        return rayTracingShaderGroupHandleCaptureReplay;
    }

    public void setRayTracingShaderGroupHandleCaptureReplay(boolean rayTracingShaderGroupHandleCaptureReplay)
    {
        this.rayTracingShaderGroupHandleCaptureReplay = rayTracingShaderGroupHandleCaptureReplay;
    }

    public boolean isRayTracingShaderGroupHandleCaptureReplayMixed()
    {
        return rayTracingShaderGroupHandleCaptureReplayMixed;
    }

    public void setRayTracingShaderGroupHandleCaptureReplayMixed(boolean rayTracingShaderGroupHandleCaptureReplayMixed)
    {
        this.rayTracingShaderGroupHandleCaptureReplayMixed = rayTracingShaderGroupHandleCaptureReplayMixed;
    }

    public boolean isRayTracingAccelerationStructureCaptureReplay()
    {
        return rayTracingAccelerationStructureCaptureReplay;
    }

    public void setRayTracingAccelerationStructureCaptureReplay(boolean rayTracingAccelerationStructureCaptureReplay)
    {
        this.rayTracingAccelerationStructureCaptureReplay = rayTracingAccelerationStructureCaptureReplay;
    }

    public boolean isRayTracingIndirectTraceRays()
    {
        return rayTracingIndirectTraceRays;
    }

    public void setRayTracingIndirectTraceRays(boolean rayTracingIndirectTraceRays)
    {
        this.rayTracingIndirectTraceRays = rayTracingIndirectTraceRays;
    }

    public boolean isRayTracingIndirectAccelerationStructureBuild()
    {
        return rayTracingIndirectAccelerationStructureBuild;
    }

    public void setRayTracingIndirectAccelerationStructureBuild(boolean rayTracingIndirectAccelerationStructureBuild)
    {
        this.rayTracingIndirectAccelerationStructureBuild = rayTracingIndirectAccelerationStructureBuild;
    }

    public boolean isRayTracingHostAccelerationStructureCommands()
    {
        return rayTracingHostAccelerationStructureCommands;
    }

    public void setRayTracingHostAccelerationStructureCommands(boolean rayTracingHostAccelerationStructureCommands)
    {
        this.rayTracingHostAccelerationStructureCommands = rayTracingHostAccelerationStructureCommands;
    }

    public boolean isRayQuery()
    {
        return rayQuery;
    }

    public void setRayQuery(boolean rayQuery)
    {
        this.rayQuery = rayQuery;
    }

    public boolean isRayTracingPrimitiveCulling()
    {
        return rayTracingPrimitiveCulling;
    }

    public void setRayTracingPrimitiveCulling(boolean rayTracingPrimitiveCulling)
    {
        this.rayTracingPrimitiveCulling = rayTracingPrimitiveCulling;
    }
}
