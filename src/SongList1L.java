import components.queue.Queue;

/**
 * {@code {SongList} represented as a {@code Queue} with implementations of
 * primary methods.
 *
 * @convention <pre>
* [all components of SongList all real songs with name, artist, and album]
* </pre>
 * 
 * @correspondence <pre>
* this = [if $this.playlist = "" then playlist is empty, and length is 0]
* </pre>
 *
 * @author Arihant Aneja, Samay Patel
 *
 */
public class SongList1L extends SongListSecondary {

    /*
     * private fields
     */
    private Queue<Song> playlist;

    @Override
    public void addSong(Song s) {
        this.playlist.enqueue(s);
    }

    @Override
    public SongListKernel.Song removeSong() {
        return this.playlist.dequeue();
    }

    @Override
    public int length() {
        return this.playlist.length();
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.playlist.length(); i++) {
            this.playlist.dequeue();
        }
    }

    @Override
    public SongList newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public void transferFrom(SongList s) {
        SongList1L localSource = (SongList1L) s;
        this.playlist = localSource.playlist;
    }
}
