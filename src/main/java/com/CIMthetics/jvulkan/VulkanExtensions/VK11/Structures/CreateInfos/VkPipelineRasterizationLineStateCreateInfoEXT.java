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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkLineRasterizationModeEXT;

public class VkPipelineRasterizationLineStateCreateInfoEXT extends VulkanCreateInfoStructure
{
    private VkLineRasterizationModeEXT  lineRasterizationMode;
    private boolean                     stippledLineEnable;
    private int                         lineStippleFactor;
    private short                       lineStipplePattern;

    public VkPipelineRasterizationLineStateCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT);
    }

    public VkLineRasterizationModeEXT getLineRasterizationMode()
    {
        return lineRasterizationMode;
    }

    public void setLineRasterizationMode(
            VkLineRasterizationModeEXT lineRasterizationMode)
    {
        this.lineRasterizationMode = lineRasterizationMode;
    }

    public boolean isStippledLineEnable()
    {
        return stippledLineEnable;
    }

    public void setStippledLineEnable(boolean stippledLineEnable)
    {
        this.stippledLineEnable = stippledLineEnable;
    }

    public int getLineStippleFactor()
    {
        return lineStippleFactor;
    }

    public void setLineStippleFactor(int lineStippleFactor)
    {
        this.lineStippleFactor = lineStippleFactor;
    }

    public short getLineStipplePattern()
    {
        return lineStipplePattern;
    }

    public void setLineStipplePattern(short lineStipplePattern)
    {
        this.lineStipplePattern = lineStipplePattern;
    }
    
}
