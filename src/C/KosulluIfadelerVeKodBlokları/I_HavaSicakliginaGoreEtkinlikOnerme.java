package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class I_HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int vHeat;
        Scanner input = new Scanner(System.in);
        System.out.print("Please entry the air temperature: ");
        vHeat = input.nextInt();

        if ((vHeat > -40) && (vHeat <= 5)){
            System.out.println("You can go skiing.");

        } else if ((vHeat > 5) && (vHeat <= 15)) {
            System.out.println("You can go to the cinema.");

        } else if ((vHeat > 15) && (vHeat <= 25)) {
            System.out.println("You can go on a picnic.");

        } else if ((vHeat > 25) && (vHeat <= 55)) {
            System.out.println("You can go swimming");

        } else {
            System.out.println("Please check air temperature.");
        }
    }
}