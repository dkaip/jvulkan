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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;

public class VkVertexInputAttributeDescription
{
    private int         location;
    private int         binding;
    private VkFormat    format;
    private int         offset;
    
    /**
     * 
     * @param location
     * @param binding
     * @param format
     * @param offset
     */
    public VkVertexInputAttributeDescription(int location, int binding, VkFormat format, int offset)
    {
        this.location   = location;
        this.binding    = binding;
        this.format     = format;
        this.offset     = offset;
    }

    public int getLocation()
    {
        return location;
    }

    public int getBinding()
    {
        return binding;
    }

    public VkFormat getFormat()
    {
        return format;
    }

    public int getOffset()
    {
        return offset;
    }
    
}
