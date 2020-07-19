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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkComponentTypeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkScopeNV;

public class VkCooperativeMatrixPropertiesNV extends VulkanCreateInfoStructure
{
    private int                 mSize;
    private int                 nSize;
    private int                 kSize;
    private VkComponentTypeNV   aType;
    private VkComponentTypeNV   bType;
    private VkComponentTypeNV   cType;
    private VkComponentTypeNV   dType;
    private VkScopeNV           scope;

    public VkCooperativeMatrixPropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV);
    }

    public int getmSize()
    {
        return mSize;
    }

    public void setmSize(int mSize)
    {
        this.mSize = mSize;
    }

    public int getnSize()
    {
        return nSize;
    }

    public void setnSize(int nSize)
    {
        this.nSize = nSize;
    }

    public int getkSize()
    {
        return kSize;
    }

    public void setkSize(int kSize)
    {
        this.kSize = kSize;
    }

    public VkComponentTypeNV getaType()
    {
        return aType;
    }

    public void setaType(VkComponentTypeNV aType)
    {
        this.aType = aType;
    }

    public VkComponentTypeNV getbType()
    {
        return bType;
    }

    public void setbType(VkComponentTypeNV bType)
    {
        this.bType = bType;
    }

    public VkComponentTypeNV getcType()
    {
        return cType;
    }

    public void setcType(VkComponentTypeNV cType)
    {
        this.cType = cType;
    }

    public VkComponentTypeNV getdType()
    {
        return dType;
    }

    public void setdType(VkComponentTypeNV dType)
    {
        this.dType = dType;
    }

    public VkScopeNV getScope()
    {
        return scope;
    }

    public void setScope(VkScopeNV scope)
    {
        this.scope = scope;
    }

}
