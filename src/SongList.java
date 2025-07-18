public interface SongList extends SongListKernel {

    /**
     * @updates q
     * @return first Song at the front of the list
     * @ensures <pre>
     * Song at the front is moved to the back of the SongList
     * </pre>
     */
    Song playFirst();

    /**
     * @updates q
     * @return Song at the front of the playlist
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
    void shuffle();

}