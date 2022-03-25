package D.Loops;
import java.util.Scanner;
public class G_ProgramToFindEvenNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        double summary = 0, counter = 0;
        double average;
        System.out.print("Please enter a number: ");
        value = input.nextInt();

        for(int i = 1; i <= value; i++){

            if ((i % 3 == 0) && (i % 4 == 0)){
                summary += i;
                counter++;
            }
        }

        average = (summary/counter);
        System.out.println("The average of the numbers dividing by 3 and 4 in the entered numbers: " + average);
    }
}