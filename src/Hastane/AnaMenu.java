package Hastane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {

Scanner scan=new Scanner(System.in);
    void islemler() {
        System.out.println("====================================\n" +
                "\t HASTANE YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- DOKTOR İŞLEMLERİ\n" +
                "\t 2- HEMSİRE İŞLEMLERİ\n" +
                "\t 3- HASTA BAKICI İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n"+ "Seciniz :");
int secim=0;
        try {
             secim= scan.nextInt();
        } catch (InputMismatchException e) {
            String deger= scan.nextLine();
            if (deger.equalsIgnoreCase("q")){
                System.out.println("Gule gule");
                System.exit(0);
            }else {
                System.out.println("Yanlis secim yaptiniz");
                islemler();
            }
        }
        switch (secim){
            case 1:{
                DoktorIslemleri doktor=new DoktorIslemleri();
                doktor.doktorIslem();
                break;
            }
            case 2:{
                HemsireIslemleri hemsire=new HemsireIslemleri();
                hemsire.HemsireIslem();
                break;
            }
            case 3:{
                HastaBakiciIslemleri hastaBakici= new HastaBakiciIslemleri();
                hastaBakici.HastaBakiciIslem();
                break;
            }
            default:{
                System.out.println("yanlis secim");
                islemler();
            }
        }

    }

}
