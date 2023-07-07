
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public String getArtist() {
        return this.artist;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getDurationInSeconds() {
        return this.durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        //Compare if it is the same object
        if (this != compared) {
            return true;
        }
        
        //Compare if instanceof
        if (!(compared instanceof Song)) {
            return false;
        }
        
        //Convert the object into type Song
        Song comparedSong = (Song) compared;
        
        //Compare attributes
        return this.artist.equals(comparedSong.getArtist()) && 
                this.name.equals(comparedSong.getName()) &&
                this.durationInSeconds == comparedSong.getDurationInSeconds();
    }
}
