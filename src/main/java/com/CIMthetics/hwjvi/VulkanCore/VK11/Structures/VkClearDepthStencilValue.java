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

public class VkClearDepthStencilValue
{
    private float depth;
    private long  stencil;
    
    /**
     * 
     * @param depth
     * @param stencil - this is a long so that it can be retrieved as a uint32_t
     */
    public VkClearDepthStencilValue(float depth, long stencil)
    {
        this.depth   = depth;
        this.stencil = stencil;
    }

    public float getDepth()
    {
        return depth;
    }

    public long getStencil()
    {
        return stencil;
    }
    
}
