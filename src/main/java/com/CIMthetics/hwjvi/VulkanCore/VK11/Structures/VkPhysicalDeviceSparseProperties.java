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

/*
 * Note: the setters are not public because they should not be used by a Java
 * application, however, the JNI method can still find them.
 */

public class VkPhysicalDeviceSparseProperties
{
    private boolean    residencyStandard2DBlockShape;
    private boolean    residencyStandard2DMultisampleBlockShape;
    private boolean    residencyStandard3DBlockShape;
    private boolean    residencyAlignedMipSize;
    private boolean    residencyNonResidentStrict;

    public boolean isResidencyStandard2DBlockShape()
    {
        return residencyStandard2DBlockShape;
    }
    
    void setResidencyStandard2DBlockShape(
            boolean residencyStandard2DBlockShape)
    {
        this.residencyStandard2DBlockShape = residencyStandard2DBlockShape;
    }
    
    public boolean isResidencyStandard2DMultisampleBlockShape()
    {
        return residencyStandard2DMultisampleBlockShape;
    }
    
    void setResidencyStandard2DMultisampleBlockShape(
            boolean residencyStandard2DMultisampleBlockShape)
    {
        this.residencyStandard2DMultisampleBlockShape = residencyStandard2DMultisampleBlockShape;
    }
    
    public boolean isResidencyStandard3DBlockShape()
    {
        return residencyStandard3DBlockShape;
    }
    
    void setResidencyStandard3DBlockShape(
            boolean residencyStandard3DBlockShape)
    {
        this.residencyStandard3DBlockShape = residencyStandard3DBlockShape;
    }
    
    public boolean isResidencyAlignedMipSize()
    {
        return residencyAlignedMipSize;
    }
    
    void setResidencyAlignedMipSize(boolean residencyAlignedMipSize)
    {
        this.residencyAlignedMipSize = residencyAlignedMipSize;
    }
    
    public boolean isResidencyNonResidentStrict()
    {
        return residencyNonResidentStrict;
    }
    
    void setResidencyNonResidentStrict(boolean residencyNonResidentStrict)
    {
        this.residencyNonResidentStrict = residencyNonResidentStrict;
    }
}
