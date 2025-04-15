public abstract class SongListTest {
    /**
     * Invokes the appropriate {@code SongList} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new SongList
     * @ensures constructorTest = {}
     */
    protected abstract SongList constructorTest();

    /**
     * Invokes the appropriate {@code SongList} constructor for the reference
     * implementation and returns the result.
     *
     * @return the new SongList
     * @ensures constructorRef = {}
     */
    protected abstract SongList constructorRef();

    Song m = new Song1L("hi", "hi", "hi");

}
