# Builder

- This is a creational design pattern.


## Problems that it solves

### Immutable classes
- This type of classes only allow modification on the item's properties/state during initialization.
      That is, once the item is created it cannot be changed.

    Product class
- We have the product class below that is going to be used as example to describe this design pattern. Let's say
      that Product instances are immutable.

    Immutable class constructor problem
- Very often when creating immutable classes we end up with a constructor with multiple parameters (since we cannot
      set properties/state after, otherwise the class would violate the immutability rule). Because of that, the
      constructors get overloaded with parameters which is a bad practise.


## Other usages of this pattern
- Whenever you need to create an object that requires an assembly of other objects to be created, this pattern can
      be used. An example would be when you have to create a "User" object, and this object requires an object of type
      "Address".


## What is a Builder?
- We have a complex process to construct an object involving multiple steps, or number of arguments in a
      constructor, then builder design pattern can help us.
- In Builder we remove the logic related to object construction from client and abstract it in a separate class.


## Implementation Considerations

- Immutable classes can be easily created by using a builder as an inner static class. This is used even if
      immutability is not the main concern.
- Notice that having a Builder inside the class that it's going to build, it's more well-structured.


## Design Consideration
- The director role is rarely implemented as separate class, typically the consumer of the object instance or the
      client handles that role.
- Abstract builder is not required if the "product" itself is not part of any inheritance hierarchy. You can
      directly create concrete builder.
- It only makes sense to have an abstract builder if you have inheritance, and multiple children class have to
      build themselves.
- If you are running into a "too many constructor arguments" problem then it's a good indication that Builder
      pattern may help.


## UML (class Builder)

### Role - Product
- Final complex object that we want to create.

### Role - Builder
- Provides interface for creating "parts" of the product.
- It allows us to specify arguments one at a time.
- It provides a method ("build()") to assemble the final object.
- Also provides a method to get the object created ("getProduct()").

### Role - ConcreteBuilder
- If the Builder is an interface or abstract class, this is an implementation of that Builder.
- It constructs parts and assembles final product.
- Keeps track of the product it creates, get method.

### Role - Director
- This is what controls the method calls, in other words, the director knows how to use the Builder object to create
      the final problem.
- Uses Builder to construct object.
- Knows the steps and their sequence to build product.

## Builder Implementation

### Step 1
- We start by creating a builder.
- We identify the "parts" of the product and provide methods to create those parts.
- It should provide a method to "assemble" or build the product/object.
- It must provide a way/method to get fully built object out. Optionally builder can keep reference to a product
      it has built so the same can be returned again in the future.

    Step 2
- A director can be a separate class or client can play the role of director.


### Examples

**StringBuilder**
- The java.lang.StringBuilder class as well as various buffer classes in java.nio package like ByteBuffer,
      CharBuffer are often given as examples of builder pattern.
- In my humble opinion they can be given as examples of builder pattern, but with an understanding that they don't
      match 100% with GoF definition. These classes do allow us to build final object in steps, providing only a part
      of final object in one step. In this way they can be thought of as an implementation of builder pattern.
- So a StringBuilder satisfies the intent/purpose of builder pattern. However, as soon we start looking at structure
      of the StringBuilder things start to fall apart. GoF definition also states that, builder has potential to build
      different representations of product interface using same steps. According to the implementation, we could have
      multiple subclasses that could be built using the same steps.

**CalendarBuilder**
 - Another example of a builder design pattern since it builds part by part of a final calendar product. It also
       has the "build()" method to assemble everything.


## Pitfalls

- Be aware that if implemented and used correctly there are no pitfalls.


### What are the pitfalls when dealing with design patterns
- Number of new classes to be added.
- Impact to refactor existing code.
- Complexity to understand.


### Some pitfalls of this pattern
- Method chaining (if it's a beginner to Java)
- Partially initialized object - Notice that if required properties are missing the Builder has to provide them or
      throw an exception.


## Summary

- This pattern will be used when an object requires a complex constructor, or if the object requires multiple
  steps to be built.
- When used, it removes the complexity from our code into a separated class.
- A builder can either be implemented as a separated class or as an inner class, but as an inner class is more
  well-structured (and we can make the set methods private, so only the builder would be able to access them).
  This was the class is immutable.

### Roles
- **Product** - This is the class that we want to create objects of.
- **Builder (abstract or interface) and ConcreteBuilder** - Define methods to build parts of our object. And a method to
  assemble our objects into a final object.
- **Director** - It knows how to use the builder class, such as the sequence of build.
  usually played by the class that uses the final product.


> class Product
> {
>     public Product(int weight, double shipVolume, int shipCode)
>     {
>         // Initialize.
    }

    // Other code.
}