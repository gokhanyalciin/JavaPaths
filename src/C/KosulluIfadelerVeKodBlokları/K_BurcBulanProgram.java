package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class K_BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the day you were born: ");
        day = input.nextInt();
        if ((day >= 1) && (day <= 31)){
            System.out.print("Please enter the month you were born: ");
            month = input.nextInt();
            if ((month>=1) && (month<=12)){

                if ((day >= 21) && (day <= 31) && (month == 3)){
                    System.out.println("Your zodiac sign is Aries");
                } else if((day >= 1) && (day <= 20) && (month == 4)) {
                    System.out.println("Your zodiac sign is Aries");

                } else if ((day >= 21) && (day <= 30) && (month == 4)) {
                    System.out.println("Your zodiac sign is Taurus");
                } else if((day >= 1) && (day <= 21) && (month == 5)) {
                    System.out.println("Your zodiac sign is Taurus");

                } else if ((day >= 22) && (day <= 31) && (month == 5)) {
                    System.out.println("Your zodiac sign is Gemini");
                } else if((day >= 1) && (day <= 22) && (month == 6)) {
                    System.out.println("Your zodiac sign is Gemini");

                } else if ((day >= 23) && (day <= 30) && (month == 6)) {
                    System.out.println("Your zodiac sign is Cancer");
                } else if((day >= 1) && (day <= 22) && (month == 7)) {
                    System.out.println("Your zodiac sign is Cancer");

                } else if ((day >= 23) && (day <= 31) && (month == 7)) {
                    System.out.println("Your zodiac sign is Leon");
                } else if((day >= 1) && (day <= 22) && (month == 8)) {
                    System.out.println("Your zodiac sign is Leon");

                } else if ((day >= 22) && (day <= 31) && (month == 8)) {
                    System.out.println("Your zodiac sign is Virgo");
                } else if((day >= 1) && (day <= 22) && (month == 9)) {
                    System.out.println("Your zodiac sign is Virgo");

                } else if ((day >= 23) && (day <= 30) && (month == 9)) {
                    System.out.println("Your zodiac sign is Libra");
                } else if((day >= 1) && (day <= 22) && (month == 10)) {
                    System.out.println("Your zodiac sign is Libra");

                } else if ((day >= 23) && (day <= 31) && (month == 10)) {
                    System.out.println("Your zodiac sign is Scorpio");
                } else if((day >= 1) && (day <= 21) && (month == 11)) {
                    System.out.println("Your zodiac sign is Scorpio");

                } else if ((day >= 22) && (day <= 30) && (month == 11)) {
                    System.out.println("Your zodiac sign is Sagittarius");
                } else if((day >= 1) && (day <= 21) && (month == 12)) {
                    System.out.println("Your zodiac sign is Sagittarius");

                } else if ((day >= 22) && (day <= 31) && (month == 12)) {
                    System.out.println("Your zodiac sign is Capricorn ");
                } else if((day >= 1) && (day <= 21) && (month == 1)) {
                    System.out.println("Your zodiac sign is Capricorn");

                } else if ((day >= 22) && (day <= 31) && (month == 1)) {
                    System.out.println("Your zodiac sign is Aquarius");
                } else if((day >= 1) && (day <= 19) && (month == 2)) {
                    System.out.println("Your zodiac sign is Aquarius");

                } else if ((day >= 20) && (day <= 30) && (month == 2)) {
                    System.out.println("Your zodiac sign is Fish");
                } else if ((day >= 1) && (day <= 20) && (month == 3)) {
                    System.out.println("Your zodiac sign is Fish");

                } else {
                    System.out.println("Please try again!");
                }
            } else {
                System.out.println("Please try again!");
            }
        } else {
            System.out.println("Please try again!");
        }
    }
}