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

public class VkDebugMarkerMarkerInfoEXT extends VulkanCreateInfoStructure
{
    private String  markerName;
    private float[]   color;
    
    public VkDebugMarkerMarkerInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT);
    }

    public String getMarkerName()
    {
        return markerName;
    }

    public void setMarkerName(String markerName)
    {
        this.markerName = markerName;
    }

    public float[] getColor()
    {
        return color;
    }

    public void setColor(float[] color)
    {
        if (color.length != 4)
        {
            throw new IllegalArgumentException("color must have a length of 4");
        }
        
        this.color = color;
    }

}
