package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineTessellationStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

/**
 * 
<ul>
<li>
<code>pNext</code> is NULL or a pointer to an extension-specific structure.
</li>

<li>
<code>flags</code> is reserved for future use.
</li>

<li>
<code>patchControlPoints</code> number of control points per patch.
</li>
</ul>
 * @author Douglas Kaip
 *
 */
public class VkPipelineTessellationStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                                pNext;
    private EnumSet<VkPipelineTessellationStateCreateFlagBits>  flags = EnumSet.noneOf(VkPipelineTessellationStateCreateFlagBits.class);
    private int                                                 patchControlPoints;

    public VkPipelineTessellationStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineTessellationStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineTessellationStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public int getPatchControlPoints()
    {
        return patchControlPoints;
    }

    public void setPatchControlPoints(int patchControlPoints)
    {
        this.patchControlPoints = patchControlPoints;
    }
    
}
