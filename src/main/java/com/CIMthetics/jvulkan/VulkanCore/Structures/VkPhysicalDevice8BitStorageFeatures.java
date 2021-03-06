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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDevice8BitStorageFeatures extends VulkanCreateInfoStructure
{
    private boolean storageBuffer8BitAccess;
    private boolean uniformAndStorageBuffer8BitAccess;
    private boolean storagePushConstant8;

    public VkPhysicalDevice8BitStorageFeatures()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES);
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
