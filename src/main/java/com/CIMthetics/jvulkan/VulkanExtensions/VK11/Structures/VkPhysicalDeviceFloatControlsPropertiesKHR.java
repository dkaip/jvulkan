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
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkShaderFloatControlsIndependenceKHR;

public class VkPhysicalDeviceFloatControlsPropertiesKHR extends VulkanCreateInfoStructure
{
    private VkShaderFloatControlsIndependenceKHR denormBehaviorIndependence;
    private VkShaderFloatControlsIndependenceKHR roundingModeIndependence;
    private boolean separateDenormSettings;
    private boolean separateRoundingModeSettings;
    private boolean shaderSignedZeroInfNanPreserveFloat16;
    private boolean shaderSignedZeroInfNanPreserveFloat32;
    private boolean shaderSignedZeroInfNanPreserveFloat64;
    private boolean shaderDenormPreserveFloat16;
    private boolean shaderDenormPreserveFloat32;
    private boolean shaderDenormPreserveFloat64;
    private boolean shaderDenormFlushToZeroFloat16;
    private boolean shaderDenormFlushToZeroFloat32;
    private boolean shaderDenormFlushToZeroFloat64;
    private boolean shaderRoundingModeRTEFloat16;
    private boolean shaderRoundingModeRTEFloat32;
    private boolean shaderRoundingModeRTEFloat64;
    private boolean shaderRoundingModeRTZFloat16;
    private boolean shaderRoundingModeRTZFloat32;
    private boolean shaderRoundingModeRTZFloat64;

