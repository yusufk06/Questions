package Hastane;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HemsireIslemleri implements MethodOrtak {
    Scanner scan= new Scanner(System.in);
    static ArrayList<Hemsire> hemsireListesi=new ArrayList<>();
    void HemsireIslem(){
        System.out.println("============= HEMSIRE İŞLEMLERI =============\n" +
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
                HemsireIslem();
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
                HemsireIslem();

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
        boolean sigorta=false;
        System.out.println("sigorta durumunuzu giriniz E/H");
        String sigortaDurumu= scan.nextLine();
        if (sigortaDurumu.equalsIgnoreCase("e")){
            sigorta=true;
        }
        Hemsire hemsire=new Hemsire(adSoyad,tcNo,bolum,sigorta);
        hemsireListesi.add(hemsire);
        System.out.println(hemsireListesi);
        HemsireIslem();

    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.println("aranacak hemsirenin tc nosunu giriniz");
        String tcno= scan.nextLine();
        boolean kontrol=true;
        for (Hemsire each:hemsireListesi
        ) {
            if (each.getTcNo().equalsIgnoreCase(tcno)){
                System.out.println(each);
                kontrol=false;
                HemsireIslem();
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
        System.out.println("silmek istediginiz hemsirenin tc nosunu giriniz");
        String no = scan.nextLine();
        boolean kontrol = true;
        for (Hemsire each : hemsireListesi
        ) {
            if (each.getTcNo().equalsIgnoreCase(no)) {
                System.out.println("silinecek hemsire :" + each);
                hemsireListesi.remove(each);
                kontrol = false;
                HemsireIslem();
            }
        }
        if (kontrol) {
            System.out.println("bu tc nosunda hemsire yok");
            silme();

        }

    }

    @Override
    public void listeleme() {
        for (Hemsire each:hemsireListesi
        ) {
            System.out.println(each);

        }
        HemsireIslem();
    }
    }
