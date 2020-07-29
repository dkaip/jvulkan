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

/**
 * A class that defines the transformation that should be applied to vertices in a geometry
 * in the class <code>VkAccelerationStructureGeometryTrianglesDataKHR</code> (<code>transformData</code> attribute) or in the
 * class <code>VkAccelerationStructureInstanceKHR</code> (<code>transform</code> attribute).
 * <p>
 * This matrix must have <b>3</b> rows and <b>4</b> columns in each row.
 *
 */
public class VkTransformMatrixKHR
{
    private float[][]   matrix;
 
    public VkTransformMatrixKHR(float[][] matrix)
    {
        if (matrix.length != 3)
        {
            throw new IllegalArgumentException("Matrix must have 3 rows.");
        }
        
        for(int i = 0; i < 3; i++)
        {
            if (matrix[i].length != 4)
            {
                throw new IllegalArgumentException("Each matrix row must have 4 columns.");
            }
        }
        
        this.matrix = matrix;
    }

    public float[][] getMatrix()
    {
        return matrix;
    }
}