    public VkPhysicalDeviceFloatControlsPropertiesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR);
    }

    public VkShaderFloatControlsIndependenceKHR getDenormBehaviorIndependence()
    {
        return denormBehaviorIndependence;
    }

    public void setDenormBehaviorIndependence(
            VkShaderFloatControlsIndependenceKHR denormBehaviorIndependence)
    {
        this.denormBehaviorIndependence = denormBehaviorIndependence;
    }

    public VkShaderFloatControlsIndependenceKHR getRoundingModeIndependence()
    {
        return roundingModeIndependence;
    }

    public void setRoundingModeIndependence(
            VkShaderFloatControlsIndependenceKHR roundingModeIndependence)
    {
        this.roundingModeIndependence = roundingModeIndependence;
    }

    public boolean isSeparateDenormSettings()
    {
        return separateDenormSettings;
    }

    public void setSeparateDenormSettings(boolean separateDenormSettings)
    {
        this.separateDenormSettings = separateDenormSettings;
    }

    public boolean isSeparateRoundingModeSettings()
    {
        return separateRoundingModeSettings;
    }

    public void setSeparateRoundingModeSettings(
            boolean separateRoundingModeSettings)
    {
        this.separateRoundingModeSettings = separateRoundingModeSettings;
    }

    public boolean isShaderSignedZeroInfNanPreserveFloat16()
    {
        return shaderSignedZeroInfNanPreserveFloat16;
    }

    public void setShaderSignedZeroInfNanPreserveFloat16(
            boolean shaderSignedZeroInfNanPreserveFloat16)
    {
        this.shaderSignedZeroInfNanPreserveFloat16 = shaderSignedZeroInfNanPreserveFloat16;
    }

    public boolean isShaderSignedZeroInfNanPreserveFloat32()
    {
        return shaderSignedZeroInfNanPreserveFloat32;
    }

    public void setShaderSignedZeroInfNanPreserveFloat32(
            boolean shaderSignedZeroInfNanPreserveFloat32)
    {
        this.shaderSignedZeroInfNanPreserveFloat32 = shaderSignedZeroInfNanPreserveFloat32;
    }

    public boolean isShaderSignedZeroInfNanPreserveFloat64()
    {
        return shaderSignedZeroInfNanPreserveFloat64;
    }

    public void setShaderSignedZeroInfNanPreserveFloat64(
            boolean shaderSignedZeroInfNanPreserveFloat64)
    {
        this.shaderSignedZeroInfNanPreserveFloat64 = shaderSignedZeroInfNanPreserveFloat64;
    }

    public boolean isShaderDenormPreserveFloat16()
    {
        return shaderDenormPreserveFloat16;
    }

    public void setShaderDenormPreserveFloat16(boolean shaderDenormPreserveFloat16)
    {
        this.shaderDenormPreserveFloat16 = shaderDenormPreserveFloat16;
    }

    public boolean isShaderDenormPreserveFloat32()
    {
        return shaderDenormPreserveFloat32;
    }

    public void setShaderDenormPreserveFloat32(boolean shaderDenormPreserveFloat32)
    {
        this.shaderDenormPreserveFloat32 = shaderDenormPreserveFloat32;
    }

    public boolean isShaderDenormPreserveFloat64()
    {
        return shaderDenormPreserveFloat64;
    }

    public void setShaderDenormPreserveFloat64(boolean shaderDenormPreserveFloat64)
    {
        this.shaderDenormPreserveFloat64 = shaderDenormPreserveFloat64;
    }

    public boolean isShaderDenormFlushToZeroFloat16()
    {
        return shaderDenormFlushToZeroFloat16;
    }

    public void setShaderDenormFlushToZeroFloat16(
            boolean shaderDenormFlushToZeroFloat16)
    {
        this.shaderDenormFlushToZeroFloat16 = shaderDenormFlushToZeroFloat16;
    }

    public boolean isShaderDenormFlushToZeroFloat32()
    {
        return shaderDenormFlushToZeroFloat32;
    }

    public void setShaderDenormFlushToZeroFloat32(
            boolean shaderDenormFlushToZeroFloat32)
    {
        this.shaderDenormFlushToZeroFloat32 = shaderDenormFlushToZeroFloat32;
    }

    public boolean isShaderDenormFlushToZeroFloat64()
    {
        return shaderDenormFlushToZeroFloat64;
    }

    public void setShaderDenormFlushToZeroFloat64(
            boolean shaderDenormFlushToZeroFloat64)
    {
        this.shaderDenormFlushToZeroFloat64 = shaderDenormFlushToZeroFloat64;
    }

    public boolean isShaderRoundingModeRTEFloat16()
    {
        return shaderRoundingModeRTEFloat16;
    }

    public void setShaderRoundingModeRTEFloat16(
            boolean shaderRoundingModeRTEFloat16)
    {
        this.shaderRoundingModeRTEFloat16 = shaderRoundingModeRTEFloat16;
    }

    public boolean isShaderRoundingModeRTEFloat32()
    {
        return shaderRoundingModeRTEFloat32;
    }

    public void setShaderRoundingModeRTEFloat32(
            boolean shaderRoundingModeRTEFloat32)
    {
        this.shaderRoundingModeRTEFloat32 = shaderRoundingModeRTEFloat32;
    }

    public boolean isShaderRoundingModeRTEFloat64()
    {
        return shaderRoundingModeRTEFloat64;
    }

    public void setShaderRoundingModeRTEFloat64(
            boolean shaderRoundingModeRTEFloat64)
    {
        this.shaderRoundingModeRTEFloat64 = shaderRoundingModeRTEFloat64;
    }

    public boolean isShaderRoundingModeRTZFloat16()
    {
        return shaderRoundingModeRTZFloat16;
    }

    public void setShaderRoundingModeRTZFloat16(
            boolean shaderRoundingModeRTZFloat16)
    {
        this.shaderRoundingModeRTZFloat16 = shaderRoundingModeRTZFloat16;
    }

    public boolean isShaderRoundingModeRTZFloat32()
    {
        return shaderRoundingModeRTZFloat32;
    }

    public void setShaderRoundingModeRTZFloat32(
            boolean shaderRoundingModeRTZFloat32)
    {
        this.shaderRoundingModeRTZFloat32 = shaderRoundingModeRTZFloat32;
    }

    public boolean isShaderRoundingModeRTZFloat64()
    {
        return shaderRoundingModeRTZFloat64;
    }

    public void setShaderRoundingModeRTZFloat64(
            boolean shaderRoundingModeRTZFloat64)
    {
        this.shaderRoundingModeRTZFloat64 = shaderRoundingModeRTZFloat64;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceFloatControlsPropertiesKHR\n"));
        sb.append(String.format("    denormBehaviorIndependence:%s\n", denormBehaviorIndependence.toString()));
        sb.append(String.format("    roundingModeIndependence:%s\n", roundingModeIndependence.toString()));
        sb.append(String.format("    separateDenormSettings:%b\n", separateDenormSettings));
        sb.append(String.format("    separateRoundingModeSettings:%b\n", separateRoundingModeSettings));
        sb.append(String.format("    shaderSignedZeroInfNanPreserveFloat16:%b\n", shaderSignedZeroInfNanPreserveFloat16));
        sb.append(String.format("    shaderSignedZeroInfNanPreserveFloat32:%b\n", shaderSignedZeroInfNanPreserveFloat32));
        sb.append(String.format("    shaderSignedZeroInfNanPreserveFloat64:%b\n", shaderSignedZeroInfNanPreserveFloat64));
        sb.append(String.format("    shaderDenormPreserveFloat16:%b\n", shaderDenormPreserveFloat16));
        sb.append(String.format("    shaderDenormPreserveFloat32:%b\n", shaderDenormPreserveFloat32));
        sb.append(String.format("    shaderDenormPreserveFloat64:%b\n", shaderDenormPreserveFloat64));
        sb.append(String.format("    shaderDenormFlushToZeroFloat16:%b\n", shaderDenormFlushToZeroFloat16));
        sb.append(String.format("    shaderDenormFlushToZeroFloat32:%b\n", shaderDenormFlushToZeroFloat32));
        sb.append(String.format("    shaderDenormFlushToZeroFloat64:%b\n", shaderDenormFlushToZeroFloat64));
        sb.append(String.format("    shaderRoundingModeRTEFloat16:%b\n", shaderRoundingModeRTEFloat16));
        sb.append(String.format("    shaderRoundingModeRTEFloat32:%b\n", shaderRoundingModeRTEFloat32));
        sb.append(String.format("    shaderRoundingModeRTEFloat64:%b\n", shaderRoundingModeRTEFloat64));
        sb.append(String.format("    shaderRoundingModeRTZFloat16:%b\n", shaderRoundingModeRTZFloat16));
        sb.append(String.format("    shaderRoundingModeRTZFloat32:%b\n", shaderRoundingModeRTZFloat32));
        sb.append(String.format("    shaderRoundingModeRTZFloat64:%b\n", shaderRoundingModeRTZFloat64));
        
        return sb.toString();
    }
}
