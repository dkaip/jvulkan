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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDescriptorUpdateTemplateCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDescriptorUpdateTemplateType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSetLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkPipelineLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkDescriptorUpdateTemplateEntry;

public class VkDescriptorUpdateTemplateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                                pNext;
    private EnumSet<VkDescriptorUpdateTemplateCreateFlagBits>   flags = EnumSet.noneOf(VkDescriptorUpdateTemplateCreateFlagBits.class);
    private Collection<VkDescriptorUpdateTemplateEntry>         queueCreateInfos;
    private VkDescriptorUpdateTemplateType                      templateType;
    private VkDescriptorSetLayout                               descriptorSetLayout;
    private VkPipelineBindPoint                                 pipelineBindPoint;
    private VkPipelineLayout                                    pipelineLayout;
    private int                                                 set;

    public VkDescriptorUpdateTemplateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkDescriptorUpdateTemplateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDescriptorUpdateTemplateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkDescriptorUpdateTemplateEntry> getQueueCreateInfos()
    {
        return queueCreateInfos;
    }

    public void setQueueCreateInfos(
            Collection<VkDescriptorUpdateTemplateEntry> queueCreateInfos)
    {
        this.queueCreateInfos = queueCreateInfos;
    }

    public VkDescriptorUpdateTemplateType getTemplateType()
    {
        return templateType;
    }

    public void setTemplateType(VkDescriptorUpdateTemplateType templateType)
    {
        this.templateType = templateType;
    }

    public VkDescriptorSetLayout getDescriptorSetLayout()
    {
        return descriptorSetLayout;
    }

    public void setDescriptorSetLayout(VkDescriptorSetLayout descriptorSetLayout)
    {
        this.descriptorSetLayout = descriptorSetLayout;
    }

    public VkPipelineBindPoint getPipelineBindPoint()
    {
        return pipelineBindPoint;
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint)
    {
        this.pipelineBindPoint = pipelineBindPoint;
    }

    public VkPipelineLayout getPipelineLayout()
    {
        return pipelineLayout;
    }

    public void setPipelineLayout(VkPipelineLayout pipelineLayout)
    {
        this.pipelineLayout = pipelineLayout;
    }

    public int getSet()
    {
        return set;
    }

    public void setSet(int set)
    {
        this.set = set;
    }
    
}
