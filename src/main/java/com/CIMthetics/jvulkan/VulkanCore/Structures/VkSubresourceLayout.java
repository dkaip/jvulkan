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

public class VkSubresourceLayout
{
    private long    offset;
    private long    size;
    private long    rowPitch;
    private long    arrayPitch;
    private long    depthPitch;
    
    public long getOffset()
    {
        return offset;
    }
    
    public void setOffset(long offset)
    {
        this.offset = offset;
    }
    
    public long getSize()
    {
        return size;
    }
    
    public void setSize(long size)
    {
        this.size = size;
    }
    
    public long getRowPitch()
    {
        return rowPitch;
    }
    
    public void setRowPitch(long rowPitch)
    {
        this.rowPitch = rowPitch;
    }
    
    public long getArrayPitch()
    {
        return arrayPitch;
    }
    
    public void setArrayPitch(long arrayPitch)
    {
        this.arrayPitch = arrayPitch;
    }
    
    public long getDepthPitch()
    {
        return depthPitch;
    }
    
    public void setDepthPitch(long depthPitch)
    {
        this.depthPitch = depthPitch;
    }
    
}
