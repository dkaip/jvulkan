package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkAttachmentStoreOp
{
    VK_ATTACHMENT_STORE_OP_STORE(0),
    VK_ATTACHMENT_STORE_OP_DONT_CARE(1),
    VK_ATTACHMENT_STORE_OP_BEGIN_RANGE(VK_ATTACHMENT_STORE_OP_STORE.valueOf()),
    VK_ATTACHMENT_STORE_OP_END_RANGE(VK_ATTACHMENT_STORE_OP_DONT_CARE.valueOf()),
    VK_ATTACHMENT_STORE_OP_RANGE_SIZE((VK_ATTACHMENT_STORE_OP_DONT_CARE.valueOf() - VK_ATTACHMENT_STORE_OP_STORE.valueOf() + 1)),
    VK_ATTACHMENT_STORE_OP_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkAttachmentStoreOp(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
