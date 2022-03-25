package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class N_LeapYearCalculator {
    public static void main(String[] args) {
        int leapYear;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        leapYear = input.nextInt();
        if ((leapYear >= 0) && (leapYear <= 2100)){

            if ((leapYear%4 == 0) && (leapYear%100 != 0)){
                System.out.println("This is a Leap Year");

            } else if ((leapYear%100 == 0) && (leapYear%400 == 0)) {
                System.out.println("This is a Leap Year");

            } else if ((leapYear%100 == 0) && (leapYear%400 != 0)) {
                System.out.println("This is not a Leap Year");

            } else {
                System.out.println("This is not a Leap Year");
            }

        } else {
            System.out.println("Please try again!");
        }
    }
}