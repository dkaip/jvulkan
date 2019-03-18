package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkBorderColor;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCompareOp;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFilter;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSamplerAddressMode;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSamplerCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSamplerMipmapMode;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkSamplerCreateInfo extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private EnumSet<VkSamplerCreateFlagBits>    flags = EnumSet.noneOf(VkSamplerCreateFlagBits.class);
    private VkFilter                            magFilter;
    private VkFilter                            minFilter;
    private VkSamplerMipmapMode                 mipmapMode;
    private VkSamplerAddressMode                addressModeU;
    private VkSamplerAddressMode                addressModeV;
    private VkSamplerAddressMode                addressModeW;
    private float                               mipLodBias;
    private boolean                             anisotropyEnable;
    private float                               maxAnisotropy;
    private boolean                             compareEnable;
    private VkCompareOp                         compareOp;
    private float                               minLod;
    private float                               maxLod;
    private VkBorderColor                       borderColor;
    private boolean                             unnormalizedCoordinates;

    public VkSamplerCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkSamplerCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkSamplerCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkFilter getMagFilter()
    {
        return magFilter;
    }

    public void setMagFilter(VkFilter magFilter)
    {
        this.magFilter = magFilter;
    }

    public VkFilter getMinFilter()
    {
        return minFilter;
    }

    public void setMinFilter(VkFilter minFilter)
    {
        this.minFilter = minFilter;
    }

    public VkSamplerMipmapMode getMipmapMode()
    {
        return mipmapMode;
    }

    public void setMipmapMode(VkSamplerMipmapMode mipmapMode)
    {
        this.mipmapMode = mipmapMode;
    }

    public VkSamplerAddressMode getAddressModeU()
    {
        return addressModeU;
    }

    public void setAddressModeU(VkSamplerAddressMode addressModeU)
    {
        this.addressModeU = addressModeU;
    }

    public VkSamplerAddressMode getAddressModeV()
    {
        return addressModeV;
    }

    public void setAddressModeV(VkSamplerAddressMode addressModeV)
    {
        this.addressModeV = addressModeV;
    }

    public VkSamplerAddressMode getAddressModeW()
    {
        return addressModeW;
    }

    public void setAddressModeW(VkSamplerAddressMode addressModeW)
    {
        this.addressModeW = addressModeW;
    }

    public float getMipLodBias()
    {
        return mipLodBias;
    }

    public void setMipLodBias(float mipLodBias)
    {
        this.mipLodBias = mipLodBias;
    }

    public boolean isAnisotropyEnable()
    {
        return anisotropyEnable;
    }

    public void setAnisotropyEnable(boolean anisotropyEnable)
    {
        this.anisotropyEnable = anisotropyEnable;
    }

    public float getMaxAnisotropy()
    {
        return maxAnisotropy;
    }

    public void setMaxAnisotropy(float maxAnisotropy)
    {
        this.maxAnisotropy = maxAnisotropy;
    }

    public boolean isCompareEnable()
    {
        return compareEnable;
    }

    public void setCompareEnable(boolean compareEnable)
    {
        this.compareEnable = compareEnable;
    }

    public VkCompareOp getCompareOp()
    {
        return compareOp;
    }

    public void setCompareOp(VkCompareOp compareOp)
    {
        this.compareOp = compareOp;
    }

    public float getMinLod()
    {
        return minLod;
    }

    public void setMinLod(float minLod)
    {
        this.minLod = minLod;
    }

    public float getMaxLod()
    {
        return maxLod;
    }

    public void setMaxLod(float maxLod)
    {
        this.maxLod = maxLod;
    }

    public VkBorderColor getBorderColor()
    {
        return borderColor;
    }

    public void setBorderColor(VkBorderColor borderColor)
    {
        this.borderColor = borderColor;
    }

    public boolean isUnnormalizedCoordinates()
    {
        return unnormalizedCoordinates;
    }

    public void setUnnormalizedCoordinates(boolean unnormalizedCoordinates)
    {
        this.unnormalizedCoordinates = unnormalizedCoordinates;
    }
    
}
