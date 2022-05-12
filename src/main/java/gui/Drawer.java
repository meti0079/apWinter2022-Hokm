package gui;

import game.GameState;

import java.awt.*;

public class Drawer {
    private Graphics2D graphics2D;
    public Drawer (Graphics2D graphics2D){
        this.graphics2D=graphics2D;
    }
    public void update(){
        GameState gameState=GameState.getInstance();


    }

    private void drawOtherCard(){
        //TODO
    }
    private void drawHakem(){
        //TODO
    }
    private void drawHokm(){
        //TODO
    }
    private void drawTeam1Get(){
        //TODO
    }
    private void drawTeam2Get(){
        //TODO
    }

}
