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
 */

public class Introduction
{
}
