package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkInternalAllocationType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSystemAllocationScope;

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
