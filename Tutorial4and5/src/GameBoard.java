public class GameBoard {
    private final int HEIGHT = 15;
    private final int WIDTH = 20;
    private char[][] grid = new char[WIDTH][HEIGHT];

    public void display(Game g) {
        // Erase the stuff at the old player and ball locations
        for(int i=0; i<g.getObjectCount(); i++) {
            if (g.getGameObjects()[i] instanceof MovableObject) {
                MovableObject m = (MovableObject) g.getGameObjects()[i];
                Point2D prevLocation = m.getPreviousLocation();
                int prevLocationX = (int) prevLocation.getX();
                int prevLocationY = (int) prevLocation.getY();
                if (prevLocationX < 15 && prevLocationY < 20) {
                    grid[prevLocationX][prevLocationY] = ' ';
                }
                }
        }
        // Draw the game objects on the board now
        for(int i=0; i<g.getObjectCount(); i++) {
            if (g.getGameObjects()[i] instanceof Wall) {
                Wall w = (Wall) g.getGameObjects()[i];
                /* Display the appropriate characters along the wall */
                Point2D location = w.getLocation();
                int locationX = (int) location.getX();
                int locationY = HEIGHT - (int) location.getY();
                w.setLocation(new Point2D(locationX, locationY));
                location = w.getLocation();
                locationX = (int) location.getX();
                locationY = (int) location.getY() -1;
                int width = w.getWidth();
                int height = w.getHeight();
                boolean isHorizontal = height == 1;
                System.out.println(location);
                System.out.println("width : " + width);
                System.out.println("height : " + height);
                if (isHorizontal) {
                    System.out.println("horizontal");
                    for (int j = locationX; j < width; j++) {
                        System.out.println(j + " " + locationY);
                        grid[j][locationY] = w.appearance();
                    }
                } else {
                    System.out.println("vertical");
                        for (int k = locationY; k > 15 - height; k--) {
                            System.out.println(locationX + " " + k);
                            grid[locationX][k] = w.appearance();
                    }
                }
            }else{
                
            }
//                if (/* obj's previous location is in a valid range */ )
//                /* Display the appropriate character at obj’s location */
//            }
        }
        // Now display it
        for (int r=0; r<WIDTH; r++) {
            for (int c=0; c<HEIGHT; c++)
                System.out.print(grid[r][c]);
            System.out.println();
        }
    }
    }


