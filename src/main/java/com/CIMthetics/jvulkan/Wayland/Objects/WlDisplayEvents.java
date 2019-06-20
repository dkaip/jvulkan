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
package com.CIMthetics.jvulkan.Wayland.Objects;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.Wayland.Enums.WlDisplayEventOpCodes;
import com.CIMthetics.jvulkan.Wayland.Handles.WlDisplayHandle;

public class WlDisplayEvents extends WaylandEventObject
{
    private WlDisplayEventOpCodes   eventType;
    
    // Stuff for error event
    private VulkanHandle            objectId;
    private int                     errorCode;
    private String                  errorText;
    
    // Stuff for delete_id event
    private int deletedObjectId;
    
    WlDisplayEvents(
            VulkanHandle handle,
            VulkanHandle objectId,
            int errorCode,
            String errorText)
    {
        super(handle);
        eventType       = WlDisplayEventOpCodes.ERROR;
        this.objectId   = objectId;
        this.errorCode  = errorCode;
        this.errorText  = errorText;
    }
    
    WlDisplayEvents(
            VulkanHandle handle,
            int deletedObjectId)
    {
        super(handle);
        eventType               = WlDisplayEventOpCodes.DELETE_ID;
        this.deletedObjectId    = deletedObjectId;
    }

    public WlDisplayHandle getHandle()
    {
        return (WlDisplayHandle)super.getHandle();
    }

    public WlDisplayEventOpCodes getEventType()
    {
        return eventType;
    }

    public VulkanHandle getObjectId()
    {
        return objectId;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public String getErrorText()
    {
        return errorText;
    }

    public int getDeletedObjectId()
    {
        return deletedObjectId;
    }
    
}
