package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineStageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkQueueFamilyCheckpointPropertiesNV extends VulkanCreateInfoStructure
{
    private long                        pNext;
    EnumSet<VkPipelineStageFlagBits>    checkpointExecutionStageMask = EnumSet.noneOf(VkPipelineStageFlagBits.class);

    public VkQueueFamilyCheckpointPropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineStageFlagBits> getCheckpointExecutionStageMask()
    {
        return checkpointExecutionStageMask;
    }

    public void setCheckpointExecutionStageMask(EnumSet<VkPipelineStageFlagBits> checkpointExecutionStageMask)
    {
        if (checkpointExecutionStageMask == null)
        {
            throw new NullPointerException("checkpointExecutionStageMask may not be null");
        }
        
        this.checkpointExecutionStageMask = checkpointExecutionStageMask;
    }
}
