package student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Stream;

public class GameList implements IGameList {
    private Set<BoardGame> games;

    /**
     * Constructor for the GameList.
     */
    public GameList() {
        games = new HashSet<>();
    }

    /**
     * Get the name of games.
     * @return a list of game names.
     */
    @Override
    public List<String> getGameNames() {
        List<String> gameNames = games.stream()
                .map(BoardGame::getName)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
        return gameNames;
    }

    /**
     * Clear the games.
     */
    @Override
    public void clear() {
        games.clear();
    }

    /**
     * Count the number of games.
     * @return the number of games.
     */
    @Override
    public int count() {
        return games.size();
    }

    /**
     * Save games to a file.
     * @param filename The name of the file to save the list to.
     */
    @Override
    public void saveGame(String filename) {
        try{
            List<String> gameNames = getGameNames();
            Files.write(Path.of(filename), gameNames, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }

    /**
     * Add games to list by index, range, name, or "all".
     * "all" means all the contents in the list.
     * @param str      the string to parse and add games to the list.
     * @param filtered the filtered list to use as a basis for adding.
     */
    @Override
    public void addToList(String str, Stream<BoardGame> filtered) throws IllegalArgumentException {
        List<BoardGame> gameList = filtered
                .sorted(Comparator.comparing(BoardGame::getName, String.CASE_INSENSITIVE_ORDER))
                .toList();

        // Check if games exist.
        Optional<BoardGame> game = checkIfGameExists(str, gameList.stream());
        if (game.isPresent()) {
           games.add(game.get());
           return;
        }

        // Add games by name.
        for (BoardGame bg : gameList) {
            if (bg.getName().equals(str)) {
                games.add(bg);
                return;
            }
        }

        // Add games by "all".
        if (str.equalsIgnoreCase("all")) {
            games.addAll(gameList);
            return;
        }

        // Add games by range or index.
        // For example, range 1-1 is treated as index 1.
        int[] range = parseRange(str, gameList.size());
        int start = range[0];
        int end = range[1];
        for (int i = start; i <= end; i++) {
            games.add(gameList.get(i));
        }
    }

    /**
     * Remove games from list by index, name, range, or "all".
     * "all" means all the contents in the list.
     * @param str The string to parse and remove games from the list.
     */
    @Override
    public void removeFromList(String str) throws IllegalArgumentException {
       Optional<BoardGame> game = checkIfGameExists(str, games.stream());

       // Check if games exist.
       if (game.isPresent()) {
           games.remove(game.get());
           return;
       }

       // Remove games by "all".
       if (str.equalsIgnoreCase("all")) {
           games.clear();
           return;
       }

       // Remove games by names.
       for (BoardGame bg : games) {
           if (bg.getName().equals(str)) {
               games.remove(bg);
           }
       }

       // Remove games by range or index.
        // For example, range 1-1 treated as index 1.
       int[] range = parseRange(str, games.size());
       int start = range[0];
       int end = range[1];
       List<BoardGame> gameList = new ArrayList<>(games);
       for (int i = start; i <= end; i++) {
           games.remove(gameList.get(i));
       }
    }

    /**
     * Parse the range string
     * @param str the range string
     * @param max the maximum number of games
     * @return a list [start, end]
     */
    private int[] parseRange(String str, int max) throws IllegalArgumentException {
        int start = 0;
        int end = max;

        String[] parts = str.split("-");
        try{
            // Parse start to indices starting from 0
            start = Integer.parseInt(parts[0]) - 1;
            if (start < 0 || start > max) {
                throw new IllegalArgumentException("Invalid range");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid range");
        }

        // Parse range
        if (parts.length == 2) {
            try{
                int userEnd = Integer.parseInt(parts[1]) - 1;
                if (userEnd < start || userEnd > max) {
                    throw new IllegalArgumentException("Invalid range");
                } else if (userEnd < end) {
                    end = userEnd;
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid range");
            }
        } else {
            // Treated as index
            // For example, [1,1] is treated as index 1
            end = start;
        }
        return new int[]{start, end};
    }

    /**
     * Determine if game exists
     * @param str the game to be found
     * @param filtered a stream of </BoardGame> to perform on
     * @return a </BoardGame> if found, otherwise an empty result
     */
    private Optional<BoardGame> checkIfGameExists(String str, Stream<BoardGame> filtered) {
        return filtered.filter(game -> game.getName().equalsIgnoreCase(str)).findFirst();
    }
}
