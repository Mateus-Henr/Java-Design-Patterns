/*  Implementation Considerations

    • By adding a separate class for the Factory it allows a better project organization.
    • Usually a static method.


    Design Considerations
    • Can be implemented together with other patterns, e.g. Builder.


    Simple Factory vs Factory
    • SF - Instantiation logic is static and away from client code.
    • F - Delegate object creation to subclasses.
    • SF - Knowledgeable on all classes whose objects it can create.
    • F - Do not know about all product subclasses.
 */

public class Considerations
{
}
