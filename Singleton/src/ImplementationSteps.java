/*
    Implementation steps

    • To control an instance creation we have to restrict the constructor from being accessed globally and
      inheritance/subclassing must not be allowed.
    • Keeping track of the instance by placing it into a class.
    • When working with a singleton we have to make sure to give access to the instance through an public static
      method. Notice that it can also be final depending on your implementation.


    Types of implementation
    • Early initialization (eager Singleton) - Create singleton as soon as the class is loaded.
    • Lazy initialization (Lazy Singleton) - Singleton is created when it is first required.
 */

public class ImplementationSteps
{
}
