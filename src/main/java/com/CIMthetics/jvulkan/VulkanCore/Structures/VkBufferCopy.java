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

public class VkBufferCopy
{
    private long srcOffset;
    private long dstOffset;
    private long size;
    
    public VkBufferCopy(long srcOffset, long dstOffset, long size)
    {
        this.srcOffset = srcOffset;
        this.dstOffset = dstOffset;
        this.size      = size;
    }

    public long getSrcOffset()
    {
        return srcOffset;
    }

    public void setSrcOffset(long srcOffset)
    {
        this.srcOffset = srcOffset;
    }

    public long getDstOffset()
    {
        return dstOffset;
    }

    public void setDstOffset(long dstOffset)
    {
        this.dstOffset = dstOffset;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }
    
}
