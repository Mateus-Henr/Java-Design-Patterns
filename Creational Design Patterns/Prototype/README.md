## Introduction

- It's a creational design pattern.


### What is a Prototype??
- Used when we have an object whose creation is costly.
- It allows us to make copies of existing objects in order to not have to create them from scratch.


## UML (Roles)
- **Prototype (abstract)** - Declares a method for cloning itself.
- **Concrete Prototype (concrete)** - Makes copies of each concrete object.
- **Client** - Creates new instance using prototype's clone method.


### Examples
- Object.clone().


##  Prototype vs Singleton
- **P** - Return the copy of an instance, so we have a different instance.
- **S** - Return the same instance.
- **P** - State of instances can be different.
- **S** - State is the same since the same object that is returned.


## Implementation Steps

- Create the class that will be the prototype.
- It must implement the Cloneable interface.
- Overwrite the "clone()" method. Decide if between a shallow copy (copy attributes) or a deep copy (recreate all
      objects).
- The method should declare CloneNotSupportedException.


## Implementation Considerations

- Decide upon which copy to use shallow or deep. Immutable fields on clones save the trouble of a deep copy.
- Reset the mutable state of the object before returning its prototype. Good idea to implement an initialize method.
- Override the method clone as public.
- The Cloneable interface is an indication that a class supports cloning.


## Design Considerations
- Useful when we have large objects where majority of state is unchanged between instances, and you can easily
      identify that state.
- A prototype registry is a class where you can register various prototypes which other code can access to clone
      out instances. This solves the issue of getting access to initial state.
- Sometimes used with Composite and Decorator patterns.


## Pitfalls

- Usability depends upon the number of properties in state that are immutable or can be shallow copied. An object
      where state is made of a large number of mutable objects is complicated to clone.
- The default clone operation provides a shallow copy, so if a deep copy is needed you have to implement it.
- The code becomes complicated when you have subclasses that do not support the clone operation.


##  Summary
- Used when an object new instance is costly or not possible.
- Implement it by using the clone method.
- Good candidates are object that have a majority of their state immutable.
- Shallow vs deep copy.
- Remember to initialize the cloned object.
