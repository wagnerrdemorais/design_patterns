package creational.factory_method;

import creational.factory_method.message.JSONMessage;
import creational.factory_method.message.Message;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
