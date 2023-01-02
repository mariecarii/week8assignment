import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {

    Exercise2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scan.nextInt();

        while (userInput > 0) {

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter a string (email, phone number, address, etc.)");
            String userInput2 = scan2.nextLine();

            boolean phoneNumber = Pattern.compile("^\\d{3}-\\d{3}-\\d{4}$").matcher(userInput2).matches();
            boolean address = Pattern.compile("^\\d*+ \\w+ [A-Za-z*]+ [A-Za-z*]+, +[A-Za-z*]+, +[A-Z]{2} +\\d{5}").matcher(userInput2).matches();
            boolean email = Pattern.compile("^(.+)@(.+)$").matcher(userInput2).matches();

            //get area code
            String areaCode = "";
            if (phoneNumber == true) {
                areaCode = userInput2.substring(0,3);

            }

            //get email username
            int index = userInput2.indexOf('@');
            String username = userInput2.substring(0,index);

            if (phoneNumber == true ) {
                System.out.println("It's a number with area code " + areaCode);
                userInput--;
            }
            else if (address == true) {
                System.out.println("It's an address.");
                userInput--;
            }
            else if (email == true) {
                System.out.println("It's " + username + " email.");
                userInput--;
            }
            else {
                System.out.println("No match");
            }

        }


    }
}
