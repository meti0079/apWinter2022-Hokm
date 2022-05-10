package game;

import model.*;

import java.util.ArrayList;

public class GameState {

    private ArrayList <Team> teams;

    private int teamScore;
    private int oppScore;


    private ArrayList<Card> played;
    private ArrayList<Card> onTable;
    private CardList cardList;

    private SuitName hokme;

    private static GameState gameState;

    private GameState(){}

    public static GameState getInstance(){
        if (gameState==null)gameState=new GameState();
        return gameState;
    }









}
