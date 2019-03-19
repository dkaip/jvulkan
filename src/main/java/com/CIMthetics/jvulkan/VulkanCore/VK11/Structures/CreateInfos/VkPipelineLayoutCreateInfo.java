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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineLayoutCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSetLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPushConstantRange;

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
