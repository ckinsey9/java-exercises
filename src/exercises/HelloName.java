/* Modify your "Hello, World" program to
prompt the user for their name, and greet them by name.
 */

package exercises;
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("Hello, " + name + "!");

    }
}

