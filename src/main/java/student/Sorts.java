package student;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorts {
    public static Stream<BoardGame> applySort(Stream<BoardGame> games, GameData sortOn, boolean ascending) {
        Comparator<BoardGame> comparator = switch (sortOn) {
            case ID -> Comparator.comparing(BoardGame::getId);
            case NAME -> Comparator.comparing(BoardGame::getName);
            case RATING -> Comparator.comparing(BoardGame::getRating);
            case DIFFICULTY -> Comparator.comparing(BoardGame::getDifficulty);
            case RANK -> Comparator.comparing(BoardGame::getRank);
            case MIN_PLAYERS -> Comparator.comparing(BoardGame::getMinPlayers);
            case MAX_PLAYERS -> Comparator.comparing(BoardGame::getMaxPlayers);
            case MIN_TIME -> Comparator.comparing(BoardGame::getMinPlayTime);
            case MAX_TIME -> Comparator.comparing(BoardGame::getMaxPlayTime);
            case YEAR -> Comparator.comparing(BoardGame::getYearPublished);
        };

        if (!ascending) {
            comparator = comparator.reversed();
        }

        return games.sorted(comparator);
    }
}


