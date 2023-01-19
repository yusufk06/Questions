package Hastane;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HastaBakiciIslemleri implements MethodOrtak{
    Scanner scan= new Scanner(System.in);
    static ArrayList<HastaBakici> hastaBakiciListesi=new ArrayList<>();
    void HastaBakiciIslem() {
        System.out.println("============= HASTABAKICI İŞLEMLERI =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        int secim = 0;
        try {
            secim = scan.nextInt();


        } catch (InputMismatchException e) {
            String deger = scan.nextLine();
            if (deger.equalsIgnoreCase("q")) {
                AnaMenu obj1 = new AnaMenu();
                obj1.islemler();
            } else {
                System.out.println("Yanlis secim");
                HastaBakiciIslem();
            }
        }
        switch (secim) {
            case 1: {
                ekleme();
                break;
            }
            case 2: {
                arama();
                break;
            }
            case 3: {
                listeleme();
                break;
            }
            case 4: {
                silme();
                break;
            }
            default:
                System.out.println("yanlis secim");
                HastaBakiciIslem();

        }
    }
    @Override
    public void ekleme() {
        scan.nextLine();
        System.out.println("adinizi soyadinizi giriniz");
        String adSoyad=scan.nextLine();
        System.out.println("tc kimlikno giriniz");
        String tcNo= scan.nextLine();
        System.out.println("bolumunuzu giriniz");
        String bolum= scan.nextLine();
        System.out.println("ogrenim durumunu giriniz");
        String oDurumu= scan.nextLine();
        System.out.println("maasinizi giriniz");
        int baslamaTarihi= scan.nextInt();
        HastaBakici hastaBakici=new HastaBakici(adSoyad,tcNo,bolum,oDurumu,baslamaTarihi);
        hastaBakiciListesi.add(hastaBakici);
        System.out.println(hastaBakiciListesi);
        HastaBakiciIslem();

    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.println("aranacak hasta bakicinin tc nosunu giriniz");
        String tcno= scan.nextLine();
        boolean kontrol=true;
        for (HastaBakici each:hastaBakiciListesi
        ) {
            if (each.getTcNo().equalsIgnoreCase(tcno)){
                System.out.println(each);
                kontrol=false;
                HastaBakiciIslem();
            }
        }
        if (kontrol){
            System.out.println("aranan tc boyle birisi yok");
            arama();
        }

    }

    @Override
    public void silme() {
        scan.nextLine();
        System.out.println("silmek istediginiz hasta bakici tc nosunu giriniz");
        String no = scan.nextLine();
        boolean kontrol = true;
        for (HastaBakici each : hastaBakiciListesi
        ) {
            if (each.getTcNo().equalsIgnoreCase(no)) {
                System.out.println("silinecek hasta bakici :" + each);
                hastaBakiciListesi.remove(each);
                kontrol = false;
                HastaBakiciIslem();
            }
        }
        if (kontrol) {
            System.out.println("bu tc nosunda hasta bakici yok");
            silme();

        }
    }
    @Override
    public void listeleme() {
        for (HastaBakici each:hastaBakiciListesi
        ) {
            System.out.println(each);

        }
        HastaBakiciIslem();
    }
}
