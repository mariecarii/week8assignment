import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordGroup {

    public static void lettersBtoM(String input) {


//        boolean b = Pattern.compile("^[b-m][a-z]*").matcher(input).matches();
        boolean b = Pattern.compile("^[b-m][a-z]*").matcher(input).matches();

        if (b == true ) {
            System.out.println(input);
        }


    }



    public static void longestWord() throws IOException {
        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get("dictionary.txt"))) {
            result = lines.collect(Collectors.toList());
        }

        int wordLength = 0;

        Optional <String> longest = result.stream().reduce((s1, s2) -> {
            if (s1.length() > s2.length())
                return s1;
            else
                return s2;
        });


        System.out.println("The longest word from range b-m is: " + longest);
    }





}

