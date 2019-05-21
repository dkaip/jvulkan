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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkPipelineCreationFeedbackFlagBitsEXT;

public class VkPipelineCreationFeedbackEXT
{
    private EnumSet<VkPipelineCreationFeedbackFlagBitsEXT>  flags = EnumSet.noneOf(VkPipelineCreationFeedbackFlagBitsEXT.class);
    private long                                            duration;
    
    public EnumSet<VkPipelineCreationFeedbackFlagBitsEXT> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkPipelineCreationFeedbackFlagBitsEXT> flags)
    {
        this.flags = flags;
    }
    public 
    long getDuration()
    {
        return duration;
    }
    
    public void setDuration(long duration)
    {
        this.duration = duration;
    }
}
