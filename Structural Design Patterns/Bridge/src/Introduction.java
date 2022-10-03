/*
    Bridge

    What is Bridge?
    • Our implementations and abstractions are generally coupled to each other in normal inheritance.
    • This design pattern allows us to decouple objects so that both can change without affecting each other.
    • It achieves it by having two separate inheritance hierarchies: implementation and abstraction.
    • Composition is used to bridge those two hierarchies.


    UML (Roles)
    • Abstraction (abstract) - It defines abstraction's interface and has ra reference to implementor.
    • Refines Abstraction - More specialized abstraction.
    • Implementor - Base interface for implementation classes.
                    Methods are unrelated to Abstraction and typically represent smaller steps.
    • Concrete Implementor - Implements implementor methods.
    OBS: There's a composition between Abstraction and Implementor.
 */

public class Introduction
{
}
