package com.CIMthetics.hwjvi.VulkanCore.VK11;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkDebugReportFlagBitsEXT;

/**
 * This is the interface that must be implemented in order to receive 
 * callbacks from the Vulkan debug layers.
 * 
 * @author Douglas Kaip
 *
 */
public interface VkDebugReportCallback
{
    /**
     * This is the callback method that is invoked when there is a debug layer
     * issue.
     * 
     * @param flags
     * @param objectType
     * @param object
     * @param location
     * @param messageCode
     * @param layerPrefix
     * @param messageText
     * @param userData
     * @return - this method MUST return false unless you are debugging the validation layers themselves.
     */
    abstract boolean invoke(
            EnumSet<VkDebugReportFlagBitsEXT>   flags,
            int                         objectType,
            long                        object,
            long                        location,
            int                         messageCode,
            String                      layerPrefix,
            String                      messageText,
            Object                      userData);
}
