## Introduction

### What is Bridge?
- Our implementations and abstractions are generally coupled to each other in normal inheritance.
- This design pattern allows us to decouple objects so that both can change without affecting each other.
- It achieves it by having two separate inheritance hierarchies: implementation and abstraction.
- Composition is used to bridge those two hierarchies.


## UML (Roles)
- Abstraction (abstract) - It defines abstraction's interface and has ra reference to implementor.
- Refines Abstraction - More specialized abstraction.
- Implementor - Base interface for implementation classes.
                    Methods are unrelated to Abstraction and typically represent smaller steps.
- Concrete Implementor - Implements implementor methods.
**OBS:** There's a composition between Abstraction and Implementor.


## Implementation Steps

- Define abstraction as needed by client.
- Determine common base operations and define them.
- There's also the option of defining a refined abstraction (more specialized operations).
- Define implementor, its methods do not have to match with abstractor.
- However, abstraction can happen using Implementor methods.
- Write one or more concrete Implementor providing implementation.
- Abstractions are created by composing them with an instance of concrete Implementor which is used by methods in
  abstraction.