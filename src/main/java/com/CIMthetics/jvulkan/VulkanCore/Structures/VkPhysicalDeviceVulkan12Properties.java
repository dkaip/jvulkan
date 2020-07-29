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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDriverId;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkResolveModeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSampleCountFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderFloatControlsIndependence;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceVulkan12Properties extends VulkanCreateInfoStructure
{
    private VkDriverId                          driverID;
    private String                              driverName;
    private String                              driverInfo;
    private VkConformanceVersion                conformanceVersion;
    private VkShaderFloatControlsIndependence   denormBehaviorIndependence;
    private VkShaderFloatControlsIndependence   roundingModeIndependence;
    private boolean                             shaderSignedZeroInfNanPreserveFloat16;
    private boolean                             shaderSignedZeroInfNanPreserveFloat32;
    private boolean                             shaderSignedZeroInfNanPreserveFloat64;
    private boolean                             shaderDenormPreserveFloat16;
    private boolean                             shaderDenormPreserveFloat32;
    private boolean                             shaderDenormPreserveFloat64;
    private boolean                             shaderDenormFlushToZeroFloat16;
    private boolean                             shaderDenormFlushToZeroFloat32;
    private boolean                             shaderDenormFlushToZeroFloat64;
    private boolean                             shaderRoundingModeRTEFloat16;
    private boolean                             shaderRoundingModeRTEFloat32;
    private boolean                             shaderRoundingModeRTEFloat64;
    private boolean                             shaderRoundingModeRTZFloat16;
    private boolean                             shaderRoundingModeRTZFloat32;
    private boolean                             shaderRoundingModeRTZFloat64;
    private int                                 maxUpdateAfterBindDescriptorsInAllPools;
    private boolean                             shaderUniformBufferArrayNonUniformIndexingNative;
    private boolean                             shaderSampledImageArrayNonUniformIndexingNative;
    private boolean                             shaderStorageBufferArrayNonUniformIndexingNative;
    private boolean                             shaderStorageImageArrayNonUniformIndexingNative;
    private boolean                             shaderInputAttachmentArrayNonUniformIndexingNative;
    private boolean                             robustBufferAccessUpdateAfterBind;
    private boolean                             quadDivergentImplicitLod;
    private int                                 maxPerStageDescriptorUpdateAfterBindSamplers;
    private int                                 maxPerStageDescriptorUpdateAfterBindUniformBuffers;
    private int                                 maxPerStageDescriptorUpdateAfterBindStorageBuffers;
    private int                                 maxPerStageDescriptorUpdateAfterBindSampledImages;
    private int                                 maxPerStageDescriptorUpdateAfterBindStorageImages;
    private int                                 maxPerStageDescriptorUpdateAfterBindInputAttachments;
    private int                                 maxPerStageUpdateAfterBindResources;
    private int                                 maxDescriptorSetUpdateAfterBindSamplers;
    private int                                 maxDescriptorSetUpdateAfterBindUniformBuffers;
    private int                                 maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
    private int                                 maxDescriptorSetUpdateAfterBindStorageBuffers;
    private int                                 maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
    private int                                 maxDescriptorSetUpdateAfterBindSampledImages;
    private int                                 maxDescriptorSetUpdateAfterBindStorageImages;
    private int                                 maxDescriptorSetUpdateAfterBindInputAttachments;
    private EnumSet<VkResolveModeFlagBits>      supportedDepthResolveModes = EnumSet.noneOf(VkResolveModeFlagBits.class);
    private EnumSet<VkResolveModeFlagBits>      supportedStencilResolveModes = EnumSet.noneOf(VkResolveModeFlagBits.class);
    private boolean                             independentResolveNone;
    private boolean                             independentResolve;
    private boolean                             filterMinmaxSingleComponentFormats;
    private boolean                             filterMinmaxImageComponentMapping;
    private long                                maxTimelineSemaphoreValueDifference;
    private EnumSet<VkSampleCountFlagBits>      framebufferIntegerColorSampleCounts;

    public VkPhysicalDeviceVulkan12Properties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES);
    }

    public VkDriverId getDriverID()
    {
        return driverID;
    }

    public void setDriverID(VkDriverId driverID)
    {
        this.driverID = driverID;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public void setDriverName(String driverName)
    {
        this.driverName = driverName;
    }

    public String getDriverInfo()
    {
        return driverInfo;
    }

    public void setDriverInfo(String driverInfo)
    {
        this.driverInfo = driverInfo;
    }

    public VkConformanceVersion getConformanceVersion()
    {
        return conformanceVersion;
    }

    public void setConformanceVersion(VkConformanceVersion conformanceVersion)
    {
        this.conformanceVersion = conformanceVersion;
    }

    public VkShaderFloatControlsIndependence getDenormBehaviorIndependence()
    {
        return denormBehaviorIndependence;
    }

    public void setDenormBehaviorIndependence(VkShaderFloatControlsIndependence denormBehaviorIndependence)
    {
        this.denormBehaviorIndependence = denormBehaviorIndependence;
    }

    public VkShaderFloatControlsIndependence getRoundingModeIndependence()
    {
        return roundingModeIndependence;
    }

    public void setRoundingModeIndependence(VkShaderFloatControlsIndependence roundingModeIndependence)
    {
        this.roundingModeIndependence = roundingModeIndependence;
    }

    public boolean isShaderSignedZeroInfNanPreserveFloat16()
    {
        return shaderSignedZeroInfNanPreserveFloat16;
    }

    public void setShaderSignedZeroInfNanPreserveFloat16(boolean shaderSignedZeroInfNanPreserveFloat16)
    {
        this.shaderSignedZeroInfNanPreserveFloat16 = shaderSignedZeroInfNanPreserveFloat16;
    }

    public boolean isShaderSignedZeroInfNanPreserveFloat32()
    {
        return shaderSignedZeroInfNanPreserveFloat32;
    }

    public void setShaderSignedZeroInfNanPreserveFloat32(boolean shaderSignedZeroInfNanPreserveFloat32)
    {
        this.shaderSignedZeroInfNanPreserveFloat32 = shaderSignedZeroInfNanPreserveFloat32;
    }

    public boolean isShaderSignedZeroInfNanPreserveFloat64()
    {
        return shaderSignedZeroInfNanPreserveFloat64;
    }

    public void setShaderSignedZeroInfNanPreserveFloat64(boolean shaderSignedZeroInfNanPreserveFloat64)
    {
        this.shaderSignedZeroInfNanPreserveFloat64 = shaderSignedZeroInfNanPreserveFloat64;
    }

    public boolean isShaderDenormPreserveFloat16()
    {
        return shaderDenormPreserveFloat16;
    }

    public void setShaderDenormPreserveFloat16(boolean shaderDenormPreserveFloat16)
    {
        this.shaderDenormPreserveFloat16 = shaderDenormPreserveFloat16;
    }

    public boolean isShaderDenormPreserveFloat32()
    {
        return shaderDenormPreserveFloat32;
    }

    public void setShaderDenormPreserveFloat32(boolean shaderDenormPreserveFloat32)
    {
        this.shaderDenormPreserveFloat32 = shaderDenormPreserveFloat32;
    }

    public boolean isShaderDenormPreserveFloat64()
    {
        return shaderDenormPreserveFloat64;
    }

    public void setShaderDenormPreserveFloat64(boolean shaderDenormPreserveFloat64)
    {
        this.shaderDenormPreserveFloat64 = shaderDenormPreserveFloat64;
    }

    public boolean isShaderDenormFlushToZeroFloat16()
    {
        return shaderDenormFlushToZeroFloat16;
    }

    public void setShaderDenormFlushToZeroFloat16(boolean shaderDenormFlushToZeroFloat16)
    {
        this.shaderDenormFlushToZeroFloat16 = shaderDenormFlushToZeroFloat16;
    }

    public boolean isShaderDenormFlushToZeroFloat32()
    {
        return shaderDenormFlushToZeroFloat32;
    }

    public void setShaderDenormFlushToZeroFloat32(boolean shaderDenormFlushToZeroFloat32)
    {
        this.shaderDenormFlushToZeroFloat32 = shaderDenormFlushToZeroFloat32;
    }

    public boolean isShaderDenormFlushToZeroFloat64()
    {
        return shaderDenormFlushToZeroFloat64;
    }

    public void setShaderDenormFlushToZeroFloat64(boolean shaderDenormFlushToZeroFloat64)
    {
        this.shaderDenormFlushToZeroFloat64 = shaderDenormFlushToZeroFloat64;
    }

    public boolean isShaderRoundingModeRTEFloat16()
    {
        return shaderRoundingModeRTEFloat16;
    }

    public void setShaderRoundingModeRTEFloat16(boolean shaderRoundingModeRTEFloat16)
    {
        this.shaderRoundingModeRTEFloat16 = shaderRoundingModeRTEFloat16;
    }

    public boolean isShaderRoundingModeRTEFloat32()
    {
        return shaderRoundingModeRTEFloat32;
    }

    public void setShaderRoundingModeRTEFloat32(boolean shaderRoundingModeRTEFloat32)
    {
        this.shaderRoundingModeRTEFloat32 = shaderRoundingModeRTEFloat32;
    }

    public boolean isShaderRoundingModeRTEFloat64()
    {
        return shaderRoundingModeRTEFloat64;
    }

    public void setShaderRoundingModeRTEFloat64(boolean shaderRoundingModeRTEFloat64)
    {
        this.shaderRoundingModeRTEFloat64 = shaderRoundingModeRTEFloat64;
    }

    public boolean isShaderRoundingModeRTZFloat16()
    {
        return shaderRoundingModeRTZFloat16;
    }

    public void setShaderRoundingModeRTZFloat16(boolean shaderRoundingModeRTZFloat16)
    {
        this.shaderRoundingModeRTZFloat16 = shaderRoundingModeRTZFloat16;
    }

    public boolean isShaderRoundingModeRTZFloat32()
    {
        return shaderRoundingModeRTZFloat32;
    }

    public void setShaderRoundingModeRTZFloat32(boolean shaderRoundingModeRTZFloat32)
    {
        this.shaderRoundingModeRTZFloat32 = shaderRoundingModeRTZFloat32;
    }

    public boolean isShaderRoundingModeRTZFloat64()
    {
        return shaderRoundingModeRTZFloat64;
    }

    public void setShaderRoundingModeRTZFloat64(boolean shaderRoundingModeRTZFloat64)
    {
        this.shaderRoundingModeRTZFloat64 = shaderRoundingModeRTZFloat64;
    }

    public int getMaxUpdateAfterBindDescriptorsInAllPools()
    {
        return maxUpdateAfterBindDescriptorsInAllPools;
    }

    public void setMaxUpdateAfterBindDescriptorsInAllPools(int maxUpdateAfterBindDescriptorsInAllPools)
    {
        this.maxUpdateAfterBindDescriptorsInAllPools = maxUpdateAfterBindDescriptorsInAllPools;
    }

    public boolean isShaderUniformBufferArrayNonUniformIndexingNative()
    {
        return shaderUniformBufferArrayNonUniformIndexingNative;
    }

    public void setShaderUniformBufferArrayNonUniformIndexingNative(
            boolean shaderUniformBufferArrayNonUniformIndexingNative)
    {
        this.shaderUniformBufferArrayNonUniformIndexingNative = shaderUniformBufferArrayNonUniformIndexingNative;
    }

    public boolean isShaderSampledImageArrayNonUniformIndexingNative()
    {
        return shaderSampledImageArrayNonUniformIndexingNative;
    }

    public void setShaderSampledImageArrayNonUniformIndexingNative(boolean shaderSampledImageArrayNonUniformIndexingNative)
    {
        this.shaderSampledImageArrayNonUniformIndexingNative = shaderSampledImageArrayNonUniformIndexingNative;
    }

    public boolean isShaderStorageBufferArrayNonUniformIndexingNative()
    {
        return shaderStorageBufferArrayNonUniformIndexingNative;
    }

    public void setShaderStorageBufferArrayNonUniformIndexingNative(
            boolean shaderStorageBufferArrayNonUniformIndexingNative)
    {
        this.shaderStorageBufferArrayNonUniformIndexingNative = shaderStorageBufferArrayNonUniformIndexingNative;
    }

    public boolean isShaderStorageImageArrayNonUniformIndexingNative()
    {
        return shaderStorageImageArrayNonUniformIndexingNative;
    }

    public void setShaderStorageImageArrayNonUniformIndexingNative(boolean shaderStorageImageArrayNonUniformIndexingNative)
    {
        this.shaderStorageImageArrayNonUniformIndexingNative = shaderStorageImageArrayNonUniformIndexingNative;
    }

    public boolean isShaderInputAttachmentArrayNonUniformIndexingNative()
    {
        return shaderInputAttachmentArrayNonUniformIndexingNative;
    }

    public void setShaderInputAttachmentArrayNonUniformIndexingNative(
            boolean shaderInputAttachmentArrayNonUniformIndexingNative)
    {
        this.shaderInputAttachmentArrayNonUniformIndexingNative = shaderInputAttachmentArrayNonUniformIndexingNative;
    }

    public boolean isRobustBufferAccessUpdateAfterBind()
    {
        return robustBufferAccessUpdateAfterBind;
    }

    public void setRobustBufferAccessUpdateAfterBind(boolean robustBufferAccessUpdateAfterBind)
    {
        this.robustBufferAccessUpdateAfterBind = robustBufferAccessUpdateAfterBind;
    }

    public boolean isQuadDivergentImplicitLod()
    {
        return quadDivergentImplicitLod;
    }

    public void setQuadDivergentImplicitLod(boolean quadDivergentImplicitLod)
    {
        this.quadDivergentImplicitLod = quadDivergentImplicitLod;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindSamplers()
    {
        return maxPerStageDescriptorUpdateAfterBindSamplers;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(int maxPerStageDescriptorUpdateAfterBindSamplers)
    {
        this.maxPerStageDescriptorUpdateAfterBindSamplers = maxPerStageDescriptorUpdateAfterBindSamplers;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindUniformBuffers()
    {
        return maxPerStageDescriptorUpdateAfterBindUniformBuffers;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(
            int maxPerStageDescriptorUpdateAfterBindUniformBuffers)
    {
        this.maxPerStageDescriptorUpdateAfterBindUniformBuffers = maxPerStageDescriptorUpdateAfterBindUniformBuffers;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindStorageBuffers()
    {
        return maxPerStageDescriptorUpdateAfterBindStorageBuffers;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(
            int maxPerStageDescriptorUpdateAfterBindStorageBuffers)
    {
        this.maxPerStageDescriptorUpdateAfterBindStorageBuffers = maxPerStageDescriptorUpdateAfterBindStorageBuffers;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindSampledImages()
    {
        return maxPerStageDescriptorUpdateAfterBindSampledImages;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(int maxPerStageDescriptorUpdateAfterBindSampledImages)
    {
        this.maxPerStageDescriptorUpdateAfterBindSampledImages = maxPerStageDescriptorUpdateAfterBindSampledImages;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindStorageImages()
    {
        return maxPerStageDescriptorUpdateAfterBindStorageImages;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(int maxPerStageDescriptorUpdateAfterBindStorageImages)
    {
        this.maxPerStageDescriptorUpdateAfterBindStorageImages = maxPerStageDescriptorUpdateAfterBindStorageImages;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindInputAttachments()
    {
        return maxPerStageDescriptorUpdateAfterBindInputAttachments;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(
            int maxPerStageDescriptorUpdateAfterBindInputAttachments)
    {
        this.maxPerStageDescriptorUpdateAfterBindInputAttachments = maxPerStageDescriptorUpdateAfterBindInputAttachments;
    }

    public int getMaxPerStageUpdateAfterBindResources()
    {
        return maxPerStageUpdateAfterBindResources;
    }

    public void setMaxPerStageUpdateAfterBindResources(int maxPerStageUpdateAfterBindResources)
    {
        this.maxPerStageUpdateAfterBindResources = maxPerStageUpdateAfterBindResources;
    }

    public int getMaxDescriptorSetUpdateAfterBindSamplers()
    {
        return maxDescriptorSetUpdateAfterBindSamplers;
    }

    public void setMaxDescriptorSetUpdateAfterBindSamplers(int maxDescriptorSetUpdateAfterBindSamplers)
    {
        this.maxDescriptorSetUpdateAfterBindSamplers = maxDescriptorSetUpdateAfterBindSamplers;
    }

    public int getMaxDescriptorSetUpdateAfterBindUniformBuffers()
    {
        return maxDescriptorSetUpdateAfterBindUniformBuffers;
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(int maxDescriptorSetUpdateAfterBindUniformBuffers)
    {
        this.maxDescriptorSetUpdateAfterBindUniformBuffers = maxDescriptorSetUpdateAfterBindUniformBuffers;
    }

    public int getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic()
    {
        return maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(
            int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic)
    {
        this.maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageBuffers()
    {
        return maxDescriptorSetUpdateAfterBindStorageBuffers;
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(int maxDescriptorSetUpdateAfterBindStorageBuffers)
    {
        this.maxDescriptorSetUpdateAfterBindStorageBuffers = maxDescriptorSetUpdateAfterBindStorageBuffers;
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic()
    {
        return maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(
            int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic)
    {
        this.maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
    }

    public int getMaxDescriptorSetUpdateAfterBindSampledImages()
    {
        return maxDescriptorSetUpdateAfterBindSampledImages;
    }

    public void setMaxDescriptorSetUpdateAfterBindSampledImages(int maxDescriptorSetUpdateAfterBindSampledImages)
    {
        this.maxDescriptorSetUpdateAfterBindSampledImages = maxDescriptorSetUpdateAfterBindSampledImages;
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageImages()
    {
        return maxDescriptorSetUpdateAfterBindStorageImages;
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageImages(int maxDescriptorSetUpdateAfterBindStorageImages)
    {
        this.maxDescriptorSetUpdateAfterBindStorageImages = maxDescriptorSetUpdateAfterBindStorageImages;
    }

    public int getMaxDescriptorSetUpdateAfterBindInputAttachments()
    {
        return maxDescriptorSetUpdateAfterBindInputAttachments;
    }

    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(int maxDescriptorSetUpdateAfterBindInputAttachments)
    {
        this.maxDescriptorSetUpdateAfterBindInputAttachments = maxDescriptorSetUpdateAfterBindInputAttachments;
    }

    public EnumSet<VkResolveModeFlagBits> getSupportedDepthResolveModes()
    {
        return supportedDepthResolveModes;
    }

    public void setSupportedDepthResolveModes(EnumSet<VkResolveModeFlagBits> supportedDepthResolveModes)
    {
        this.supportedDepthResolveModes = supportedDepthResolveModes;
    }

    public EnumSet<VkResolveModeFlagBits> getSupportedStencilResolveModes()
    {
        return supportedStencilResolveModes;
    }

    public void setSupportedStencilResolveModes(EnumSet<VkResolveModeFlagBits> supportedStencilResolveModes)
    {
        this.supportedStencilResolveModes = supportedStencilResolveModes;
    }

    public boolean isIndependentResolveNone()
    {
        return independentResolveNone;
    }

    public void setIndependentResolveNone(boolean independentResolveNone)
    {
        this.independentResolveNone = independentResolveNone;
    }

    public boolean isIndependentResolve()
    {
        return independentResolve;
    }

    public void setIndependentResolve(boolean independentResolve)
    {
        this.independentResolve = independentResolve;
    }

    public boolean isFilterMinmaxSingleComponentFormats()
    {
        return filterMinmaxSingleComponentFormats;
    }

    public void setFilterMinmaxSingleComponentFormats(boolean filterMinmaxSingleComponentFormats)
    {
        this.filterMinmaxSingleComponentFormats = filterMinmaxSingleComponentFormats;
    }

    public boolean isFilterMinmaxImageComponentMapping()
    {
        return filterMinmaxImageComponentMapping;
    }

    public void setFilterMinmaxImageComponentMapping(boolean filterMinmaxImageComponentMapping)
    {
        this.filterMinmaxImageComponentMapping = filterMinmaxImageComponentMapping;
    }

    public long getMaxTimelineSemaphoreValueDifference()
    {
        return maxTimelineSemaphoreValueDifference;
    }

    public void setMaxTimelineSemaphoreValueDifference(long maxTimelineSemaphoreValueDifference)
    {
        this.maxTimelineSemaphoreValueDifference = maxTimelineSemaphoreValueDifference;
    }

    public EnumSet<VkSampleCountFlagBits> getFramebufferIntegerColorSampleCounts()
    {
        return framebufferIntegerColorSampleCounts;
    }

    public void setFramebufferIntegerColorSampleCounts(EnumSet<VkSampleCountFlagBits> framebufferIntegerColorSampleCounts)
    {
        this.framebufferIntegerColorSampleCounts = framebufferIntegerColorSampleCounts;
    }
}
