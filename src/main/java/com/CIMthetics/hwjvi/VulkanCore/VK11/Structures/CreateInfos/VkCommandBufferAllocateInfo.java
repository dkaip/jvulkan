package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCommandBufferLevel;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkCommandPool;

public class VkCommandBufferAllocateInfo extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private VkCommandPool           commandPool;
    private VkCommandBufferLevel    level;
    private int                     commandBufferCount;
    
    public VkCommandBufferAllocateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkCommandPool getCommandPool()
    {
        return commandPool;
    }

    public void setCommandPool(VkCommandPool commandPool)
    {
        this.commandPool = commandPool;
    }

    public VkCommandBufferLevel getLevel()
    {
        return level;
    }

    public void setLevel(VkCommandBufferLevel level)
    {
        this.level = level;
    }

    public int getCommandBufferCount()
    {
        return commandBufferCount;
    }

    public void setCommandBufferCount(int commandBufferCount)
    {
        this.commandBufferCount = commandBufferCount;
    }

}
