# jvulkan

**jvulkan** is a Java Vulkan SDK project.  It has been implemented in a way as to be far more 
"friendly" to programmers that grew up in the Java world.

If you are new to this you may want to also fetch the **jvulkan-examples** project.  The 
**jvulkan-examples** provides some working examples of using this project.

The fine folks at JogAmp have created Java bindings that allow you to use the Vulkan API from
Java, however, in my opinion it works fine, but, is not friendly to the Java way of doing things
and is certainly not Java programmer friendly to the normal Java programmer.

This current release is an attempt at providing access to the Vulkan Specification 1.1.101.0 
functionality ultimately via the [Vulkan® SDK](https://www.lunarg.com/vulkan-sdk/) from LUNARG.

It is not, at this moment, complete in implementing all of the 1.1.101.0 functionality, however, it should 
be able to run all of the example programs in the **jvulkan-examples** project.  

Also, do not expect this software to work if you do not have Vulkan drivers available on your 
machine for your graphics card.  It has been running just fine on a Radeon RX460 with 4GB of RAM.

## Get the code
Use the <code>git clone</code> command to get the code. 

<code>git clone path-to-repository jvulkan</code> 

This will create a <code>jvulkan</code> directory in your current directory


## Building
Change your current directory (<code>cd</code>) to the project root directory.  If you used the 
command above it would be <code>cd jvulkan</code>.  

## Installation


In addition to this library you will need to retrieve and build the 
**jvulkan-natives-Linux-x86_64** project.

## Usage Notes
The [Vulkan® SDK](https://www.lunarg.com/vulkan-sdk/) from LUNARG is written in c++ 
and as you might imagine there are some challenges when "wrapping" c++ code with Java. 
As a result there are some systematic differences between using **jvulkan** and Java 
versus using c++ and the LUNARG Vulkan® SDK directly.

When the documentation ([Vulkan® Specification](https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/)) indicates that an array of <code>SomeObjectType</code> is to be passed as an argument and there is an additional argument indicating the number of elements contained within the array the corresponding argument using **jvulkan** will be passed as a <code>Collection&lt;SomeObjectType&gt;</code>.  Additionally, the argument indicating the number of elements contained within the array 
will not be present since a Java collection knows its size.

If a Java <code>Collection</code> is expected as a return argument from a **jvulkan** method make
sure the <code>Collection&lt;SomeObjectType&gt;</code> is created first 
(i.e. <code>Collection&lt;SomeObjectType&gt; myCollection = new LinkedList&lt;SomeObjectType&gt;()</code>).  In most cases in this situation the collection should be empty.

When a "handle" is returned (basically an object that extends <code>VulkanHandle</code>) make sure
you create the handle before you use it as an argument to a method. 
(i.e.<code>VkDebugReportCallbackEXT debugCallbackHandle = new VkDebugReportCallbackEXT();</code>) 


<code>javah -classpath /home/dkaip/git/jvulkan/src/main/java com.CIMthetics.jvulkan.VulkanCore.VK11.NativeProxies</code>

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0)