package Listeners;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){

            case  KeyEvent.VK_E:
                System.out.println("exit");
                break;


        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
