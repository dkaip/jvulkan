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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSurfaceTransformFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkRect2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkCommandBufferInheritanceRenderPassTransformInfoQCOM extends VulkanCreateInfoStructure
{
    private VkSurfaceTransformFlagBitsKHR   transform;
    private VkRect2D                        renderArea;

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM);
    }

    public VkSurfaceTransformFlagBitsKHR getTransform()
    {
        return transform;
    }

    public void setTransform(VkSurfaceTransformFlagBitsKHR transform)
    {
        this.transform = transform;
    }

    public VkRect2D getRenderArea()
    {
        return renderArea;
    }

    public void setRenderArea(VkRect2D renderArea)
    {
        this.renderArea = renderArea;
    }
}
