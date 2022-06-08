/*  Introduction


    What does it solve
    • It moves the instantiation logic to a separate class and most commonly to a static method of this class.
      In other words, instantiation that is based on a condition is separated to another class.


    Other concerns
    • Some may not consider it as a design pattern because it's too simple.
    • THIS IS NOT "FACTORY METHOD".


    When it's used
    • As mentioned before, this is typically used when we have more than one option when instantiating an object.


    UML (Roles)
    • Product - This can be an interface or an abstract class.
    • SimpleFactory - Provides a static method to get instance of product subclass. Typically, a separated class.
                      This is the class that the client would access.
 */

public class Introduction
{
}
