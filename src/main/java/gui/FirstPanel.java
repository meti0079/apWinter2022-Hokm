package gui;

import config.GlobalAssetPaths;
import config.PanelConfig;
import listeners.MyStartNewGameListener;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FirstPanel extends JPanel {
    private BufferedImage img;
    private PanelConfig panelConfig;
    private MainFrame mainFrame;

    public FirstPanel (MainFrame mainFrame){
        this.mainFrame=mainFrame;
        panelConfig = new PanelConfig("FIRSTPANEL_CONFIG_FILE");
        setPreferredSize(new Dimension(panelConfig.getWidth(),panelConfig.getHeight()));
        setSize(panelConfig.getWidth(),panelConfig.getHeight());
        setButton();
        repaint();
        revalidate();
    }

    private void setButton() {
        JButton start=new JButton("start new game");
        start.setSize(100,20);
        start.addActionListener(new MyStartNewGameListener(this,mainFrame ));
        add(start);
            JButton exit=new JButton("EXIT");
            exit.setSize(100,20);
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            add(exit);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            img=ImageIO.read(new File(GlobalAssetPaths.blackGoldenImagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

            g.drawImage(img,0,0,null);
        }
}
