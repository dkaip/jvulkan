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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSurfaceTransformFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkDisplayKHR;

public class VkDisplayPropertiesKHR
{
    private VkDisplayKHR                            display;
    private String                                  displayName;
    private VkExtent2D                              physicalDimensions;
    private VkExtent2D                              physicalResolution;
    private EnumSet<VkSurfaceTransformFlagBitsKHR>  supportedTransforms = EnumSet.noneOf(VkSurfaceTransformFlagBitsKHR.class);
    private boolean                                 planeReorderPossible;
    private boolean                                 persistentContent;
    
    public VkDisplayKHR getDisplay()
    {
        return display;
    }
    
    public void setDisplay(VkDisplayKHR display)
    {
        this.display = display;
    }
    
    public String getDisplayName()
    {
        return displayName;
    }
    
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }
    
    public VkExtent2D getPhysicalDimensions()
    {
        return physicalDimensions;
    }
    
    public void setPhysicalDimensions(VkExtent2D physicalDimensions)
    {
        this.physicalDimensions = physicalDimensions;
    }
    
    public VkExtent2D getPhysicalResolution()
    {
        return physicalResolution;
    }
    
    public void setPhysicalResolution(VkExtent2D physicalResolution)
    {
        this.physicalResolution = physicalResolution;
    }
    
    public EnumSet<VkSurfaceTransformFlagBitsKHR> getSupportedTransforms()
    {
        return supportedTransforms;
    }
    
    public void setSupportedTransforms(
            EnumSet<VkSurfaceTransformFlagBitsKHR> supportedTransforms)
    {
        this.supportedTransforms = supportedTransforms;
    }
    
    public boolean isPlaneReorderPossible()
    {
        return planeReorderPossible;
    }
    
    public void setPlaneReorderPossible(boolean planeReorderPossible)
    {
        this.planeReorderPossible = planeReorderPossible;
    }
    
    public boolean isPersistentContent()
    {
        return persistentContent;
    }
    
    public void setPersistentContent(boolean persistentContent)
    {
        this.persistentContent = persistentContent;
    }

}
