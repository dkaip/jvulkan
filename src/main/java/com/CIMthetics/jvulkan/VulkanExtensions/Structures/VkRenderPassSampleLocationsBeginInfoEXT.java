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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkRenderPassSampleLocationsBeginInfoEXT extends VulkanCreateInfoStructure
{
    private Collection<VkAttachmentSampleLocationsEXT>  attachmentInitialSampleLocations;
    private Collection<VkSubpassSampleLocationsEXT>     postSubpassSampleLocations;

    public VkRenderPassSampleLocationsBeginInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
    }

    public Collection<VkAttachmentSampleLocationsEXT> getAttachmentInitialSampleLocations()
    {
        return attachmentInitialSampleLocations;
    }

    public void setAttachmentInitialSampleLocations(
            Collection<VkAttachmentSampleLocationsEXT> attachmentInitialSampleLocations)
    {
        this.attachmentInitialSampleLocations = attachmentInitialSampleLocations;
    }

    public Collection<VkSubpassSampleLocationsEXT> getPostSubpassSampleLocations()
    {
        return postSubpassSampleLocations;
    }

    public void setPostSubpassSampleLocations(
            Collection<VkSubpassSampleLocationsEXT> postSubpassSampleLocations)
    {
        this.postSubpassSampleLocations = postSubpassSampleLocations;
    }

}
