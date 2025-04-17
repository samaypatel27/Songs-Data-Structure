import components.queue.Queue;
import components.queue.Queue1L;

public abstract class SongListSecondary implements SongList {

    /**
     * Secondary methods
     */

    @Override
    public Song playFirst() {
        if (this.length() > 0) {
            Song s = this.removeSong();
            for (int i = 0; i < this.length(); i++) {
                this.addSong(s);
                this.removeSong();
            }
            return s;
        }
        return new SongListKernel.Song("None", "None", "None");

    }

    @Override
    public Song skip() {
        Song s = this.removeSong();
        this.addSong(s);
        return s;
    }

    @Override
    public void shuffle() {
        Queue<Song> temp = new Queue1L<>();
        while (this.length() > 0) {
            temp.enqueue(this.removeSong());
        }
        while (temp.length() > 0) {
            int randIndex = (int) (Math.random() * temp.length());
            for (int i = 0; i < randIndex; i++) {
                temp.enqueue(temp.dequeue());
            }
            this.addSong(temp.dequeue());
        }
    }

    @Override
    public String toString() {
        return this.playFirst().toString();
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o) {
            SongList s = (SongList) o;
            if (this.length() == s.length()) {
                result = true;
                for (int i = 0; i < this.length(); i++) {
                    if (!(this.playFirst().equals(this.playFirst()))) {
                        return false;
                    }
                }
            }
        }
        return result;
    }
}
