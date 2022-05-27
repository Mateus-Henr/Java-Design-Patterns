package implementations;

/* Implementation Considerations

    • Immutable classes can be easily created by using a builder as an inner static class. This is used even if
      immutability is not the main concern.
    • Notice that having a Builder inside the class that it's going to build, it's more well-structured.


    Design Consideration
    • The director role is rarely implemented as separate class, typically the consumer of the object instance or the
      client handles that role.
    • Abstract builder is not required if the "product" itself is not part of any inheritance hierarchy. You can
      directly create concrete builder.
    • It only makes sense to have an abstract builder if you have inheritance, and multiple children class have to
      build themselves.
    • If you are running into a "too many constructor arguments" problem then it's a good indication that Builder
      pattern may help.
 */

public class Considerations
{

}
