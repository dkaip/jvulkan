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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkAccessFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDependencyFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineStageFlagBits;

public class VkSubpassDependency
{
    private int                                 srcSubpass;
    private int                                 dstSubpass;
    private EnumSet<VkPipelineStageFlagBits>    srcStageMask    = EnumSet.noneOf(VkPipelineStageFlagBits.class);
    private EnumSet<VkPipelineStageFlagBits>    dstStageMask    = EnumSet.noneOf(VkPipelineStageFlagBits.class);
    private EnumSet<VkAccessFlagBits>           srcAccessMask   = EnumSet.noneOf(VkAccessFlagBits.class);
    private EnumSet<VkAccessFlagBits>           dstAccessMask   = EnumSet.noneOf(VkAccessFlagBits.class);
    private EnumSet<VkDependencyFlagBits>       dependencyFlags = EnumSet.noneOf(VkDependencyFlagBits.class);
    
    public int getSrcSubpass()
    {
        return srcSubpass;
    }
    
    public void setSrcSubpass(int srcSubpass)
    {
        this.srcSubpass = srcSubpass;
    }
    
    public int getDstSubpass()
    {
        return dstSubpass;
    }
    
    public void setDstSubpass(int dstSubpass)
    {
        this.dstSubpass = dstSubpass;
    }
    
    public EnumSet<VkPipelineStageFlagBits> getSrcStageMask()
    {
        return srcStageMask;
    }
    
    public void setSrcStageMask(EnumSet<VkPipelineStageFlagBits> srcStageMask)
    {
        this.srcStageMask = srcStageMask;
    }
    
    public EnumSet<VkPipelineStageFlagBits> getDstStageMask()
    {
        return dstStageMask;
    }
    
    public void setDstStageMask(EnumSet<VkPipelineStageFlagBits> dstStageMask)
    {
        this.dstStageMask = dstStageMask;
    }
    
    public EnumSet<VkAccessFlagBits> getSrcAccessMask()
    {
        return srcAccessMask;
    }
    
    public void setSrcAccessMask(EnumSet<VkAccessFlagBits> srcAccessMask)
    {
        this.srcAccessMask = srcAccessMask;
    }
    
    public EnumSet<VkAccessFlagBits> getDstAccessMask()
    {
        return dstAccessMask;
    }
    
    public void setDstAccessMask(EnumSet<VkAccessFlagBits> dstAccessMask)
    {
        this.dstAccessMask = dstAccessMask;
    }
    
    public EnumSet<VkDependencyFlagBits> getDependencyFlags()
    {
        return dependencyFlags;
    }
    
    public void setDependencyFlags(EnumSet<VkDependencyFlagBits> dependencyFlags)
    {
        this.dependencyFlags = dependencyFlags;
    }
}
