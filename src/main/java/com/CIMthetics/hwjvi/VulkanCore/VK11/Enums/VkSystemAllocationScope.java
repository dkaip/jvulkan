package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

/**
 * 
 * @author Douglas Kaip
 *
 */
public enum VkSystemAllocationScope
{
    VK_SYSTEM_ALLOCATION_SCOPE_COMMAND(0),
            VK_SYSTEM_ALLOCATION_SCOPE_OBJECT(1),
            VK_SYSTEM_ALLOCATION_SCOPE_CACHE(2),
            VK_SYSTEM_ALLOCATION_SCOPE_DEVICE(3),
            VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE(4),
            VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE(VK_SYSTEM_ALLOCATION_SCOPE_COMMAND.valueOf()),
            VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE(VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE.valueOf()),
            VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE((VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE.valueOf() - VK_SYSTEM_ALLOCATION_SCOPE_COMMAND.valueOf() + 1)),
            VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM(0x7FFFFFFF);
    
    private int value;
    
    private VkSystemAllocationScope(int value) { this.value = value; }
    
    int valueOf() { return value; }
}
