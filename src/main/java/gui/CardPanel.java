package gui;

import Listeners.CardListener;
import model.Card;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CardPanel extends JLabel {
    private  Card card;
public int x;
public int y;
public GamePanel gamePanel;
private int cardSize;
    public CardPanel(Card card,int x,int y,int cardSize,GamePanel gamePanel) {
       this.card=card;
       this.gamePanel=gamePanel;
       this.cardSize=cardSize;
       this.x=x;
       this.y=y;
       init();
       addMouseListener(new CardListener(this));
        setBounds(x, y, cardSize, cardSize);
        setVisible(true);

    }



    public void init() {
            if (card.isFace()) {
                String name = card.getValueName() + "" + card.getSuitName();
                name = name.toLowerCase();
                System.out.println(name);
                setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//card//" + name + ".png"));
            } else {
                if (card.getValue() == 14) {
                    String name = card.getSuitName() + "1";
                    name = name.toLowerCase();
                    System.out.println(name);
                    setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//card//" + name + ".png"));

                } else {
                    String name = "" + card.getSuitName() + card.getValue();
                    name = name.toLowerCase();
                    System.out.println(name);
                    setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//card//" + name + ".png"));

                }
            }
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public void setGamePanel(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public int getCardSize() {
        return cardSize;
    }

    public void setCardSize(int cardSize) {
        this.cardSize = cardSize;
    }
}
