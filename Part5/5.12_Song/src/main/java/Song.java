
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compare) {
        // Check if both references point to the same object
        if (this == compare) {
            return true;
        }

        // Check if obj is an instance of Song
        if (!(compare instanceof Song)) {
            return false;
        }

        // Cast and compare fields
        Song other = (Song) compare;
        return this.artist.equals(other.artist) &&
                this.name.equals(other.name) &&
                this.durationInSeconds == other.durationInSeconds;
    }


    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
