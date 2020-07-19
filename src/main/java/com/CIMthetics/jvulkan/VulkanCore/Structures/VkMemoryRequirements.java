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

import java.util.BitSet;

public class VkMemoryRequirements
{
    private long   size;
    private long   alignment;
    private BitSet memoryTypeBits;
    
    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public long getAlignment()
    {
        return alignment;
    }

    public void setAlignment(long alignment)
    {
        this.alignment = alignment;
    }

    public BitSet getMemoryTypeBits()
    {
        return memoryTypeBits;
    }

    public void setMemoryTypeBits(BitSet memoryTypeBits)
    {
        this.memoryTypeBits = memoryTypeBits;
    }
    
}
