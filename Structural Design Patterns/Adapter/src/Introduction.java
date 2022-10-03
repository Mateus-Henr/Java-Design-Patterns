/*
    Introduction

    What is Adapter (or Wrapper)?
    • Given an existing object that provides a functionality, say that you want to utilize this object,
      but you can't because it expects an object with different interface.
    • By using this design pattern we can adapt the object to the client's expected interface.


    UML (Roles)

    Class Adapter
    • Adaptee (concrete) - Implements the functionality which is need for the client.
    • Adapter (concrete) - It implements the interface that was being the problem and extends "Adaptee".
    • Client (concrete) - Needs functionality provided but as different interface than "Adaptee".
    • Target (interface) - Expected by "Client".

    Object Adapter (Preferable)
    • ObjectAdapter - Makes use of composition instead of inheritance (it takes place of "Adapter").
    • The rest is similar to Class Adapter.
 */

public class Introduction
{
}
