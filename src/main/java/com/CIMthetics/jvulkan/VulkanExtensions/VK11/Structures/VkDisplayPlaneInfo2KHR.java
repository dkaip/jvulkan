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
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDisplayModeKHR;

public class VkDisplayPlaneInfo2KHR extends VulkanCreateInfoStructure
{
    private VkDisplayModeKHR    mode;
    private int                 planeIndex;

    public VkDisplayPlaneInfo2KHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR);
    }

    public VkDisplayModeKHR getMode()
    {
        return mode;
    }

    public void setMode(VkDisplayModeKHR mode)
    {
        this.mode = mode;
    }

    public int getPlaneIndex()
    {
        return planeIndex;
    }

    public void setPlaneIndex(int planeIndex)
    {
        this.planeIndex = planeIndex;
    }

}
