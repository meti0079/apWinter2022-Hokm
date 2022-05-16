package gui.dummygui;

import javax.swing.JButton;

import gui.controller.GameController;
import model.card.Card;

import java.awt.event.MouseAdapter;

public class DummyButton extends JButton {

    public DummyButton(Card card, GameController controller) {
        this.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    controller.play(card);
                };
            }
        );

        this.setText(card.getValueName().toString() + " of " + card.getSuitName());
    }
}
