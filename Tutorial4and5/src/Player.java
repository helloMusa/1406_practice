import java.awt.Color;
public class Player extends MovableObject {
    private String		name;
    private Color       color;
    private boolean 	hasBall;
    private int	 		score;

    public Player(String n, Color c, Point2D loc, int dir) {
        super(dir, 0, loc);
        name = n;
        color = c;
        hasBall = false;
        score = 0;
    }

    // The get/set methods
    public String getName() { return name; }
    public Color getColor() { return color; }
    public boolean hasBall() { return hasBall; }
    public int getScore() { return score; }
    public void setHasBall(boolean newHasBall) { hasBall = newHasBall; }
    public void setScore(int newScore) { score = newScore; }

//    public void draw() {
//        System.out.println("Player is at " + getLocation() + " facing " + getDirection() +
//                " degrees and moving at " + getSpeed() + " pixels per second");
//    }

    public char appearance() {
        return 'P';
    }

    public String toString() {
        String  s =  "Player" + " " + name + super.toString();
        if (hasBall)
            s += " with the ball";
        return s;
    }
}