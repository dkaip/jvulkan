package com.CIMthetics.jvulkan.Wayland.Enums;

public enum WlPointerAxisTypeEnum
{
    VERTICAL_SCROLL(0),
    HORIZONTAL_SCROLL(1);
    
    private int value;
    
    private WlPointerAxisTypeEnum(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlPointerAxisTypeEnum fromValue(int value)
    {
        for(WlPointerAxisTypeEnum listValue : WlPointerAxisTypeEnum.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
