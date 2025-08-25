package main.java;

class Match {
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;

    public Match(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }

    public boolean involvesTeam(String team) {
        return homeTeam.equals(team) || awayTeam.equals(team);
    }

    public boolean didTeamWin(String team) {
        if (homeTeam.equals(team)) {
            return homePoints > awayPoints;
        } else if (awayTeam.equals(team)) {
            return awayPoints > homePoints;
        }
        return false;
    }
}