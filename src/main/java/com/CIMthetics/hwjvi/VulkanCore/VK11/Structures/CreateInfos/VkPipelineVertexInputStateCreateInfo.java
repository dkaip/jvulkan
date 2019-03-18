package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineVertexInputStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkVertexInputAttributeDescription;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkVertexInputBindingDescription;

public class VkPipelineVertexInputStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                                pNext;
    private EnumSet<VkPipelineVertexInputStateCreateFlagBits>   flags = EnumSet.noneOf(VkPipelineVertexInputStateCreateFlagBits.class);
    private Collection<VkVertexInputBindingDescription>         vertexBindingDescriptions;
    private Collection<VkVertexInputAttributeDescription>       vertexAttributeDescriptions;

    public VkPipelineVertexInputStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineVertexInputStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineVertexInputStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkVertexInputBindingDescription> getVertexBindingDescriptions()
    {
        return vertexBindingDescriptions;
    }

    public void setVertexBindingDescriptions(
            Collection<VkVertexInputBindingDescription> vertexBindingDescriptions)
    {
        this.vertexBindingDescriptions = vertexBindingDescriptions;
    }

    public Collection<VkVertexInputAttributeDescription> getVertexAttributeDescriptions()
    {
        return vertexAttributeDescriptions;
    }

    public void setVertexAttributeDescriptions(
            Collection<VkVertexInputAttributeDescription> vertexAttributeDescriptions)
    {
        this.vertexAttributeDescriptions = vertexAttributeDescriptions;
    }
    
}
