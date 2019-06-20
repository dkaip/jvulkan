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

import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlRegistryBind;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlCompositorHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlOutputHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegistryHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellHandle;

public class WlRegistry extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlRegistry.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();
    private ConcurrentHashMap<Integer,WaylandGlobalRegistryEntry> registry = new ConcurrentHashMap<Integer,WaylandGlobalRegistryEntry>(40, 0.75f, 2);

    public WlRegistry(WlRegistryHandle handle)
    {
        setHandle(handle);
        
        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }

    public ConcurrentHashMap<Integer,WaylandGlobalRegistryEntry> getRegistry()
    {
        return registry;
    }

    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        WlRegistryEvents event = (WlRegistryEvents)eventObject;

        log.debug("Processing {} event.", event.getEventType().toString());
        
        switch(event.getEventType())
        {
            case ANNOUNCE_GLOBAL_OBJECT:
                registry.put(event.getGlobalRegistryEntry().getObjectName(), event.getGlobalRegistryEntry());
                break;
            case ANNOUNCE_GLOBAL_OBJECT_REMOVAL:
                registry.remove(event.getGlobalRegistryEntry().getObjectName());
                break;
            default:
                System.err.println("Unhandled case of " + event.getEventType().toString());
                break;
        }
    }
    
    /**
     * Retrieve a list of all of the registered Wayland interfaces that have an
     * interface name matching the one specified.
     * 
     * @param registryInterfaceName the name of the desired Wayland interface.
     * @return A list of all of the registered Wayland interfaces that have an
     * interface name matching the one specified.
     */
    public LinkedList<WaylandGlobalRegistryEntry> getRegistryEntriesFor(String registryInterfaceName)
    {
        LinkedList<WaylandGlobalRegistryEntry> result = new LinkedList<WaylandGlobalRegistryEntry>();
        
        for (WaylandGlobalRegistryEntry entry : registry.values() )
        {
            if (entry.getInterfaceName().equals(registryInterfaceName) == true)
            {
                result.add(entry);
            }
        }
        
        return result;
    }

    public WaylandInterfaceObject bind(WaylandGlobalRegistryEntry registryEntry)
    {
        WaylandInterfaceObject newObject = null;
        
        String interfaceName = registryEntry.getInterfaceName() + "_interface";
        
        VulkanHandle handle = wlRegistryBind(
                (WlRegistryHandle)this.getHandle(),
                registryEntry.getObjectName(),
                interfaceName,
                registryEntry.getInterfaceVersion());

        if (interfaceName.equals("wl_display_interface") == true)
        {
            log.error("This should never happen.  The display interface is created a different way.");
        }
        else if (interfaceName.equals("wl_registry_interface") == true)
        {
            log.error("This should never happen.  The registry interface is created a different way.");
        }
        else if (interfaceName.equals("wl_callback_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_compositor_interface") == true)
        {
            newObject = new WlCompositor((WlCompositorHandle)handle);
        }
        else if (interfaceName.equals("wl_shm_pool_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_shm_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_buffer_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_data_offer_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_data_source_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_data_device_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_data_device_manager_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_shell_interface") == true)
        {
            log.debug("Creating new WlShell handle is {}.", handle.toString());
            newObject = new WlShell((WlShellHandle)handle);
        }
        else if (interfaceName.equals("wl_shell_surface_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_surface_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_seat_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_pointer_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_keyboard_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_touch_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_output_interface") == true)
        {
            log.debug("Creating new WlOutput handle is {}.", handle.toString());
            newObject = new WlOutput((WlOutputHandle)handle);
        }
        else if (interfaceName.equals("wl_region_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_subcompositor_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else if (interfaceName.equals("wl_subsurface_interface") == true)
        {
            log.warn("Not implemented yet.");
        }
        else
        {
            log.error("Unhandled interface name of {}.",interfaceName);
        }
        
        return newObject;
    }
}
