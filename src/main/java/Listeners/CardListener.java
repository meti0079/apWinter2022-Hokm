package listeners;

import game.GameState;
import game.Mapper;
import gui.CardPanel;
import gui.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardListener implements MouseListener {
    CardPanel cardPanel;
    public CardListener(CardPanel cardPanel){
        this.cardPanel=cardPanel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (GameState.getInstance().getTurn()==0){
            if ( GameState.getInstance().getTableCard()==cardPanel.getCard().getSuitName() ){
                Mapper.getInstance().clickCard(cardPanel.getCard(),0);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        cardPanel.setBounds(cardPanel.x,cardPanel.y,100,100);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        cardPanel.setBounds(cardPanel.x,cardPanel.y-70,100,100);
        cardPanel.gamePanel.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        cardPanel.setBounds(cardPanel.x,cardPanel.y,100,100);
        cardPanel.gamePanel.repaint();
    }
}
