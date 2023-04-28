package howard.edu.lsp.finals.problem;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SongsDatabaseTest {

    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> TherapSongs = db.getSongs("Rap");
        assertEquals(2, TherapSongs.size());
        assertEquals(true, TherapSongs.contains("Savage"));
        assertEquals(true, TherapSongs.contains("Gin and Juice"));

        Set<String> ThejazzSongs = db.getSongs("Jazz");
        assertEquals(1, ThejazzSongs.size());
        assertEquals(true, ThejazzSongs.contains("Always There"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> TherapSongs = db.getSongs("Rap");
        assertEquals(2, TherapSongs.size());
        assertEquals(true, TherapSongs.contains("Savage"));
        assertEquals(true, TherapSongs.contains("Gin and Juice"));

        Set<String> ThejazzSongs = db.getSongs("Jazz");
        assertEquals(1, ThejazzSongs.size());
        assertEquals(true, ThejazzSongs.contains("Always There"));

        Set<String> emptySet = db.getSongs("Country");
        assertEquals(0, emptySet.size());
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Single Ladies"));
        Set<String> TherapSongs = db.getSongs("Rap");
        System.out.println("Rap songs: " + TherapSongs); // [Savage, Gin and Juice]

        String genreOfSavage = db.getGenreOfSong("Savage");
        System.out.println("Genre of Savage: " + genreOfSavage); // Rap

        String genreOfAlwaysThere = db.getGenreOfSong("Always There");
        System.out.println("Genre of Always There: " + genreOfAlwaysThere); // Jazz
    }
}
