
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<GameData> games = getGamesData(file);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        gamesPlayedByTeam(games, team);
        winsLossesByTeam(games, team);

    }
    
    public static ArrayList<GameData> getGamesData(String file) {
        ArrayList<GameData> data = new ArrayList();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                
                String[] array = row.split(",");
                
                String homeTeam = array[0];
                String awayTeam = array[1];
                int homePoints = Integer.valueOf(array[2]);
                int awayPoints = Integer.valueOf(array[3]);
                
                data.add(new GameData(homeTeam, awayTeam, homePoints, awayPoints));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        return data;
    }
    
    public static void gamesPlayedByTeam(ArrayList<GameData> games, String teamName) {
        int count = 0;
        
        for (GameData game : games) {
            if (game.getHomeTeam().equals(teamName) || game.getAwayTeam().equals(teamName)) {
                count++;
            }
        }
        
        System.out.println("Games: " + count);
    }
    
    public static void winsLossesByTeam(ArrayList<GameData> games, String teamName) {
        int wins = 0;
        int losses = 0;
        
        for (GameData game : games) {
            if (game.getHomeTeam().equals(teamName) || game.getAwayTeam().equals(teamName)) {
                if (game.getWinner().equals(teamName)) {
                    wins++;
                    continue;
                }
                losses++;
            }
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
