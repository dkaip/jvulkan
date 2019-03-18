package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineStageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Handles.CheckpointMarker;

public class VkCheckpointDataNV extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private VkPipelineStageFlagBits stage;
    private CheckpointMarker        checkpointMarker;

    public VkCheckpointDataNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkPipelineStageFlagBits getStage()
    {
        return stage;
    }

    public void setStage(VkPipelineStageFlagBits stage)
    {
        this.stage = stage;
    }

    public CheckpointMarker getCheckpointMarker()
    {
        return checkpointMarker;
    }

    public void setCheckpointMarker(CheckpointMarker checkpointMarker)
    {
        this.checkpointMarker = checkpointMarker;
    }
}
