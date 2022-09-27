/*
    Introduction

    What is Factory Method?
    • A creational design pattern in a separate class.
    • We don't have to know which class to instantiate in advance.
    • It allows it by letting the object creation to subclasses through method overriding.


    UML (Roles)
    • Product - Base class or interface of products created by factory method.
    • Concrete Product - Implements the Product interface or class.
    • Creator - Declares the abstract factory method and uses factory method to create product.
    • Concrete creator - Implements the factory method and returns the concrete product instance.


    Example
    • Collection or AbstractCollection.


    Summary
    • Use when you want to delegate object creation to subclasses and when you have a "product" inheritance
      hierarchy and possibility of future additions to that.
    •
 */

public class Introduction
{
}
