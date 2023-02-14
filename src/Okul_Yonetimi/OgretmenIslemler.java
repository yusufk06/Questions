package Okul_Yonetimi;

import Questions.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements Islemler{
    Scanner scan=new Scanner(System.in);
    static int sicilNo=1000;
    static ArrayList<Ogretmen> ogretmenList=new ArrayList<>();
    void ogrtMenu(){
        System.out.println("   ============= OGRETMEN İŞLEMLERI =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\t\t SEÇİMİNİZ:");

        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{ekleme();}
                case 2:{arama();}
                case 3:{listeleme();}
                case 4:{silme();}
            }
        }catch (InputMismatchException e){
            String secim= scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu=new AnaMenu();
                anaMenu.menu();
            }else {
                System.out.println("HATALI GIRIS YAPILDI");
                ogrtMenu();
            }
        }
    }
    @Override
    public void ekleme() {
        System.out.println("OGRETMENIN ADINI GIRINIZ");
        scan.nextLine();
        String ad= scan.nextLine();
        System.out.println("OGRETMENIN SOYADINI GIRINIZ");
        String sAd= scan.nextLine();
        System.out.println("OGRETMENIN TCSINI GIRINIZ");
        String tcNo=scan.next();
        System.out.println("OGRETMENIN YASINI GIRINIZ");
        int yas= scan.nextInt();
        scan.nextLine();
        System.out.println("OGRETMENIN BOLUMUNU GIRINIZ");
        String bolum= scan.nextLine();
        Ogretmen ogretmen=new Ogretmen(ad,sAd,tcNo,yas,bolum,sicilNo++);
        ogretmenList.add(ogretmen);
        listeleme();
        ogrtMenu();

    }

    @Override
    public void arama() {

        System.out.println("ARANACAK KISININ TC NOSUNU GIRINIZ");
        String tcNo= scan.next();
        int kontrol=0;
        for (Ogretmen each: ogretmenList
             ) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println(each);
                kontrol=1;
            }
        }
        if (kontrol==0){
            System.out.println(tcNo + "TC NOLU KISI BULUNMAMAKTADIR");
        }
        ogrtMenu();
    }

    @Override
    public void listeleme() {
        for (Ogretmen each:ogretmenList
             ) {
            System.out.println(each);
        }
    ogrtMenu();
    }

    @Override
    public void silme() {
        System.out.println("SILINECEK OGRETMENIN TC NOSUNU GIRINIZ");
        String tcNo= scan.next();
        boolean kontrol=false;
        for (int i = 0; i <ogretmenList.size() ; i++) {
            if (ogretmenList.get(i).getTcNo().equals(tcNo)){
                System.out.println("SILINEN KISI : " + ogretmenList.get(i));
                ogretmenList.remove(i);
                kontrol=true;
            }
        }
        if (!kontrol){
            System.out.println("GIRILEN TC NOLU OGRETMEN BULUNMAMAKTADIR");
            ogrtMenu();
        }

    }
}
