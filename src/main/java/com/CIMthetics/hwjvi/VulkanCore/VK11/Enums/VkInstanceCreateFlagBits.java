package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

/**
 * 
 * @author Douglas Kaip
 *
 */
public enum VkInstanceCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkInstanceCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
