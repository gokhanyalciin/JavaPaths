package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class F_HesapMakinesi {
    public static void main(String[] args) {
        double vA, vB;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen işlem yapmak istediğiniz birinci sayıyı giriniz: ");
        vA = input.nextDouble();
        System.out.print("Lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz: ");
        vB = input.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Hesaplama Sonucunuz: " +(vA + vB));
                break;
            case 2:
                System.out.println("Hesaplama Sonucunuz: " +(vA - vB));
                break;
            case 3:
                System.out.println("Hesaplama Sonucunuz: " +(vA * vB));
                break;
            case 4:
                System.out.println("Hesaplama Sonucunuz: " +(vA / vB));
                break;
            default: System.out.println("Hatalı seçim yaptınız.");

        }
    }
}