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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineMultisampleStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSampleCountFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkPipelineMultisampleStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                                pNext;
    private EnumSet<VkPipelineMultisampleStateCreateFlagBits>   flags = EnumSet.noneOf(VkPipelineMultisampleStateCreateFlagBits.class);
    private VkSampleCountFlagBits                               rasterizationSamples;
    private boolean                                             sampleShadingEnable;
    private float                                               minSampleShading;
    private int[]                                               sampleMask;
    private boolean                                             alphaToCoverageEnable;
    private boolean                                             alphaToOneEnable;

    public VkPipelineMultisampleStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineMultisampleStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineMultisampleStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkSampleCountFlagBits getRasterizationSamples()
    {
        return rasterizationSamples;
    }

    public void setRasterizationSamples(VkSampleCountFlagBits rasterizationSamples)
    {
        this.rasterizationSamples = rasterizationSamples;
    }

    public boolean isSampleShadingEnable()
    {
        return sampleShadingEnable;
    }

    public void setSampleShadingEnable(boolean sampleShadingEnable)
    {
        this.sampleShadingEnable = sampleShadingEnable;
    }

    public float getMinSampleShading()
    {
        return minSampleShading;
    }

    public void setMinSampleShading(float minSampleShading)
    {
        this.minSampleShading = minSampleShading;
    }

    public int[] getSampleMask()
    {
        return sampleMask;
    }

    public void setSampleMask(int[] sampleMask)
    {
        this.sampleMask = sampleMask;
    }

    public boolean isAlphaToCoverageEnable()
    {
        return alphaToCoverageEnable;
    }

    public void setAlphaToCoverageEnable(boolean alphaToCoverageEnable)
    {
        this.alphaToCoverageEnable = alphaToCoverageEnable;
    }

    public boolean isAlphaToOneEnable()
    {
        return alphaToOneEnable;
    }

    public void setAlphaToOneEnable(boolean alphaToOneEnable)
    {
        this.alphaToOneEnable = alphaToOneEnable;
    }
    
}
