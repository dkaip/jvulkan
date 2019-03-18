package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkAttachmentLoadOp
{
    VK_ATTACHMENT_LOAD_OP_LOAD(0),
            VK_ATTACHMENT_LOAD_OP_CLEAR(1),
            VK_ATTACHMENT_LOAD_OP_DONT_CARE(2),
            VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE(VK_ATTACHMENT_LOAD_OP_LOAD.valueOf()),
            VK_ATTACHMENT_LOAD_OP_END_RANGE(VK_ATTACHMENT_LOAD_OP_DONT_CARE.valueOf()),
            VK_ATTACHMENT_LOAD_OP_RANGE_SIZE((VK_ATTACHMENT_LOAD_OP_DONT_CARE.valueOf() - VK_ATTACHMENT_LOAD_OP_LOAD.valueOf() + 1)),
            VK_ATTACHMENT_LOAD_OP_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkAttachmentLoadOp(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
