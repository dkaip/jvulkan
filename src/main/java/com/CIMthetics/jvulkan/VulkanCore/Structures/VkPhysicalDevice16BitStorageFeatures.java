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

public class VkPhysicalDevice16BitStorageFeatures extends VulkanCreateInfoStructure
{
    private boolean storageBuffer16BitAccess;
    private boolean uniformAndStorageBuffer16BitAccess;
    private boolean storagePushConstant16;
    private boolean storageInputOutput16;

    public VkPhysicalDevice16BitStorageFeatures()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES);
    }

    public boolean isStorageBuffer16BitAccess()
    {
        return storageBuffer16BitAccess;
    }

    public void setStorageBuffer16BitAccess(boolean storageBuffer16BitAccess)
    {
        this.storageBuffer16BitAccess = storageBuffer16BitAccess;
    }

    public boolean isUniformAndStorageBuffer16BitAccess()
    {
        return uniformAndStorageBuffer16BitAccess;
    }

    public void setUniformAndStorageBuffer16BitAccess(
            boolean uniformAndStorageBuffer16BitAccess)
    {
        this.uniformAndStorageBuffer16BitAccess = uniformAndStorageBuffer16BitAccess;
    }

    public boolean isStoragePushConstant16()
    {
        return storagePushConstant16;
    }

    public void setStoragePushConstant16(boolean storagePushConstant16)
    {
        this.storagePushConstant16 = storagePushConstant16;
    }

    public boolean isStorageInputOutput16()
    {
        return storageInputOutput16;
    }

    public void setStorageInputOutput16(boolean storageInputOutput16)
    {
        this.storageInputOutput16 = storageInputOutput16;
    }

}
