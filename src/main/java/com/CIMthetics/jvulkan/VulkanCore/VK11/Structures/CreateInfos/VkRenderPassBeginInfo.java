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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkFramebuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkRenderPass;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkClearValue;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkRect2D;

public class VkRenderPassBeginInfo extends VulkanCreateInfoStructure
{
    private VkRenderPass                renderPass;
    private VkFramebuffer               framebuffer;
    private VkRect2D                    renderArea;
    private Collection<VkClearValue>    clearValues;

    public VkRenderPassBeginInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO);
    }

    public VkRenderPass getRenderPass()
    {
        return renderPass;
    }

    public void setRenderPass(VkRenderPass renderPass)
    {
        this.renderPass = renderPass;
    }

    public VkFramebuffer getFramebuffer()
    {
        return framebuffer;
    }

    public void setFramebuffer(VkFramebuffer framebuffer)
    {
        this.framebuffer = framebuffer;
    }

    public VkRect2D getRenderArea()
    {
        return renderArea;
    }

    public void setRenderArea(VkRect2D renderArea)
    {
        this.renderArea = renderArea;
    }

    public Collection<VkClearValue> getClearValues()
    {
        return clearValues;
    }

    public void setClearValues(Collection<VkClearValue> clearValues)
    {
        this.clearValues = clearValues;
    }
}
