package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class L_UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int flightDistance, passengerAge, tripType;
        double flightDistanceCost, normalCost, ageDiscountChild, ageDiscountTeen, ageDiscountOld, ageDiscountedCost, totalCost, roundTripDiscount;
        flightDistanceCost = 0.1;
        ageDiscountChild = 0.5;
        ageDiscountTeen = 0.1;
        ageDiscountOld = 0.3;
        roundTripDiscount = 0.2;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the flight distance: ");
        flightDistance = input.nextInt();
        if (flightDistance >=0 ){
            normalCost = (flightDistance * flightDistanceCost);
            System.out.print("Please enter your age: ");
            passengerAge = input.nextInt();
            if ((passengerAge >= 0) && (passengerAge <= 12)){
                ageDiscountedCost = normalCost - (normalCost * ageDiscountChild);
                System.out.println("Please select your trip type: 1- One Way Flight 2- Round Trip Flight");
                tripType = input.nextInt();
                if ((tripType == 1)) {
                    totalCost = ageDiscountedCost;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else if ((tripType == 2)) {
                    totalCost = (ageDiscountedCost - (ageDiscountedCost * roundTripDiscount))*2;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else {
                    System.out.println("You entered incorrect data. Please try again!");
                }

            } else if ((passengerAge >= 13) && (passengerAge <= 24)) {
                ageDiscountedCost = normalCost - (normalCost * ageDiscountTeen);
                System.out.println("Please select your trip type: 1- One Way Flight 2- Round Trip Flight");
                tripType = input.nextInt();
                if ((tripType == 1)) {
                    totalCost = ageDiscountedCost;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else if ((tripType == 2)) {
                    totalCost = (ageDiscountedCost - (ageDiscountedCost * roundTripDiscount))*2;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else {
                    System.out.println("You entered incorrect data. Please try again!");
                }

            } else if ((passengerAge >= 25) && (passengerAge <= 64)) {
                System.out.println("Please select your trip type: 1- One Way Flight 2- Round Trip Flight");
                tripType = input.nextInt();
                if ((tripType == 1)) {
                    totalCost = normalCost;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else if ((tripType == 2)) {
                    totalCost = (normalCost - (normalCost * roundTripDiscount))*2;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else {
                    System.out.println("You entered incorrect data. Please try again!");
                }

            } else if ((passengerAge >= 65) && (passengerAge <= 120)) {
                ageDiscountedCost = normalCost - (normalCost * ageDiscountOld);
                System.out.println("Please select your trip type: 1- One Way Flight 2- Round Trip Flight");
                tripType = input.nextInt();
                if ((tripType == 1)) {
                    totalCost = ageDiscountedCost;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else if ((tripType == 2)) {
                    totalCost = (ageDiscountedCost - (ageDiscountedCost * roundTripDiscount))*2;
                    System.out.println("Your total flight cost: " + totalCost + " $");
                } else {
                    System.out.println("You entered incorrect data. Please try again!");
                }

            } else {
                System.out.println("You entered incorrect data. Please try again!");
            }
        } else {
            System.out.println("You entered incorrect data. Please try again!");
        }

    }
}