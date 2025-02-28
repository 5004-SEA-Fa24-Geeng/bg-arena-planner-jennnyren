package student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GameListTest {
    private GameList gameList;
    private Set<BoardGame> games;

    @TempDir
    static Path tempDir;

    @BeforeEach
    void setUp() {
        gameList = new GameList();
        games = new HashSet<>();
        games.add(new BoardGame("17 days", 6, 1, 8, 70, 70, 9.0, 600, 9.0, 2005));
        games.add(new BoardGame("Chess", 7, 2, 2, 10, 20, 10.0, 700, 10.0, 2006));
        games.add(new BoardGame("Go", 1, 2, 5, 30, 30, 8.0, 100, 7.5, 2000));
        games.add(new BoardGame("Go Fish", 2, 2, 10, 20, 120, 3.0, 200, 6.5, 2001));
        games.add(new BoardGame("golang", 4, 2, 7, 50, 55, 7.0, 400, 9.5, 2003));
        games.add(new BoardGame("GoRami", 3, 6, 6, 40, 42, 5.0, 300, 8.5, 2002));
        games.add(new BoardGame("Monopoly", 8, 6, 10, 20, 1000, 1.0, 800, 5.0, 2007));
        games.add(new BoardGame("Tucano", 5, 10, 20, 60, 90, 6.0, 500, 8.0, 2004));
    }

    @Test
    void getGameNamesValid() {
        gameList.addToList("2", games.stream());
        assertTrue(gameList.getGameNames().contains("Chess"));
    }

    @Test
    void clear() {
        gameList.addToList("1", games.stream());
        gameList.addToList("2", games.stream());
        gameList.clear();
        assertEquals(0, gameList.count());
        assertTrue(gameList.getGameNames().isEmpty());
    }

    @Test
    void count() {
        assertEquals(0, gameList.count());
        gameList.addToList("1", games.stream());
        assertEquals(1, gameList.count());
    }

    @Test
    void saveGame() throws IOException {
        IGameList list = new GameList();
        list.addToList("1", games.stream());
        list.addToList("2", games.stream());
        Path gameList = tempDir.resolve("gameList.txt");
        list.saveGame(gameList.toString());
        assertTrue(Files.exists(gameList));
        List<String> fileContent = Files.readAllLines(gameList);
        List<String> expectedResult = List.of("17 days", "Chess");
        assertEquals(expectedResult, fileContent);
    }

    @Test
    void addToListByIndex(){
        gameList.addToList("1", games.stream());
        assertEquals(1, gameList.count());
        assertTrue(gameList.getGameNames().contains("17 days"));
    }

    @Test
    void addToListByName(){
        gameList.addToList("Chess", games.stream());
        assertEquals(1, gameList.count());
        assertTrue(gameList.getGameNames().contains("Chess"));
    }

    @Test
    void addToListByRange(){
        gameList.addToList("1-3", games.stream());
        assertEquals(3, gameList.count());
        assertTrue(gameList.getGameNames().contains("17 days"));
        assertTrue(gameList.getGameNames().contains("Chess"));
        assertTrue(gameList.getGameNames().contains("Go"));
    }
    @Test
    void addAllToList(){
        gameList.addToList("ALL", games.stream());
        assertEquals(8, gameList.count());
        assertTrue(gameList.getGameNames().contains("Chess"));
    }

    @Test
    void removeFromListByIndex() {
        gameList.addToList("1", games.stream());
        gameList.removeFromList("1");
        assertEquals(0, gameList.count());
    }

    @Test
    void removeFromListByRange() {
        gameList.addToList("1-3", games.stream());
        gameList.removeFromList("1-2");
        assertEquals(1, gameList.count());
    }

    @Test
    void removeFromListByName(){
        gameList.addToList("Chess", games.stream());
        gameList.removeFromList("Chess");
        assertEquals(0, gameList.count());
    }

    @Test
    void removeAllFromList(){
        gameList.addToList("1", games.stream());
        gameList.addToList("2", games.stream());
        gameList.removeFromList("all");
        assertEquals(0, gameList.count());
    }
}