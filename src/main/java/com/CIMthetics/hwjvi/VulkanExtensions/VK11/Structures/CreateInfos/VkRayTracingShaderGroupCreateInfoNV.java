package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkRayTracingShaderGroupTypeNV;

public class VkRayTracingShaderGroupCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private VkRayTracingShaderGroupTypeNV   type;
    private int                             generalShader;
    private int                             closestHitShader;
    private int                             anyHitShader;
    private int                             intersectionShader;

    public VkRayTracingShaderGroupCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkRayTracingShaderGroupTypeNV getType()
    {
        return type;
    }

    public void setType(VkRayTracingShaderGroupTypeNV type)
    {
        this.type = type;
    }

    public int getGeneralShader()
    {
        return generalShader;
    }

    public void setGeneralShader(int generalShader)
    {
        this.generalShader = generalShader;
    }

    public int getClosestHitShader()
    {
        return closestHitShader;
    }

    public void setClosestHitShader(int closestHitShader)
    {
        this.closestHitShader = closestHitShader;
    }

    public int getAnyHitShader()
    {
        return anyHitShader;
    }

    public void setAnyHitShader(int anyHitShader)
    {
        this.anyHitShader = anyHitShader;
    }

    public int getIntersectionShader()
    {
        return intersectionShader;
    }

    public void setIntersectionShader(int intersectionShader)
    {
        this.intersectionShader = intersectionShader;
    }

}
