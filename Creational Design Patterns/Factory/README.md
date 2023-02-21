## Introduction

### What is Factory Method?
- A creational design pattern in a separate class.
- We don't have to know which class to instantiate in advance.
- It allows it by letting the object creation to subclasses through method overriding.


## UML (Roles)
- Product - Base class or interface of products created by factory method.
- Concrete Product - Implements the Product interface or class.
- Creator - Declares the abstract factory method and uses factory method to create product.
- Concrete creator - Implements the factory method and returns the concrete product instance.

### Example
- Collection or AbstractCollection.


## Implementation Steps

- Create the Creator class, it can be concrete if it has a default object otherwise is abstract.
- Implementations will override the method and return an object.


## Implementation Considerations

- The Creator can be a concrete class if provided a default implementation.
- The factory method could take arguments to decide upon which object to create.


## Design Consideration
- The factory design reflects the product hierarchy. So we usually end up with a concrete creator per object type.
- "Abstract Factory" makes use of Factory method pattern just like some Template method design patterns.


## Pitfalls

- Complex to implement/refactor code since it uses more classes.
- Sometimes it forces you to subclass to create a proper instance.


## Summary
- Use when you want to delegate object creation to subclasses and when you have a "product" inheritance
      hierarchy and possibility of future additions to that.
