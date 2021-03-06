/*
 * Copyright 2019-2020 Douglas Kaip
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

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkRect2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDiscardRectangleModeEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPipelineDiscardRectangleStateCreateFlagBitsEXT;

public class VkPipelineDiscardRectangleStateCreateInfoEXT extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineDiscardRectangleStateCreateFlagBitsEXT>   flags;
    private VkDiscardRectangleModeEXT                                   discardRectangleMode;
    private Collection<VkRect2D>                                        discardRectangles;

    public VkPipelineDiscardRectangleStateCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT);
    }

    public EnumSet<VkPipelineDiscardRectangleStateCreateFlagBitsEXT> getFlags()
    {
        return flags;
    }

    public void setFlags(
            EnumSet<VkPipelineDiscardRectangleStateCreateFlagBitsEXT> flags)
    {
        this.flags = flags;
    }

    public VkDiscardRectangleModeEXT getDiscardRectangleMode()
    {
        return discardRectangleMode;
    }

    public void setDiscardRectangleMode(
            VkDiscardRectangleModeEXT discardRectangleMode)
    {
        this.discardRectangleMode = discardRectangleMode;
    }

    public Collection<VkRect2D> getDiscardRectangles()
    {
        return discardRectangles;
    }

    public void setDiscardRectangles(Collection<VkRect2D> discardRectangles)
    {
        this.discardRectangles = discardRectangles;
    }

}
