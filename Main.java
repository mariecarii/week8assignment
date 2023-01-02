import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get("dictionary.txt"))) {
            result = lines.collect(Collectors.toList());
        }
//        run for palinfrome results
//        result.stream().forEach((x) -> {
//            Palindrome.isPalindrome(x);
//        })

//         run for words that start with b-m
//        result.stream().forEach((x) -> {
//            WordGroup.lettersBtoM(x);
//        });

        //run for exercise 2
//        Exercise2 try1 = new Exercise2();

    }
}
