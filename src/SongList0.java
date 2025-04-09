
import components.queue.Queue;
import components.queue.Queue1L;

/**
 * {@code Set} represented as a {@code BinaryTree} (maintained as a binary
 * search tree) of elements with implementations of primary methods.
 */
public class SongList0 {

    public record Song(String artist, String title, String album) {

    }

    /**
     * Private members --------------------------------------------------------
     */
    private String artist;
    private String title;
    private String album;

    /**
     * Elements to store in playlist
     */

    private Queue<Song> playlist;

    /**
     * Kernel methods
     */

    public void addSong() {
        this.playlist.enqueue(new Song(this.artist, this.title, this.album));
    }

    public Song removeSong() {
        return this.playlist.dequeue();
    }

    public int length() {
        return this.playlist.length();
    }

    /**
     * Secondary methods
     */

    public Song skip() {
        this.playlist.rotate(1);
        return this.playlist.front();
    }

    public void shuffle() {
        Queue<Song> left = new Queue1L();
        Queue<Song> right = new Queue1L();
        int partition = this.playlist.length() / 2;
        int counter = 0;

        while (counter < partition) {
            left.enqueue(this.playlist.dequeue());
        }
        while (partition < this.playlist.length()) {
            right.enqueue(this.playlist.dequeue());
        }
        rotate(this.playlist, left, right);

    }

    private static void rotate(Queue<Song> q, Queue<Song> left,
            Queue<Song> right) {
        int leftRotations = (int) (Math.random() * (left.length())) + 1;
        int rightRotations = (int) (Math.random() * (left.length())) + 1;
        left.rotate(leftRotations);
        right.rotate(rightRotations);

    }

    public static void main(String[] args) {
        Song x = new Song("Sabrina Carpenter", "Espresso", "???");
        System.out.println(x);

    }
}
