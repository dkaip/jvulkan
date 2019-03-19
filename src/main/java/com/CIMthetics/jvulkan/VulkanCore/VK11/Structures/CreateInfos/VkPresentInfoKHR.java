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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkResult;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSemaphore;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSwapchainKHR;

public class VkPresentInfoKHR extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private Collection<VkSemaphore>                 waitSemaphores;
    private Collection<VkSwapchainKHR>              swapchains;
    private int[]                                   imageIndices;
    private Collection<VkResult>                    results;
    
    public VkPresentInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public Collection<VkSemaphore> getWaitSemaphores()
    {
        return waitSemaphores;
    }

    public void setWaitSemaphores(Collection<VkSemaphore> waitSemaphores)
    {
        this.waitSemaphores = waitSemaphores;
    }

    public Collection<VkSwapchainKHR> getSwapchains()
    {
        return swapchains;
    }

    public void setSwapchains(Collection<VkSwapchainKHR> swapchains)
    {
        this.swapchains = swapchains;
    }

    public int[] getImageIndices()
    {
        return imageIndices;
    }

    public void setImageIndices(int[] imageIndices)
    {
        this.imageIndices = imageIndices;
    }

    public Collection<VkResult> getResults()
    {
        return results;
    }

    public void setResults(Collection<VkResult> results)
    {
        this.results = results;
    }
    
}
