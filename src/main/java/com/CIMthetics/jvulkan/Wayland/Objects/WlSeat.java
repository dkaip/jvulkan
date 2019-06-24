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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WlSeat extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlSeat.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();

    public WlSeat(WlSeatHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    


    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        // TODO Auto-generated method stub

    }
    
    @Override
    public WlSeatHandle getHandle()
    {
        return (WlSeatHandle)handle;
    }
}