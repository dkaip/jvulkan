package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugUtilsMessengerCallbackDataFlagsEXT;

class VkDebugUtilsMessengerCallbackDataFlagsEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkDebugUtilsMessengerCallbackDataFlagsEXT[] values = VkDebugUtilsMessengerCallbackDataFlagsEXT.values();
        assertEquals(1, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkDebugUtilsMessengerCallbackDataFlagsEXT.RESERVED_FOR_FUTURE_USE.valueOf(), VkDebugUtilsMessengerCallbackDataFlagsEXT.RESERVED_FOR_FUTURE_USE.toString() + " has an unexpected value.");
    }
}
