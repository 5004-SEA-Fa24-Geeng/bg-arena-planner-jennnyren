package student;

import java.util.stream.Stream;

public class Filter {
    /**
     *
     * @param filter the filter string
     * @param games a stream of BoardGame objects
     * @return the filtered stream
     */
    public static Stream<BoardGame> applyFilter(String filter, Stream<BoardGame> games) {
        filter = filter.replaceAll(" ", "");

        Operations operator = Operations.getOperatorFromStr(filter);
        if (operator == null) {
            return games;
        }

        String[] parts = filter.split(operator.getOperator());
        if (parts.length != 2) {
            return games;
        }

        try {
            GameData column = GameData.fromString(parts[0]);
            String value = parts[1];

            return switch (column) {
                case ID -> filterNumeric(games, BoardGame::getId, operator, Integer.parseInt(value));
                case NAME -> filterString(games, BoardGame::getName, operator, value);
                case RATING -> filterNumeric(games, BoardGame::getRating, operator, Double.parseDouble(value));
                case DIFFICULTY -> filterNumeric(games, BoardGame::getDifficulty, operator, Double.parseDouble(value));
                case RANK -> filterNumeric(games, BoardGame::getRank, operator, Integer.parseInt(value));
                case MIN_PLAYERS -> filterNumeric(games, BoardGame::getMinPlayers, operator, Integer.parseInt(value));
                case MAX_PLAYERS -> filterNumeric(games, BoardGame::getMaxPlayers, operator, Integer.parseInt(value));
                case MIN_TIME -> filterNumeric(games, BoardGame::getMinPlayTime, operator, Integer.parseInt(value));
                case MAX_TIME -> filterNumeric(games, BoardGame::getMaxPlayTime, operator, Integer.parseInt(value));
                case YEAR -> filterNumeric(games, BoardGame::getYearPublished, operator, Integer.parseInt(value));
            };
        } catch (IllegalArgumentException e) {
            return games;
        }
    }

    private static <T extends Comparable<T>> Stream<BoardGame> filterNumeric(
            Stream<BoardGame> games,
            java.util.function.Function<BoardGame, T> getter,
            Operations operator,
            T value) {
        return switch (operator) {
            case EQUALS -> games.filter(game -> getter.apply(game).compareTo(value) == 0);
            case NOT_EQUALS -> games.filter(game -> getter.apply(game).compareTo(value) != 0);
            case GREATER_THAN -> games.filter(game -> getter.apply(game).compareTo(value) > 0);
            case LESS_THAN -> games.filter(game -> getter.apply(game).compareTo(value) < 0);
            case GREATER_THAN_EQUALS -> games.filter(game -> getter.apply(game).compareTo(value) >= 0);
            case LESS_THAN_EQUALS -> games.filter(game -> getter.apply(game).compareTo(value) <= 0);
            default -> games;
        };
    }

    private static Stream<BoardGame> filterString(
            Stream<BoardGame> games,
            java.util.function.Function<BoardGame, String> getter,
            Operations operator,
            String value) {
        return switch (operator) {
            case EQUALS -> games.filter(game -> getter.apply(game).equalsIgnoreCase(value));
            case NOT_EQUALS -> games.filter(game -> !getter.apply(game).equalsIgnoreCase(value));
            case CONTAINS -> games.filter(game -> getter.apply(game).toLowerCase().contains(value.toLowerCase()));
            default -> games;
        };
    }
}
