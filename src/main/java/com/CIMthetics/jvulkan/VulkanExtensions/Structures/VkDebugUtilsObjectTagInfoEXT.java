package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkObjectType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDebugUtilsObjectTagInfoEXT extends VulkanCreateInfoStructure
{
    private VkObjectType    objectType;
    private VulkanHandle    objectHandle;
    private long            tagName;
    private byte[]          tag;
    
    public VkDebugUtilsObjectTagInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT);
    }

    public VkObjectType getObjectType()
    {
        return objectType;
    }

    public void setObjectType(VkObjectType objectType)
    {
        this.objectType = objectType;
    }

    public VulkanHandle getObjectHandle()
    {
        return objectHandle;
    }

    public void setObjectHandle(VulkanHandle objectHandle)
    {
        this.objectHandle = objectHandle;
    }

    public long getTagName()
    {
        return tagName;
    }

    public void setTagName(long tagName)
    {
        this.tagName = tagName;
    }

    public byte[] getTag()
    {
        return tag;
    }

    public void setTag(byte[] tag)
    {
        this.tag = tag;
    }

}
