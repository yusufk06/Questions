package day01_karisik;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    static List<Ogrenci> ogrenciListesi = new ArrayList<>();
    static List<Ogretmen> ogretmenlistesi = new ArrayList<>();

    public static void ogrenciIslemler() {
        System.out.println("ISLEMINIZI SECINIZ\n1- OGRENCI EKLEME\n2- OGRENCİ ARAMA \n3- OGRENCI LİSTELEME \n4- OGRENCİ SİLME\n5- UST MENU \nQ- CIKIS");
        try {
            int islem = scan.nextInt();
            switch (islem) {
                case 1: {
                    ogrenciEKleme();
                    break;
                }
                case 2: {
                    kimlikNoileArama();
                    break;
                }
                case 3: {
                    ogrenciListeleme();
                    break;
                }
                case 4: {
                    ogrenciSilme();
                    break;
                }
                case 5: {
                    ustMenu();
                    break;
                }
                default: {
                    System.out.println("yanlis islem");
                    ogrenciIslemler();
                }
            }
        } catch (InputMismatchException e) {
            String cikis = scan.nextLine();
            if (cikis.equalsIgnoreCase("q")) {
                System.out.println("iyi günler");
                System.exit(0);
            } else {
                System.out.println("yanlis secim");
                ogrenciIslemler();
            }
        }
    }

    private static void ustMenu() {
        Runner.islem1();
    }

    private static void ogrenciSilme() {
        System.out.println("silmek istediğiniz ogrencinin tc no su nu giriniz");
        int tcNo = scan.nextInt();
        boolean kontrol = true;
        for (Ogrenci each : ogrenciListesi
        ) {
            if (each.getKimlikNo() == tcNo) {
                ogrenciListesi.remove(each);
                System.out.println("silinen ogrenci :" + each);
                kontrol = false;
                ogrenciIslemler();
            }
        }
        if (kontrol) {
            System.out.println("bu tc de bir ogrenci yok");
            ogrenciSilme();
        }
    }

    private static void ogrenciListeleme() {
        for (Ogrenci each : ogrenciListesi
        ) {
            System.out.println(each);
        }
        ogrenciIslemler();
    }

    private static void kimlikNoileArama() {
        System.out.println("aramak istediğiniz ogrencinin kimlik numarasını giriniz");
        int tcNo = scan.nextInt();
        boolean kontrol = true;
        for (Ogrenci each : ogrenciListesi
        ) {
            if (each.getKimlikNo() == tcNo) {
                System.out.println("Aranan ogrenci :" + each);
                kontrol = false;
                ogrenciIslemler();
                break;
            }
        }
        if (kontrol) {
            System.out.println("bu tc de bir ogrenci yok");
            kimlikNoileArama();
        }
    }

    private static void ogrenciEKleme() {
        scan.nextLine();
        System.out.println("Ogrencinin adını soyadını giriniz");
        String adSoyad = scan.nextLine();
        System.out.println("Ogrenci kimlik no");
        int tcNO = scan.nextInt();
        System.out.println("ogrenci yaşını giriniz");
        int yas = scan.nextInt();
        System.out.println("ogrenci numarsını giriniz");
        int numara = scan.nextInt();
        scan.nextLine();
        System.out.println("ogrenci sınıfını giriniz");
        String sinif = scan.nextLine();
        Ogrenci ogrenci = new Ogrenci(adSoyad, tcNO, yas, numara, sinif);
        ogrenciListesi.add(ogrenci);
        System.out.println(ogrenciListesi);
        ogrenciIslemler();
    }

    public static void ogretmenIslemler() {
        System.out.println("ISLEMINIZI SECINIZ\n1- OGRETMEN EKLEME\n2- OGRETMEN ARAMA \n3- OGRETMEN LİSTELEME \n4- OGRETMEN SİLME\n5- UST MENU \nQ- CIKIS");
        try {
            int islem = scan.nextInt();
            switch (islem) {
                case 1: {
                    ogretmenEKleme();
                    break;
                }
                case 2: {
                    kimlikNoileArama2();
                    break;
                }
                case 3: {
                    ogretmenListeleme();
                    break;
                }
                case 4: {
                    ogretmeniSilme();
                    break;
                }
                case 5: {
                    ustMenu();
                    break;
                }
                default: {
                    System.out.println("yanlis islem");
                    ogrenciIslemler();
                }
            }
        } catch (InputMismatchException e) {
            String cikis = scan.nextLine();
            if (cikis.equalsIgnoreCase("q")) {
                System.out.println("iyi günler");
                System.exit(0);
            } else {
                System.out.println("yanlis secim");
                ogrenciIslemler();
            }
        }
    }

    private static void ogretmeniSilme() {
        System.out.println("silmek istediğiniz ogretmenin tc kimlik no sunu giriniz");
        int tcNo = scan.nextInt();
        boolean kontrol = true;
        for (Ogretmen each : ogretmenlistesi
        ) {
            if (each.getKimlikNo() == tcNo) {
                System.out.println("silinen ogretmen :" + each);
                ogretmenlistesi.remove(each);
                kontrol = false;
                ogretmenIslemler();
            }
        }
        if (kontrol) {
            System.out.println("bu tc de ogretmen yok");
            ogretmeniSilme();
        }
    }

    private static void ogretmenListeleme() {
        for (Ogretmen each : ogretmenlistesi
        ) {
            System.out.println(each);
        }
        ogretmenIslemler();
    }

    private static void kimlikNoileArama2() {
        System.out.println("aramak istediğiniz ogretmenin kimlik numarasını giriniz");
        int tcNo = scan.nextInt();
        boolean kontrol = true;
        for (Ogretmen each : ogretmenlistesi
        ) {
            if (each.getKimlikNo() == tcNo) {
                System.out.println("Aranan ogretmen :" + each);
                kontrol = false;
                ogretmenIslemler();
                break;
            }
        }
        if (kontrol) {
            System.out.println("bu tc de bir ogrenci yok");
            kimlikNoileArama2();
        }
    }

    private static void ogretmenEKleme() {
        scan.nextLine();
        System.out.println("Ogretmenin adını soyadını giriniz");
        String adSoyad = scan.nextLine();
        System.out.println("Ogretmen kimlik no");
        int tcNO = scan.nextInt();
        System.out.println("ogretmen yaşını giriniz");
        int yas = scan.nextInt();
        System.out.println("ogretmenin sicil numarsını giriniz");
        int sicilnumara = scan.nextInt();
        scan.nextLine();
        System.out.println("ogretmenin bölümünü  giriniz");
        String bolum = scan.nextLine();
        Ogretmen ogretmen = new Ogretmen(adSoyad, tcNO, yas, bolum, sicilnumara);
        ogretmenlistesi.add(ogretmen);
        System.out.println(ogretmenlistesi);
        ogretmenIslemler();
    }
}