package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineStageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkCommandBuffer;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkSemaphore;

public class VkSubmitInfo extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private Collection<VkSemaphore>                         waitSemaphores;
    private Collection<EnumSet<VkPipelineStageFlagBits>>    waitDstStageMask;
    private Collection<VkCommandBuffer>                     commandBuffers;
    private Collection<VkSemaphore>                         signalSemaphores;
    
    public VkSubmitInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SUBMIT_INFO);
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

    public Collection<EnumSet<VkPipelineStageFlagBits>> getWaitDstStageMask()
    {
        return waitDstStageMask;
    }

    public void setWaitDstStageMask(
            Collection<EnumSet<VkPipelineStageFlagBits>> waitDstStageMask)
    {
        this.waitDstStageMask = waitDstStageMask;
    }

    public Collection<VkCommandBuffer> getCommandBuffers()
    {
        return commandBuffers;
    }

    public void setCommandBuffers(Collection<VkCommandBuffer> commandBuffers)
    {
        this.commandBuffers = commandBuffers;
    }

    public void setCommandBuffers(VkCommandBuffer commandBuffer)
    {
        this.commandBuffers = new LinkedList<VkCommandBuffer>();
        this.commandBuffers.add(commandBuffer);
    }

    public Collection<VkSemaphore> getSignalSemaphores()
    {
        return signalSemaphores;
    }

    public void setSignalSemaphores(Collection<VkSemaphore> signalSemaphores)
    {
        this.signalSemaphores = signalSemaphores;
    }
    
}
