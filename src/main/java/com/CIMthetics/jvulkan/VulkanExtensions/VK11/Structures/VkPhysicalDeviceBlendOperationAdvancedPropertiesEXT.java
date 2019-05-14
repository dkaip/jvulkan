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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends VulkanCreateInfoStructure
{
    private int      advancedBlendMaxColorAttachments;
    private boolean  advancedBlendIndependentBlend;
    private boolean  advancedBlendNonPremultipliedSrcColor;
    private boolean  advancedBlendNonPremultipliedDstColor;
    private boolean  advancedBlendCorrelatedOverlap;
    private boolean  advancedBlendAllOperations;

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT);
    }

    public int getAdvancedBlendMaxColorAttachments()
    {
        return advancedBlendMaxColorAttachments;
    }

    public void setAdvancedBlendMaxColorAttachments(
            int advancedBlendMaxColorAttachments)
    {
        this.advancedBlendMaxColorAttachments = advancedBlendMaxColorAttachments;
    }

    public boolean isAdvancedBlendIndependentBlend()
    {
        return advancedBlendIndependentBlend;
    }

    public void setAdvancedBlendIndependentBlend(
            boolean advancedBlendIndependentBlend)
    {
        this.advancedBlendIndependentBlend = advancedBlendIndependentBlend;
    }

    public boolean isAdvancedBlendNonPremultipliedSrcColor()
    {
        return advancedBlendNonPremultipliedSrcColor;
    }

    public void setAdvancedBlendNonPremultipliedSrcColor(
            boolean advancedBlendNonPremultipliedSrcColor)
    {
        this.advancedBlendNonPremultipliedSrcColor = advancedBlendNonPremultipliedSrcColor;
    }

    public boolean isAdvancedBlendNonPremultipliedDstColor()
    {
        return advancedBlendNonPremultipliedDstColor;
    }

    public void setAdvancedBlendNonPremultipliedDstColor(
            boolean advancedBlendNonPremultipliedDstColor)
    {
        this.advancedBlendNonPremultipliedDstColor = advancedBlendNonPremultipliedDstColor;
    }

    public boolean isAdvancedBlendCorrelatedOverlap()
    {
        return advancedBlendCorrelatedOverlap;
    }

    public void setAdvancedBlendCorrelatedOverlap(
            boolean advancedBlendCorrelatedOverlap)
    {
        this.advancedBlendCorrelatedOverlap = advancedBlendCorrelatedOverlap;
    }

    public boolean isAdvancedBlendAllOperations()
    {
        return advancedBlendAllOperations;
    }

    public void setAdvancedBlendAllOperations(boolean advancedBlendAllOperations)
    {
        this.advancedBlendAllOperations = advancedBlendAllOperations;
    }
    
}
