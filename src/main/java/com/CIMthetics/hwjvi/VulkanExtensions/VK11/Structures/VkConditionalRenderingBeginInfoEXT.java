package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkConditionalRenderingFlagBitsEXT;

public class VkConditionalRenderingBeginInfoEXT extends VulkanCreateInfoStructure
{
    private long                                        pNext;
    private VkBuffer                                    buffer;
    private long                                        offset;
    private EnumSet<VkConditionalRenderingFlagBitsEXT>  flags = EnumSet.noneOf(VkConditionalRenderingFlagBitsEXT.class);

    public VkConditionalRenderingBeginInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkBuffer getBuffer()
    {
        return buffer;
    }

    public void setBuffer(VkBuffer buffer)
    {
        this.buffer = buffer;
    }

    public long getOffset()
    {
        return offset;
    }

    public void setOffset(long offset)
    {
        this.offset = offset;
    }

    public EnumSet<VkConditionalRenderingFlagBitsEXT> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkConditionalRenderingFlagBitsEXT> flags)
    {
        this.flags = flags;
    }
}
