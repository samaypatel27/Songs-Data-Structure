public interface SongList extends SongListKernel {

    /**
     * @updates q
     * @return new Song that is at the front of the SongList, after rotation
     * @ensures <pre>
     * Song at the front is moved to the back of the SongList
     * </pre>
     */
    Song skip();

    /**
     * @updates q
     * @ensures <pre>
     * Songs within the SongList are shuffled in a random order
     * </pre>
     */
    void Shuffle();

    /**
     * @param artist
     *            The artist of the Song
     * @param title
     *            The title of the Song
     * @requries Song of artist and title to exist
     * @ensures <pre>
     * API call using another service returns the lyrics to the Song specificed in String format
     * </pre>
     */
    String getLyrics(String artist, String title);

}