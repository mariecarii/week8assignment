import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class GroupWordsByFirstLetter {

    public static Map<Character, List<String>> groupWords() throws IOException {

        return Files.lines(Paths.get("dictionary.txt")).
        flatMap(s -> Stream.of(s.split("[^a-zA-Z]"))).
                filter(s -> s.length() > 0).
                map(s -> s.toLowerCase()).
                collect(Collectors.groupingBy(s -> s.charAt(0))
        );


    }

}
