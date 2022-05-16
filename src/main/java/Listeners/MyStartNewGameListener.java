package listeners;

import gui.FirstPanel;
import gui.GamePanel;
import gui.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStartNewGameListener implements ActionListener {
    FirstPanel panel;
    MainFrame mainFrame;
    public MyStartNewGameListener(FirstPanel firstPanel, MainFrame mainFrame) {
        panel=firstPanel;
        this.mainFrame=mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GamePanel p=new GamePanel(mainFrame);
        mainFrame.setContentPane(p);
        mainFrame.update();
//        panel.getRootPane().setContentPane(p);
    }
}
