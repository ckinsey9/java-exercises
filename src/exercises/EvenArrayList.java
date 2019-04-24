/*Write a static method to find the sum of all the even numbers in a list. Within main,
create a list with at least 10 integers and call your method on the list.
 */


package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Integer total = 0;

        for (int i = 0; i < 15; i++) {
            nums.add(i);
        }

        for (int i : nums) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
