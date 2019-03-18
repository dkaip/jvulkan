package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPresentModeKHR
{
    VK_PRESENT_MODE_IMMEDIATE_KHR(0),
    VK_PRESENT_MODE_MAILBOX_KHR(1),
    VK_PRESENT_MODE_FIFO_KHR(2),
    VK_PRESENT_MODE_FIFO_RELAXED_KHR(3),
    VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR(1000111000),
    VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR(1000111001),
    VK_PRESENT_MODE_BEGIN_RANGE_KHR(VK_PRESENT_MODE_IMMEDIATE_KHR.valueOf()),
    VK_PRESENT_MODE_END_RANGE_KHR(VK_PRESENT_MODE_FIFO_RELAXED_KHR.valueOf()),
    VK_PRESENT_MODE_RANGE_SIZE_KHR((VK_PRESENT_MODE_FIFO_RELAXED_KHR.valueOf() - VK_PRESENT_MODE_IMMEDIATE_KHR.valueOf() + 1)),
    VK_PRESENT_MODE_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkPresentModeKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkPresentModeKHR fromValue(int inputValue)
    {
        VkPresentModeKHR result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_PRESENT_MODE_IMMEDIATE_KHR;
                break;
            case 1:
                result = VK_PRESENT_MODE_MAILBOX_KHR;
                break;
            case 2:
                result = VK_PRESENT_MODE_FIFO_KHR;
                break;
            case 3:
                result =  VK_PRESENT_MODE_FIFO_RELAXED_KHR;
                break;
            case 1000111000:
                result = VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR;
                break;
            case 1000111001:
                result = VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR;
                break;
            case 0x7FFFFFFF:
                result = VK_PRESENT_MODE_MAX_ENUM_KHR;
                break;
        }

        if (inputValue == (VK_PRESENT_MODE_FIFO_RELAXED_KHR.valueOf() - VK_PRESENT_MODE_IMMEDIATE_KHR.valueOf() + 1))
            result = VK_PRESENT_MODE_RANGE_SIZE_KHR;
        
        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
