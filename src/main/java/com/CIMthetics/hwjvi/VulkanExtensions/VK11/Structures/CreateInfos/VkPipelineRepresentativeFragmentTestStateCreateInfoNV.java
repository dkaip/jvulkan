package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPipelineRepresentativeFragmentTestStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean representativeFragmentTestEnable;
    
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isRepresentativeFragmentTestEnable()
    {
        return representativeFragmentTestEnable;
    }

    public void setRepresentativeFragmentTestEnable(
            boolean representativeFragmentTestEnable)
    {
        this.representativeFragmentTestEnable = representativeFragmentTestEnable;
    }
}
