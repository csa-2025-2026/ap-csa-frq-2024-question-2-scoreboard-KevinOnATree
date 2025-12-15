/*

# Answer close reading 1 questions here
1. The 1st Team
2. The integer parameter in the RecordPlay method
3. when the integer paremter in RecordPlay is 0

# Answer close reading 2 questions here
1. String team1, String team2, int score1, int score2, String ActiveTeam
2. String team1, String tem2, int score1, int score2

*/

// Write the class below
public class Scoreboard {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean ActiveTeam;

    public Scoreboard(String t1, String t2) {
        team1 = t1;
        team2 = t2;
        score1 = 0;
        score2 = 0; 
        ActiveTeam = false;
    }
    public void recordPlay(int score) {
        if (score == 0) { ActiveTeam = !ActiveTeam; }
        if (ActiveTeam) { score2 += score; } 
        else { score1 += score; }
    } 
    public String getScore() {
        if (ActiveTeam) { return score1 + "-" + score2 + "-" + team2; } 
        else { return score1 + "-" + score2 + "-" + team1; }
    }
}