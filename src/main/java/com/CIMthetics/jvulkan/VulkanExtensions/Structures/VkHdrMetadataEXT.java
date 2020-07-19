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

public class VkHdrMetadataEXT extends VulkanCreateInfoStructure
{
    private VkXYColorEXT       displayPrimaryRed;
    private VkXYColorEXT       displayPrimaryGreen;
    private VkXYColorEXT       displayPrimaryBlue;
    private VkXYColorEXT       whitePoint;
    private float              maxLuminance;
    private float              minLuminance;
    private float              maxContentLightLevel;
    private float              maxFrameAverageLightLevel;

    public VkHdrMetadataEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_HDR_METADATA_EXT);
    }

    public VkXYColorEXT getDisplayPrimaryRed()
    {
        return displayPrimaryRed;
    }

    public void setDisplayPrimaryRed(VkXYColorEXT displayPrimaryRed)
    {
        this.displayPrimaryRed = displayPrimaryRed;
    }

    public VkXYColorEXT getDisplayPrimaryGreen()
    {
        return displayPrimaryGreen;
    }

    public void setDisplayPrimaryGreen(VkXYColorEXT displayPrimaryGreen)
    {
        this.displayPrimaryGreen = displayPrimaryGreen;
    }

    public VkXYColorEXT getDisplayPrimaryBlue()
    {
        return displayPrimaryBlue;
    }

    public void setDisplayPrimaryBlue(VkXYColorEXT displayPrimaryBlue)
    {
        this.displayPrimaryBlue = displayPrimaryBlue;
    }

    public VkXYColorEXT getWhitePoint()
    {
        return whitePoint;
    }

    public void setWhitePoint(VkXYColorEXT whitePoint)
    {
        this.whitePoint = whitePoint;
    }

    public float getMaxLuminance()
    {
        return maxLuminance;
    }

    public void setMaxLuminance(float maxLuminance)
    {
        this.maxLuminance = maxLuminance;
    }

    public float getMinLuminance()
    {
        return minLuminance;
    }

    public void setMinLuminance(float minLuminance)
    {
        this.minLuminance = minLuminance;
    }

    public float getMaxContentLightLevel()
    {
        return maxContentLightLevel;
    }

    public void setMaxContentLightLevel(float maxContentLightLevel)
    {
        this.maxContentLightLevel = maxContentLightLevel;
    }

    public float getMaxFrameAverageLightLevel()
    {
        return maxFrameAverageLightLevel;
    }

    public void setMaxFrameAverageLightLevel(float maxFrameAverageLightLevel)
    {
        this.maxFrameAverageLightLevel = maxFrameAverageLightLevel;
    }

}
