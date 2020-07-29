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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

public class VkRect2D
{
    private VkOffset2D offset;
    private VkExtent2D extent;
    
    /**
     * 
     * @param offset
     * @param extent
     */
    public VkRect2D(VkOffset2D offset, VkExtent2D extent)
    {
        this.offset = offset;
        this.extent = extent;
    }

    public VkOffset2D getOffset()
    {
        return offset;
    }

    public void setOffset(VkOffset2D offset)
    {
        this.offset = offset;
    }

    public VkExtent2D getExtent()
    {
        return extent;
    }

    public void setExtent(VkExtent2D extent)
    {
        this.extent = extent;
    }
    
}
