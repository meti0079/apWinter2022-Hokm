package gui.dummygui;

import javax.swing.JFrame;

import game.Game;
import gui.controller.GameController;

public class GameFrame extends JFrame {
    public GameFrame(GameController controller) {
        super();
        this.add(new GamePanel(controller));
        this.setSize(new java.awt.Dimension(400,300));
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Game game = new Game();
        GameController controller = game.getController();
        new GameFrame(controller);
        
        game.run();
    }
}
