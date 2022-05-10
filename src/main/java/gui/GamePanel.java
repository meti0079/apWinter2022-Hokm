package gui;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Drawer d =new Drawer((Graphics2D)g);
        d.update();
    }
}
