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
    private int turn;
    private SuitName hokme;
    private SuitName tableCard;
    private static GameState gameState;



    private GameState(){
        played=new ArrayList<>();
        onTable=new ArrayList<>();
        cardList=new CardList();
        teams=new ArrayList<>();
    }

    public static GameState getInstance(){
        if (gameState==null)gameState=new GameState();
        return gameState;

    }

    public SuitName getTableCard() {
        return tableCard;
    }

    public void setTableCard(SuitName tableCard) {
        this.tableCard = tableCard;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public int getOppScore() {
        return oppScore;
    }

    public void setOppScore(int oppScore) {
        this.oppScore = oppScore;
    }

    public ArrayList<Card> getPlayed() {
        return played;
    }

    public void setPlayed(ArrayList<Card> played) {
        this.played = played;
    }

    public ArrayList<Card> getOnTable() {
        return onTable;
    }

    public void setOnTable(ArrayList<Card> onTable) {
        this.onTable = onTable;
    }

    public CardList getCardList() {
        return cardList;
    }

    public void setCardList(CardList cardList) {
        this.cardList = cardList;
    }

    public SuitName getHokme() {
        return hokme;
    }

    public void setHokme(SuitName hokme) {
        this.hokme = hokme;
    }

    public static GameState getGameState() {
        return gameState;
    }

    public static void setGameState(GameState gameState) {
        GameState.gameState = gameState;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
