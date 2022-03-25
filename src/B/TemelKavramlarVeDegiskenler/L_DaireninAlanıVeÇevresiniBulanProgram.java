package B.TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class L_DaireninAlanıVeÇevresiniBulanProgram {
    public static void main(String[] args) {
        double vPi, vDaireninCevresi, vDaireYariCapi,vDaireninAlanı,vMerkezAcisi;
        Scanner input = new Scanner(System.in);
        vPi = 3.14;
        System.out.print("Lütfen Dairenin Yarıçapını Giriniz: ");
        vDaireYariCapi = input.nextDouble();
        System.out.print("Lütfen Dairenin Merkez Açı Ölçüsünü Giriniz: ");
        vMerkezAcisi = input.nextDouble();
        /*vDaireninAlanı = vPi*vDaireYariCapi*vDaireYariCapi;
        vDaireninCevresi = 2*vPi*vDaireYariCapi;*/
        vDaireninAlanı = (vPi*vDaireYariCapi*vDaireYariCapi*vMerkezAcisi)/360;
        System.out.println("Dairenin Alanı: " +vDaireninAlanı);

    }
}