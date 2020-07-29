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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkObjectEntryTypeNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkObjectEntryUsageFlagBitsNVX;

public abstract class VkObjectTableEntryNVX
{
    private VkObjectEntryTypeNVX                    type;
    private EnumSet<VkObjectEntryUsageFlagBitsNVX>  flags;

    protected VkObjectTableEntryNVX(VkObjectEntryTypeNVX type)
    {
        this.type = type;
    }

    public VkObjectEntryTypeNVX getType()
    {
        return type;
    }

    public EnumSet<VkObjectEntryUsageFlagBitsNVX> getFlags()
    {
        return flags;
    }

    protected void setFlags(EnumSet<VkObjectEntryUsageFlagBitsNVX> flags)
    {
        this.flags = flags;
    }
}
