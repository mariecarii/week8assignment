import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
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


}

