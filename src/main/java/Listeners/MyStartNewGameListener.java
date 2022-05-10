package Listeners;

import gui.FirstPanel;
import gui.GamePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStartNewGameListener implements ActionListener {
    FirstPanel panel;

    public MyStartNewGameListener(FirstPanel firstPanel) {
        panel=firstPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GamePanel p=new GamePanel();
        panel.getRootPane().setContentPane(p);
    }
}
