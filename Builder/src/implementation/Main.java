package implementation;

/*  Builder Implementation


    Implementation steps

    Step 1
    • We start by creating a builder.
    • We identify the "parts" of the product and provide methods to create those parts.
    • It should provide a method to "assemble" or build the product/object.
    • It must provide a way/method to get fully built object out. Optionally builder can keep reference to a product
      it has built so the same can be returned again in the future.

    Step 2
    • A director can be a separate class or client can play the role of director.


    Examples

    StringBuilder
    • The java.lang.StringBuilder class as well as various buffer classes in java.nio package like ByteBuffer,
      CharBuffer are often given as examples of builder pattern.
    • In my humble opinion they can be given as examples of builder pattern, but with an understanding that they don't
      match 100% with GoF definition. These classes do allow us to build final object in steps, providing only a part
      of final object in one step. In this way they can be thought of as an implementation of builder pattern.
    • So a StringBuilder satisfies the intent/purpose of builder pattern. However, as soon we start looking at structure
      of the StringBuilder things start to fall apart. GoF definition also states that, builder has potential to build
      different representations of product interface using same steps. According to the implementation, we could have
      multiple subclasses that could be built using the same steps.

     CalendarBuilder
     • Another example of a builder design pattern since it builds part by part of a final calendar product. It also
       has the "build()" method to assemble everything.
 */

public class Main
{
}
