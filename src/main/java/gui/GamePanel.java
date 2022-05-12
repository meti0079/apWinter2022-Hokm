package gui;

import config.PanelConfig;
import game.GameState;
import model.Card;
import model.SuitName;
import model.ValueName;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GamePanel extends JPanel {
    MainFrame mainFrame;
    PanelConfig panelConfig;
    JLabel[] onTable = new JLabel[4];
    JLabel hokm;
    public GamePanel(MainFrame mainFrame) {

        this.mainFrame = mainFrame;
        panelConfig = new PanelConfig("FIRSTPANEL_CONFIG_FILE");
        setPreferredSize(new Dimension(panelConfig.getWidth(), panelConfig.getHeight()));
        setSize(panelConfig.getWidth(), panelConfig.getHeight());
        setLayout(null);
        repaint();
        revalidate();

        JButton exit = new JButton("EXIT");
        exit.setSize(100, 20);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        add(exit);
        setPlayerHands();
        setBotHands(1);
        setBotHands(2);
        setBotHands(3);
        setOnTable(new Card(SuitName.Club, ValueName.Four), 0);
        setOnTable(new Card(SuitName.Spade, ValueName.Ace), 1);
        setOnTable(new Card(SuitName.Diamond, ValueName.Ace), 2);
        setOnTable(new Card(SuitName.Heart, ValueName.Ace), 3);
        setHokme("spade");
        repaint();
        revalidate();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            g.drawImage(ImageIO.read(new File(System.getProperty("user.dir") + "//src//main//resources//background.jpg")), 0, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void setHokme(String name){
if (hokm!=null) remove(hokm);
    hokm = new JLabel();
    hokm.repaint();
    hokm.setBounds(250, 140, 500,500);
    hokm.setVisible(true);
    hokm.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//"+name+".png"));
    add(hokm);
}
    public void setOnTable(Card onTable, int turn) {
        String name = "";
        if (onTable.isFace()) {
            name = onTable.getValueName() + "" + onTable.getSuitName();
            name = name.toLowerCase();
        } else {
            if (onTable.getValue() == 14) {
                name = onTable.getSuitName() + "1";
                name = name.toLowerCase();
            } else {
                name = "" + onTable.getSuitName() + onTable.getValue();
                name = name.toLowerCase();
            }
        }
        if (turn == 1) {
            JLabel jLabel = new JLabel();
            jLabel.repaint();
            jLabel.setBounds(550, 300, panelConfig.getCardSize(), panelConfig.getCardSize());
            jLabel.setVisible(true);
            jLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//card//"+name+".png"));
            add(jLabel);
            this.onTable[turn] = jLabel;
        } else if (turn == 2) {
            JLabel jLabel = new JLabel();
            jLabel.setBounds(450, 200, panelConfig.getCardSize(), panelConfig.getCardSize());
            jLabel.setVisible(true);
            jLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//card//"+name+".png"));
            add(jLabel);
            this.onTable[turn] = jLabel;


        } else if (turn == 3) {
            JLabel jLabel = new JLabel();
            jLabel.setBounds(350, 300, panelConfig.getCardSize(), panelConfig.getCardSize());
            jLabel.setVisible(true);
            jLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//card//"+name+".png"));
            add(jLabel);
            this.onTable[turn] = jLabel;

        } else {
            JLabel jLabel = new JLabel();
            jLabel.setBounds(450, 400, panelConfig.getCardSize(), panelConfig.getCardSize());
            jLabel.setVisible(true);
            jLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//card//"+name+".png"));
            add(jLabel);
            this.onTable[turn] = jLabel;

        }


    }

    public void setPlayerHands() {
        ArrayList<Card> hand = GameState.getInstance().getTeams().get(0).getTeamPlayer().get(0).getHand();
        int base = panelConfig.getWidth() - ((hand.size() + 1) * 50);
        base = base / 2;
        base = 900 - base;
        for (Card card : GameState.getInstance().getTeams().get(0).getTeamPlayer().get(0).getHand()) {
            CardPanel cardLable = new CardPanel(card, base, 650, panelConfig.getCardSize(),this);
            add(cardLable);
            base -= 50;
        }
    }

    public void setBotHands(int turn) {
        if (turn == 1) {
            int base = panelConfig.getHeight() - (GameState.getInstance().getTeams().get(0).getTeamPlayer().get(1).getHand().size()) * 30 - 70;

            base = base / 2;
            for (int i = 0; i < GameState.getInstance().getTeams().get(1).getTeamPlayer().get(0).getHand().size(); i++) {
                JLabel jLabel = new JLabel();
                jLabel.setBounds(panelConfig.getWidth() - 130, base, panelConfig.getCardSize(), panelConfig.getCardSize());
                jLabel.setVisible(true);
                jLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//back_H.jpg"));
                base += 30;
                add(jLabel);
            }
        } else if (turn == 2) {
            int base = panelConfig.getWidth() - (GameState.getInstance().getTeams().get(0).getTeamPlayer().get(1).getHand().size()) * 30 - 70;
            base = base / 2;
            for (int i = 0; i < GameState.getInstance().getTeams().get(0).getTeamPlayer().get(1).getHand().size(); i++) {
                JLabel jLabel = new JLabel();
                jLabel.setBounds(base, 30, panelConfig.getCardSize(), panelConfig.getCardSize());
                jLabel.setVisible(true);
                jLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//back.jpg"));
                base += 30;
                add(jLabel);
            }
        } else if (turn == 3) {
            int base = panelConfig.getHeight() - (GameState.getInstance().getTeams().get(0).getTeamPlayer().get(1).getHand().size()) * 30 - 70;
            base = base / 2;

            for (int i = 0; i < GameState.getInstance().getTeams().get(1).getTeamPlayer().get(1).getHand().size(); i++) {
                JLabel jLabel = new JLabel();
                jLabel.setBounds(30, base, panelConfig.getCardSize(), panelConfig.getCardSize());
                jLabel.setVisible(true);
                jLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "//src//main//resources//back_H.jpg"));
                base += 30;
                add(jLabel);
            }
        }
    }
public void removeTable(){
        for (int i=0;i<4;i++){
            remove(onTable[i]);
        }
}
    public void update() {
        removeAll();

        setPlayerHands();
        repaint();
        revalidate();
    }
}
