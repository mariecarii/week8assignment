import java.util.regex.*;

public class WordGroup {

    public static void lettersAtoB(String input) {


//        boolean b = Pattern.compile("^[b-m][a-z]*").matcher(input).matches();
        boolean b = Pattern.compile("^[b-m][a-z]*").matcher(input).matches();

        if (b == true ) {
            System.out.println(input);
        }


    }
}

