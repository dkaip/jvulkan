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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends VulkanCreateInfoStructure
{
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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%nVkPhysicalDeviceTransformFeedbackPropertiesEXT%n"));
        sb.append(String.format("    maxTransformFeedbackStreams:%d%n", maxTransformFeedbackStreams));
        sb.append(String.format("    maxTransformFeedbackBuffers:%d%n", maxTransformFeedbackBuffers));
        sb.append(String.format("    maxTransformFeedbackBufferSize:%d%n", maxTransformFeedbackBufferSize));
        sb.append(String.format("    maxTransformFeedbackStreamDataSize:%d%n", maxTransformFeedbackStreamDataSize));
        sb.append(String.format("    maxTransformFeedbackBufferDataSize:%d%n", maxTransformFeedbackBufferDataSize));
        sb.append(String.format("    maxTransformFeedbackBufferDataStride:%d%n", maxTransformFeedbackBufferDataStride));
        sb.append(String.format("    transformFeedbackQueries:%b%n", transformFeedbackQueries));
        sb.append(String.format("    transformFeedbackStreamsLinesTriangles:%b%n", transformFeedbackStreamsLinesTriangles));
        sb.append(String.format("    transformFeedbackRasterizationStreamSelect:%b%n", transformFeedbackRasterizationStreamSelect));
        sb.append(String.format("    transformFeedbackDraw:%b%n", transformFeedbackDraw));
        
        return sb.toString();
    }
}
