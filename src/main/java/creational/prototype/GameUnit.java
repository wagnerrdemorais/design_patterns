package creational.prototype;

/**
 * Represents an abstract prototype and defines the clone method.
 */
public abstract class GameUnit implements Cloneable {

    Position position;

    public GameUnit() {
        position = new Position(0, 0);
    }

    public GameUnit(float x, float y) {
        position = new Position(x, y);
    }

    public void moveX(float distance) {
        position = new Position(position.getX() + distance, position.getY());
    }

    public void moveY(float distance) {
        position = new Position(position.getX(), position.getY() + distance);
    }

    public Position getPosition() {
        return position;
    }

    // shallow copy
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit clone = (GameUnit) super.clone();
        clone.initialize();
        return clone;
    }

    // reset the state of the object
    protected void initialize() {
        this.position = new Position();
        reset();
    }

    protected abstract void reset();
}
