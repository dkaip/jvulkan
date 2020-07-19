package com.CIMthetics.jvulkan.VulkanCore.Structures;

public class BooleanReturnValue
{
    private boolean value;
    
    public BooleanReturnValue()
    {
        setValue(false);
    }

    public boolean getValue()
    {
        return value;
    }

    public void setValue(boolean value)
    {
        this.value = value;
    }
}
