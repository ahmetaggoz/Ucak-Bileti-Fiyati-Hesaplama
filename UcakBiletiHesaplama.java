package Giris;
import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int mesafe,yas,yolculuk;
        double bilet,indirim,tutar = 0,indirim2;
        boolean isError = false;

        Scanner pipi = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden girin : ");
        mesafe = pipi.nextInt();

        System.out.print("Yaşınıızı girin : ");
        yas = pipi.nextInt();

        System.out.print("Yolculuk tipini girin (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        yolculuk = pipi.nextInt();


        if (mesafe > 0){
            if(yolculuk == 1 || yolculuk == 2){
               if (yolculuk == 2){
                   if (yas < 12){
                       bilet = mesafe * 0.10;
                       indirim = bilet * 0.50;
                       indirim2 = bilet * 0.20;
                       tutar = bilet - indirim - indirim2;
                       tutar *= 2;
                   } else if (yas <= 24 && yas > 12) {
                       bilet = mesafe * 0.10;
                       indirim = bilet * 0.10;
                       indirim2 = bilet * 0.20;
                       tutar = bilet - indirim - indirim2;
                       tutar *= 2;
                   } else if (yas >= 65) {
                       bilet = mesafe * 0.10;
                       indirim = bilet * 0.30;
                       indirim2 = bilet * 0.20;
                       tutar = bilet - indirim - indirim2;
                       tutar *= 2;
                   }
               }else {
                   if (yas < 12){
                       bilet = mesafe * 0.10;
                       indirim = bilet * 0.50;
                       tutar = bilet - indirim;
                   } else if (yas <= 24 && yas > 12) {
                       bilet = mesafe * 0.10;
                       indirim = bilet * 0.10;
                       tutar = bilet - indirim;
                   } else if (yas >= 65) {
                       bilet = mesafe * 0.10;
                       indirim = bilet * 0.30;
                       tutar = bilet - indirim;
                   }
               }
            }else {
                isError = true;
            }
        }else {
            isError = true;
        }

        System.out.println("Toplam tutar : " + tutar);
        System.out.println(isError ? "Hatalı giriş yaptınız!!" : "");

    }
}
