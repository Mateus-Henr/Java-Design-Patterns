package implementation;

import implementation.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator
{
    public Message getMessage()
    {
        Message msg = createMessage();

        // Additional operations.
        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    // Factory method.
    public abstract Message createMessage();

}
