package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkDisplayModeCreateFlagBitsKHRTest
{
    @Test
    void testNumberOfElements()
    {
        VkDisplayModeCreateFlagBitsKHR[] values = VkDisplayModeCreateFlagBitsKHR.values();
        assertEquals(1, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkDisplayModeCreateFlagBitsKHR.RESERVED_FOR_FUTURE_USE.valueOf(), VkDisplayModeCreateFlagBitsKHR.RESERVED_FOR_FUTURE_USE.toString() + " has an unexpected value.");
    }
}
