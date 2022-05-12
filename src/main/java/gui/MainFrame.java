package gui;

import Listeners.Keyboard;
import config.FrameConfig;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
private FrameConfig frameConfig;
public  MainFrame(){
    addKeyListener(new Keyboard());
    init();
    FirstPanel p= new FirstPanel(this);
    add(p);
    setVisible(true);

    pack();
}

  private void  init() {
    frameConfig= new FrameConfig("FRAME_CONFIG_FILE");
    configFrame();
    setLocationRelativeTo(null);
    setLocation(0,0);

    }

    private void configFrame() {
        setPreferredSize(new Dimension(frameConfig.getWidth(),frameConfig.getHeight()));
        setDefaultCloseOperation(3);
        setResizable(frameConfig.isResizable());
    }
    public void update(){
    repaint();
    revalidate();
    }

}
