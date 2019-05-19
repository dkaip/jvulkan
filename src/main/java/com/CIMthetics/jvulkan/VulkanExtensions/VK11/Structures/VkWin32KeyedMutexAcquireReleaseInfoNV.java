package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkWin32KeyedMutexAcquireReleaseInfoNV extends VulkanCreateInfoStructure
{
    private Collection<VkDeviceMemory>  acquireSyncs;
    private long[]                      acquireKeys;
    private int[]                       acquireTimeoutMilliseconds;
    private Collection<VkDeviceMemory>  releaseSyncs;
    private long[]                      releaseKeys;

    public VkWin32KeyedMutexAcquireReleaseInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
    }

    public Collection<VkDeviceMemory> getAcquireSyncs()
    {
        return acquireSyncs;
    }

    public void setAcquireSyncs(Collection<VkDeviceMemory> acquireSyncs)
    {
        this.acquireSyncs = acquireSyncs;
    }

    public long[] getAcquireKeys()
    {
        return acquireKeys;
    }

    public void setAcquireKeys(long[] acquireKeys)
    {
        this.acquireKeys = acquireKeys;
    }

    public int[] getAcquireTimeoutMilliseconds()
    {
        return acquireTimeoutMilliseconds;
    }

    public void setAcquireTimeoutMilliseconds(int[] acquireTimeoutMilliseconds)
    {
        this.acquireTimeoutMilliseconds = acquireTimeoutMilliseconds;
    }

    public Collection<VkDeviceMemory> getReleaseSyncs()
    {
        return releaseSyncs;
    }

    public void setReleaseSyncs(Collection<VkDeviceMemory> releaseSyncs)
    {
        this.releaseSyncs = releaseSyncs;
    }

    public long[] getReleaseKeys()
    {
        return releaseKeys;
    }

    public void setReleaseKeys(long[] releaseKeys)
    {
        this.releaseKeys = releaseKeys;
    }

}
