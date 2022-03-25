package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class J_SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        double vA,vB,vC;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        vA = input.nextDouble();
        System.out.print("Please enter the second number: ");
        vB = input.nextDouble();
        System.out.print("Please enter the third number: ");
        vC = input.nextDouble();

        if ((vA >= vB) && (vA >= vC) && (vB >= vC)){
            System.out.println(" A >= B >= C");

        } else if ((vA >= vB) && (vA >= vC) && (vC >= vB)){
            System.out.println(" A >= C >=B");

        } else if ((vB >= vA) && (vB >= vC) && (vA >= vC)){
            System.out.println(" B >= A >= C");

        } else if ((vB >= vA) && (vB >= vC) && (vC >= vA)){
            System.out.println(" B >= C >= A");

        } else if ((vC >= vA) && (vC >= vB) && (vA >= vB)){
            System.out.println(" C >= A >= B");

        } else if ((vC >= vA) && (vC >= vB) && (vB >= vA)){
            System.out.println(" C >= B >= A");

        } else {
            System.out.println("You entered the wrong number.");
        }
    }
}