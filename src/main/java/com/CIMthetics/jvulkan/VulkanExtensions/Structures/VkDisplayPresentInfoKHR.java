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
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkRect2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDisplayPresentInfoKHR extends VulkanCreateInfoStructure
{
    private VkRect2D    srcRect;
    private VkRect2D    dstRect;
    private boolean     persistent;

    public VkDisplayPresentInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR);
    }

    public VkRect2D getSrcRect()
    {
        return srcRect;
    }

    public void setSrcRect(VkRect2D srcRect)
    {
        this.srcRect = srcRect;
    }

    public VkRect2D getDstRect()
    {
        return dstRect;
    }

    public void setDstRect(VkRect2D dstRect)
    {
        this.dstRect = dstRect;
    }

    public boolean isPersistent()
    {
        return persistent;
    }

    public void setPersistent(boolean persistent)
    {
        this.persistent = persistent;
    }

}
