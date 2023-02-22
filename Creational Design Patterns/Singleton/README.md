## Introduction

### What is a Singleton?
- A singleton class has only one instance, accessible globally through a single point (method/field).
- This ensures that only a single instance of a class exists.
- Any state modified/added in your singleton becomes the "global state" of your application.


## UML (Role)
- Singleton - Responsible for creating an unique instance and provides an static method to get the instance.

### Example
- Runtime.


## Comparison with Factory Method
- **S** - Ensures one instance is ever created.
- **FM** - Isolates object creation and delegates it to subclasses.
- **S** - No arguments.
- **FM** - Allows arguments.


## Implementation steps
  - To control an instance creation we have to restrict the constructor from being accessed globally and
      inheritance/subclassing must not be allowed.
  - Keeping track of the instance by placing it into a class.
  - When working with a singleton we have to make sure to give access to the instance through an public static
      method. Notice that it can also be final depending on your src.


## Types of src
  - Early initialization (eager Singleton) - Create singleton as soon as the class is loaded.
  - Lazy initialization (Lazy Singleton) - Singleton is created when it is first required.


## Implementation Considerations
- Early/Eager initialization is the one that should be tried to be used first.
- The classic version uses double check locking and volatile field.
- Lazy initialization holder is the preferred one.
- Enum can be used but it's bad practise.


## Design Considerations
- Singleton creation does not need any parameters. If it does, then a factory method or simple factory
      pattern is better.
- Singletons cannot carry a lot of mutable global state.


## Pitfalls

  - Different parts of the code might start depending on that Singleton instance.
  - They are difficult to unit test.
  - It relies on static variables and this type of variable is held per class loader, so depending on
      the app it may not be truly a singleton.
  - It should not have a large mutable global state.


## Summary
- Used for ensuring one instance in an application.
- Construct must be private (disables inheritance).
- It has public static method to get the instance.
- Eager or Lazy.
- Must not be used if it has a large mutable state.


## Usages
- Store app config values (read from file). Values must be immutable.
- Logging frameworks.
- Spring framework (beans).