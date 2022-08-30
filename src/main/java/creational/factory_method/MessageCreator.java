package creational.factory_method;

import creational.factory_method.message.Message;

/**
 * Abstract "creator", the abstract method has to be implemented by its subclasses
 */
public abstract class MessageCreator {

    /**
     * Abstract creator typically perform some additional processing on the object that is returned by its subclasses.
     *
     * @return Message
     */
    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    public abstract Message createMessage();
}
