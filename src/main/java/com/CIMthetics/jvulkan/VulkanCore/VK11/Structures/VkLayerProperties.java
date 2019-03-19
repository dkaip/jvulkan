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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

public class VkLayerProperties
{
    private String      layerName;
    private int         specVersion;
    private int         implementationVersion;
    private String      description;
    
    public String getLayerName()
    {
        return layerName;
    }
    
    void setLayerName(String layerName)
    {
        this.layerName = layerName;
    }
    
    public int getSpecVersion()
    {
        return specVersion;
    }
    
    void setSpecVersion(int specVersion)
    {
        this.specVersion = specVersion;
    }
    
    public int getImplementationVersion()
    {
        return implementationVersion;
    }
    
    void setImplementationVersion(int implementationVersion)
    {
        this.implementationVersion = implementationVersion;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    void setDescription(String description)
    {
        this.description = description;
    }
}
