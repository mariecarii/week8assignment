public class Palindrome {

    public static void isPalindrome(String input) {
        String newVersion = "";

        for (int i= input.length()-1; i >=0; i--) {
            newVersion = newVersion + input.charAt(i);
        }

        if (input.equals(newVersion)) {
            System.out.println(input + "is a palindrome");
        }

    }

}
