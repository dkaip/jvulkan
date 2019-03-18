package com.CIMthetics.hwjvi.Wayland;

import com.CIMthetics.hwjvi.Wayland.Handles.WlRegistry;

public interface WlRegistryListener
{
    abstract public void registryAddEventHandler(
            Object userData,
            WlRegistry registry,
            int registryObjectId,
            String interfaceTextId,
            int version);
    
    abstract public void registryRemoveEventHandler(
            Object userData,
            WlRegistry registry,
            int registryObjectId);
}
