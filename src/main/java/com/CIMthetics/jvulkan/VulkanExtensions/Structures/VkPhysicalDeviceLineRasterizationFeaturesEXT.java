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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceLineRasterizationFeaturesEXT extends VulkanCreateInfoStructure
{
    private boolean rectangularLines;
    private boolean bresenhamLines;
    private boolean smoothLines;
    private boolean stippledRectangularLines;
    private boolean stippledBresenhamLines;
    private boolean stippledSmoothLines;

    public VkPhysicalDeviceLineRasterizationFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT);
    }

    public boolean isRectangularLines()
    {
        return rectangularLines;
    }

    public void setRectangularLines(boolean rectangularLines)
    {
        this.rectangularLines = rectangularLines;
    }

    public boolean isBresenhamLines()
    {
        return bresenhamLines;
    }

    public void setBresenhamLines(boolean bresenhamLines)
    {
        this.bresenhamLines = bresenhamLines;
    }

    public boolean isSmoothLines()
    {
        return smoothLines;
    }

    public void setSmoothLines(boolean smoothLines)
    {
        this.smoothLines = smoothLines;
    }

    public boolean isStippledRectangularLines()
    {
        return stippledRectangularLines;
    }

    public void setStippledRectangularLines(boolean stippledRectangularLines)
    {
        this.stippledRectangularLines = stippledRectangularLines;
    }

    public boolean isStippledBresenhamLines()
    {
        return stippledBresenhamLines;
    }

    public void setStippledBresenhamLines(boolean stippledBresenhamLines)
    {
        this.stippledBresenhamLines = stippledBresenhamLines;
    }

    public boolean isStippledSmoothLines()
    {
        return stippledSmoothLines;
    }

    public void setStippledSmoothLines(boolean stippledSmoothLines)
    {
        this.stippledSmoothLines = stippledSmoothLines;
    }
}
