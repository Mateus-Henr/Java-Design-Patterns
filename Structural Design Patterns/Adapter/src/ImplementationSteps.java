/*
    Implementation Steps

    • Firstly we create a class for Adapter, and it must implement the interface expected by client.
    • When using a Class Adapter, we extend from our existing class, and we forward the method to another
      method inherited from adaptee.
    • In the case of Object Adapter, we implement the target interface and accept adaptee as constructor
      argument in adapter by using composition.
    • An object adapter should take adapter as an argument in constructor or a less preferred or a less
      preferred solution, you can instantiate it in the constructor this tightly coupling with a specific
      adaptee.
 */

public class ImplementationSteps
{
}
