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
