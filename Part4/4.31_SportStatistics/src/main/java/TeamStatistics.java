package main.java;

class TeamStatistics {
    private String teamName;
    private int games;
    private int wins;
    private int losses;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.games = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public void updateStats(Match match) {
        if (match.involvesTeam(teamName)) {
            games++;
            if (match.didTeamWin(teamName)) {
                wins++;
            } else {
                losses++;
            }
        }
    }

    public void printStats() {
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
