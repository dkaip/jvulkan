package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;

public class VkPhysicalDeviceTransformFeedbackFeaturesEXT extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private VkAccelerationStructureNV  accelerationStructure;
    private boolean                     transformFeedback;
    private boolean                     geometryStreams;
    
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkAccelerationStructureNV getAccelerationStructure()
    {
        return accelerationStructure;
    }

    public void setAccelerationStructure(
            VkAccelerationStructureNV accelerationStructure)
    {
        this.accelerationStructure = accelerationStructure;
    }

    public boolean isTransformFeedback()
    {
        return transformFeedback;
    }

    public void setTransformFeedback(boolean transformFeedback)
    {
        this.transformFeedback = transformFeedback;
    }

    public boolean isGeometryStreams()
    {
        return geometryStreams;
    }

    public void setGeometryStreams(boolean geometryStreams)
    {
        this.geometryStreams = geometryStreams;
    }

}
