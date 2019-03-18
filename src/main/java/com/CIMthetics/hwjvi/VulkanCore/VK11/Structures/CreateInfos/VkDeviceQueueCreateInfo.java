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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDeviceQueueCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

/**
 * This class is used in the <code>VkDeviceCreateInfo</code> Class(structure) when creating
 * a Vulkan logical device (<code>VkDevice</code>).  You will have one of these Classes
 * (structures) for each queue family you want to access for the specified 
 * device.  The <code>queueCount</code> attribute is the number of queues you want to use
 * for a given queue family.  The <code>queuePriorities</code> attribute <b>MUST</b> be the
 * same size as the value of <code>queueCount</code>.  You will need to specify a queue
 * priority for each queue you want to access within a given queue family.
 * 
 * 
 * @author Douglas Kaip
 *
 */
public class VkDeviceQueueCreateInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkDeviceQueueCreateFlagBits>    flags = EnumSet.noneOf(VkDeviceQueueCreateFlagBits.class);
    private int                                     queueFamilyIndex;
    private int                                     queueCount;
    private float[]                                 queuePriorities;
    
    public VkDeviceQueueCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
    }
    
    public long getpNext()
    {
        return pNext;
    }
    
    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }
    
    public EnumSet<VkDeviceQueueCreateFlagBits> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkDeviceQueueCreateFlagBits> flags)
    {
        this.flags = flags;
    }
    
//    int getFlagsAsInt()
//    {
//        int result = 0;
//        
//        for (VkDeviceQueueCreateFlagBits flag : flags)
//        {
//            result |= flag.valueOf();
//        }
//            
//        return result;
//    }
//    
    public int getQueueFamilyIndex()
    {
        return queueFamilyIndex;
    }
    
    public void setQueueFamilyIndex(int queueFamilyIndex)
    {
        this.queueFamilyIndex = queueFamilyIndex;
    }
    
    public int getQueueCount()
    {
        return queueCount;
    }
    
    public void setQueueCount(int queueCount)
    {
        this.queueCount = queueCount;
    }
    
    public float[] getQueuePriorities()
    {
        return queuePriorities;
    }
    
    /**
     * Set the queue priority for each queue.  If Queue Count is 1 then a float
     * array with one element who's value is between 0 and 1 inclusive is needed.
     * If the Queue Count is set to 4 then a float array with 4 elements will
     * be needed, etc.
     * 
     * @param queuePriorities
     */
    public void setQueuePriorities(float[] queuePriorities)
    {
        this.queuePriorities = queuePriorities;
    }
}
