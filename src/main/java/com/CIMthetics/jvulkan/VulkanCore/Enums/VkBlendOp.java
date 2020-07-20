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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

public enum VkBlendOp
{
    VK_BLEND_OP_ADD(0),
    VK_BLEND_OP_SUBTRACT(1),
    VK_BLEND_OP_REVERSE_SUBTRACT(2),
    VK_BLEND_OP_MIN(3),
    VK_BLEND_OP_MAX(4),
    VK_BLEND_OP_ZERO_EXT(1000148000),
    VK_BLEND_OP_SRC_EXT(1000148001),
    VK_BLEND_OP_DST_EXT(1000148002),
    VK_BLEND_OP_SRC_OVER_EXT(1000148003),
    VK_BLEND_OP_DST_OVER_EXT(1000148004),
    VK_BLEND_OP_SRC_IN_EXT(1000148005),
    VK_BLEND_OP_DST_IN_EXT(1000148006),
    VK_BLEND_OP_SRC_OUT_EXT(1000148007),
    VK_BLEND_OP_DST_OUT_EXT(1000148008),
    VK_BLEND_OP_SRC_ATOP_EXT(1000148009),
    VK_BLEND_OP_DST_ATOP_EXT(1000148010),
    VK_BLEND_OP_XOR_EXT(1000148011),
    VK_BLEND_OP_MULTIPLY_EXT(1000148012),
    VK_BLEND_OP_SCREEN_EXT(1000148013),
    VK_BLEND_OP_OVERLAY_EXT(1000148014),
    VK_BLEND_OP_DARKEN_EXT(1000148015),
    VK_BLEND_OP_LIGHTEN_EXT(1000148016),
    VK_BLEND_OP_COLORDODGE_EXT(1000148017),
    VK_BLEND_OP_COLORBURN_EXT(1000148018),
    VK_BLEND_OP_HARDLIGHT_EXT(1000148019),
    VK_BLEND_OP_SOFTLIGHT_EXT(1000148020),
    VK_BLEND_OP_DIFFERENCE_EXT(1000148021),
    VK_BLEND_OP_EXCLUSION_EXT(1000148022),
    VK_BLEND_OP_INVERT_EXT(1000148023),
    VK_BLEND_OP_INVERT_RGB_EXT(1000148024),
    VK_BLEND_OP_LINEARDODGE_EXT(1000148025),
    VK_BLEND_OP_LINEARBURN_EXT(1000148026),
    VK_BLEND_OP_VIVIDLIGHT_EXT(1000148027),
    VK_BLEND_OP_LINEARLIGHT_EXT(1000148028),
    VK_BLEND_OP_PINLIGHT_EXT(1000148029),
    VK_BLEND_OP_HARDMIX_EXT(1000148030),
    VK_BLEND_OP_HSL_HUE_EXT(1000148031),
    VK_BLEND_OP_HSL_SATURATION_EXT(1000148032),
    VK_BLEND_OP_HSL_COLOR_EXT(1000148033),
    VK_BLEND_OP_HSL_LUMINOSITY_EXT(1000148034),
    VK_BLEND_OP_PLUS_EXT(1000148035),
    VK_BLEND_OP_PLUS_CLAMPED_EXT(1000148036),
    VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT(1000148037),
    VK_BLEND_OP_PLUS_DARKER_EXT(1000148038),
    VK_BLEND_OP_MINUS_EXT(1000148039),
    VK_BLEND_OP_MINUS_CLAMPED_EXT(1000148040),
    VK_BLEND_OP_CONTRAST_EXT(1000148041),
    VK_BLEND_OP_INVERT_OVG_EXT(1000148042),
    VK_BLEND_OP_RED_EXT(1000148043),
    VK_BLEND_OP_GREEN_EXT(1000148044),
    VK_BLEND_OP_BLUE_EXT(1000148045),
    VK_BLEND_OP_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkBlendOp(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
