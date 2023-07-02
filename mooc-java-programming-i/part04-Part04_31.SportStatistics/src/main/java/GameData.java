/**
 *
 * @author facu
 */
public class GameData {
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;
    private String winner;
    
    GameData(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
        
        if (this.homePoints > this.awayPoints) {
            this.winner = this.homeTeam;
        } else {
            this.winner = this.awayTeam;
        }
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam() {
        return this.awayTeam;
    }
    
    public String getWinner() {
        return this.winner;
    }
}
