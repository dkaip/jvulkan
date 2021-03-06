/*
 * Copyright 2019-2020 Douglas Kaip
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

import java.util.concurrent.atomic.AtomicBoolean;

import com.CIMthetics.jvulkan.Wayland.Handles.WlCallbackHandle;

public class WlCallback extends WaylandInterfaceObject
{
    private AtomicBoolean isFired = new AtomicBoolean(false);

    public WlCallback(WlCallbackHandle handle)
    {
        setHandle(handle);
    }

    void setIsFired()
    {
        isFired.set(true);
    }
    
    public boolean isFired()
    {
        return isFired.get();
    }

    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        System.err.println("Setting isFired");
        setIsFired();
    }

    @Override
    public WlCallbackHandle getHandle()
    {
        return (WlCallbackHandle)getHandle();
    }
}
