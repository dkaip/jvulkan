/*
 * Copyright 2019 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Handles;

public class VulkanHandle
{
    private long handleValue;
    
    public void setHandleValue(long handleValue)
    {
        this.handleValue = handleValue;
    }
    
    public long getHandleValue()
    {
        return handleValue;
    }
    
    @Override
    public String toString()
    {
        return String.format("%x", handleValue);
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (handleValue ^ (handleValue >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        /*
         * We are enforcing that in order to be equal the objects must also be
         * of the same class.  i.e. Even though VkQueue and VkImage are just
         * VkHandles they are not of the same class and are as such not considered
         * to be equal.
         */
        if (getClass() != obj.getClass())
            return false;

        VulkanHandle other = (VulkanHandle)obj;

        if (handleValue != other.handleValue)
            return false;

        return true;
    }
}
