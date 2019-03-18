package com.CIMthetics.hwjvi.Wayland;

public class WaylandRegistryEntry
{
    private int     registryId;
    private String  objectName;
    private int     objectVersion;

    /**
     * 
     * @param registryId
     * @param objectName
     * @param objectVersion
     */
    public WaylandRegistryEntry(int registryId, String objectName, int objectVersion)
    {
        this.registryId    = registryId;
        this.objectName    = objectName;
        this.objectVersion = objectVersion;
    }

    public int getRegistryId()
    {
        return registryId;
    }

    public String getObjectName()
    {
        return objectName;
    }

    public int getObjectVersion()
    {
        return objectVersion;
    }
}
