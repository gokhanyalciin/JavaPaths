package B.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class J_DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        double vKenar1, vKenar2, vKokHesaplama, vHipotenus, vUcgeninCevreUzunlugu,vUcgeninAlanı;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Üçgenin Birinci Kenar Uzunluğunu Giriniz: ");
        vKenar1 = input.nextDouble();
        System.out.println("Lütfen Üçgenin İkinci Kenar Uzunluğunu Giriniz: ");
        vKenar2 = input.nextDouble();
        vKokHesaplama = (vKenar1*vKenar1)+(vKenar2*vKenar2);
        vHipotenus = Math.sqrt(vKokHesaplama);
        vUcgeninCevreUzunlugu = vKenar1+vKenar2+vHipotenus;
        vUcgeninAlanı = vKenar1*vKenar2/2;
        System.out.println("Hipotenüs Uzunluğu: " +vHipotenus);
        System.out.println("Üçgenin Çevresinin Uzunluğu: " +vUcgeninCevreUzunlugu);
        System.out.println("Üçgenin Alanı: " +vUcgeninAlanı);
    }
}