package creational.factory_method;

import creational.factory_method.message.Message;
import creational.factory_method.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
