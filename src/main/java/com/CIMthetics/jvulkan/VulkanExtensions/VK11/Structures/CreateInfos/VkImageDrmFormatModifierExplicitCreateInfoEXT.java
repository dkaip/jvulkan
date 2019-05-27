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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.LinkedList;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSubresourceLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageDrmFormatModifierExplicitCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long                            drmFormatModifier;
    private Collection<VkSubresourceLayout> planeLayouts = new LinkedList<VkSubresourceLayout>();
    
    public VkImageDrmFormatModifierExplicitCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT);
    }

    public long getDrmFormatModifier()
    {
        return drmFormatModifier;
    }

    public void setDrmFormatModifier(long drmFormatModifier)
    {
        this.drmFormatModifier = drmFormatModifier;
    }

    public Collection<VkSubresourceLayout> getPlaneLayouts()
    {
        return planeLayouts;
    }

    public void setPlaneLayouts(LinkedList<VkSubresourceLayout> planeLayouts)
    {
        this.planeLayouts = planeLayouts;
    }

}
