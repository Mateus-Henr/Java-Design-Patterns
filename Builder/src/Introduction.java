public class Introduction
{
}

/*  Builder

    • This is a creational design pattern.


    Problems that it solves

    Immutable classes
    • This type of classes only allow modification on the item's properties/state during initialization.
      That is, once the item is created it cannot be changed.

    Product class
    • We have the product class below that is going to be used as example to describe this design pattern. Let's say
      that Product instances are immutable.

    Immutable class constructor problem
    • Very often when creating immutable classes we end up with a constructor with multiple parameters (since we cannot
      set properties/state after, otherwise the class would violate the immutability rule). Because of that, the
      constructors get overloaded with parameters which is a bad practise.


    Other usages of this pattern
    • Whenever you need to create an object that requires an assembly of other objects to be created, this pattern can
      be used. An example would be when you have to create a "User" object, and this object requires an object of type
      "Address".


    What is a Builder?
    • We have a complex process to construct an object involving multiple steps, or number of arguments in a
      constructor, then builder design pattern can help us.
    • In Builder we remove the logic related to object construction from client and abstract it in a separate class.


    UML (class Builder)

    Role - Product
    • Final complex object that we want to create.

    Role - Builder
    • Provides interface for creating "parts" of the product.
    • It allows us to specify arguments one at a time.
    • It provides a method ("build()") to assemble the final object.
    • Also provides a method to get the object created ("getProduct()").

    Role - ConcreteBuilder
    • If the Builder is an interface or abstract class, this is an implementation of that Builder.
    • It constructs parts and assembles final product.
    • Keeps track of the product it creates, get method.

    Role - Director
    • This is what controls the method calls, in other words, the director knows how to use the Builder object to create
      the final problem.
    • Uses Builder to construct object.
    • Knows the steps and their sequence to build product.
 */

class Product
{
    public Product(int weight, double shipVolume, int shipCode)
    {
        // Initialize.
    }

    // Other code.
}