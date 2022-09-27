/*
    Pitfalls

    • Usability depends upon the number of properties in state that are immutable or can be shallow copied. An object
      where state is made of a large number of mutable objects is complicated to clone.
    • The default clone operation provides a shallow copy, so if a deep copy is needed you have to implement it.
    • The code becomes complicated when you have subclasses that do not support the clone operation.
 */

public class Pitfalls
{
}
