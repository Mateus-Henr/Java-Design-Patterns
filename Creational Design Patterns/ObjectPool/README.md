## Introduction

## What is an Object Pool?
- This utilized when we have an instance that has a costly creation, and we need a large number of objects
      of this class for short duration.
- When implementing it we can either pre-create objects of the class or collect unused instances in
      memory cache. When code needs an object of this class we provide it from this cache.
- Considered one of the most complicated patterns.


## UML (Roles)
- **Abstract Reusable** - Abstract product defining operations.
- **Concrete Reusable Product** - Implementation of reusable product with state.
- **Object Pool** - Caches instances of reusable product and provides them.
- **Client** - Uses object pool to get instances of reusable product.


### Examples
- ThreadPoolExecutor.
- BasicDataSource (db connections).


## Comparison with Prototype
- **OP** - We have cached objects that live during the program execution.
- **P** - Creates objects when (needed no caching).
- **OP** - It has to return objects explicitly to the pool otherwise you may have a memory/ resource leak.
- **P** - After cloning an object it can be used as a regular object, and the client code doesn't have to do
          anything.


## Implementation Steps

- First we create a class for object pool.
- Then a thread-safe caching of objects should be done in pool.
- Methods to acquire and release objects should be provided and pool should reset cached objects
  before giving them out.
- The reusable object must provide methods to reset its state.
- When implementing it we can either create new pooled objects when pool is empty or to wait until
  an object becomes available. This is based on whether the object is tied to a fixed number of
  external resources.


## Implementation Considerations

  - The reset should not be a costly operation.
  - Pre-caching objects: Creating objects in advance in order for not slow down the code. But on the other
      side this approach increases memory consumption and start-up time.
  - Depending on the amount of time that the reset operation takes it might be a good ideia to take the
      reset code out of the synchronized block.


## Design Considerations
  - The get method can be parameterized to work similarly to a Factory Method.
  - Pooling objects is only beneficial if it involves a costly initialization because of external
      resources like connection or a thread. Don't pool objects to save memory.
  - Don't pool long-lived objects or only to save frequent call to new. This mat negatively impact
      performance.


## Pitfalls
  - The client code has to use it correctly, objects must be released back to the pool.
  - The reusable object has to reset its state efficiently.
  - Difficult to use in refactoring legacy code once the client code and the reusable object need to be
      aware of object pool.
  - Decide what happens when the pool is empty, you can either create an object or wait for one.
  - If chosen to create an object whenever needed you have to create a logic to trim your pool.


## Summary
- Used when you require a large number of instances that have a costly creation and are only used for
     a short period of time.
- Typically implemented when you have connections, threads or system resources.
- Object to be pooled must have a method to reset their state efficiently.
- Pool must handle synchronization issues efficiently.
- Client must release the object after using it back to the pool.
- Difficult to optimize.
- When creating objects when the pool is empty you have to manage the size of the pool yourself.