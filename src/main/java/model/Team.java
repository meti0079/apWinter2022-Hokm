package model;

import java.util.ArrayList;

public class Team {

    private int point;
    private int teamNumber;
    private int score;
    private ArrayList<Player> teamPlayer;


    public Team(Player player1,Player player2){

        teamPlayer= new ArrayList<>();
        teamPlayer.add(player1);
        teamPlayer.add(player2);
    }



    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Player> getTeamPlayer() {
        return teamPlayer;
    }

    public void setTeamPlayer(ArrayList<Player> teamPlayer) {
        this.teamPlayer = teamPlayer;
    }
}
