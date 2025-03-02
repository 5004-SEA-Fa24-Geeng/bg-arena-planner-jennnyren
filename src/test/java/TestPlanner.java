import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import student.BoardGame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import student.Planner;
import student.IPlanner;
import student.GameData;


/**
 * JUnit test for the Planner class.
 * 
 * Just a sample test to get you started, also using
 * setup to help out. 
 */
public class TestPlanner {
    static Set<BoardGame> games;

    @BeforeAll
    public static void setup() {
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

    // Test Filter.
    // Test names.
    @Test
    public void testFilterNameEquals() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("name == Go").toList();
        assertEquals(1, filtered.size());
        assertEquals("Go", filtered.get(0).getName());
    }
    @Test
    public void testFilterNameNotEquals() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("name != Go").toList();
        assertEquals(7, filtered.size());
    }
    @Test
    public void testFilterNameContains() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("name ~= go").toList();
        assertEquals(4, filtered.size());
    }

    // Test Id.
    @Test
    public void testFilterIdEquals() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("id == 1").toList();
        assertEquals(1, filtered.size());
    }
    @Test
    public void testFilterIdNotEquals() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("id != 1").toList();
        assertEquals(7, filtered.size());
    }

    // Test MinPlayers.
    @Test
    public void testFilterMinPlayersGreaterThan() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("minPlayers > 3").toList();
        assertEquals(3, filtered.size());
    }
    @Test
    public void testFilterMinPlayersLessThan() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("minPlayers < 3").toList();
        assertEquals(5, filtered.size());
    }

    // Test MaxPlayers.
    @Test
    public void testFilterMaxPlayersLessThanEqual() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("maxPlayers <= 10").toList();
        assertEquals(7, filtered.size());
    }
    @Test
    public void testFilterMaxPlayersGreaterThanEqual() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("maxPlayers >= 10").toList();
        assertEquals(3, filtered.size());
    }

    // Test MinPlayTime
    @Test
    public void testFilterMinPlayTimeLessThan() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("minPlayTime < 70").toList();
        assertEquals(7, filtered.size());
    }
    @Test
    public void testFilterMinPlayTimeGreaterThan() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("minPlayTime > 70").toList();
        assertEquals(0, filtered.size());
    }

    // Test MaxPLayTime
    @Test
    public void testFilterMaxPlayTimeLessThanEqual() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("maxPlayTime <= 1000").toList();
        assertEquals(8, filtered.size());
    }
    @Test
    public void testFilterMaxPlayTimeGreaterThanEqual() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("maxPlayTime >= 1000").toList();
        assertEquals(1, filtered.size());
    }

    // Test Difficulty.
    @Test
    public void testFilterDifficultyLessThan(){
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("difficulty < 5.0").toList();
        assertEquals(2, filtered.size());
    }
    @Test
    public void testFilterDifficultyGreaterThan(){
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("difficulty > 5.0").toList();
        assertEquals(5, filtered.size());
    }

    // Test Rank.
    @Test
    public void testFilterRankLessThanEqual() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("rank <= 600").toList();
        assertEquals(6, filtered.size());
    }
    @Test
    public void testFilterRankGreaterThanEqual() {
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("rank >= 600").toList();
        assertEquals(3, filtered.size());
    }

    // Test Average rating.
    @Test
    public void testAverageRatingLessThan(){
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("rating < 5.0").toList();
        assertEquals(0, filtered.size());
    }
    @Test
    public void testAverageRatingGreaterThan(){
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("rating > 5.0").toList();
        assertEquals(7, filtered.size());
    }

    // Test year published.
    @Test
    public void testYearPublishedEquals(){
        IPlanner planner = new Planner(games);
        List<BoardGame> filtered = planner.filter("year == 2006").toList();
        assertEquals(1, filtered.size());
    }

    // Test filter and sort
    // Test year in ascending order
    @Test
    public void testYearPublishedAscending(){
        IPlanner planner = new Planner(games);
        List<BoardGame> GreaterThan2005 = planner
                .filter("year > 2005", GameData.YEAR)
                .toList();

        assertEquals(List.of("Chess", "Monopoly"),
                GreaterThan2005.stream()
                        .map(BoardGame::getName)
                        .toList());
    }

    // Test rating in descending order
    @Test
    public void testRatingDescending(){
        IPlanner planner = new Planner(games);
        List<BoardGame> RatingDescending = planner
                .filter("rating>8.0", GameData.RATING, false)
                .toList();

        assertEquals(List.of("Chess", "golang", "17 days", "GoRami"),
                RatingDescending.stream()
                        .map(BoardGame::getName)
                        .toList());
    }
}