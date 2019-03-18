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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSampleCountFlagBits;

/*
 * Note: the setters are not public because they should not be used by a Java
 * application, however, the JNI method can still find them.
 */

public class VkPhysicalDeviceLimits
{
    private int                             maxImageDimension1D;
    private int                             maxImageDimension2D;
    private int                             maxImageDimension3D;
    private int                             maxImageDimensionCube;
    private int                             maxImageArrayLayers;
    private int                             maxTexelBufferElements;
    private int                             maxUniformBufferRange;
    private int                             maxStorageBufferRange;
    private int                             maxPushConstantsSize;
    private int                             maxMemoryAllocationCount;
    private int                             maxSamplerAllocationCount;
    private long                            bufferImageGranularity;
    private long                            sparseAddressSpaceSize;
    private int                             maxBoundDescriptorSets;
    private int                             maxPerStageDescriptorSamplers;
    private int                             maxPerStageDescriptorUniformBuffers;
    private int                             maxPerStageDescriptorStorageBuffers;
    private int                             maxPerStageDescriptorSampledImages;
    private int                             maxPerStageDescriptorStorageImages;
    private int                             maxPerStageDescriptorInputAttachments;
    private int                             maxPerStageResources;
    private int                             maxDescriptorSetSamplers;
    private int                             maxDescriptorSetUniformBuffers;
    private int                             maxDescriptorSetUniformBuffersDynamic;
    private int                             maxDescriptorSetStorageBuffers;
    private int                             maxDescriptorSetStorageBuffersDynamic;
    private int                             maxDescriptorSetSampledImages;
    private int                             maxDescriptorSetStorageImages;
    private int                             maxDescriptorSetInputAttachments;
    private int                             maxVertexInputAttributes;
    private int                             maxVertexInputBindings;
    private int                             maxVertexInputAttributeOffset;
    private int                             maxVertexInputBindingStride;
    private int                             maxVertexOutputComponents;
    private int                             maxTessellationGenerationLevel;
    private int                             maxTessellationPatchSize;
    private int                             maxTessellationControlPerVertexInputComponents;
    private int                             maxTessellationControlPerVertexOutputComponents;
    private int                             maxTessellationControlPerPatchOutputComponents;
    private int                             maxTessellationControlTotalOutputComponents;
    private int                             maxTessellationEvaluationInputComponents;
    private int                             maxTessellationEvaluationOutputComponents;
    private int                             maxGeometryShaderInvocations;
    private int                             maxGeometryInputComponents;
    private int                             maxGeometryOutputComponents;
    private int                             maxGeometryOutputVertices;
    private int                             maxGeometryTotalOutputComponents;
    private int                             maxFragmentInputComponents;
    private int                             maxFragmentOutputAttachments;
    private int                             maxFragmentDualSrcAttachments;
    private int                             maxFragmentCombinedOutputResources;
    private int                             maxComputeSharedMemorySize;
    private int[]                           maxComputeWorkGroupCount;
    private int                             maxComputeWorkGroupInvocations;
    private int[]                           maxComputeWorkGroupSize;
    private int                             subPixelPrecisionBits;
    private int                             subTexelPrecisionBits;
    private int                             mipmapPrecisionBits;
    private int                             maxDrawIndexedIndexValue;
    private int                             maxDrawIndirectCount;
    private float                           maxSamplerLodBias;
    private float                           maxSamplerAnisotropy;
    private int                             maxViewports;
    private int[]                           maxViewportDimensions;
    private float[]                         viewportBoundsRange;
    private int                             viewportSubPixelBits;
    private long                            minMemoryMapAlignment;
    private long                            minTexelBufferOffsetAlignment;
    private long                            minUniformBufferOffsetAlignment;
    private long                            minStorageBufferOffsetAlignment;
    private int                             minTexelOffset;
    private int                             maxTexelOffset;
    private int                             minTexelGatherOffset;
    private int                             maxTexelGatherOffset;
    private float                           minInterpolationOffset;
    private float                           maxInterpolationOffset;
    private int                             subPixelInterpolationOffsetBits;
    private int                             maxFramebufferWidth;
    private int                             maxFramebufferHeight;
    private int                             maxFramebufferLayers;
    private EnumSet<VkSampleCountFlagBits>  framebufferColorSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  framebufferDepthSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  framebufferStencilSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  framebufferNoAttachmentsSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private int                             maxColorAttachments;
    private EnumSet<VkSampleCountFlagBits>  sampledImageColorSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  sampledImageIntegerSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  sampledImageDepthSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  sampledImageStencilSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  storageImageSampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private int                             maxSampleMaskWords;
    private boolean                         timestampComputeAndGraphics;
    private float                           timestampPeriod;
    private int                             maxClipDistances;
    private int                             maxCullDistances;
    private int                             maxCombinedClipAndCullDistances;
    private int                             discreteQueuePriorities;
    private float[]                         pointSizeRange;
    private float[]                         lineWidthRange;
    private float                           pointSizeGranularity;
    private float                           lineWidthGranularity;
    private boolean                         strictLines;
    private boolean                         standardSampleLocations;
    private long                            optimalBufferCopyOffsetAlignment;
    private long                            optimalBufferCopyRowPitchAlignment;
    private long                            nonCoherentAtomSize;
    
