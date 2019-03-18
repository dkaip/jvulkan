package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends VulkanCreateInfoStructure
{
    private long        pNext;
    private int         maxTransformFeedbackStreams;
    private int         maxTransformFeedbackBuffers;
    private long        maxTransformFeedbackBufferSize;
    private int         maxTransformFeedbackStreamDataSize;
    private int         maxTransformFeedbackBufferDataSize;
    private int         maxTransformFeedbackBufferDataStride;
    private boolean     transformFeedbackQueries;
    private boolean     transformFeedbackStreamsLinesTriangles;
    private boolean     transformFeedbackRasterizationStreamSelect;
    private boolean     transformFeedbackDraw;

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public int getMaxTransformFeedbackStreams()
    {
        return maxTransformFeedbackStreams;
    }

    public void setMaxTransformFeedbackStreams(int maxTransformFeedbackStreams)
    {
        this.maxTransformFeedbackStreams = maxTransformFeedbackStreams;
    }

    public int getMaxTransformFeedbackBuffers()
    {
        return maxTransformFeedbackBuffers;
    }

    public void setMaxTransformFeedbackBuffers(int maxTransformFeedbackBuffers)
    {
        this.maxTransformFeedbackBuffers = maxTransformFeedbackBuffers;
    }

    public long getMaxTransformFeedbackBufferSize()
    {
        return maxTransformFeedbackBufferSize;
    }

    public void setMaxTransformFeedbackBufferSize(
            long maxTransformFeedbackBufferSize)
    {
        this.maxTransformFeedbackBufferSize = maxTransformFeedbackBufferSize;
    }

    public int getMaxTransformFeedbackStreamDataSize()
    {
        return maxTransformFeedbackStreamDataSize;
    }

    public void setMaxTransformFeedbackStreamDataSize(
            int maxTransformFeedbackStreamDataSize)
    {
        this.maxTransformFeedbackStreamDataSize = maxTransformFeedbackStreamDataSize;
    }

    public int getMaxTransformFeedbackBufferDataSize()
    {
        return maxTransformFeedbackBufferDataSize;
    }

    public void setMaxTransformFeedbackBufferDataSize(
            int maxTransformFeedbackBufferDataSize)
    {
        this.maxTransformFeedbackBufferDataSize = maxTransformFeedbackBufferDataSize;
    }

    public int getMaxTransformFeedbackBufferDataStride()
    {
        return maxTransformFeedbackBufferDataStride;
    }

    public void setMaxTransformFeedbackBufferDataStride(
            int maxTransformFeedbackBufferDataStride)
    {
        this.maxTransformFeedbackBufferDataStride = maxTransformFeedbackBufferDataStride;
    }

    public boolean isTransformFeedbackQueries()
    {
        return transformFeedbackQueries;
    }

    public void setTransformFeedbackQueries(boolean transformFeedbackQueries)
    {
        this.transformFeedbackQueries = transformFeedbackQueries;
    }

    public boolean isTransformFeedbackStreamsLinesTriangles()
    {
        return transformFeedbackStreamsLinesTriangles;
    }

    public void setTransformFeedbackStreamsLinesTriangles(
            boolean transformFeedbackStreamsLinesTriangles)
    {
        this.transformFeedbackStreamsLinesTriangles = transformFeedbackStreamsLinesTriangles;
    }

    public boolean isTransformFeedbackRasterizationStreamSelect()
    {
        return transformFeedbackRasterizationStreamSelect;
    }

    public void setTransformFeedbackRasterizationStreamSelect(
            boolean transformFeedbackRasterizationStreamSelect)
    {
        this.transformFeedbackRasterizationStreamSelect = transformFeedbackRasterizationStreamSelect;
    }

    public boolean isTransformFeedbackDraw()
    {
        return transformFeedbackDraw;
    }

    public void setTransformFeedbackDraw(boolean transformFeedbackDraw)
    {
        this.transformFeedbackDraw = transformFeedbackDraw;
    }
}
