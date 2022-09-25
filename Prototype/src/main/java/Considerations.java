/*
    Implementation Considerations

    • Decide upon which copy to use shallow or deep. Immutable fields on clones save the trouble of a deep copy.
    • Reset the mutable state of the object before returning its prototype. Good idea to implement an initialize method.
    • Override the method clone as public.
    • The Cloneable interface is an indication that a class supports cloning.


    Design Considerations
    • Useful when we have large objects where majority of state is unchanged between instances, and you can easily
      identify that state.
    • A prototype registry is a class where you can register various prototypes which other code can access to clone
      out instances. This solves the issue of getting access to initial state.
    • Sometimes used with Composite and Decorator patterns.
 */

public class Considerations
{
}
