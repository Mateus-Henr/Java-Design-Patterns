package implementation;

import implementation.message.JSONMessage;
import implementation.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator
{
    @Override
    public Message createMessage()
    {
        return new JSONMessage();
    }

}
