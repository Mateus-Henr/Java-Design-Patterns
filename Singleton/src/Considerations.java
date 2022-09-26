/*
    Implementation Considerations

    • Early/Eager initialization is the one that should be tried to be used first.
    • The classic version uses double check locking and volatile field.
    • Lazy initialization holder is the preferred one.
    • Enum can be used but it's bad practise.


    Design Considerations
    • Singleton creation does not need any parameters. If it does, then a factory method or simple factory
      pattern is better.
    • Singletons cannot carry a lot of mutable global state.
 */

public class Considerations
{
}
