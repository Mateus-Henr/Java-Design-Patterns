## Introduction

- Another creational design pattern.


## What is an Abstract Factory?
- This is used when we have two or more objects that work together.
- It separates the client from the objects that the client is using but also separates the client from the code
      which creates sets of these objects.


#### Example
- The instructor gave an example of a game where it has different ages and in each age you have a set that is
      composed of a naval unit, and a land unit.
- The goal of this pattern is to decide which class of which age to create.

## Implementation Steps

- Plan on how to implement the "sets".
-  Create the abstract factory as an abstract class or interface, with methods for creating products.
-  Provide concrete implementation of factory for each set of products.
-  This design pattern makes use of factory method pattern. This is basically an object with multiple factory
      methods.


## UML (Roles)
- LandUnit  (Abstract Product) (abstract) - Swordsman or Rifleman.
- NavalUnit (Abstract Product) (abstract) - Galley or Ironclad.
    - The two classes above are designed to work together, they also have a concrete implementation.
- GameUnitFactory (AbstractFactory) (abstract) - It will provide methods to create land and naval units.
- ConcreteFactory - It will provide implementations to create units of that specific era.


#### Example
- DocumentBuilderFactory.


## Comparison Abstract Factory vs Factory Method
- AF - Hides factories and concrete objects from the main.java.Client code.
- FM - Hides the concrete objects from the client code.
- AF - Multiple objects working together of a single family.
- FM - One product and its subclasses.


## Summary
- Used when we have multiple sets of objects.
- It uses factory method pattern.
- Future modifications require modifications to all and base implementations.
- Concrete factories can be singleton.
- Provide the client with concrete factory instance.

## Implementation Considerations

- Factories can be implemented as singletons, but singletons have drawbacks.
- Adding a new product requires changes to the base factory as well as all implementations of factory.
- We typically provide the client code with concrete factory for it to create objects.


## Design Considerations
- Used to constrain object creations, so they all work together.
- It uses factory method pattern.
- If objects are expensive to create you can use it together with prototype design.

## Pitfalls
- Very complex.
- It requires changes to base factory and all implementations of factory.
- Difficult to visualise the need for this.
- Very specific to the "product families" problem.