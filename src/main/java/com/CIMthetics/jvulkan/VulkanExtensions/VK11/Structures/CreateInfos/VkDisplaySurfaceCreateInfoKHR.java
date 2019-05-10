package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSurfaceTransformFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDisplayPlaneAlphaFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDisplaySurfaceCreateFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDisplayModeKHR;

public class VkDisplaySurfaceCreateInfoKHR extends VulkanCreateInfoStructure
{
    private EnumSet<VkDisplaySurfaceCreateFlagBitsKHR>  flags = EnumSet.noneOf(VkDisplaySurfaceCreateFlagBitsKHR.class);
    private VkDisplayModeKHR                            displayMode;
    private int                                         planeIndex;
    private int                                         planeStackIndex;
    private VkSurfaceTransformFlagBitsKHR               transform;
    private float                                       globalAlpha;
    private VkDisplayPlaneAlphaFlagBitsKHR              alphaMode;
    private VkExtent2D                                  imageExtent;

    public VkDisplaySurfaceCreateInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR);
    }

    public EnumSet<VkDisplaySurfaceCreateFlagBitsKHR> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDisplaySurfaceCreateFlagBitsKHR> flags)
    {
        this.flags = flags;
    }

    public VkDisplayModeKHR getDisplayMode()
    {
        return displayMode;
    }

    public void setDisplayMode(VkDisplayModeKHR displayMode)
    {
        this.displayMode = displayMode;
    }

    public int getPlaneIndex()
    {
        return planeIndex;
    }

    public void setPlaneIndex(int planeIndex)
    {
        this.planeIndex = planeIndex;
    }

    public int getPlaneStackIndex()
    {
        return planeStackIndex;
    }

    public void setPlaneStackIndex(int planeStackIndex)
    {
        this.planeStackIndex = planeStackIndex;
    }

    public VkSurfaceTransformFlagBitsKHR getTransform()
    {
        return transform;
    }

    public void setTransform(VkSurfaceTransformFlagBitsKHR transform)
    {
        this.transform = transform;
    }

    public float getGlobalAlpha()
    {
        return globalAlpha;
    }

    public void setGlobalAlpha(float globalAlpha)
    {
        this.globalAlpha = globalAlpha;
    }

    public VkDisplayPlaneAlphaFlagBitsKHR getAlphaMode()
    {
        return alphaMode;
    }

    public void setAlphaMode(VkDisplayPlaneAlphaFlagBitsKHR alphaMode)
    {
        this.alphaMode = alphaMode;
    }

    public VkExtent2D getImageExtent()
    {
        return imageExtent;
    }

    public void setImageExtent(VkExtent2D imageExtent)
    {
        this.imageExtent = imageExtent;
    }

}
