/*
    Introduction

    • It's a creational design pattern.


    What is a Prototype??
    • Used when we have an object whose creation is costly.
    • It allows us to make copies of existing objects in order to not have to create them from scratch.


    UML (Roles)
    • Prototype (abstract) - Declares a method for cloning itself.
    • Concrete Prototype (concrete) - Makes copies of each concrete object.
    • Client - Creates new instance using prototype's clone method.


    Examples
    • Object.clone().


    Prototype vs Singleton
    • P - Return the copy of an instance, so we have a different instance.
    • S - Return the same instance.
    • P - State of instances can be different.
    • S - State is the same since the same object that is returned.


    Summary
    • Used when an object new instance is costly or not possible.
    • Implement it by using the clone method.
    • Good candidates are object that have a majority of their state immutable.
    • Shallow vs deep copy.
    • Remember to initialize the cloned object.
 */

public class Introduction
{
}
