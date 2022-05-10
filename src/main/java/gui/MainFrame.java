package gui;

import Listeners.Keyboard;
import config.FrameConfig;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
private FrameConfig frameConfig;
public  MainFrame(){
    addKeyListener(new Keyboard());
    FirstPanel p= new FirstPanel();
    add(p);
    setVisible(true);
    frameInit();
    pack();
}

    @Override
    protected void frameInit() {
    frameConfig= new FrameConfig("FRAME_CONFIG_FILE");
    configFrame();
   setLocationRelativeTo(null);


    }

    private void configFrame() {
        setPreferredSize(new Dimension(frameConfig.getWidth(),frameConfig.getHeight()));
        setDefaultCloseOperation(3);
        setResizable(frameConfig.isResizable());
    }
}
