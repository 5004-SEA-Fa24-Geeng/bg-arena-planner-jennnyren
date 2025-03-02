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

    @Override
    public Stream<BoardGame> filter(String filter) {
        this.currentGames = Filter.applyFilter(filter, allGames.stream());
        return this.currentGames;
    }

    @Override
    public Stream<BoardGame> filter(String filter, GameData sortOn) {
        this.currentGames = Filter.applyFilter(filter, allGames.stream());
        this.currentGames = Sorts.applySort(currentGames, sortOn, true); // Default to ascending
        return this.currentGames;
    }

    @Override
    public Stream<BoardGame> filter(String filter, GameData sortOn, boolean ascending) {
        this.currentGames = Filter.applyFilter(filter, allGames.stream());
        this.currentGames = Sorts.applySort(currentGames, sortOn, ascending);
        return this.currentGames;
    }

    @Override
    public void reset() {
        this.currentGames = allGames.stream();
    }
}
