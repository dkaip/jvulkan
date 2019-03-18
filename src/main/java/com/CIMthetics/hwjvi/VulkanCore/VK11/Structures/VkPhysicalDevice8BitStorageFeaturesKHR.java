package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDevice8BitStorageFeaturesKHR extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private boolean                     storageBuffer8BitAccess;
    private boolean                     uniformAndStorageBuffer8BitAccess;
    private boolean                     storagePushConstant8;
    
    public VkPhysicalDevice8BitStorageFeaturesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isStorageBuffer8BitAccess()
    {
        return storageBuffer8BitAccess;
    }

    public void setStorageBuffer8BitAccess(boolean storageBuffer8BitAccess)
    {
        this.storageBuffer8BitAccess = storageBuffer8BitAccess;
    }

    public boolean isUniformAndStorageBuffer8BitAccess()
    {
        return uniformAndStorageBuffer8BitAccess;
    }

    public void setUniformAndStorageBuffer8BitAccess(
            boolean uniformAndStorageBuffer8BitAccess)
    {
        this.uniformAndStorageBuffer8BitAccess = uniformAndStorageBuffer8BitAccess;
    }

    public boolean isStoragePushConstant8()
    {
        return storagePushConstant8;
    }

    public void setStoragePushConstant8(boolean storagePushConstant8)
    {
        this.storagePushConstant8 = storagePushConstant8;
    }
}
