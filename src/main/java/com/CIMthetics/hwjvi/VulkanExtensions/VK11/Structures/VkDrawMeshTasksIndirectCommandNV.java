package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

public class VkDrawMeshTasksIndirectCommandNV
{
    private int taskCount;
    private int firstTask;
    
    public VkDrawMeshTasksIndirectCommandNV(int taskCount, int firstTask)
    {
        this.taskCount = taskCount;
        this.firstTask = firstTask;
    }

    public int getTaskCount()
    {
        return taskCount;
    }

    public void setTaskCount(int taskCount)
    {
        this.taskCount = taskCount;
    }

    public int getFirstTask()
    {
        return firstTask;
    }

    public void setFirstTask(int firstTask)
    {
        this.firstTask = firstTask;
    }
}
