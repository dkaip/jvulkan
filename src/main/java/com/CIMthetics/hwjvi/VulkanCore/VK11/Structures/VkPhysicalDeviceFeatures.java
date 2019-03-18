package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkPhysicalDeviceFeatures
{
    private boolean    robustBufferAccess;
    private boolean    fullDrawIndexUint32;
    private boolean    imageCubeArray;
    private boolean    independentBlend;
    private boolean    geometryShader;
    private boolean    tessellationShader;
    private boolean    sampleRateShading;
    private boolean    dualSrcBlend;
    private boolean    logicOp;
    private boolean    multiDrawIndirect;
    private boolean    drawIndirectFirstInstance;
    private boolean    depthClamp;
    private boolean    depthBiasClamp;
    private boolean    fillModeNonSolid;
    private boolean    depthBounds;
    private boolean    wideLines;
    private boolean    largePoints;
    private boolean    alphaToOne;
    private boolean    multiViewport;
    private boolean    samplerAnisotropy;
    private boolean    textureCompressionETC2;
    private boolean    textureCompressionASTC_LDR;
    private boolean    textureCompressionBC;
    private boolean    occlusionQueryPrecise;
    private boolean    pipelineStatisticsQuery;
    private boolean    vertexPipelineStoresAndAtomics;
    private boolean    fragmentStoresAndAtomics;
    private boolean    shaderTessellationAndGeometryPointSize;
    private boolean    shaderImageGatherExtended;
    private boolean    shaderStorageImageExtendedFormats;
    private boolean    shaderStorageImageMultisample;
    private boolean    shaderStorageImageReadWithoutFormat;
    private boolean    shaderStorageImageWriteWithoutFormat;
    private boolean    shaderUniformBufferArrayDynamicIndexing;
    private boolean    shaderSampledImageArrayDynamicIndexing;
    private boolean    shaderStorageBufferArrayDynamicIndexing;
    private boolean    shaderStorageImageArrayDynamicIndexing;
    private boolean    shaderClipDistance;
    private boolean    shaderCullDistance;
    private boolean    shaderFloat64;
    private boolean    shaderInt64;
    private boolean    shaderInt16;
    private boolean    shaderResourceResidency;
    private boolean    shaderResourceMinLod;
    private boolean    sparseBinding;
    private boolean    sparseResidencyBuffer;
    private boolean    sparseResidencyImage2D;
    private boolean    sparseResidencyImage3D;
    private boolean    sparseResidency2Samples;
    private boolean    sparseResidency4Samples;
    private boolean    sparseResidency8Samples;
    private boolean    sparseResidency16Samples;
    private boolean    sparseResidencyAliased;
    private boolean    variableMultisampleRate;
    private boolean    inheritedQueries;
    
    // TODO change most is to has
    public boolean isRobustBufferAccess()
    {
        return robustBufferAccess;
    }
    
    public void setRobustBufferAccess(boolean robustBufferAccess)
    {
        this.robustBufferAccess = robustBufferAccess;
    }
    
    public boolean isFullDrawIndexUint32()
    {
        return fullDrawIndexUint32;
    }
    
    public void setFullDrawIndexUint32(boolean fullDrawIndexUint32)
    {
        this.fullDrawIndexUint32 = fullDrawIndexUint32;
    }
    
    public boolean isImageCubeArray()
    {
        return imageCubeArray;
    }
    
    public void setImageCubeArray(boolean imageCubeArray)
    {
        this.imageCubeArray = imageCubeArray;
    }
    
    public boolean isIndependentBlend()
    {
        return independentBlend;
    }
    
    public void setIndependentBlend(boolean independentBlend)
    {
        this.independentBlend = independentBlend;
    }
    
    public boolean isGeometryShader()
    {
        return geometryShader;
    }
    
    public void setGeometryShader(boolean geometryShader)
    {
        this.geometryShader = geometryShader;
    }
    
    public boolean isTessellationShader()
    {
        return tessellationShader;
    }
    
    public void setTessellationShader(boolean tessellationShader)
    {
        this.tessellationShader = tessellationShader;
    }
    
    public boolean isSampleRateShading()
    {
        return sampleRateShading;
    }
    
    public void setSampleRateShading(boolean sampleRateShading)
    {
        this.sampleRateShading = sampleRateShading;
    }
    
    public boolean isDualSrcBlend()
    {
        return dualSrcBlend;
    }
    
    public void setDualSrcBlend(boolean dualSrcBlend)
    {
        this.dualSrcBlend = dualSrcBlend;
    }
    
    public boolean isLogicOp()
    {
        return logicOp;
    }
    
    public void setLogicOp(boolean logicOp)
    {
        this.logicOp = logicOp;
    }
    
    public boolean isMultiDrawIndirect()
    {
        return multiDrawIndirect;
    }
    
    public void setMultiDrawIndirect(boolean multiDrawIndirect)
    {
        this.multiDrawIndirect = multiDrawIndirect;
    }
    
    public boolean isDrawIndirectFirstInstance()
    {
        return drawIndirectFirstInstance;
    }
    
    public void setDrawIndirectFirstInstance(boolean drawIndirectFirstInstance)
    {
        this.drawIndirectFirstInstance = drawIndirectFirstInstance;
    }
    
    public boolean isDepthClamp()
    {
        return depthClamp;
    }
    
    public void setDepthClamp(boolean depthClamp)
    {
        this.depthClamp = depthClamp;
    }
    
    public boolean isDepthBiasClamp()
    {
        return depthBiasClamp;
    }
    
    public void setDepthBiasClamp(boolean depthBiasClamp)
    {
        this.depthBiasClamp = depthBiasClamp;
    }
    
    public boolean isFillModeNonSolid()
    {
        return fillModeNonSolid;
    }
    
    public void setFillModeNonSolid(boolean fillModeNonSolid)
    {
        this.fillModeNonSolid = fillModeNonSolid;
    }
    
    public boolean isDepthBounds()
    {
        return depthBounds;
    }
    
    public void setDepthBounds(boolean depthBounds)
    {
        this.depthBounds = depthBounds;
    }
    
    public boolean isWideLines()
    {
        return wideLines;
    }
    
    public void setWideLines(boolean wideLines)
    {
        this.wideLines = wideLines;
    }
    
    public boolean isLargePoints()
    {
        return largePoints;
    }
    
    public void setLargePoints(boolean largePoints)
    {
        this.largePoints = largePoints;
    }
    
    public boolean isAlphaToOne()
    {
        return alphaToOne;
    }
    
    public void setAlphaToOne(boolean alphaToOne)
    {
        this.alphaToOne = alphaToOne;
    }
    
    public boolean isMultiViewport()
    {
        return multiViewport;
    }
    
    public void setMultiViewport(boolean multiViewport)
    {
        this.multiViewport = multiViewport;
    }
    
    public boolean isSamplerAnisotropy()
    {
        return samplerAnisotropy;
    }
    
    public void setSamplerAnisotropy(boolean samplerAnisotropy)
    {
        this.samplerAnisotropy = samplerAnisotropy;
    }
    
    public boolean isTextureCompressionETC2()
    {
        return textureCompressionETC2;
    }
    
    public void setTextureCompressionETC2(boolean textureCompressionETC2)
    {
        this.textureCompressionETC2 = textureCompressionETC2;
    }
    
    public boolean isTextureCompressionASTC_LDR()
    {
        return textureCompressionASTC_LDR;
    }
    
    public void setTextureCompressionASTC_LDR(boolean textureCompressionASTC_LDR)
    {
        this.textureCompressionASTC_LDR = textureCompressionASTC_LDR;
    }
    
    public boolean isTextureCompressionBC()
    {
        return textureCompressionBC;
    }
    
    public void setTextureCompressionBC(boolean textureCompressionBC)
    {
        this.textureCompressionBC = textureCompressionBC;
    }
    
    public boolean isOcclusionQueryPrecise()
    {
        return occlusionQueryPrecise;
    }
    
    public void setOcclusionQueryPrecise(boolean occlusionQueryPrecise)
    {
        this.occlusionQueryPrecise = occlusionQueryPrecise;
    }
    
    public boolean isPipelineStatisticsQuery()
    {
        return pipelineStatisticsQuery;
    }
    
    public void setPipelineStatisticsQuery(boolean pipelineStatisticsQuery)
    {
        this.pipelineStatisticsQuery = pipelineStatisticsQuery;
    }
    
    public boolean isVertexPipelineStoresAndAtomics()
    {
        return vertexPipelineStoresAndAtomics;
    }
    
    public void setVertexPipelineStoresAndAtomics(
            boolean vertexPipelineStoresAndAtomics)
    {
        this.vertexPipelineStoresAndAtomics = vertexPipelineStoresAndAtomics;
    }
    
    public boolean isFragmentStoresAndAtomics()
    {
        return fragmentStoresAndAtomics;
    }
    
    public void setFragmentStoresAndAtomics(boolean fragmentStoresAndAtomics)
    {
        this.fragmentStoresAndAtomics = fragmentStoresAndAtomics;
    }
    
    public boolean isShaderTessellationAndGeometryPointSize()
    {
        return shaderTessellationAndGeometryPointSize;
    }
    
    public void setShaderTessellationAndGeometryPointSize(
            boolean shaderTessellationAndGeometryPointSize)
    {
        this.shaderTessellationAndGeometryPointSize = shaderTessellationAndGeometryPointSize;
    }
    
    public boolean isShaderImageGatherExtended()
    {
        return shaderImageGatherExtended;
    }
    
    public void setShaderImageGatherExtended(boolean shaderImageGatherExtended)
    {
        this.shaderImageGatherExtended = shaderImageGatherExtended;
    }
    
    public boolean isShaderStorageImageExtendedFormats()
    {
        return shaderStorageImageExtendedFormats;
    }
    
    public void setShaderStorageImageExtendedFormats(
            boolean shaderStorageImageExtendedFormats)
    {
        this.shaderStorageImageExtendedFormats = shaderStorageImageExtendedFormats;
    }
    
    public boolean isShaderStorageImageMultisample()
    {
        return shaderStorageImageMultisample;
    }
    
    public void setShaderStorageImageMultisample(
            boolean shaderStorageImageMultisample)
    {
        this.shaderStorageImageMultisample = shaderStorageImageMultisample;
    }
    
    public boolean isShaderStorageImageReadWithoutFormat()
    {
        return shaderStorageImageReadWithoutFormat;
    }
    
    public void setShaderStorageImageReadWithoutFormat(
            boolean shaderStorageImageReadWithoutFormat)
    {
        this.shaderStorageImageReadWithoutFormat = shaderStorageImageReadWithoutFormat;
    }
    
    public boolean isShaderStorageImageWriteWithoutFormat()
    {
        return shaderStorageImageWriteWithoutFormat;
    }
    
    public void setShaderStorageImageWriteWithoutFormat(
            boolean shaderStorageImageWriteWithoutFormat)
    {
        this.shaderStorageImageWriteWithoutFormat = shaderStorageImageWriteWithoutFormat;
    }
    
    public boolean isShaderUniformBufferArrayDynamicIndexing()
    {
        return shaderUniformBufferArrayDynamicIndexing;
    }
    
    public void setShaderUniformBufferArrayDynamicIndexing(
            boolean shaderUniformBufferArrayDynamicIndexing)
    {
        this.shaderUniformBufferArrayDynamicIndexing = shaderUniformBufferArrayDynamicIndexing;
    }
    
    public boolean isShaderSampledImageArrayDynamicIndexing()
    {
        return shaderSampledImageArrayDynamicIndexing;
    }
    
    public void setShaderSampledImageArrayDynamicIndexing(
            boolean shaderSampledImageArrayDynamicIndexing)
    {
        this.shaderSampledImageArrayDynamicIndexing = shaderSampledImageArrayDynamicIndexing;
    }
    
    public boolean isShaderStorageBufferArrayDynamicIndexing()
    {
        return shaderStorageBufferArrayDynamicIndexing;
    }
    
    public void setShaderStorageBufferArrayDynamicIndexing(
            boolean shaderStorageBufferArrayDynamicIndexing)
    {
        this.shaderStorageBufferArrayDynamicIndexing = shaderStorageBufferArrayDynamicIndexing;
    }
    
    public boolean isShaderStorageImageArrayDynamicIndexing()
    {
        return shaderStorageImageArrayDynamicIndexing;
    }
    
    public void setShaderStorageImageArrayDynamicIndexing(
            boolean shaderStorageImageArrayDynamicIndexing)
    {
        this.shaderStorageImageArrayDynamicIndexing = shaderStorageImageArrayDynamicIndexing;
    }
    
    public boolean isShaderClipDistance()
    {
        return shaderClipDistance;
    }
    
    public void setShaderClipDistance(boolean shaderClipDistance)
    {
        this.shaderClipDistance = shaderClipDistance;
    }
    
    public boolean isShaderCullDistance()
    {
        return shaderCullDistance;
    }
    
    public void setShaderCullDistance(boolean shaderCullDistance)
    {
        this.shaderCullDistance = shaderCullDistance;
    }
    
    public boolean isShaderFloat64()
    {
        return shaderFloat64;
    }
    
    public void setShaderFloat64(boolean shaderFloat64)
    {
        this.shaderFloat64 = shaderFloat64;
    }
    
    public boolean isShaderInt64()
    {
        return shaderInt64;
    }
    
    public void setShaderInt64(boolean shaderInt64)
    {
        this.shaderInt64 = shaderInt64;
    }
    
    public boolean isShaderInt16()
    {
        return shaderInt16;
    }
    
    public void setShaderInt16(boolean shaderInt16)
    {
        this.shaderInt16 = shaderInt16;
    }
    
    public boolean isShaderResourceResidency()
    {
        return shaderResourceResidency;
    }
    
    public void setShaderResourceResidency(boolean shaderResourceResidency)
    {
        this.shaderResourceResidency = shaderResourceResidency;
    }
    
    public boolean isShaderResourceMinLod()
    {
        return shaderResourceMinLod;
    }
    
    public void setShaderResourceMinLod(boolean shaderResourceMinLod)
    {
        this.shaderResourceMinLod = shaderResourceMinLod;
    }
    
    public boolean isSparseBinding()
    {
        return sparseBinding;
    }
    
    public void setSparseBinding(boolean sparseBinding)
    {
        this.sparseBinding = sparseBinding;
    }
    
    public boolean isSparseResidencyBuffer()
    {
        return sparseResidencyBuffer;
    }
    
    public void setSparseResidencyBuffer(boolean sparseResidencyBuffer)
    {
        this.sparseResidencyBuffer = sparseResidencyBuffer;
    }
    
    public boolean isSparseResidencyImage2D()
    {
        return sparseResidencyImage2D;
    }
    
    public void setSparseResidencyImage2D(boolean sparseResidencyImage2D)
    {
        this.sparseResidencyImage2D = sparseResidencyImage2D;
    }
    
    public boolean isSparseResidencyImage3D()
    {
        return sparseResidencyImage3D;
    }
    
    public void setSparseResidencyImage3D(boolean sparseResidencyImage3D)
    {
        this.sparseResidencyImage3D = sparseResidencyImage3D;
    }
    
    public boolean isSparseResidency2Samples()
    {
        return sparseResidency2Samples;
    }
    
    public void setSparseResidency2Samples(boolean sparseResidency2Samples)
    {
        this.sparseResidency2Samples = sparseResidency2Samples;
    }
    
    public boolean isSparseResidency4Samples()
    {
        return sparseResidency4Samples;
    }
    
    public void setSparseResidency4Samples(boolean sparseResidency4Samples)
    {
        this.sparseResidency4Samples = sparseResidency4Samples;
    }
    
    public boolean isSparseResidency8Samples()
    {
        return sparseResidency8Samples;
    }
    
    public void setSparseResidency8Samples(boolean sparseResidency8Samples)
    {
        this.sparseResidency8Samples = sparseResidency8Samples;
    }
    
    public boolean isSparseResidency16Samples()
    {
        return sparseResidency16Samples;
    }
    
    public void setSparseResidency16Samples(boolean sparseResidency16Samples)
    {
        this.sparseResidency16Samples = sparseResidency16Samples;
    }
    
    public boolean isSparseResidencyAliased()
    {
        return sparseResidencyAliased;
    }
    
    public void setSparseResidencyAliased(boolean sparseResidencyAliased)
    {
        this.sparseResidencyAliased = sparseResidencyAliased;
    }
    
    public boolean isVariableMultisampleRate()
    {
        return variableMultisampleRate;
    }
    
    public void setVariableMultisampleRate(boolean variableMultisampleRate)
    {
        this.variableMultisampleRate = variableMultisampleRate;
    }
    
    public boolean isInheritedQueries()
    {
        return inheritedQueries;
    }
    
    public void setInheritedQueries(boolean inheritedQueries)
    {
        this.inheritedQueries = inheritedQueries;
    }
}
