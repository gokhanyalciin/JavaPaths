package B.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class N_ManavKasaProgrami {
    public static void main(String[] args) {
        double vArmut, vArmutFiyat, vElma, vElmaFiyat, vDomates, vDomatesFiyat, vMuz, vMuzFiyat, vPatlican, vPatlicanFiyat, vToplamTutar;
        vArmutFiyat = 2.14;
        vElmaFiyat = 3.67;
        vDomatesFiyat = 1.11;
        vMuzFiyat = 0.95;
        vPatlicanFiyat = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Alınan Armut Miktarı?: ");
        vArmut = input.nextDouble();
        System.out.print("Alınan Elma Miktarı?: ");
        vElma = input.nextDouble();
        System.out.print("Alınan Domates Miktarı?: ");
        vDomates = input.nextDouble();
        System.out.print("Alınan Muz Miktarı?: ");
        vMuz = input.nextDouble();
        System.out.print("Alınan Patlıcan Miktarı?: ");
        vPatlican = input.nextDouble();
        vToplamTutar = vArmut*vArmutFiyat + vElma*vElmaFiyat + vDomates*vDomatesFiyat +vMuz*vMuzFiyat + vPatlican*vPatlicanFiyat;
        System.out.print("Toplam Tutar: " +vToplamTutar +"TL");


    }
}