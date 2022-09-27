/*
    Introduction

    What is a Singleton?
    • A singleton class has only one instance, accessible globally through a single point (method/field).
    • This ensures that only a single instance of a class exists.
    • Any state modified/added in your singleton becomes the "global state" of your application.


    UML (Role)
    • Singleton - Responsible for creating an unique instance and provides an static method to get the instance.


    Example
    • Runtime.


    Comparison with Factory Method
    • S - Ensures one instance is ever created.
    • FM - Isolates object creation and delegates it to subclasses.
    • S - No arguments.
    • FM - Allows arguments.


    Summary
    • Used for ensuring one instance in an application.
    • Construct must be private (disables inheritance).
    • It has public static method to get the instance.
    • Eager or Lazy.
    • Must not be used if it has a large mutable state.


    Usages
    • Store app config values (read from file). Values must be immutable.
    • Logging frameworks.
    • Spring framework (beans).
 */

public class Introduction
{
}
