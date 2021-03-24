import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Something%n");

        String userInput = sc.nextLine();

        boolean userInputNumeric = StringUtils.isNumeric(userInput);
        String userInputFlipped = StringUtils.swapCase(userInput);
        String userInputReversed = StringUtils.reverse(userInput);

        if (!userInputNumeric) {
            System.out.printf("\"%s\" is not a number %n", userInput);
        } else {
            System.out.printf("You entered: %s %n", userInput);
        }



//        System.out.printf("Flipped Case: %s %n", userInputFlipped);
//        System.out.printf("Reversed: %s %n", userInputReversed);


        String newString = String.format("""
                Is input numeric: %s
                Input with case flipped: %s
                Input reversed: %s
                """, userInputNumeric, userInputFlipped, userInputReversed);
        System.out.println(newString);

    }

}
