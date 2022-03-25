package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class H_SinifGecmeDurumu {
    public static void main(String[] args) {
        int scoreMath, scorePhysics, scoreTurkish, scoreChemical, scoreMusic;
        double sumGPA;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Math score: ");
        scoreMath = input.nextInt();
        if ((scoreMath >= 0) && (scoreMath <=100)) {
            System.out.print("Please enter your Physics score: ");
            scorePhysics = input.nextInt();

            if ((scorePhysics >= 0) && (scorePhysics <=100)) {
                System.out.print("Please enter your Turkish score: ");
                scoreTurkish = input.nextInt();

                if ((scoreTurkish >= 0) && (scoreTurkish <=100)) {
                    System.out.print("Please enter your Chemical score: ");
                    scoreChemical = input.nextInt();

                    if ((scoreChemical >= 0) && (scoreChemical <=100)) {
                        System.out.print("Please enter your Music score: ");
                        scoreMusic = input.nextInt();

                        if ((scoreMusic >= 0) && (scoreMusic <=100)) {
                            sumGPA = ((scoreMath*6 + scorePhysics*4 + scoreTurkish*5 + scoreChemical*4 + scoreMusic*2)/21);
                            System.out.print("Your GPA is: " +sumGPA +"\n");

                            if (sumGPA < 55){
                                System.out.println("Please work harder next term.");

                            } else {
                                System.out.println("Congratulations!");
                            }

                        } else {
                            System.out.println("You entered an incorrect score, please run this code again.");
                        }

                    } else {
                        System.out.println("You entered an incorrect score, please run this code again.");
                    }

                } else {
                    System.out.println("You entered an incorrect score, please run this code again.");
                }

            } else {
                System.out.println("You entered an incorrect score, please run this code again.");
            }
        }else {
            System.out.println("You entered an incorrect score, please run this code again.");
        }
    }
}