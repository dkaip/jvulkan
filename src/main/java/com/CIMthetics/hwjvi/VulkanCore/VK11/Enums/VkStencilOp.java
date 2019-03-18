package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkStencilOp
{
    VK_STENCIL_OP_KEEP(0),
    VK_STENCIL_OP_ZERO(1),
    VK_STENCIL_OP_REPLACE(2),
    VK_STENCIL_OP_INCREMENT_AND_CLAMP(3),
    VK_STENCIL_OP_DECREMENT_AND_CLAMP(4),
    VK_STENCIL_OP_INVERT(5),
    VK_STENCIL_OP_INCREMENT_AND_WRAP(6),
    VK_STENCIL_OP_DECREMENT_AND_WRAP(7),
    VK_STENCIL_OP_BEGIN_RANGE(VK_STENCIL_OP_KEEP.valueOf()),
    VK_STENCIL_OP_END_RANGE(VK_STENCIL_OP_DECREMENT_AND_WRAP.valueOf()),
    VK_STENCIL_OP_RANGE_SIZE((VK_STENCIL_OP_DECREMENT_AND_WRAP.valueOf() - VK_STENCIL_OP_KEEP.valueOf() + 1)),
    VK_STENCIL_OP_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkStencilOp(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
