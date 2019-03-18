package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class IntReturnValue
{
    private int value;
    
    public IntReturnValue()
    {
        setValue(-1);
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
}
