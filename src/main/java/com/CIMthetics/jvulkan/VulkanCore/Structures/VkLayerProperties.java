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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkLayerProperties\n"));
        sb.append(String.format("    layerName:%s\n", layerName));
        sb.append(String.format("    specVersion:%d\n", specVersion));
        sb.append(String.format("    implementationVersion:%d\n", implementationVersion));
        sb.append(String.format("    description:%s\n", description));
        
        return sb.toString();
    }
}
