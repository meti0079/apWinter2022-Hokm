package gui.dummygui;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.controller.GameController;
import model.card.Card;
import model.card.CardValueName;
import model.card.SuitName;

public class GamePanel extends JPanel {

    public GamePanel(GameController controller) {
        JButton button = new JButton("click here to play the very first card you have");
    
        this.add(new DummyButton(new Card(SuitName.CLUB, CardValueName.Ace), controller));
        this.add(new DummyButton(new Card(SuitName.HEART, CardValueName.Four), controller));
    }
}
