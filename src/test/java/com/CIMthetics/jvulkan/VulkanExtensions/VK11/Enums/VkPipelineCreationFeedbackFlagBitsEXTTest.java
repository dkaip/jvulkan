package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkPipelineCreationFeedbackFlagBitsEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkPipelineCreationFeedbackFlagBitsEXT[] values = VkPipelineCreationFeedbackFlagBitsEXT.values();
        assertEquals(4, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }

    @Test
    void testValues()
    {
        assertEquals(1, VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT.valueOf(), VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(2, VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT.valueOf(), VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(4, VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT.valueOf(), VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_FLAG_BITS_MAX_ENUM_EXT.valueOf(), VkPipelineCreationFeedbackFlagBitsEXT.VK_PIPELINE_CREATION_FEEDBACK_FLAG_BITS_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
