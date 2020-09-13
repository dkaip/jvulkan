/*
 * Copyright 2020 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

public class VkPresentTimeGOOGLE
{
    private int     presentID;
    private long    desiredPresentTime;

    public int getPresentID()
    {
        return presentID;
    }
    
    public void setPresentID(int presentID)
    {
        this.presentID = presentID;
    }
    
    public long getDesiredPresentTime()
    {
        return desiredPresentTime;
    }

    public void setDesiredPresentTime(long desiredPresentTime)
    {
        this.desiredPresentTime = desiredPresentTime;
    }
}
