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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

public enum VkDynamicState
{
    VK_DYNAMIC_STATE_VIEWPORT(0),
    VK_DYNAMIC_STATE_SCISSOR(1),
    VK_DYNAMIC_STATE_LINE_WIDTH(2),
    VK_DYNAMIC_STATE_DEPTH_BIAS(3),
    VK_DYNAMIC_STATE_BLEND_CONSTANTS(4),
    VK_DYNAMIC_STATE_DEPTH_BOUNDS(5),
    VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK(6),
    VK_DYNAMIC_STATE_STENCIL_WRITE_MASK(7),
    VK_DYNAMIC_STATE_STENCIL_REFERENCE(8),
    VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV(1000087000),
    VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT(1000099000),
    VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT(1000143000),
    VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV(1000164004),
    VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV(1000164006),
    VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV(1000205001),
    VK_DYNAMIC_STATE_LINE_STIPPLE_EXT(1000259000),
    VK_DYNAMIC_STATE_BEGIN_RANGE(VK_DYNAMIC_STATE_VIEWPORT.valueOf()),
    VK_DYNAMIC_STATE_END_RANGE(VK_DYNAMIC_STATE_STENCIL_REFERENCE.valueOf()),
    VK_DYNAMIC_STATE_RANGE_SIZE((VK_DYNAMIC_STATE_STENCIL_REFERENCE.valueOf() - VK_DYNAMIC_STATE_VIEWPORT.valueOf() + 1)),
    VK_DYNAMIC_STATE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkDynamicState(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
