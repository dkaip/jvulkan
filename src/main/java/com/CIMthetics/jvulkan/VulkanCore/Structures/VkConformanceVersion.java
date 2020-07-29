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

public class VkConformanceVersion
{
    private byte major;
    private byte minor;
    private byte subminor;
    private byte patch;
    
    public byte getMajor()
    {
        return major;
    }
    
    void setMajor(byte major)
    {
        this.major = major;
    }
    
    public byte getMinor()
    {
        return minor;
    }
    
    void setMinor(byte minor)
    {
        this.minor = minor;
    }
    
    public byte getSubminor()
    {
        return subminor;
    }
    
    void setSubminor(byte subminor)
    {
        this.subminor = subminor;
    }
    
    public byte getPatch()
    {
        return patch;
    }
    
    void setPatch(byte patch)
    {
        this.patch = patch;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkConformanceVersionKHR\n"));
        sb.append(String.format("    major:%d\n", (int)major));
        sb.append(String.format("    minor:%d\n", (int)minor));
        sb.append(String.format("    subminor:%d\n", (int)subminor));
        sb.append(String.format("    patch:%d\n", (int)patch));
        
        return sb.toString();
    }
}
