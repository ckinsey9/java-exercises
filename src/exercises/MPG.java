/*Write a program that asks a user for the number of miles
they have driven and the amount of gas they've consumed
(in gallons), and print their miles-per-gallon.
 */

package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        float miles_driven;
        float gas_consumed;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles_driven = in.nextFloat();
        System.out.println("How many gallons of gas did you consume?");
        gas_consumed = in.nextFloat();
        System.out.println(("Your MPG: " + miles_driven/gas_consumed));

    }
}