    public int getMaxImageDimension1D()
    {
        return maxImageDimension1D;
    }
    void setMaxImageDimension1D(int maxImageDimension1D)
    {
        this.maxImageDimension1D = maxImageDimension1D;
    }
    public int getMaxImageDimension2D()
    {
        return maxImageDimension2D;
    }
    
    void setMaxImageDimension2D(int maxImageDimension2D)
    {
        this.maxImageDimension2D = maxImageDimension2D;
    }
    
    public int getMaxImageDimension3D()
    {
        return maxImageDimension3D;
    }
    
    void setMaxImageDimension3D(int maxImageDimension3D)
    {
        this.maxImageDimension3D = maxImageDimension3D;
    }
    
    public int getMaxImageDimensionCube()
    {
        return maxImageDimensionCube;
    }
    
    void setMaxImageDimensionCube(int maxImageDimensionCube)
    {
        this.maxImageDimensionCube = maxImageDimensionCube;
    }
    
    public int getMaxImageArrayLayers()
    {
        return maxImageArrayLayers;
    }
    
    void setMaxImageArrayLayers(int maxImageArrayLayers)
    {
        this.maxImageArrayLayers = maxImageArrayLayers;
    }
    
    public int getMaxTexelBufferElements()
    {
        return maxTexelBufferElements;
    }
    
    void setMaxTexelBufferElements(int maxTexelBufferElements)
    {
        this.maxTexelBufferElements = maxTexelBufferElements;
    }
    
    public int getMaxUniformBufferRange()
    {
        return maxUniformBufferRange;
    }
    
    void setMaxUniformBufferRange(int maxUniformBufferRange)
    {
        this.maxUniformBufferRange = maxUniformBufferRange;
    }
    
    public int getMaxStorageBufferRange()
    {
        return maxStorageBufferRange;
    }
    
    void setMaxStorageBufferRange(int maxStorageBufferRange)
    {
        this.maxStorageBufferRange = maxStorageBufferRange;
    }
    
    public int getMaxPushConstantsSize()
    {
        return maxPushConstantsSize;
    }
    void setMaxPushConstantsSize(int maxPushConstantsSize)
    {
        this.maxPushConstantsSize = maxPushConstantsSize;
    }
    
    public int getMaxMemoryAllocationCount()
    {
        return maxMemoryAllocationCount;
    }
    
    void setMaxMemoryAllocationCount(int maxMemoryAllocationCount)
    {
        this.maxMemoryAllocationCount = maxMemoryAllocationCount;
    }
    
    public int getMaxSamplerAllocationCount()
    {
        return maxSamplerAllocationCount;
    }
    
    void setMaxSamplerAllocationCount(int maxSamplerAllocationCount)
    {
        this.maxSamplerAllocationCount = maxSamplerAllocationCount;
    }
    
    public long getBufferImageGranularity()
    {
        return bufferImageGranularity;
    }
    
    void setBufferImageGranularity(long bufferImageGranularity)
    {
        this.bufferImageGranularity = bufferImageGranularity;
    }
    
    public long getSparseAddressSpaceSize()
    {
        return sparseAddressSpaceSize;
    }
    
    void setSparseAddressSpaceSize(long sparseAddressSpaceSize)
    {
        this.sparseAddressSpaceSize = sparseAddressSpaceSize;
    }
    
    public int getMaxBoundDescriptorSets()
    {
        return maxBoundDescriptorSets;
    }
    
    void setMaxBoundDescriptorSets(int maxBoundDescriptorSets)
    {
        this.maxBoundDescriptorSets = maxBoundDescriptorSets;
    }
    
    public int getMaxPerStageDescriptorSamplers()
    {
        return maxPerStageDescriptorSamplers;
    }
    
