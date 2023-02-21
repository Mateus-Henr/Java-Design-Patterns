## Introduction

### What is Adapter (or Wrapper)?
  - Given an existing object that provides a functionality, say that you want to utilize this object,
      but you can't because it expects an object with different interface.
  - By using this design pattern we can adapt the object to the client's expected interface.


## UML (Roles)
### Class Adapter
  - Adaptee (concrete) - Implements the functionality which is need for the client.
  - Adapter (concrete) - It implements the interface that was being the problem and extends "Adaptee".
  - Client (concrete) - Needs functionality provided but as different interface than "Adaptee".
  - Target (interface) - Expected by "Client".

### Object Adapter (Preferable)
  - ObjectAdapter - Makes use of composition instead of inheritance (it takes place of "Adapter").
  - The rest is similar to Class Adapter.

## Implementation Steps

  - Firstly we create a class for Adapter, and it must implement the interface expected by client.
  - When using a Class Adapter, we extend from our existing class, and we forward the method to another
      method inherited from adaptee.
  - In the case of Object Adapter, we implement the target interface and accept adaptee as constructor
      argument in adapter by using composition.
  - An object adapter should take adapter as an argument in constructor or a less preferred or a less
      preferred solution, you can instantiate it in the constructor this tightly coupling with a specific
      adaptee.
