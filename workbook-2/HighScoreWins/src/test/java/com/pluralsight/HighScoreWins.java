package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a game score in this format: Home:Visitor|21:9");
        String finalScore = scanner.nextLine();

        //Split finalScore. We'll call this 'first split'
        String[] split = finalScore.split(Pattern.quote("|"));

        //Create variables for index 0 & 1
        String game = split[0];
        String score = split[1];

        //Split index 0 from our first split
        String[] home_awayTeam = game.split(Pattern.quote(":"));
        String homeTeam = home_awayTeam[0];
        String awayTeam = home_awayTeam[1];

        //Split index 1 from our first split
        String[] home_awayScore = score.split(Pattern.quote(":"));
        String homeScore1 = home_awayScore[0];
        String awayScore1 = home_awayScore[1];

        //Display 'home_away' winner based off of 'home_awayScore'
        //But first we need to convert our String to int
        int homeScore2 = Integer.parseInt(home_awayScore[0]);
        int awayScore2 = Integer.parseInt(home_awayScore[1]);

        //Now we can display.
        if (homeScore2 > awayScore2) {
            System.out.println("Winner: " + homeTeam);
        } else if (awayScore2 > homeScore2) {
            System.out.println("Winner: " + awayTeam);
        }
    }
}

//User input score in following format Home:Visitor|21:9
//Determine which team had the higher score and display the name of the winning team
//Split the text once on the pipe ( | )
//Split the text one on the colon ( : )

/* Have it display like this:
    Please enter a game score: (User input) Home:Visitor:21:9
    Winner: Home     */
