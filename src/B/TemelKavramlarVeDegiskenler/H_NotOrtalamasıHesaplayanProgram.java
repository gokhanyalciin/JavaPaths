package B.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class H_NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {
        int vMatematik, vFizik, vKimya, vTürkçe, vTarih, vMuzik, vToplam;
        double vResult;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Matematik Dersinizin Notunu Giriniz: ");
        vMatematik = input.nextInt();
        System.out.println("Lütfen Fizik Dersinizin Notunu Giriniz: ");
        vFizik = input.nextInt();
        System.out.println("Lütfen Kimya Dersinizin Notunu Giriniz: ");
        vKimya = input.nextInt();
        System.out.println("Lütfen Türkçe Dersinizin Notunu Giriniz: ");
        vTürkçe = input.nextInt();
        System.out.println("Lütfen Tarih Dersinizin Notunu Giriniz: ");
        vTarih = input.nextInt();
        System.out.println("Lütfen Müzik Dersinizin Notunu Giriniz: ");
        vMuzik = input.nextInt();
        vToplam = vMatematik*6+vFizik*4+vKimya*4+vTürkçe*5+vTarih*4+vMuzik*2;
        vResult = (vToplam/25);

        String vDurum = vResult>=60 ? "Sınıfı Geçtiniz!" : "Gelecek Yıl Tekrar Deneyiniz.";

        System.out.println(vResult);
        System.out.println(vDurum);

    }
}