package creational.factory_method;

import creational.factory_method.message.Message;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The factory method pattern is used when we want to delegate the object instantiation to subclasses:
 *      - Example: A product inheritance hierarchy and the possibility of future additions to its hierarchy.
 * <p>
 * The creator can be a concrete class and provide a default implementation for the factory method.
 * <p>
 * We can accept some criteria in the factory method to change the creation logic.
 * <p>
 * An example of factory method in Java can be found in the java.util.Collection,or (AbstractCollection has an abstract method called iterator()
 * which is an example of factory method)
 */
public class Client {

    public static void main(String[] args) {

        JSONMessageCreator jsonMessageCreator = new JSONMessageCreator();
        TextMessageCreator textMessageCreator = new TextMessageCreator();

        printMessage(jsonMessageCreator);
        printMessage(textMessageCreator);

        AbstractCollection<Message> abstractCollection = new ArrayList<>();
        abstractCollection.add(jsonMessageCreator.getMessage());
        abstractCollection.add(textMessageCreator.getMessage());

        //Here the iterator is the factory method that is going to create the concrete iterator based on the implementation.
        Iterator<Message> iterator = abstractCollection.iterator();

        System.out.println("\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getContent());
        }
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
