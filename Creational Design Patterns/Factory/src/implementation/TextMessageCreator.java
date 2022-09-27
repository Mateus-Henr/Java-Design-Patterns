package implementation;

import implementation.message.Message;
import implementation.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator
{
    @Override
    public Message createMessage()
    {
        return new TextMessage();
    }

}
