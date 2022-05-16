package gui;

import config.FrameConfig;
import gui.controller.GameController;
import listeners.KeyboardListener;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FrameConfig frameConfig;

    public MainFrame(GameController controller) {
        init();
        FirstPanel p = new FirstPanel(this, controller);
        add(p);
        setVisible(true);
        pack();
    }

    private void init() {
        addKeyListener(new KeyboardListener());
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

    public void update() {
        repaint();
        revalidate();
    }
}
