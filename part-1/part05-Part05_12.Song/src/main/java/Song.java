public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        // check if the compared object is the same reference
        if (this == compared) {
            return true;
        }

        // check that the compared object is a Song
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Song
        Song comparedSong = (Song) compared;

        // check if attributes are equal
        return this.artist.equals(comparedSong.artist)
                && this.name.equals(comparedSong.name)
                && this.durationInSeconds == comparedSong.durationInSeconds;
    }
}
