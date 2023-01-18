package Hastane;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DoktorIslemleri implements MethodOrtak {
    Scanner scan= new Scanner(System.in);
   static ArrayList<Doktor> doktorlarListesi=new ArrayList<>();
    void doktorIslem(){

        System.out.println("============= DOKTOR İŞLEMLERI =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        int secim=0;
        try {
            secim= scan.nextInt();


        }catch (InputMismatchException e){
            String deger= scan.nextLine();
            if (deger.equalsIgnoreCase("q")){
                AnaMenu obj1=new AnaMenu();
                obj1.islemler();
            }else {
                System.out.println("Yanlis secim");
                doktorIslem();
            }
        }
        switch (secim){
            case 1:{
                ekleme();
                break;
            }
            case 2:{
                arama();
                break;
            }
            case 3:{
                listeleme();
                break;
            }
            case 4:{
                silme();
                break;
            }
            default:
                System.out.println("yanlis secim");
                doktorIslem();
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
        System.out.println("sicil no giriniz");
        int sicil= scan.nextInt();
        System.out.println("maasinizi giriniz");
        int maas= scan.nextInt();
        Doktor doktor=new Doktor(adSoyad,tcNo,bolum,sicil,maas);
        doktorlarListesi.add(doktor);
        System.out.println(doktorlarListesi);
        doktorIslem();

    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.println("aranacak doktorun tc nosunu giriniz");
        String tcno= scan.nextLine();
        boolean kontrol=true;
        for (Doktor each:doktorlarListesi
             ) {
            if (each.getTcNo().equalsIgnoreCase(tcno)){
                System.out.println(each);
                kontrol=false;
                doktorIslem();
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
        System.out.println("silmek istediginiz doktorun sicil nosunu giriniz");
        int no= scan.nextInt();
        boolean kontrol=true;
        for (Doktor each:doktorlarListesi
             ) {
           if (each.getSicilNo()==no){
               System.out.println("silinecek doktor :"+ each);
               doktorlarListesi.remove(each);
                kontrol=false;
                doktorIslem();
           }
        }
        if (kontrol){
    System.out.println("bu sicil nosunda doktor yok");
    silme();
}
    }

    @Override
    public void listeleme() {
        for (Doktor each:doktorlarListesi
             ) {
            System.out.println(each);

        }
doktorIslem();
    }
}
