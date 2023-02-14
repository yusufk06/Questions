package Okul_Yonetimi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciIslemler implements  Islemler{
    Scanner scan= new Scanner(System.in);
static  int numara=100;
    ArrayList<Ogrenci> ogrenciList=new ArrayList<>();

    void ogrenciMenu(){
        System.out.println("  ============= OGRENCI İŞLEMLERI =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\t\t SEÇİMİNİZ:");
        try{
            int secim= scan.nextInt();
            switch (secim){
                case 1 :{
                    ekleme();
                }
                case 2:{
                    arama();
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                }
            }
        }catch (InputMismatchException e){
            String secim= scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu=new AnaMenu();
                anaMenu.menu();
            }
        }
    }
    @Override
    public void ekleme() {
        System.out.println("OGRENCININ  ADINI GIRINIZ");
        scan.nextLine();
        String ad= scan.nextLine();
        System.out.print("OGRENCININ SOYADINI GIRINIZ");
        String sAd= scan.nextLine();
        System.out.print("OGRENCININ TCSINI GIRINIZ");
        String tcNo=scan.next();
        System.out.print("OGRENCININ YASINI GIRINIZ");
        int yas= scan.nextInt();
        scan.nextLine();
        System.out.print("OGRENCININ SINIFINI GIRINIZ");
        String sinif= scan.next();
        Ogrenci ogrenci=new Ogrenci(ad,sAd,tcNo,yas,numara++,sinif);
        ogrenciList.add(ogrenci);
        listeleme();
        ogrenciMenu();
    }

    @Override
    public void arama() {
        System.out.println("ARANACAK OGRENCININ TC NOSUNU GIRINIZ");
        String tcNo= scan.next();
        int kontrol=0;
        for (Ogrenci each:ogrenciList
             ) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println("ARANAN KISI ; "+ each);
                kontrol=1;
                ogrenciMenu();
            }
        }
if (kontrol==0){
    System.out.println(tcNo + "TC NOLU OGRENCI KAYDI YOKTUR");
    ogrenciMenu();
}
    }

    @Override
    public void listeleme() {
        for (Ogrenci each: ogrenciList
             ) {
            System.out.println(each);
        }
        ogrenciMenu();
    }


    @Override
    public void silme() {
        System.out.println("SILINECEK OGRENCININ TC NOSUNU GIRINIZ");
        String tcNo= scan.next();
        boolean kontrol=true;
        for (int i = 0; i <ogrenciList.size() ; i++) {
            if (ogrenciList.get(i).getTcNo().equals(tcNo)) {
                System.out.println("SILINECEK OGRENCI : " + ogrenciList.get(i));
                ogrenciList.remove(i);
                kontrol = false;
                ogrenciMenu();
            }
        }
        if (kontrol){
            System.out.println(tcNo+ " TC NOLU OGRENCI YOKTUR");
            ogrenciMenu();
        }
    }

}
