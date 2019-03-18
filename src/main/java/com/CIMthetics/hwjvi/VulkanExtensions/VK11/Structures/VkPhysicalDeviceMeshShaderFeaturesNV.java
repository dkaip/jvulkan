package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceMeshShaderFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean taskShader;
    private boolean meshShader;

    public VkPhysicalDeviceMeshShaderFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isTaskShader()
    {
        return taskShader;
    }

    public void setTaskShader(boolean taskShader)
    {
        this.taskShader = taskShader;
    }

    public boolean isMeshShader()
    {
        return meshShader;
    }

    public void setMeshShader(boolean meshShader)
    {
        this.meshShader = meshShader;
    }
}
