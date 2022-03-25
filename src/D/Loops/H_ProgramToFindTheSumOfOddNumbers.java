package D.Loops;

import java.util.Scanner;

public class H_ProgramToFindTheSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddNumber;
        int summaryQuadruple = 0;
        int summary;
        System.out.print("Please enter an odd number: ");
        oddNumber = input.nextInt();

        while (oddNumber%2 == 0){
            System.out.print("Please enter an odd number: ");
            oddNumber = input.nextInt();
        }
        for (int i = 1; i<= oddNumber; i++){

            if ((i %4 == 0)){
                summaryQuadruple += i;
                i++;
            }
        }
        summary = summaryQuadruple;
        System.out.println("The summary of the numbers dividing by four in the entered numbers: " + summary);
    }
}
