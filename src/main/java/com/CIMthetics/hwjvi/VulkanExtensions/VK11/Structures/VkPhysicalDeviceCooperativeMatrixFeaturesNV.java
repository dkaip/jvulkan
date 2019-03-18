package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceCooperativeMatrixFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean cooperativeMatrix;
    private boolean cooperativeMatrixRobustBufferAccess;

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isCooperativeMatrix()
    {
        return cooperativeMatrix;
    }

    public void setCooperativeMatrix(boolean cooperativeMatrix)
    {
        this.cooperativeMatrix = cooperativeMatrix;
    }

    public boolean isCooperativeMatrixRobustBufferAccess()
    {
        return cooperativeMatrixRobustBufferAccess;
    }

    public void setCooperativeMatrixRobustBufferAccess(
            boolean cooperativeMatrixRobustBufferAccess)
    {
        this.cooperativeMatrixRobustBufferAccess = cooperativeMatrixRobustBufferAccess;
    }

}
