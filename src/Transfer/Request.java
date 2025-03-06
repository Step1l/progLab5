package Transfer;

import Models.Movie;
import java.util.List;

public record Request(String command, List<String>args, Movie movie) {
}
