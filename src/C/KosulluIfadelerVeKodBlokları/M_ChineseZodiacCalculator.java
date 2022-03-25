package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class M_ChineseZodiacCalculator {
    public static void main(String[] args) {
        int yearOfBirth;
        System.out.print("Please enter the year you were born: ");
        Scanner input = new Scanner(System.in);
        yearOfBirth = input.nextInt();

        if ((yearOfBirth >= 0) && (yearOfBirth%12==0) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Monkey");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==1) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Rooster");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==2) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Dog");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==3) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Pig");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==4) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Mice");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==5) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Ox");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==6) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Tiger");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==7) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Rabbit");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==8) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Dragon");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==9) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Snake");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==10) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Horse");

        } else if ((yearOfBirth >= 0) && (yearOfBirth%12==11) && (yearOfBirth <= 2100)){
            System.out.println("Your Chinese zodiac sign is Sheep");

        } else {
            System.out.println("You entered incorrect data. Please try again!");
        }
    }
}