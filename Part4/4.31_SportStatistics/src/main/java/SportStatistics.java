package main.java;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        List<Match> matches = readMatchesFromFile(fileName);

        TeamStatistics stats = new TeamStatistics(teamName);
        for (Match match : matches) {
            stats.updateStats(match);
        }

        stats.printStats();
    }

    public static List<Match> readMatchesFromFile(String fileName) {
        List<Match> matches = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int awayPoints = Integer.parseInt(parts[3]);

                matches.add(new Match(homeTeam, awayTeam, homePoints, awayPoints));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return matches;
    }
}

