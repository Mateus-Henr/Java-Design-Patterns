/*
    Implementation Considerations

    • Factories can be implemented as singletons, but singletons have drawbacks.
    • Adding a new product requires changes to the base factory as well as all implementations of factory.
    • We typically provide the client code with concrete factory for it to create objects.


    Design Considerations
    • Used to constrain object creations, so they all work together.
    • It uses factory method pattern.
    • If objects are expensive to create you can use it together with prototype design.
 */

public class Considerations
{
}
