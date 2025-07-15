import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SongListTest {

    @Test
    public void testConstructorEmpty() {
        SongList s = new SongList1L();
        assertEquals(s.length(), 0);
    }

    @Test
    public void testConstructorNonEmpty() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        s.addSong(new SongListKernel.Song("Brent Faiyaz", "Loose Change",
                "Wasteland"));
        s.addSong(new SongListKernel.Song("SZA", "Snooze", "SOS"));
        assertEquals(s.length(), 3);
    }

    @Test
    public void testAddEmpty() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        SongListKernel.Song song = new SongListKernel.Song("Drake",
                "Fair Trade", "Certified Lover Boy");
        assertEquals(s.removeSong(), song);
    }

    @Test
    public void testAddMany() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        s.addSong(new SongListKernel.Song("Brent Faiyaz", "Loose Change",
                "Wasteland"));
        SongListKernel.Song song = new SongListKernel.Song("Drake",
                "Fair Trade", "Certified Lover Boy");
        assertEquals(s.removeSong(), song);
    }

    @Test
    public void testRemoveEmpty() {
        SongList s = new SongList1L();
        SongListKernel.Song removedSong = s.removeSong();
        assertEquals(s.length(), 0);
        assertNull(removedSong);
    }

    @Test
    public void testRemoveMany() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        s.addSong(new SongListKernel.Song("Brent Faiyaz", "Loose Change",
                "Wasteland"));
        s.addSong(new SongListKernel.Song("SZA", "Snooze", "SOS"));

        SongListKernel.Song drakeSong = new SongListKernel.Song("Drake",
                "Fair Trade", "Certified Lover Boy");
        assertEquals(s.removeSong(), drakeSong);

        SongListKernel.Song brentSong = new SongListKernel.Song("Brent Faiyaz",
                "Loose Change", "Wasteland");
        assertEquals(s.removeSong(), brentSong);

        SongListKernel.Song szaSong = new SongListKernel.Song("SZA", "Snooze",
                "SOS");
        assertEquals(s.removeSong(), szaSong);
    }

    @Test
    public void testPlayFirstEmpty() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        SongListKernel.Song song = new SongListKernel.Song("Drake",
                "Fair Trade", "Certified Lover Boy");
        assertEquals(s.playFirst(), song);
    }

    @Test
    public void testPlayFirstMany() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        s.addSong(new SongListKernel.Song("Brent Faiyaz", "Loose Change",
                "Wasteland"));
        SongListKernel.Song song = new SongListKernel.Song("Drake",
                "Fair Trade", "Certified Lover Boy");
        assertEquals(s.playFirst(), song);
    }

    @Test
    public void testSkip() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        SongListKernel.Song song = new SongListKernel.Song("Drake",
                "Fair Trade", "Certified Lover Boy");
        assertEquals(s.skip(), song);
    }

    @Test
    public void testSkipMany() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        s.addSong(new SongListKernel.Song("Brent Faiyaz", "Loose Change",
                "Wasteland"));
        SongListKernel.Song song = new SongListKernel.Song("Drake",
                "Fair Trade", "Certified Lover Boy");
        assertEquals(s.skip(), song);
    }

    @Test
    public void testShuffleEmpty() {
        SongList s = new SongList1L();
        s.shuffle();
        assertEquals(s.length(), 0);

    }

    @Test
    public void testShuffleNonEmpty() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        s.addSong(new SongListKernel.Song("Brent Faiyaz", "Loose Change",
                "Wasteland"));
        s.addSong(new SongListKernel.Song("SZA", "Snooze", "SOS"));

        s.shuffle();
        assertEquals(s.length(), 3);

    }

    @Test
    public void testToString() {
        SongList s = new SongList1L();
        s.addSong(new SongListKernel.Song("Drake", "Fair Trade",
                "Certified Lover Boy"));
        assertEquals(s.toString(),
                "Song[artist=Drake, title=Fair Trade, album=Certified Lover Boy]");

    }

}
