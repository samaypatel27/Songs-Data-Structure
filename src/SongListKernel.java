import components.standard.Standard;

public interface SongListKernel extends Standard<SongList> {

    public record Song(String artist, String title, String album) {

    }

    /**
     * @param s
     *            Song s to be added to the front of SongList
     * @updates q
     * @ensures <pre>
     * Song is added to the back of the SongList
     * </pre>
     */
    void addSong(Song s);

    /**
     * @updates q
     * @return Song removed from the SongList
     * @ensures <pre>
     * Song at the front is removed from the SongList
     * </pre>
     */
    Song removeSong();

    /**
     * @return SongList length in integer format
     * @ensures <pre>
     * Songlist does not violate =/
     * </pre>
     */
    int length();

}