package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkFrontFace
{
    VK_FRONT_FACE_COUNTER_CLOCKWISE(0),
    VK_FRONT_FACE_CLOCKWISE(1),
    VK_FRONT_FACE_BEGIN_RANGE(VK_FRONT_FACE_COUNTER_CLOCKWISE.valueOf()),
    VK_FRONT_FACE_END_RANGE(VK_FRONT_FACE_CLOCKWISE.valueOf()),
    VK_FRONT_FACE_RANGE_SIZE((VK_FRONT_FACE_CLOCKWISE.valueOf() - VK_FRONT_FACE_COUNTER_CLOCKWISE.valueOf() + 1)),
    VK_FRONT_FACE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkFrontFace(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
