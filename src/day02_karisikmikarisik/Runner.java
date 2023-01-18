package day02_karisikmikarisik;

import java.util.Scanner;

public class Runner {
Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

     ogrenciEkleme();

    }

    private static void ogrenciEkleme() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ogrenci ismini giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyadini giriniz");
        String soyad= scan.nextLine();
        System.out.println("Lutfen bolumunu giriniz");
        String bolum= scan.nextLine();
        
    }

}
