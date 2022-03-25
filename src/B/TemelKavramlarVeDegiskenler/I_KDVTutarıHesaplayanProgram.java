package B.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class I_KDVTutarıHesaplayanProgram {
    public static void main(String[] args) {
        /*
        double vKDVliFiyat, vKDVTutarı, vKDVsizFiyat, vKDVOranı1,vKDVOranı2;
        vKDVOranı1=0.18;
        vKDVOranı2=0.08;
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen KDV'li Ürün Fiyatını Giriniz: ");
        vKDVliFiyat = input.nextDouble();
        vKDVsizFiyat = vKDVliFiyat/(1+vKDVOranı1);
        vKDVTutarı = vKDVliFiyat - vKDVsizFiyat;
        System.out.println("KDV'siz Tutarı: " + vKDVsizFiyat);
        System.out.println("KDV Tutarı: " +vKDVTutarı);
        */
        double vKDVliFiyat, vKDVsizFiyat, vKDVOranı1, vKDVOranı2;
        vKDVOranı1 = 0.18;
        vKDVOranı2 = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen KDV'siz Ürün Fiyatını Giriniz: ");
        vKDVsizFiyat = input.nextDouble();
        double vKDVTutari = vKDVsizFiyat < 1000 ? vKDVsizFiyat*vKDVOranı1 : vKDVsizFiyat*vKDVOranı2;
        vKDVliFiyat = vKDVsizFiyat + vKDVTutari;
        System.out.println("KDV Tutarı: " +vKDVTutari);
        System.out.println("KDV'li Tutar: " +vKDVliFiyat);

    }
}