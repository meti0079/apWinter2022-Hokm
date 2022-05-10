package gui;

import Listeners.MyStartNewGameListener;
import config.PanelConfig;

import javax.swing.*;
import java.awt.*;

public class FirstPanel extends JPanel {

   private PanelConfig panelConfig;



    public FirstPanel (){
        panelConfig=new PanelConfig("FIRSTPANEL_CONFIG_FILE");
        setPreferredSize(new Dimension(panelConfig.getWidth(),panelConfig.getHeight()));
        setSize(panelConfig.getWidth(),panelConfig.getHeight());
        setButton();
    }

    private void setButton() {
    JButton start=new JButton("start new game");
    start.setSize(100,20);
    start.addActionListener(new MyStartNewGameListener(this));
    add(start);









    }


}
