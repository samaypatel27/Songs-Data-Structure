import components.queue.Queue;
import components.queue.Queue1L;

public abstract class SongListSecondary implements SongList {

    /**
     * Secondary methods
     */

    @Override
    public Song playFirst() {
        Song s = this.removeSong();
        for (int i = 0; i < this.length(); i++) {
            this.addSong(s);
            this.removeSong();
        }
        return s;
    }

    @Override
    public void skip() {
        Song s = this.removeSong();
        this.addSong(s);
    }

    @Override
    public void shuffle() {
        Queue<Song> left = new Queue1L();
        Queue<Song> right = new Queue1L();
        int partition = this.length() / 2;
        int counter = 0;

        while (counter < partition) {
            left.enqueue(this.removeSong());
        }
        while (partition < this.length()) {
            right.enqueue(this.removeSong());
        }
        rotate(left, right);

    }

    private static void rotate(Queue<Song> left, Queue<Song> right) {
        int leftRotations = (int) (Math.random() * (left.length())) + 1;
        int rightRotations = (int) (Math.random() * (left.length())) + 1;
        left.rotate(leftRotations);
        right.rotate(rightRotations);

    }

}
