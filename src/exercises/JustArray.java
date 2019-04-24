//Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
// Then loop through the array and print out each value.

package exercises;

import java.lang.reflect.Array;

public class JustArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,5,8};

        for (Integer num : nums) {
            System.out.println(num);
        }


    }
}
