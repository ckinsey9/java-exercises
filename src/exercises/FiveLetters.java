//Write a static method to print out each word in a list that has exactly 5 letters.

package exercises;

import java.util.Scanner;
import java.util.ArrayList;


public class FiveLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String new_word;
        Scanner in = new Scanner(System.in);
        Integer counter = 0;

        System.out.println("Enter words to check (or ENTER to finish):");

        do {
            System.out.println("Word: ");
            new_word = in.nextLine();
            words.add(new_word);
        }
        while
            (!new_word.equals(""));

        System.out.println("Five letter words include: ");

        for (String word : words) {
            if (word.length() == 5) {
                counter += 1;
                System.out.println(word);
            }
        }
        if (counter.equals(0)) {
            System.out.println("No five letter words");

        }
    }
}
