## Introduction

### What does it solve
- It moves the instantiation logic to a separate class and most commonly to a static method of this class.
      In other words, instantiation that is based on a condition is separated to another class.

### Other concerns
- Some may not consider it as a design pattern because it's too simple.
- THIS IS NOT "FACTORY METHOD".

### When it's used
- As mentioned before, this is typically used when we have more than one option when instantiating an object.


## UML (Roles)
- Product - This can be an interface or an abstract class.
- SimpleFactory - Provides a static method to get instance of product subclass. Typically, a separated class.
                      This is the class that the client would access.

### Examples
- NumberFormat.


## Implementation steps

- This is considerably easy to implement, we start by creating a separate class, then the static method that is
  going to return the object of the desired type.
- Notice also that it usually accepts an argument which is going to be what will decide the object type to be
  returned.
- It can accept additional arguments as well, that would be used to instantiate the return object.


## Implementation Considerations

- By adding a separate class for the Factory it allows a better project organization.
- Usually a static method.


## Design Considerations
- Can be implemented together with other patterns, e.g. Builder.


## Simple Factory vs Factory
- SF - Instantiation logic is static and away from client code.
- F - Delegate object creation to subclasses.
- SF - Knowledgeable on all classes whose objects it can create.
- F - Do not know about all product subclasses.


## Pitfalls

- Criteria for deciding which object to create can become complex over time. By using Factory pattern this should
      be solved.


## Summary
- Encapsulates object instantiation in a separate method.
- Decide on which object to create based on a parameter.
