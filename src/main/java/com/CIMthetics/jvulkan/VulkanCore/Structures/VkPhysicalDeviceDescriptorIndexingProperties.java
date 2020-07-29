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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceDescriptorIndexingProperties extends VulkanCreateInfoStructure
{
    private int     maxUpdateAfterBindDescriptorsInAllPools;
    private boolean shaderUniformBufferArrayNonUniformIndexingNative;
    private boolean shaderSampledImageArrayNonUniformIndexingNative;
    private boolean shaderStorageBufferArrayNonUniformIndexingNative;
    private boolean shaderStorageImageArrayNonUniformIndexingNative;
    private boolean shaderInputAttachmentArrayNonUniformIndexingNative;
    private boolean robustBufferAccessUpdateAfterBind;
    private boolean quadDivergentImplicitLod;
    private int     maxPerStageDescriptorUpdateAfterBindSamplers;
    private int     maxPerStageDescriptorUpdateAfterBindUniformBuffers;
    private int     maxPerStageDescriptorUpdateAfterBindStorageBuffers;
    private int     maxPerStageDescriptorUpdateAfterBindSampledImages;
    private int     maxPerStageDescriptorUpdateAfterBindStorageImages;
    private int     maxPerStageDescriptorUpdateAfterBindInputAttachments;
    private int     maxPerStageUpdateAfterBindResources;
    private int     maxDescriptorSetUpdateAfterBindSamplers;
    private int     maxDescriptorSetUpdateAfterBindUniformBuffers;
    private int     maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
    private int     maxDescriptorSetUpdateAfterBindStorageBuffers;
    private int     maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
    private int     maxDescriptorSetUpdateAfterBindSampledImages;
    private int     maxDescriptorSetUpdateAfterBindStorageImages;
    private int     maxDescriptorSetUpdateAfterBindInputAttachments;

    public VkPhysicalDeviceDescriptorIndexingProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES);
    }

    public int getMaxUpdateAfterBindDescriptorsInAllPools()
    {
        return maxUpdateAfterBindDescriptorsInAllPools;
    }

    public void setMaxUpdateAfterBindDescriptorsInAllPools(
            int maxUpdateAfterBindDescriptorsInAllPools)
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

    public void setShaderSampledImageArrayNonUniformIndexingNative(
            boolean shaderSampledImageArrayNonUniformIndexingNative)
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

    public void setShaderStorageImageArrayNonUniformIndexingNative(
            boolean shaderStorageImageArrayNonUniformIndexingNative)
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

    public void setRobustBufferAccessUpdateAfterBind(
            boolean robustBufferAccessUpdateAfterBind)
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

    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(
            int maxPerStageDescriptorUpdateAfterBindSamplers)
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

    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(
            int maxPerStageDescriptorUpdateAfterBindSampledImages)
    {
        this.maxPerStageDescriptorUpdateAfterBindSampledImages = maxPerStageDescriptorUpdateAfterBindSampledImages;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindStorageImages()
    {
        return maxPerStageDescriptorUpdateAfterBindStorageImages;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(
            int maxPerStageDescriptorUpdateAfterBindStorageImages)
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

    public void setMaxPerStageUpdateAfterBindResources(
            int maxPerStageUpdateAfterBindResources)
    {
        this.maxPerStageUpdateAfterBindResources = maxPerStageUpdateAfterBindResources;
    }

    public int getMaxDescriptorSetUpdateAfterBindSamplers()
    {
        return maxDescriptorSetUpdateAfterBindSamplers;
    }

    public void setMaxDescriptorSetUpdateAfterBindSamplers(
            int maxDescriptorSetUpdateAfterBindSamplers)
    {
        this.maxDescriptorSetUpdateAfterBindSamplers = maxDescriptorSetUpdateAfterBindSamplers;
    }

    public int getMaxDescriptorSetUpdateAfterBindUniformBuffers()
    {
        return maxDescriptorSetUpdateAfterBindUniformBuffers;
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(
            int maxDescriptorSetUpdateAfterBindUniformBuffers)
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

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(
            int maxDescriptorSetUpdateAfterBindStorageBuffers)
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

    public void setMaxDescriptorSetUpdateAfterBindSampledImages(
            int maxDescriptorSetUpdateAfterBindSampledImages)
    {
        this.maxDescriptorSetUpdateAfterBindSampledImages = maxDescriptorSetUpdateAfterBindSampledImages;
    }

    public int getMaxDescriptorSetUpdateAfterBindStorageImages()
    {
        return maxDescriptorSetUpdateAfterBindStorageImages;
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageImages(
            int maxDescriptorSetUpdateAfterBindStorageImages)
    {
        this.maxDescriptorSetUpdateAfterBindStorageImages = maxDescriptorSetUpdateAfterBindStorageImages;
    }

    public int getMaxDescriptorSetUpdateAfterBindInputAttachments()
    {
        return maxDescriptorSetUpdateAfterBindInputAttachments;
    }

    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(
            int maxDescriptorSetUpdateAfterBindInputAttachments)
    {
        this.maxDescriptorSetUpdateAfterBindInputAttachments = maxDescriptorSetUpdateAfterBindInputAttachments;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceDescriptorIndexingPropertiesEXT\n"));
        sb.append(String.format("    maxUpdateAfterBindDescriptorsInAllPools:%d\n", maxUpdateAfterBindDescriptorsInAllPools));
        sb.append(String.format("    shaderUniformBufferArrayNonUniformIndexingNative:%b\n", shaderUniformBufferArrayNonUniformIndexingNative));
        sb.append(String.format("    shaderSampledImageArrayNonUniformIndexingNative:%b\n", shaderSampledImageArrayNonUniformIndexingNative));
        sb.append(String.format("    shaderStorageBufferArrayNonUniformIndexingNative:%b\n", shaderStorageBufferArrayNonUniformIndexingNative));
        sb.append(String.format("    shaderStorageImageArrayNonUniformIndexingNative:%b\n", shaderStorageImageArrayNonUniformIndexingNative));
        sb.append(String.format("    shaderInputAttachmentArrayNonUniformIndexingNative:%b\n", shaderInputAttachmentArrayNonUniformIndexingNative));
        sb.append(String.format("    robustBufferAccessUpdateAfterBind:%b\n", robustBufferAccessUpdateAfterBind));
        sb.append(String.format("    quadDivergentImplicitLod:%b\n", quadDivergentImplicitLod));
        sb.append(String.format("    maxPerStageDescriptorUpdateAfterBindSamplers:%d\n", maxPerStageDescriptorUpdateAfterBindSamplers));
        sb.append(String.format("    maxPerStageDescriptorUpdateAfterBindUniformBuffers:%d\n", maxPerStageDescriptorUpdateAfterBindUniformBuffers));
        sb.append(String.format("    maxPerStageDescriptorUpdateAfterBindStorageBuffers:%d\n", maxPerStageDescriptorUpdateAfterBindStorageBuffers));
        sb.append(String.format("    maxPerStageDescriptorUpdateAfterBindSampledImages:%d\n", maxPerStageDescriptorUpdateAfterBindSampledImages));
        sb.append(String.format("    maxPerStageDescriptorUpdateAfterBindStorageImages:%d\n", maxPerStageDescriptorUpdateAfterBindStorageImages));
        sb.append(String.format("    maxPerStageDescriptorUpdateAfterBindInputAttachments:%d\n", maxPerStageDescriptorUpdateAfterBindInputAttachments));
        sb.append(String.format("    maxPerStageUpdateAfterBindResources:%d\n", maxPerStageUpdateAfterBindResources));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindSamplers:%d\n", maxDescriptorSetUpdateAfterBindSamplers));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindUniformBuffers:%d\n", maxDescriptorSetUpdateAfterBindUniformBuffers));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindUniformBuffersDynamic:%d\n", maxDescriptorSetUpdateAfterBindUniformBuffersDynamic));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindStorageBuffers:%d\n", maxDescriptorSetUpdateAfterBindStorageBuffers));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindSampledImages:%d\n", maxDescriptorSetUpdateAfterBindSampledImages));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindStorageImages:%d\n", maxDescriptorSetUpdateAfterBindStorageImages));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindInputAttachments:%d\n", maxDescriptorSetUpdateAfterBindInputAttachments));
        
        return sb.toString();
    }
}
