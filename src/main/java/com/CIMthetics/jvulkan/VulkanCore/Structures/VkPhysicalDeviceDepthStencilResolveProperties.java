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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkResolveModeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceDepthStencilResolveProperties extends VulkanCreateInfoStructure
{
    private EnumSet<VkResolveModeFlagBits>  supportedDepthResolveModes = EnumSet.noneOf(VkResolveModeFlagBits.class);
    private EnumSet<VkResolveModeFlagBits>  supportedStencilResolveModes = EnumSet.noneOf(VkResolveModeFlagBits.class);
    private boolean                         independentResolveNone;
    private boolean                         independentResolve;
    
    public VkPhysicalDeviceDepthStencilResolveProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES);
    }

    public EnumSet<VkResolveModeFlagBits> getSupportedDepthResolveModes()
    {
        return supportedDepthResolveModes;
    }

    public void setSupportedDepthResolveModes(
            EnumSet<VkResolveModeFlagBits> supportedDepthResolveModes)
    {
        this.supportedDepthResolveModes = supportedDepthResolveModes;
    }

    public EnumSet<VkResolveModeFlagBits> getSupportedStencilResolveModes()
    {
        return supportedStencilResolveModes;
    }

    public void setSupportedStencilResolveModes(
            EnumSet<VkResolveModeFlagBits> supportedStencilResolveModes)
    {
        this.supportedStencilResolveModes = supportedStencilResolveModes;
    }

    public boolean isIndependentResolveNone()
    {
        return independentResolveNone;
    }

    public void setIndependentResolveNone(boolean independentResolveNone)
    {
        this.independentResolveNone = independentResolveNone;
    }

    public boolean isIndependentResolve()
    {
        return independentResolve;
    }

    public void setIndependentResolve(boolean independentResolve)
    {
        this.independentResolve = independentResolve;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceDepthStencilResolvePropertiesKHR\n"));
        sb.append(String.format("    supportedDepthResolveModes:%s\n", supportedDepthResolveModes.toString()));
        sb.append(String.format("    supportedStencilResolveModes:%s\n", supportedStencilResolveModes.toString()));
        sb.append(String.format("    independentResolveNone:%b\n", independentResolveNone));
        sb.append(String.format("    independentResolve:%b\n", independentResolve));
        
        return sb.toString();
    }

}
