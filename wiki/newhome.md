**jvulkan** is a Java Vulkan SDK project.  It has been implemented in a way as to be far more 
"friendly" to programmers that grew up in the Java world.

If you are new to this you may want to also fetch the [jvulkan-examples](https://github.com/dkaip/jvulkan-examples) project.  The 
**jvulkan-examples** project provides some working examples of using this project.

The fine folks at JogAmp have created Java bindings that allow you to use the Vulkan API from
Java, however, in my opinion it works fine, but, is not friendly to the Java way of doing things
and is certainly not Java programmer friendly to the normal Java programmer.

This current release is an attempt at providing access to the Vulkan Specification 1.1.101.0 
functionality ultimately via the [Vulkan® SDK](https://www.lunarg.com/vulkan-sdk/) from LUNARG.

It is not, at this moment, complete in implementing all of the 1.1.101.0 functionality, however, it should 
be able to run all of the example programs in the **jvulkan-examples** project.  

Also, do not expect this software to work if you do not have Vulkan drivers available on your 
machine for your graphics card.  

Note: This has only been built and tested in a Linux 64 bit environment, 
at this moment, Fedora 29.  It has been running just fine on a Radeon RX460 with 4GB of RAM. 
I expect the examples to run fine on a card that has much less memory.

