/*Write a program to calculate the area of a rectangle and
print the answer to the console. You should prompt the user
for the dimensions.
(What data types should the dimensions be?)
 */


package exercises;
import java.util.Scanner;


public class RectangleArea {
    public static void main(String[] args){
        float width;
        float height;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the width?");
        width = in.nextFloat();
        System.out.println("What is the height?");
        height = in.nextFloat();
        System.out.println("Area: " + width*height);
    }
}
