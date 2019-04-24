/*Make a program similar to GradebookHashMap, but which takes in students names and
ID numbers (as integers) instead of names and grades. In this case, however, the keys
should be integers (the IDs) and the values should be strings (the names). Modify the
roster printing code accordingly.
 */

package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradePractice {
    public static void main(String[] args) {
        HashMap<Integer, String> student_list = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String new_student;
        Integer counter = 1;

        System.out.println("Enter your students (or ENTER to finish):");

        do {

            System.out.print("Student: ");
            new_student = in.nextLine();

            if (!new_student.equals("")) {
                student_list.put(counter, new_student);
                counter += 1;


            }

        } while(!new_student.equals(""));

        System.out.println("Class roster: ");

        for (Map.Entry<Integer, String> student : student_list.entrySet()) {
            System.out.println("ID: " + student.getKey() + ", " + student.getValue());
        }
    }
}
