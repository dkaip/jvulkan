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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkBlendFactor;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkBlendOp;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkColorComponentFlagBits;

/**
 * 
<ul>
<li>
<code>blendEnable</code> controls whether blending is enabled for the corresponding color attachment. If blending is not enabled, the source fragment’s color for that attachment is passed through unmodified.
</li>
<li>
    <code>srcColorBlendFactor</code> selects which blend factor is used to determine the source factors (Sr,Sg,Sb).
</li>

<li>
    <code>dstColorBlendFactor</code> selects which blend factor is used to determine the destination factors (Dr,Dg,Db).
</li>

<li>
    <code>colorBlendOp</code> selects which blend operation is used to calculate the RGB values to write to the color attachment.
</li>

<li>
    <code>srcAlphaBlendFactor</code> selects which blend factor is used to determine the source factor Sa.
</li>

<li>
    <code>dstAlphaBlendFactor</code> selects which blend factor is used to determine the destination factor Da.
</li>

<li>
    <code>alphaBlendOp</code> selects which blend operation is use to calculate the alpha values to write to the color attachment.
</li>

<li>
    <code>colorWriteMask</code> is a bitmask of VkColorComponentFlagBits specifying which of the R, G, B, and/or A components are enabled for writing, as described for the Color Write Mask.
</li>
</ul>

 * @author Douglas Kaip
 *
 */
public class VkPipelineColorBlendAttachmentState
{
    private boolean                             blendEnable;
    private VkBlendFactor                       srcColorBlendFactor;
    private VkBlendFactor                       dstColorBlendFactor;
    private VkBlendOp                           colorBlendOp;
    private VkBlendFactor                       srcAlphaBlendFactor;
    private VkBlendFactor                       dstAlphaBlendFactor;
    private VkBlendOp                           alphaBlendOp;
    private EnumSet<VkColorComponentFlagBits>   colorWriteMask = EnumSet.noneOf(VkColorComponentFlagBits.class);
    
    public boolean isBlendEnable()
    {
        return blendEnable;
    }
    
    public void setBlendEnable(boolean blendEnable)
    {
        this.blendEnable = blendEnable;
    }
    
    public VkBlendFactor getSrcColorBlendFactor()
    {
        return srcColorBlendFactor;
    }
    
    public void setSrcColorBlendFactor(VkBlendFactor srcColorBlendFactor)
    {
        this.srcColorBlendFactor = srcColorBlendFactor;
    }
    
    public VkBlendFactor getDstColorBlendFactor()
    {
        return dstColorBlendFactor;
    }
    
    public void setDstColorBlendFactor(VkBlendFactor dstColorBlendFactor)
    {
        this.dstColorBlendFactor = dstColorBlendFactor;
    }
    
    public VkBlendOp getColorBlendOp()
    {
        return colorBlendOp;
    }
    
    public void setColorBlendOp(VkBlendOp colorBlendOp)
    {
        this.colorBlendOp = colorBlendOp;
    }
    
    public VkBlendFactor getSrcAlphaBlendFactor()
    {
        return srcAlphaBlendFactor;
    }
    
    public void setSrcAlphaBlendFactor(VkBlendFactor srcAlphaBlendFactor)
    {
        this.srcAlphaBlendFactor = srcAlphaBlendFactor;
    }
    
    public VkBlendFactor getDstAlphaBlendFactor()
    {
        return dstAlphaBlendFactor;
    }
    
    public void setDstAlphaBlendFactor(VkBlendFactor dstAlphaBlendFactor)
    {
        this.dstAlphaBlendFactor = dstAlphaBlendFactor;
    }
    
    public VkBlendOp getAlphaBlendOp()
    {
        return alphaBlendOp;
    }
    
    public void setAlphaBlendOp(VkBlendOp alphaBlendOp)
    {
        this.alphaBlendOp = alphaBlendOp;
    }
    
    public EnumSet<VkColorComponentFlagBits> getColorWriteMask()
    {
        return colorWriteMask;
    }

    public void setColorWriteMask(EnumSet<VkColorComponentFlagBits> colorWriteMask)
    {
        this.colorWriteMask = colorWriteMask;
    }
}
