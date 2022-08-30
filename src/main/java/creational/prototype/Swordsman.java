package creational.prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "position=" + position +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }
}
