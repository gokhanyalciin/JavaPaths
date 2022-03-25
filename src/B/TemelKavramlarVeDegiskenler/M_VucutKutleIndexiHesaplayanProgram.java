package B.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class M_VucutKutleIndexiHesaplayanProgram {
    public static void main(String[] args) {
        double vBoy, vKilo,vVucutKitleIndexi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz: ");
        vBoy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        vKilo = input.nextDouble();
        vVucutKitleIndexi = vKilo/(vBoy*vBoy);
        System.out.println("Vücut Kitle İndeksiniz: " +vVucutKitleIndexi);

    }
}