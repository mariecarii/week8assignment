import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
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

//      run to find longest word in b-m range and get # of vowels in it
//        WordGroup.longestWord();

//        run for exercise 2
//        Exercise2 try1 = new Exercise2();

//      run for function that groups words by first letter
//        System.out.println(GroupWordsByFirstLetter.groupWords());

    }
}