    void setMaxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers)
    {
        this.maxPerStageDescriptorSamplers = maxPerStageDescriptorSamplers;
    }
    
    public int getMaxPerStageDescriptorUniformBuffers()
    {
        return maxPerStageDescriptorUniformBuffers;
    }
    
    void setMaxPerStageDescriptorUniformBuffers(
            int maxPerStageDescriptorUniformBuffers)
    {
        this.maxPerStageDescriptorUniformBuffers = maxPerStageDescriptorUniformBuffers;
    }
    
    public int getMaxPerStageDescriptorStorageBuffers()
    {
        return maxPerStageDescriptorStorageBuffers;
    }
    
    void setMaxPerStageDescriptorStorageBuffers(
            int maxPerStageDescriptorStorageBuffers)
    {
        this.maxPerStageDescriptorStorageBuffers = maxPerStageDescriptorStorageBuffers;
    }
    
    public int getMaxPerStageDescriptorSampledImages()
    {
        return maxPerStageDescriptorSampledImages;
    }
    
    void setMaxPerStageDescriptorSampledImages(
            int maxPerStageDescriptorSampledImages)
    {
        this.maxPerStageDescriptorSampledImages = maxPerStageDescriptorSampledImages;
    }
    
    public int getMaxPerStageDescriptorStorageImages()
    {
        return maxPerStageDescriptorStorageImages;
    }
    
    void setMaxPerStageDescriptorStorageImages(
            int maxPerStageDescriptorStorageImages)
    {
        this.maxPerStageDescriptorStorageImages = maxPerStageDescriptorStorageImages;
    }
    
    public int getMaxPerStageDescriptorInputAttachments()
    {
        return maxPerStageDescriptorInputAttachments;
    }
    
    void setMaxPerStageDescriptorInputAttachments(
            int maxPerStageDescriptorInputAttachments)
    {
        this.maxPerStageDescriptorInputAttachments = maxPerStageDescriptorInputAttachments;
    }
    
    public int getMaxPerStageResources()
    {
        return maxPerStageResources;
    }
    
    void setMaxPerStageResources(int maxPerStageResources)
    {
        this.maxPerStageResources = maxPerStageResources;
    }
    
    public int getMaxDescriptorSetSamplers()
    {
        return maxDescriptorSetSamplers;
    }
    
    void setMaxDescriptorSetSamplers(int maxDescriptorSetSamplers)
    {
        this.maxDescriptorSetSamplers = maxDescriptorSetSamplers;
    }
    
    public int getMaxDescriptorSetUniformBuffers()
    {
        return maxDescriptorSetUniformBuffers;
    }
    
    void setMaxDescriptorSetUniformBuffers(
            int maxDescriptorSetUniformBuffers)
    {
        this.maxDescriptorSetUniformBuffers = maxDescriptorSetUniformBuffers;
    }
    
    public int getMaxDescriptorSetUniformBuffersDynamic()
    {
        return maxDescriptorSetUniformBuffersDynamic;
    }
    
    void setMaxDescriptorSetUniformBuffersDynamic(
            int maxDescriptorSetUniformBuffersDynamic)
    {
        this.maxDescriptorSetUniformBuffersDynamic = maxDescriptorSetUniformBuffersDynamic;
    }
    
    public int getMaxDescriptorSetStorageBuffers()
    {
        return maxDescriptorSetStorageBuffers;
    }
    
    void setMaxDescriptorSetStorageBuffers(
            int maxDescriptorSetStorageBuffers)
    {
        this.maxDescriptorSetStorageBuffers = maxDescriptorSetStorageBuffers;
    }
    
    public int getMaxDescriptorSetStorageBuffersDynamic()
    {
        return maxDescriptorSetStorageBuffersDynamic;
    }
    
    void setMaxDescriptorSetStorageBuffersDynamic(
            int maxDescriptorSetStorageBuffersDynamic)
    {
        this.maxDescriptorSetStorageBuffersDynamic = maxDescriptorSetStorageBuffersDynamic;
    }
    
    public int getMaxDescriptorSetSampledImages()
    {
        return maxDescriptorSetSampledImages;
    }
    
    void setMaxDescriptorSetSampledImages(int maxDescriptorSetSampledImages)
    {
        this.maxDescriptorSetSampledImages = maxDescriptorSetSampledImages;
    }
    
    public int getMaxDescriptorSetStorageImages()
    {
        return maxDescriptorSetStorageImages;
    }
    
    void setMaxDescriptorSetStorageImages(int maxDescriptorSetStorageImages)
    {
        this.maxDescriptorSetStorageImages = maxDescriptorSetStorageImages;
    }
    
    public int getMaxDescriptorSetInputAttachments()
    {
        return maxDescriptorSetInputAttachments;
    }
    
    void setMaxDescriptorSetInputAttachments(
            int maxDescriptorSetInputAttachments)
    {
        this.maxDescriptorSetInputAttachments = maxDescriptorSetInputAttachments;
    }
    
    public int getMaxVertexInputAttributes()
    {
        return maxVertexInputAttributes;
    }
    
    void setMaxVertexInputAttributes(int maxVertexInputAttributes)
    {
        this.maxVertexInputAttributes = maxVertexInputAttributes;
    }
    
    public int getMaxVertexInputBindings()
    {
        return maxVertexInputBindings;
    }
    
    void setMaxVertexInputBindings(int maxVertexInputBindings)
    {
        this.maxVertexInputBindings = maxVertexInputBindings;
    }
    
    public int getMaxVertexInputAttributeOffset()
    {
        return maxVertexInputAttributeOffset;
    }
    
    void setMaxVertexInputAttributeOffset(int maxVertexInputAttributeOffset)
    {
        this.maxVertexInputAttributeOffset = maxVertexInputAttributeOffset;
    }
    
    public int getMaxVertexInputBindingStride()
    {
        return maxVertexInputBindingStride;
    }
    
    void setMaxVertexInputBindingStride(int maxVertexInputBindingStride)
    {
        this.maxVertexInputBindingStride = maxVertexInputBindingStride;
    }
    
    public int getMaxVertexOutputComponents()
    {
        return maxVertexOutputComponents;
    }
    
    void setMaxVertexOutputComponents(int maxVertexOutputComponents)
    {
        this.maxVertexOutputComponents = maxVertexOutputComponents;
    }
    
    public int getMaxTessellationGenerationLevel()
    {
        return maxTessellationGenerationLevel;
    }
    
    void setMaxTessellationGenerationLevel(
            int maxTessellationGenerationLevel)
    {
        this.maxTessellationGenerationLevel = maxTessellationGenerationLevel;
    }
    
    public int getMaxTessellationPatchSize()
    {
        return maxTessellationPatchSize;
    }
    
    void setMaxTessellationPatchSize(int maxTessellationPatchSize)
    {
        this.maxTessellationPatchSize = maxTessellationPatchSize;
    }
    
    public int getMaxTessellationControlPerVertexInputComponents()
    {
        return maxTessellationControlPerVertexInputComponents;
    }
    
    void setMaxTessellationControlPerVertexInputComponents(
            int maxTessellationControlPerVertexInputComponents)
    {
        this.maxTessellationControlPerVertexInputComponents = maxTessellationControlPerVertexInputComponents;
    }
    
    public int getMaxTessellationControlPerVertexOutputComponents()
    {
        return maxTessellationControlPerVertexOutputComponents;
    }
    
    void setMaxTessellationControlPerVertexOutputComponents(
            int maxTessellationControlPerVertexOutputComponents)
    {
        this.maxTessellationControlPerVertexOutputComponents = maxTessellationControlPerVertexOutputComponents;
    }
    
    public int getMaxTessellationControlPerPatchOutputComponents()
    {
        return maxTessellationControlPerPatchOutputComponents;
    }
    
    void setMaxTessellationControlPerPatchOutputComponents(
            int maxTessellationControlPerPatchOutputComponents)
    {
        this.maxTessellationControlPerPatchOutputComponents = maxTessellationControlPerPatchOutputComponents;
    }
    
    public int getMaxTessellationControlTotalOutputComponents()
    {
        return maxTessellationControlTotalOutputComponents;
    }
    
    void setMaxTessellationControlTotalOutputComponents(
            int maxTessellationControlTotalOutputComponents)
    {
        this.maxTessellationControlTotalOutputComponents = maxTessellationControlTotalOutputComponents;
    }
    
    public int getMaxTessellationEvaluationInputComponents()
    {
        return maxTessellationEvaluationInputComponents;
    }
    
    void setMaxTessellationEvaluationInputComponents(
            int maxTessellationEvaluationInputComponents)
    {
        this.maxTessellationEvaluationInputComponents = maxTessellationEvaluationInputComponents;
    }
    
    public int getMaxTessellationEvaluationOutputComponents()
    {
        return maxTessellationEvaluationOutputComponents;
    }
    
    void setMaxTessellationEvaluationOutputComponents(
            int maxTessellationEvaluationOutputComponents)
    {
        this.maxTessellationEvaluationOutputComponents = maxTessellationEvaluationOutputComponents;
    }
    
    public int getMaxGeometryShaderInvocations()
    {
        return maxGeometryShaderInvocations;
    }
    
    void setMaxGeometryShaderInvocations(int maxGeometryShaderInvocations)
    {
        this.maxGeometryShaderInvocations = maxGeometryShaderInvocations;
    }
    
    public int getMaxGeometryInputComponents()
    {
        return maxGeometryInputComponents;
    }
    
    void setMaxGeometryInputComponents(int maxGeometryInputComponents)
    {
        this.maxGeometryInputComponents = maxGeometryInputComponents;
    }
    
    public int getMaxGeometryOutputComponents()
    {
        return maxGeometryOutputComponents;
    }
    
    void setMaxGeometryOutputComponents(int maxGeometryOutputComponents)
    {
        this.maxGeometryOutputComponents = maxGeometryOutputComponents;
    }
    
    public int getMaxGeometryOutputVertices()
    {
        return maxGeometryOutputVertices;
    }
    
    void setMaxGeometryOutputVertices(int maxGeometryOutputVertices)
    {
        this.maxGeometryOutputVertices = maxGeometryOutputVertices;
    }
    
    public int getMaxGeometryTotalOutputComponents()
    {
        return maxGeometryTotalOutputComponents;
    }
    
    void setMaxGeometryTotalOutputComponents(
            int maxGeometryTotalOutputComponents)
    {
        this.maxGeometryTotalOutputComponents = maxGeometryTotalOutputComponents;
    }
    
    public int getMaxFragmentInputComponents()
    {
        return maxFragmentInputComponents;
    }
    
    void setMaxFragmentInputComponents(int maxFragmentInputComponents)
    {
        this.maxFragmentInputComponents = maxFragmentInputComponents;
    }
    
    public int getMaxFragmentOutputAttachments()
    {
        return maxFragmentOutputAttachments;
    }
    
    void setMaxFragmentOutputAttachments(int maxFragmentOutputAttachments)
    {
        this.maxFragmentOutputAttachments = maxFragmentOutputAttachments;
    }
    
    public int getMaxFragmentDualSrcAttachments()
    {
        return maxFragmentDualSrcAttachments;
    }
    
    void setMaxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments)
    {
        this.maxFragmentDualSrcAttachments = maxFragmentDualSrcAttachments;
    }
    
    public int getMaxFragmentCombinedOutputResources()
    {
        return maxFragmentCombinedOutputResources;
    }
    
    void setMaxFragmentCombinedOutputResources(
            int maxFragmentCombinedOutputResources)
    {
        this.maxFragmentCombinedOutputResources = maxFragmentCombinedOutputResources;
    }
    
    public int getMaxComputeSharedMemorySize()
    {
        return maxComputeSharedMemorySize;
    }
    
    void setMaxComputeSharedMemorySize(int maxComputeSharedMemorySize)
    {
        this.maxComputeSharedMemorySize = maxComputeSharedMemorySize;
    }
    
    public int[] getMaxComputeWorkGroupCount()
    {
        return maxComputeWorkGroupCount;
    }

    void setMaxComputeWorkGroupCount(int[] maxComputeWorkGroupCount)
    {
        this.maxComputeWorkGroupCount = maxComputeWorkGroupCount;
    }
    
    public int getMaxComputeWorkGroupInvocations()
    {
        return maxComputeWorkGroupInvocations;
    }
    
    void setMaxComputeWorkGroupInvocations(
            int maxComputeWorkGroupInvocations)
    {
        this.maxComputeWorkGroupInvocations = maxComputeWorkGroupInvocations;
    }
    
    public int[] getMaxComputeWorkGroupSize()
    {
        return maxComputeWorkGroupSize;
    }
    
    void setMaxComputeWorkGroupSize(int[] maxComputeWorkGroupSize)
    {
        this.maxComputeWorkGroupSize = maxComputeWorkGroupSize;
    }
    
    public int getSubPixelPrecisionBits()
    {
        return subPixelPrecisionBits;
    }
    
    void setSubPixelPrecisionBits(int subPixelPrecisionBits)
    {
        this.subPixelPrecisionBits = subPixelPrecisionBits;
    }
    
    public int getSubTexelPrecisionBits()
    {
        return subTexelPrecisionBits;
    }
    
    void setSubTexelPrecisionBits(int subTexelPrecisionBits)
    {
        this.subTexelPrecisionBits = subTexelPrecisionBits;
    }
    
    public int getMipmapPrecisionBits()
    {
        return mipmapPrecisionBits;
    }
    
    void setMipmapPrecisionBits(int mipmapPrecisionBits)
    {
        this.mipmapPrecisionBits = mipmapPrecisionBits;
    }
    
    public int getMaxDrawIndexedIndexValue()
    {
        return maxDrawIndexedIndexValue;
    }
    
    void setMaxDrawIndexedIndexValue(int maxDrawIndexedIndexValue)
    {
        this.maxDrawIndexedIndexValue = maxDrawIndexedIndexValue;
    }
    
    public int getMaxDrawIndirectCount()
    {
        return maxDrawIndirectCount;
    }
    
    void setMaxDrawIndirectCount(int maxDrawIndirectCount)
    {
        this.maxDrawIndirectCount = maxDrawIndirectCount;
    }
    
    public float getMaxSamplerLodBias()
    {
        return maxSamplerLodBias;
    }
    
    void setMaxSamplerLodBias(float maxSamplerLodBias)
    {
        this.maxSamplerLodBias = maxSamplerLodBias;
    }
    
    public float getMaxSamplerAnisotropy()
    {
        return maxSamplerAnisotropy;
    }
    
    void setMaxSamplerAnisotropy(float maxSamplerAnisotropy)
    {
        this.maxSamplerAnisotropy = maxSamplerAnisotropy;
    }
    
    public int getMaxViewports()
    {
        return maxViewports;
    }
    
    void setMaxViewports(int maxViewports)
    {
        this.maxViewports = maxViewports;
    }
    
    public int[] getMaxViewportDimensions()
    {
        return maxViewportDimensions;
    }
    
    void setMaxViewportDimensions(int[] maxViewportDimensions)
    {
        this.maxViewportDimensions = maxViewportDimensions;
    }
    
    public float[] getViewportBoundsRange()
    {
        return viewportBoundsRange;
    }
    
    void setViewportBoundsRange(float[] viewportBoundsRange)
    {
        this.viewportBoundsRange = viewportBoundsRange;
    }
    
    public int getViewportSubPixelBits()
    {
        return viewportSubPixelBits;
    }
    
    void setViewportSubPixelBits(int viewportSubPixelBits)
    {
        this.viewportSubPixelBits = viewportSubPixelBits;
    }
    
    public long getMinMemoryMapAlignment()
    {
        return minMemoryMapAlignment;
    }
    
    void setMinMemoryMapAlignment(long minMemoryMapAlignment)
    {
        this.minMemoryMapAlignment = minMemoryMapAlignment;
    }
    
    public long getMinTexelBufferOffsetAlignment()
    {
        return minTexelBufferOffsetAlignment;
    }
    
    void setMinTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment)
    {
        this.minTexelBufferOffsetAlignment = minTexelBufferOffsetAlignment;
    }
    
    public long getMinUniformBufferOffsetAlignment()
    {
        return minUniformBufferOffsetAlignment;
    }
    
    void setMinUniformBufferOffsetAlignment(
            long minUniformBufferOffsetAlignment)
    {
        this.minUniformBufferOffsetAlignment = minUniformBufferOffsetAlignment;
    }
    
    public long getMinStorageBufferOffsetAlignment()
    {
        return minStorageBufferOffsetAlignment;
    }
    
    void setMinStorageBufferOffsetAlignment(
            long minStorageBufferOffsetAlignment)
    {
        this.minStorageBufferOffsetAlignment = minStorageBufferOffsetAlignment;
    }
    
    public int getMinTexelOffset()
    {
        return minTexelOffset;
    }
    
    void setMinTexelOffset(int minTexelOffset)
    {
        this.minTexelOffset = minTexelOffset;
    }
    
    public int getMaxTexelOffset()
    {
        return maxTexelOffset;
    }
    
    void setMaxTexelOffset(int maxTexelOffset)
    {
        this.maxTexelOffset = maxTexelOffset;
    }
    
    public int getMinTexelGatherOffset()
    {
        return minTexelGatherOffset;
    }
    
    void setMinTexelGatherOffset(int minTexelGatherOffset)
    {
        this.minTexelGatherOffset = minTexelGatherOffset;
    }
    
    public int getMaxTexelGatherOffset()
    {
        return maxTexelGatherOffset;
    }
    
    void setMaxTexelGatherOffset(int maxTexelGatherOffset)
    {
        this.maxTexelGatherOffset = maxTexelGatherOffset;
    }
    
    public float getMinInterpolationOffset()
    {
        return minInterpolationOffset;
    }
    
    void setMinInterpolationOffset(float minInterpolationOffset)
    {
        this.minInterpolationOffset = minInterpolationOffset;
    }
    
    public float getMaxInterpolationOffset()
    {
        return maxInterpolationOffset;
    }
    
    void setMaxInterpolationOffset(float maxInterpolationOffset)
    {
        this.maxInterpolationOffset = maxInterpolationOffset;
    }
    
    public int getSubPixelInterpolationOffsetBits()
    {
        return subPixelInterpolationOffsetBits;
    }
    
    void setSubPixelInterpolationOffsetBits(
            int subPixelInterpolationOffsetBits)
    {
        this.subPixelInterpolationOffsetBits = subPixelInterpolationOffsetBits;
    }
    
    public int getMaxFramebufferWidth()
    {
        return maxFramebufferWidth;
    }
    
    void setMaxFramebufferWidth(int maxFramebufferWidth)
    {
        this.maxFramebufferWidth = maxFramebufferWidth;
    }
    
    public int getMaxFramebufferHeight()
    {
        return maxFramebufferHeight;
    }
    
    void setMaxFramebufferHeight(int maxFramebufferHeight)
    {
        this.maxFramebufferHeight = maxFramebufferHeight;
    }
    
    public int getMaxFramebufferLayers()
    {
        return maxFramebufferLayers;
    }
    
    void setMaxFramebufferLayers(int maxFramebufferLayers)
    {
        this.maxFramebufferLayers = maxFramebufferLayers;
    }
    
    public EnumSet<VkSampleCountFlagBits> getFramebufferColorSampleCounts()
    {
        return framebufferColorSampleCounts;
    }

    void setFramebufferColorSampleCounts(
            EnumSet<VkSampleCountFlagBits> framebufferColorSampleCounts)
    {
        this.framebufferColorSampleCounts = framebufferColorSampleCounts;
    }
    
    public EnumSet<VkSampleCountFlagBits> getFramebufferDepthSampleCounts()
    {
        return framebufferDepthSampleCounts;
    }
    
    void setFramebufferDepthSampleCounts(
            EnumSet<VkSampleCountFlagBits> framebufferDepthSampleCounts)
    {
        this.framebufferDepthSampleCounts = framebufferDepthSampleCounts;
    }
    
    public EnumSet<VkSampleCountFlagBits> getFramebufferStencilSampleCounts()
    {
        return framebufferStencilSampleCounts;
    }
    
    void setFramebufferStencilSampleCounts(
            EnumSet<VkSampleCountFlagBits> framebufferStencilSampleCounts)
    {
        this.framebufferStencilSampleCounts = framebufferStencilSampleCounts;
    }
    
    public EnumSet<VkSampleCountFlagBits> getFramebufferNoAttachmentsSampleCounts()
    {
        return framebufferNoAttachmentsSampleCounts;
    }
    
    void setFramebufferNoAttachmentsSampleCounts(
            EnumSet<VkSampleCountFlagBits> framebufferNoAttachmentsSampleCounts)
    {
        this.framebufferNoAttachmentsSampleCounts = framebufferNoAttachmentsSampleCounts;
    }
    
    public int getMaxColorAttachments()
    {
        return maxColorAttachments;
    }
    
    void setMaxColorAttachments(int maxColorAttachments)
    {
        this.maxColorAttachments = maxColorAttachments;
    }
    
    public EnumSet<VkSampleCountFlagBits> getSampledImageColorSampleCounts()
    {
        return sampledImageColorSampleCounts;
    }
    
    void setSampledImageColorSampleCounts(
            EnumSet<VkSampleCountFlagBits> sampledImageColorSampleCounts)
    {
        this.sampledImageColorSampleCounts = sampledImageColorSampleCounts;
    }
    
    public EnumSet<VkSampleCountFlagBits> getSampledImageIntegerSampleCounts()
    {
        return sampledImageIntegerSampleCounts;
    }
    
    void setSampledImageIntegerSampleCounts(
            EnumSet<VkSampleCountFlagBits> sampledImageIntegerSampleCounts)
    {
        this.sampledImageIntegerSampleCounts = sampledImageIntegerSampleCounts;
    }
    
    public EnumSet<VkSampleCountFlagBits> getSampledImageDepthSampleCounts()
    {
        return sampledImageDepthSampleCounts;
    }
    
    void setSampledImageDepthSampleCounts(
            EnumSet<VkSampleCountFlagBits> sampledImageDepthSampleCounts)
    {
        this.sampledImageDepthSampleCounts = sampledImageDepthSampleCounts;
    }
    
    public EnumSet<VkSampleCountFlagBits> getSampledImageStencilSampleCounts()
    {
        return sampledImageStencilSampleCounts;
    }
    
    void setSampledImageStencilSampleCounts(
            EnumSet<VkSampleCountFlagBits> sampledImageStencilSampleCounts)
    {
        this.sampledImageStencilSampleCounts = sampledImageStencilSampleCounts;
    }
    
    public EnumSet<VkSampleCountFlagBits> getStorageImageSampleCounts()
    {
        return storageImageSampleCounts;
    }
    
    void setStorageImageSampleCounts(
            EnumSet<VkSampleCountFlagBits> storageImageSampleCounts)
    {
        this.storageImageSampleCounts = storageImageSampleCounts;
    }
    
    public int getMaxSampleMaskWords()
    {
        return maxSampleMaskWords;
    }
    
    void setMaxSampleMaskWords(int maxSampleMaskWords)
    {
        this.maxSampleMaskWords = maxSampleMaskWords;
    }
    
    public boolean isTimestampComputeAndGraphics()
    {
        return timestampComputeAndGraphics;
    }
    
    void setTimestampComputeAndGraphics(boolean timestampComputeAndGraphics)
    {
        this.timestampComputeAndGraphics = timestampComputeAndGraphics;
    }
    
    public float getTimestampPeriod()
    {
        return timestampPeriod;
    }
    
    void setTimestampPeriod(float timestampPeriod)
    {
        this.timestampPeriod = timestampPeriod;
    }
    
    public int getMaxClipDistances()
    {
        return maxClipDistances;
    }
    
    void setMaxClipDistances(int maxClipDistances)
    {
        this.maxClipDistances = maxClipDistances;
    }
    
    public int getMaxCullDistances()
    {
        return maxCullDistances;
    }
    
    void setMaxCullDistances(int maxCullDistances)
    {
        this.maxCullDistances = maxCullDistances;
    }
    
    public int getMaxCombinedClipAndCullDistances()
    {
        return maxCombinedClipAndCullDistances;
    }
    
    void setMaxCombinedClipAndCullDistances(
            int maxCombinedClipAndCullDistances)
    {
        this.maxCombinedClipAndCullDistances = maxCombinedClipAndCullDistances;
    }
    
    public int getDiscreteQueuePriorities()
    {
        return discreteQueuePriorities;
    }
    
    void setDiscreteQueuePriorities(int discreteQueuePriorities)
    {
        this.discreteQueuePriorities = discreteQueuePriorities;
    }
    
    public float[] getPointSizeRange()
    {
        return pointSizeRange;
    }
    
    void setPointSizeRange(float[] pointSizeRange)
    {
        this.pointSizeRange = pointSizeRange;
    }
    
    public float[] getLineWidthRange()
    {
        return lineWidthRange;
    }
    
    void setLineWidthRange(float[] lineWidthRange)
    {
        this.lineWidthRange = lineWidthRange;
    }
    
    public float getPointSizeGranularity()
    {
        return pointSizeGranularity;
    }
    
    void setPointSizeGranularity(float pointSizeGranularity)
    {
        this.pointSizeGranularity = pointSizeGranularity;
    }
    
    public float getLineWidthGranularity()
    {
        return lineWidthGranularity;
    }
    
    void setLineWidthGranularity(float lineWidthGranularity)
    {
        this.lineWidthGranularity = lineWidthGranularity;
    }
    
    public boolean isStrictLines()
    {
        return strictLines;
    }
    
    void setStrictLines(boolean strictLines)
    {
        this.strictLines = strictLines;
    }
    
    public boolean isStandardSampleLocations()
    {
        return standardSampleLocations;
    }
    
    void setStandardSampleLocations(boolean standardSampleLocations)
    {
        this.standardSampleLocations = standardSampleLocations;
    }
    
    public long getOptimalBufferCopyOffsetAlignment()
    {
        return optimalBufferCopyOffsetAlignment;
    }
    
    void setOptimalBufferCopyOffsetAlignment(
            long optimalBufferCopyOffsetAlignment)
    {
        this.optimalBufferCopyOffsetAlignment = optimalBufferCopyOffsetAlignment;
    }
    
    public long getOptimalBufferCopyRowPitchAlignment()
    {
        return optimalBufferCopyRowPitchAlignment;
    }
    
    void setOptimalBufferCopyRowPitchAlignment(
            long optimalBufferCopyRowPitchAlignment)
    {
        this.optimalBufferCopyRowPitchAlignment = optimalBufferCopyRowPitchAlignment;
    }
    
    public long getNonCoherentAtomSize()
    {
        return nonCoherentAtomSize;
    }
    
    void setNonCoherentAtomSize(long nonCoherentAtomSize)
    {
        this.nonCoherentAtomSize = nonCoherentAtomSize;
    }
}
