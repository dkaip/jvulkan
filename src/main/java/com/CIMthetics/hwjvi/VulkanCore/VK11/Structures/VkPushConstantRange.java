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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkShaderStageFlagBits;

/**
 * 
<ul>
<li>
    <code>stageFlags</code> is a set of stage flags describing the shader stages that will access a range of push constants. If a particular stage is not included in the range, then accessing members of that range of push constants from the corresponding shader stage will result in undefined data being read.
</li>

<li>
    <code>offset</code> and size are the start offset and size, respectively, consumed by the range. Both offset and size are in units of bytes and must be a multiple of 4. The layout of the push constant variables is specified in the shader.
</li>
</ul>

 * @author Douglas Kaip
 *
 */
public class VkPushConstantRange
{
    private EnumSet<VkShaderStageFlagBits>  stageFlags = EnumSet.noneOf(VkShaderStageFlagBits.class);
    private int                             offset;
    private int                             size;
    
    public EnumSet<VkShaderStageFlagBits> getStageFlags()
    {
        return stageFlags;
    }
    
    public void setStageFlags(EnumSet<VkShaderStageFlagBits> stageFlags)
    {
        this.stageFlags = stageFlags;
    }
    
    public int getOffset()
    {
        return offset;
    }
    
    public void setOffset(int offset)
    {
        this.offset = offset;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void setSize(int size)
    {
        this.size = size;
    }
    
}
