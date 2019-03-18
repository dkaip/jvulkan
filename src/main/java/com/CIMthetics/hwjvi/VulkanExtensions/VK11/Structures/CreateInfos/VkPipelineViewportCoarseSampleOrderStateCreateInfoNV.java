package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkCoarseSampleOrderTypeNV;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.VkCoarseSampleOrderCustomNV;

public class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private VkCoarseSampleOrderTypeNV               sampleOrderType;
    private Collection<VkCoarseSampleOrderCustomNV> customSampleOrders;

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkCoarseSampleOrderTypeNV getSampleOrderType()
    {
        return sampleOrderType;
    }

    public void setSampleOrderType(VkCoarseSampleOrderTypeNV sampleOrderType)
    {
        this.sampleOrderType = sampleOrderType;
    }

    public Collection<VkCoarseSampleOrderCustomNV> getCustomSampleOrders()
    {
        return customSampleOrders;
    }

    public void setCustomSampleOrders(
            Collection<VkCoarseSampleOrderCustomNV> customSampleOrders)
    {
        this.customSampleOrders = customSampleOrders;
    }
}
