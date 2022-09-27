/*
    Pitfalls

    • Different parts of the code might start depending on that Singleton instance.
    • They are difficult to unit test.
    • It relies on static variables and this type of variable is held per class loader, so depending on
      the app it may not be truly a singleton.
    • It should not have a large mutable global state.
 */

public class Pitfalls
{
}
