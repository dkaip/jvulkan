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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkImage;

public class VkSparseImageOpaqueMemoryBindInfo
{
    private VkImage                      image;
    private Collection<VkSparseMemoryBind>  binds;
    
    public VkImage getImage()
    {
        return image;
    }
    
    public void setImage(VkImage image)
    {
        this.image = image;
    }
    
    public Collection<VkSparseMemoryBind> getBinds()
    {
        return binds;
    }
    
    public void setBinds(Collection<VkSparseMemoryBind> binds)
    {
        this.binds = binds;
    }

}
