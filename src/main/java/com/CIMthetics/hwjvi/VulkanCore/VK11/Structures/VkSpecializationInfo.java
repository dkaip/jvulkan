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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.Collection;

public class VkSpecializationInfo
{
    private Collection<VkSpecializationMapEntry>    mapEntries;
    private byte[]                                  data;
    
    public Collection<VkSpecializationMapEntry> getMapEntries()
    {
        return mapEntries;
    }
    
    public void setMapEntries(Collection<VkSpecializationMapEntry> mapEntries)
    {
        this.mapEntries = mapEntries;
    }
    
    public byte[] getData()
    {
        return data;
    }
    
    public void setData(byte[] data)
    {
        this.data = data;
    }
}
