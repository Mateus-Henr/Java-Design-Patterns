/*
    Introduction

    What is an Object Pool?
    • This utilized when we have an instance that has a costly creation, and we need a large number of objects
      of this class for short duration.
    • When implementing it we can either pre-create objects of the class or collect unused instances in
      memory cache. When code needs an object of this class we provide it from this cache.
    • Considered one of the most complicated patterns.


    UML (Roles)
    • Abstract Reusable - Abstract product defining operations.
    • Concrete Reusable Product - Implementation of reusable product with state.
    • Object Pool - Caches instances of reusable product and provides them.
    • Client - Uses object pool to get instances of reusable product.


    Examples
    • ThreadPoolExecutor.
    • BasicDataSource (db connections).


    Comparison with Prototype
    • OP - We have cached objects that live during the program execution.
    • P - Creates objects when (needed no caching).
    • OP - It has to return objects explicitly to the pool otherwise you may have a memory/ resource leak.
    • P - After cloning an object it can be used as a regular object, and the client code doesn't have to do
          anything.


   Summary
   • Used when you require a large number of instances that have a costly creation and are only used for
     a short period of time.
   • Typically implemented when you have connections, threads or system resources.
   • Object to be pooled must have a method to reset their state efficiently.
   • Pool must handle synchronization issues efficiently.
   • Client must release the object after using it back to the pool.
   • Difficult to optimize.
   • When creating objects when the pool is empty you have to manage the size of the pool yourself.
 */

public class Introduction
{
}
