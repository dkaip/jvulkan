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

import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkViewportCoordinateSwizzleNV;

public class VkViewportSwizzleNV
{
    private VkViewportCoordinateSwizzleNV   x;
    private VkViewportCoordinateSwizzleNV   y;
    private VkViewportCoordinateSwizzleNV   z;
    private VkViewportCoordinateSwizzleNV   w;
    
    public VkViewportCoordinateSwizzleNV getX()
    {
        return x;
    }
    
    public void setX(VkViewportCoordinateSwizzleNV x)
    {
        this.x = x;
    }
    
    public VkViewportCoordinateSwizzleNV getY()
    {
        return y;
    }
    
    public void setY(VkViewportCoordinateSwizzleNV y)
    {
        this.y = y;
    }
    
    public VkViewportCoordinateSwizzleNV getZ()
    {
        return z;
    }
    
    public void setZ(VkViewportCoordinateSwizzleNV z)
    {
        this.z = z;
    }
    
    public VkViewportCoordinateSwizzleNV getW()
    {
        return w;
    }
    
    public void setW(VkViewportCoordinateSwizzleNV w)
    {
        this.w = w;
    }
    
}
