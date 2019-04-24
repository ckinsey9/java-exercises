// Takes user search input and returns T or F if in or
// not in long string

package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String user_word;
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in;

        in = new Scanner(System.in);

        System.out.println("What is your search term?");
        user_word = in.nextLine();
        String cap_word = user_word.substring(0, 1).toUpperCase() + user_word.substring(1);
        String lower_word = user_word.substring(0, 1).toLowerCase() + user_word.substring(1);
        System.out.print(paragraph.contains(cap_word) || paragraph.contains(lower_word));

    }
}
