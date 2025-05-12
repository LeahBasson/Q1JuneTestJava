
import java.util.Scanner;

public class Q1JuneTestA230146740 {

    public static void main(String[] args) {
        // requests integers from the user, one at a time, until the user enters a sentinel value of 0 (zero).
        // counts even numbers
        // counts multiples of 7
        // counts negative numbers

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (or 0 to stop): ");
        int number = input.nextInt();

        int normal_counter = 0;
        int even_counter = 0;
        int seven_multiples_counter = 0;
        int negative_num_counter = 0;

        String even_numbers = "", seven_multiples = "", negative_num = "";

        while (number != 0) {
            normal_counter += 1;

            if (number % 2 == 0) {
                even_counter += 1;
                even_numbers += "<" + number + ">";
            } if (number % 7 == 0) {
                seven_multiples_counter += 1;
                seven_multiples += "<" + number + ">";
            } if (number < 0) {
                negative_num_counter += 1;
                negative_num += "<" + number + ">";
            }

            System.out.print("Enter an integer (or 0 to stop): ");
            number = input.nextInt();
        }

        if (normal_counter == 0) {
            System.out.println("No meaningful values entered.");
        } else {
            System.out.println("Even numbers entered are " + even_numbers + " = " + even_counter + " in all.");
            
            System.out.println("Multiples of 7 entered are " + seven_multiples + " = " + seven_multiples_counter + " in all.");
           
            System.out.println("Negative numbers are " + negative_num + " = " + negative_num_counter + " in all");
        }

    }

}
