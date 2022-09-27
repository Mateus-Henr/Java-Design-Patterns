/*
    Pitfalls

    • The client code has to use it correctly, objects must be released back to the pool.
    • The reusable object has to reset its state efficiently.
    • Difficult to use in refactoring legacy code once the client code and the reusable object need to be
      aware of object pool.
    • Decide what happens when the pool is empty, you can either create an object or wait for one.
    • If chosen to create an object whenever needed you have to create a logic to trim your pool.
 */

public class Pitfalls
{
}
