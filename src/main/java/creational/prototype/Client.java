package creational.prototype;

/**
 * There are two ways to implement prototype, with shallow or deep copy,
 * While copying, if there are immutable objects as part of the object state, then shallow copy can be use,
 * however, when there are mutable objects as part of the state of the object, then the deep copy might be used.
 *
 * Shallow copies duplicate as little as possible, for example, a shallow copy of a collection is a copy of the
 * collection structure, not the elements, with shallow copy, two collections share the individual elements.
 *
 * Deep copies duplicate everything. A deep copy of a collection is tro collections with all the elements in the original
 * collection duplicated.
 *
 * <p>
 * its a good practice to reset the mutable state to allow the subclasses to initialize themselves.
 * <p>
 * The clone method is protected in Object class and must be overridden to be callable outside the class.
 *
 * Cloneable is a "marker" interface indicating that the class is cloneable.
 *
 * Prototypes are useful when there are large objects where the majority of states is unchanged between instances
 * and the states are easily identifiable.
 *
 * A prototype registry is a class where in you can register various prototypes witch other code can access to clone out
 * instances. This solves the issue of getting access to initial instance.
 *
 * The Object.clone() is an example of prototype. The default clone operation will only perform the shallow copy,
 * if a deep copy is needed, tou must implement it.
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman1 = new Swordsman();
        swordsman1.moveX(10);
        swordsman1.attack();

        System.out.println(swordsman1);

        Swordsman swordsman2 = (Swordsman) swordsman1.clone();
        System.out.println(swordsman2);
        System.out.println(swordsman1);
        swordsman2.moveY(20);
        System.out.println(swordsman2);

    }
}
