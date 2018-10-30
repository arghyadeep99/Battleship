package sample;

import javax.swing.*;
import java.awt.*;

public class ShipPiece {
    boolean isPlayer1;
    private Image shipPieceAlive;
    private boolean shipIsDead;

    /*
     * Constructor that has a boolean to determine which player the ship piece
     * belongs to. false is player 2, true is player 1
     */
    public ShipPiece(boolean isPlayer1) {
        this.isPlayer1 = isPlayer1;
        // sets the image based on which player it belongs too
        if (isPlayer1)
            shipPieceAlive = new ImageIcon("/home/arghyadeep/IdeaProjects/Battleship/res/Player1.png").getImage();
        else
            shipPieceAlive = new ImageIcon("/home/arghyadeep/IdeaProjects/Battleship/res/Player2.png").getImage();
        shipIsDead = false;
    }

    /*
     * returns the ship piece's image
     */
    public Image getShipImage() {
        return shipPieceAlive;
    }

    /*
     * sets the image based on the file name
     */
    public void setShipImage(String file) {
        shipPieceAlive = new ImageIcon(file).getImage();

    }

    /*
     * Destroys the ship piece by setting shipIsDead to true and changing the
     * image to the damaged image for the player
     */
    public void destroy() {
        shipIsDead = true;
        if (isPlayer1) {
            setShipImage("/home/arghyadeep/IdeaProjects/Battleship/res/Player1Hit.png");
        } else {
            setShipImage("/home/arghyadeep/IdeaProjects/Battleship/res/Player2Hit.png");
        }
    }

    /*
     * Returns if the ship piece is destroyed
     */
    public boolean isDestroy() {
        return shipIsDead;
    }

}

