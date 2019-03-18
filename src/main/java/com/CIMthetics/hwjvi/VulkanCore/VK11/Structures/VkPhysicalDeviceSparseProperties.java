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
