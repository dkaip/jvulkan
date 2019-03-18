package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkClearColorValue
{
    private float[] floatValues;
    private int[]   intValues;
    private long[]  uintValues;
    
    public VkClearColorValue(float redValue, float greenValue, float blueValue, float alphaValue)
    {
        floatValues = new float[4];
        floatValues[0] = redValue;
        floatValues[1] = greenValue;
        floatValues[2] = blueValue;
        floatValues[3] = alphaValue;
    }

    public VkClearColorValue(int redValue, int greenValue, int blueValue, int alphaValue)
    {
        intValues = new int[4];
        intValues[0] = redValue;
        intValues[1] = greenValue;
        intValues[2] = blueValue;
        intValues[3] = alphaValue;
    }
    
    /**
     * This constructor allows for uint32_t values.
     * 
     * @param redValue
     * @param greenValue
     * @param blueValue
     * @param alphaValue
     */
    public VkClearColorValue(long redValue, long greenValue, long blueValue, long alphaValue)
    {
        uintValues = new long[4];
        uintValues[0] = redValue;
        uintValues[1] = greenValue;
        uintValues[2] = blueValue;
        uintValues[3] = alphaValue;
    }

    public float[] getFloatValues()
    {
        return floatValues;
    }

    public int[] getIntValues()
    {
        return intValues;
    }

    public long[] getUintValues()
    {
        return uintValues;
    }
    
}
