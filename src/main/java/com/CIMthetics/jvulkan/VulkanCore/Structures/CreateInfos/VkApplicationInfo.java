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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

public class VkApplicationInfo extends VulkanCreateInfoStructure
{
    private String                  applicationName;
    private int                     applicationVersion;
    private String                  engineName;
    private int                     engineVersion;
    private int                     apiVersion;
    
    public VkApplicationInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
    }
    
    public String getApplicationName()
    {
        return applicationName;
    }
    
    public void setApplicationName(String applicationName)
    {
        this.applicationName = applicationName;
    }
    
    public int getApplicationVersion()
    {
        return applicationVersion;
    }
    
    public void setApplicationVersion(int applicationVersion)
    {
        this.applicationVersion = applicationVersion;
    }
    
    public String getEngineName()
    {
        return engineName;
    }
    
    public void setEngineName(String engineName)
    {
        this.engineName = engineName;
    }
    
    public int getEngineVersion()
    {
        return engineVersion;
    }
    
    public void setEngineVersion(int engineVersion)
    {
        this.engineVersion = engineVersion;
    }
    
    public int getApiVersion()
    {
        return apiVersion;
    }
    
    public void setApiVersion(int apiVersion)
    {
        this.apiVersion = apiVersion;
    }
}
