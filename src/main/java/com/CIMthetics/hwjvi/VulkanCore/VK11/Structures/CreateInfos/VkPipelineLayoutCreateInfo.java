package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineLayoutCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkDescriptorSetLayout;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkPushConstantRange;

/**
 * 
<ul>
<li>
<code>pNext</code> is NULL or a pointer to an extension-specific structure.
</li>

<li>
<code>flags</code> is reserved for future use.
</li>

<li>
<code>setLayouts</code> is a <code>Collection</code> of <code>VkDescriptorSetLayout</code> objects.
</li>

<li>
<code>pushConstantRanges</code> is a <code>Collection</code> of <code>VkPushConstantRange</code> structures defining a set of push constant ranges for use in a single pipeline layout. In addition to descriptor set layouts, a pipeline layout also describes how many push constants can be accessed by each stage of the pipeline.
</li>
</ul>
 * @author Douglas Kaip
 *
 */
public class VkPipelineLayoutCreateInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkPipelineLayoutCreateFlagBits> flags = EnumSet.noneOf(VkPipelineLayoutCreateFlagBits.class);
    private Collection<VkDescriptorSetLayout>       setLayouts;
    private Collection<VkPushConstantRange>         pushConstantRanges;

    public VkPipelineLayoutCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineLayoutCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineLayoutCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkDescriptorSetLayout> getSetLayouts()
    {
        return setLayouts;
    }

    public void setSetLayouts(Collection<VkDescriptorSetLayout> setLayouts)
    {
        this.setLayouts = setLayouts;
    }

    public Collection<VkPushConstantRange> getPushConstantRanges()
    {
        return pushConstantRanges;
    }

    public void setPushConstantRanges(
            Collection<VkPushConstantRange> pushConstantRanges)
    {
        this.pushConstantRanges = pushConstantRanges;
    }
    
}
