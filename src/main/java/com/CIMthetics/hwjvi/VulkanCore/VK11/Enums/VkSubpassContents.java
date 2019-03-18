package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSubpassContents
{
    VK_SUBPASS_CONTENTS_INLINE(0),
    VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS(1),
    VK_SUBPASS_CONTENTS_BEGIN_RANGE(VK_SUBPASS_CONTENTS_INLINE.valueOf()),
    VK_SUBPASS_CONTENTS_END_RANGE(VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS.valueOf()),
    VK_SUBPASS_CONTENTS_RANGE_SIZE((VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS.valueOf() - VK_SUBPASS_CONTENTS_INLINE.valueOf() + 1)),
    VK_SUBPASS_CONTENTS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSubpassContents(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
