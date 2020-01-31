public class GameBoard {

    public void display(Game g) {
        // Erase the stuff at the old player and ball locations
        for(int go=0; go<g.getObjectCount(); go++) {
            if (g.getGameObjects()[go] instanceof MovableObject) {
                MovableObject m = (MovableObject) g.getGameObjects()[go];
                if ( /* m's previous location is in a valid range */ )
                /* Put a ' ' at m’s previous location in the grid */
            }
        }
        // Draw the game objects on the board now
        for(int go=0; go<g.getObjectCount(); go++) {
            if (g.getGameObjects()[go] instanceof Wall) {
                Wall w = (Wall) g.getGameObjects()[go];
                /* Display the appropriate characters along the wall */
            }else{
                if (/* obj's previous location is in a valid range */ )
                /* Display the appropriate character at obj’s location */
            }
        }
        // Now display it
        for (int r=0; r<HEIGHT; r++) {
            for (int c=0; c<WIDTH; c++)
                System.out.print(grid[r][c]);
            System.out.println();
        }
    }

}
