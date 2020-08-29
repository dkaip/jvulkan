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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

public enum VkIndirectCommandsTokenTypeNV
{
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV(0),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV(1),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV(2),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV(3),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV(4),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV(5),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV(6),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV(7),
    VK_INDIRECT_COMMANDS_TOKEN_TYPE_MAX_ENUM_NVX(0x7FFFFFFF);

    private int value;
    
    private VkIndirectCommandsTokenTypeNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
