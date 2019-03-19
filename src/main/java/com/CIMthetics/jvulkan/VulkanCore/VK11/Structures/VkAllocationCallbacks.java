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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkInternalAllocationType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSystemAllocationScope;

public interface VkAllocationCallbacks
{
    public Object userData = null;
    
    public abstract long PFN_vkAllocationFunction(
            Object userData,
            int size, 
            int alignment,
            VkSystemAllocationScope allocationScope);
    
    public abstract long PFN_vkReallocationFunction(
            Object userData,
            long pOriginal,
            int size, 
            int alignment,
            VkSystemAllocationScope allocationScope);
    
    public abstract void PFN_vkFreeFunction(
            Object userData,
            long pMemory);
    
    public abstract void PFN_vkInternalAllocationNotification(
            Object userData,
            int size, 
            VkInternalAllocationType allocationType,
            VkSystemAllocationScope allocationScope);
    
    public abstract void PFN_vkInternalFreeNotification(
            Object userData,
            int size, 
            VkInternalAllocationType allocationType,
            VkSystemAllocationScope allocationScope);
    
}
