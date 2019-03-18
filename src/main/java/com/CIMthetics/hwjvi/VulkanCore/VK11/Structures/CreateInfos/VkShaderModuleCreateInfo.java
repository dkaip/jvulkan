package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.nio.ByteBuffer;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkShaderModuleCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkShaderModuleCreateInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkShaderModuleCreateFlagBits>   flags = EnumSet.noneOf(VkShaderModuleCreateFlagBits.class);
    private long                                    codeSize;
    private byte[]                                  code;

    public VkShaderModuleCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkShaderModuleCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkShaderModuleCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public long getCodeSize()
    {
        return codeSize;
    }

    public byte[] getCode()
    {
        return code;
    }

    /**
     * Set the shader code.
     * 
     * @param code - a <code>ByteBuffer</code> containing the shader code
     * @param codeSize - the length of the shader code in bytes
     * 
     */
    public void setCode(ByteBuffer code, long codeSize)
    {
        this.codeSize = codeSize;
        
        long byteBufferSize = codeSize / 4;
        if ((codeSize % 4) != 0)
        {
            byteBufferSize++;
        }

        this.code = new byte[(int)(byteBufferSize * 4)];
        
        // Just to make sure the last byte has been properly cleared
        this.code[(int)byteBufferSize - 1] = 0;
        this.code[(int)byteBufferSize - 2] = 0;
        this.code[(int)byteBufferSize - 3] = 0;
        this.code[(int)byteBufferSize - 4] = 0;
        
        code.get(this.code);
    }
}
