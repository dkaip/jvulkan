package com.CIMthetics.jvulkan.Wayland.Enums;

public enum WlPointerAxisType
{
    VERTICAL_SCROLL(0),
    HORIZONTAL_SCROLL(1);
    
    private int value;
    
    private WlPointerAxisType(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlPointerAxisType fromValue(int value)
    {
        for(WlPointerAxisType listValue : WlPointerAxisType.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
