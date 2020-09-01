/*
 * Copyright 2019-2020 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkIndexType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipelineLayout;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkIndirectCommandsTokenTypeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkIndirectStateFlagBitsNV;

public class VkIndirectCommandsLayoutTokenNV extends VulkanCreateInfoStructure
{
    private VkIndirectCommandsTokenTypeNV       tokenType;
    private int                                 stream;
    private int                                 offset;
    private int                                 vertexBindingUnit;
    private boolean                             vertexDynamicStride;
    private VkPipelineLayout                    pushconstantPipelineLayout;
    private EnumSet<VkShaderStageFlagBits>      pushconstantShaderStageFlags;
    private int                                 pushconstantOffset;
    private int                                 pushconstantSize;
    private EnumSet<VkIndirectStateFlagBitsNV>  indirectStateFlags;
    /*
     * indexTypes and indexTypeValues must have the same number of elements.
     */
    private Collection<VkIndexType>             indexTypes;
    private int[]                               indexTypeValues;
    
    public VkIndirectCommandsLayoutTokenNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
    }

    public VkIndirectCommandsTokenTypeNV getTokenType()
    {
        return tokenType;
    }

    public void setTokenType(VkIndirectCommandsTokenTypeNV tokenType)
    {
        this.tokenType = tokenType;
    }

    public int getStream()
    {
        return stream;
    }

    public void setStream(int stream)
    {
        this.stream = stream;
    }

    public int getOffset()
    {
        return offset;
    }

    public void setOffset(int offset)
    {
        this.offset = offset;
    }

    public int getVertexBindingUnit()
    {
        return vertexBindingUnit;
    }

    public void setVertexBindingUnit(int vertexBindingUnit)
    {
        this.vertexBindingUnit = vertexBindingUnit;
    }

    public boolean isVertexDynamicStride()
    {
        return vertexDynamicStride;
    }

    public void setVertexDynamicStride(boolean vertexDynamicStride)
    {
        this.vertexDynamicStride = vertexDynamicStride;
    }

    public VkPipelineLayout getPushconstantPipelineLayout()
    {
        return pushconstantPipelineLayout;
    }

    public void setPushconstantPipelineLayout(VkPipelineLayout pushconstantPipelineLayout)
    {
        this.pushconstantPipelineLayout = pushconstantPipelineLayout;
    }

    public EnumSet<VkShaderStageFlagBits> getPushconstantShaderStageFlags()
    {
        return pushconstantShaderStageFlags;
    }

    public void setPushconstantShaderStageFlags(EnumSet<VkShaderStageFlagBits> pushconstantShaderStageFlags)
    {
        this.pushconstantShaderStageFlags = pushconstantShaderStageFlags;
    }

    public int getPushconstantOffset()
    {
        return pushconstantOffset;
    }

    public void setPushconstantOffset(int pushconstantOffset)
    {
        this.pushconstantOffset = pushconstantOffset;
    }

    public int getPushconstantSize()
    {
        return pushconstantSize;
    }

    public void setPushconstantSize(int pushconstantSize)
    {
        this.pushconstantSize = pushconstantSize;
    }

    public EnumSet<VkIndirectStateFlagBitsNV> getIndirectStateFlags()
    {
        return indirectStateFlags;
    }

    public void setIndirectStateFlags(EnumSet<VkIndirectStateFlagBitsNV> indirectStateFlags)
    {
        this.indirectStateFlags = indirectStateFlags;
    }

    public Collection<VkIndexType> getIndexTypes()
    {
        return indexTypes;
    }

    public void setIndexTypes(Collection<VkIndexType> indexTypes)
    {
        this.indexTypes = indexTypes;
    }

    public int[] getIndexTypeValues()
    {
        return indexTypeValues;
    }

    public void setIndexTypeValues(int[] indexTypeValues)
    {
        this.indexTypeValues = indexTypeValues;
    }
}
