package student;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class GameList implements IGameList {
    private Set<String> listOfGames;

    /**
     * Constructor for the GameList.
     */
    public GameList() {
        listOfGames = new HashSet<String>();
    }

    @Override
    public List<String> getGameNames() {
        return List.copyOf(listOfGames);
    }

    @Override
    public void clear() {
        listOfGames.clear();
    }

    @Override
    public int count() {
        return listOfGames.size();
    }

    @Override
    public void saveGame(String filename) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveGame'");
    }

    @Override
    public void addToList(String str, Stream<BoardGame> filtered) throws IllegalArgumentException {
        List<BoardGame> filteredList = filtered.toList();
        try {
            int index = Integer.parseInt(str);
            if (index < 0 || index > filteredList.size()) {
                throw new IllegalArgumentException("Index out of bounds");
            }
            listOfGames.add(filteredList.get(index).getName());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid index");
        }
    }

    @Override
    public void removeFromList(String str) throws IllegalArgumentException {
        if (!listOfGames.remove(str)) {
            throw new IllegalArgumentException("Invalid game");
        }
    }
}
