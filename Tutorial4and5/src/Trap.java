public class Trap extends StationaryObject implements Harmful {

    public Trap(Point2D loc) {
        super(loc);
    }

    public int getDamageAmount() {
        return -50;
    }

    public char appearance() {
        return '@';
    }

    public String toString() {
        return "Trap" + super.toString();
    }
}