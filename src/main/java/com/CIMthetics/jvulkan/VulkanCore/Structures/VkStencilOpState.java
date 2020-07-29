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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCompareOp;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStencilOp;

public class VkStencilOpState
{
    private VkStencilOp failOp;
    private VkStencilOp passOp;
    private VkStencilOp depthFailOp;
    private VkCompareOp compareOp;
    private int         compareMask;
    private int         writeMask;
    private int         reference;
    
    public VkStencilOp getFailOp()
    {
        return failOp;
    }
    
    public void setFailOp(VkStencilOp failOp)
    {
        this.failOp = failOp;
    }
    
    public VkStencilOp getPassOp()
    {
        return passOp;
    }
    
    public void setPassOp(VkStencilOp passOp)
    {
        this.passOp = passOp;
    }
    
    public VkStencilOp getDepthFailOp()
    {
        return depthFailOp;
    }
    
    public void setDepthFailOp(VkStencilOp depthFailOp)
    {
        this.depthFailOp = depthFailOp;
    }
    
    public VkCompareOp getCompareOp()
    {
        return compareOp;
    }
    
    public void setCompareOp(VkCompareOp compareOp)
    {
        this.compareOp = compareOp;
    }
    
    public int getCompareMask()
    {
        return compareMask;
    }
    
    public void setCompareMask(int compareMask)
    {
        this.compareMask = compareMask;
    }
    
    public int getWriteMask()
    {
        return writeMask;
    }
    
    public void setWriteMask(int writeMask)
    {
        this.writeMask = writeMask;
    }
    
    public int getReference()
    {
        return reference;
    }
    
    public void setReference(int reference)
    {
        this.reference = reference;
    }
}
