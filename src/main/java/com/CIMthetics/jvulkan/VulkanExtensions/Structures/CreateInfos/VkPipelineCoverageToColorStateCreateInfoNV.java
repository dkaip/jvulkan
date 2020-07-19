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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPipelineCoverageToColorStateCreateFlagBitsNV;

public class VkPipelineCoverageToColorStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineCoverageToColorStateCreateFlagBitsNV> flags;
    private boolean                                                 coverageToColorEnable;
    private int                                                     coverageToColorLocation;

    public VkPipelineCoverageToColorStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
    }

    public EnumSet<VkPipelineCoverageToColorStateCreateFlagBitsNV> getFlags()
    {
        return flags;
    }

    public void setFlags(
            EnumSet<VkPipelineCoverageToColorStateCreateFlagBitsNV> flags)
    {
        this.flags = flags;
    }

    public boolean isCoverageToColorEnable()
    {
        return coverageToColorEnable;
    }

    public void setCoverageToColorEnable(boolean coverageToColorEnable)
    {
        this.coverageToColorEnable = coverageToColorEnable;
    }

    public int getCoverageToColorLocation()
    {
        return coverageToColorLocation;
    }

    public void setCoverageToColorLocation(int coverageToColorLocation)
    {
        this.coverageToColorLocation = coverageToColorLocation;
    }

}
