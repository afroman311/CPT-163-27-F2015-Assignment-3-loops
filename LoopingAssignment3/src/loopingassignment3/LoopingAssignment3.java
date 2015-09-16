
package loopingassignment3;
import java.util.Scanner;

public class LoopingAssignment3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        print("Welcome to Scott's mystical word reverser");
        print("Please enter a word with at least 5 letters\n\n");
        String word = keyboard.nextLine();
        print("\n your word reversed is:\n");
        for(int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
    public static void print(String str){
        System.out.print(str); //print method
    }
}
