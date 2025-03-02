package student;


import java.util.Set;
import java.util.stream.Stream;


public class Planner implements IPlanner {
    private Set<BoardGame> allGames;
    private Stream<BoardGame> currentGames;

    public Planner(Set<BoardGame> games) {
        this.allGames = games;
        this.currentGames = games.stream();
    }

    /**
     * Filter the game with a string.
     * @param filter The filter to apply to the board games.
     * @return the filtered stream
     */
    @Override
    public Stream<BoardGame> filter(String filter) {
        this.currentGames = Filter.applyFilter(filter, allGames.stream());
        return this.currentGames;
    }

    /**
     * Filter the stream with a string and sort on a column.
     * @param filter The filter to apply to the board games.
     * @param sortOn The column to sort the results on.
     * @return the filtered and sorted stream
     */
    @Override
    public Stream<BoardGame> filter(String filter, GameData sortOn) {
        this.currentGames = Filter.applyFilter(filter, allGames.stream());
        this.currentGames = Sorts.applySort(currentGames, sortOn, true); // Default to ascending
        return this.currentGames;
    }

    /**
     * Filter the stream with a string and sort on a column
     * in ascending or descending order.
     * @param filter The filter to apply to the board games.
     * @param sortOn The column to sort the results on.
     * @param ascending Whether to sort the results in ascending order or descending order.
     * @return the filtered and sorted stream in ascending or descending order
     */
    @Override
    public Stream<BoardGame> filter(String filter, GameData sortOn, boolean ascending) {
        this.currentGames = Filter.applyFilter(filter, allGames.stream());
        this.currentGames = Sorts.applySort(currentGames, sortOn, ascending);
        return this.currentGames;
    }

    /**
     * Reset the stream.
     */
    @Override
    public void reset() {
        this.currentGames = allGames.stream();
    }
}
