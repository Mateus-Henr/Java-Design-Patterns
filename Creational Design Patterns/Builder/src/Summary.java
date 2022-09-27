/*  Summary

    • This pattern will be used when an object requires a complex constructor, or if the object requires multiple
      steps to be built.
    • When used, it removes the complexity from our code into a separated class.
    • A builder can either be implemented as a separated class or as an inner class, but as an inner class is more
      well-structured (and we can make the set methods private, so only the builder would be able to access them).
      This was the class is immutable.

    Roles
    • Product - This is the class that we want to create objects of.
    • Builder (abstract or interface) and ConcreteBuilder - Define methods to build parts of our object. And a method to
                                                            assemble our objects into a final object.
    • Director - It knows how to use the builder class, such as the sequence of build.
                 usually played by the class that uses the final product.
 */

public class Summary
{
}
