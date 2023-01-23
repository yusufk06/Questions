package mapKitap;

import java.util.*;

public class Menu {
    Scanner scan = new Scanner(System.in);
    static int kitapNo = 1000;

    Map<Integer, List<Kitap>> kitapMapi = new HashMap<>();

    void islemler() {
        System.out.println("========HOSGELDİNİZ===========");
        System.out.println("YAPMAK İSTEDGİNİZ İSLEMİ SECİNİZ \n1-Kitap Ekle\n2-No ile kitap goruntıle\n3-Bigi ile kitap goruntule" +
                "\n4-no ile kitap sil\n5-kitaplari listele\nQ-Cikis");
        int secim = 0;
        try {
            secim = scan.nextInt();

        } catch (InputMismatchException e) {
            String secim2 = scan.nextLine();
            if (secim2.equalsIgnoreCase("q")) {
                System.out.println("güle güle");
                System.exit(0);
            } else {
                System.out.println("yanlis secim");
                islemler();
            }
        }
        switch (secim) {
            case 1: {
                ekle();
                break;
            }
            case 2: {
                noIleSorgula();
                break;
            }
            case 3: {
                bigiIleKtiap();
                break;
            }
            case 4: {
                kiatpSil();
                break;
            }
            case 5: {
                kitaplistele();
                break;
            }
            default: {
                System.out.println("hatali giris");
                islemler();
            }



        }


    }


    private void kitaplistele() {
        System.out.println(kitapMapi);
        Set<Map.Entry<Integer, List<Kitap>>> setMap = kitapMapi.entrySet();
        for (Map.Entry<Integer, List<Kitap>> each : setMap
        ) {
            System.out.println(each.getKey() + " " + each.getValue());
        }
        islemler();

    }


    private void kiatpSil() {
        System.out.println("silinecek kitabın numarasını giriniz");
        int no = scan.nextInt();
        Set<Integer> set = kitapMapi.keySet();
        boolean kontrol = true;
        for (Integer each : set
        ) {
            if (each == no) {
                System.out.println("silinecek kitap" + kitapMapi.remove(no));
                kontrol = false;
                kitaplistele();
            }
        }

        if (kontrol) {
            System.out.println("böyle bir kitap bulunmamaktadir.");
            islemler();
        }

    }




    private void bigiIleKtiap() {
        scan.nextLine();
        System.out.println("Kitabin adini veya yazarini giriniz");
        String isim = scan.nextLine();
        boolean kontrol = true;
        Set<Map.Entry<Integer, List<Kitap>>> setMap = kitapMapi.entrySet();
        for (Map.Entry<Integer, List<Kitap>> each : setMap
        ) {

            for (Kitap w : each.getValue()
            ) {
                if (w.getKitapAdi().equalsIgnoreCase(isim) || w.getYazar().equalsIgnoreCase(isim)) {
                    System.out.println("kitap bilgisi :" + w + " no :" + each.getKey());
                    kontrol = false;
                    islemler();

                }

            }
        }

        if (kontrol) {
            System.out.println("bu isimde veya bu yazar adında bir kitap yok");
            islemler();
        }

    }


    private void noIleSorgula() {
        System.out.println("götüntülemek istediğiniz kitabın no sunu giriniz");
        int no = scan.nextInt();
        System.out.println(kitapMapi.get(no));

        //Set<Map.Entry<Integer,List<Kitap>>> setMap=kitapMapi.entrySet();
        Set<Integer> setkey = kitapMapi.keySet();
        boolean kontrol = true;
        for (Integer each : setkey
        ) {
            if (each == no) {
                System.out.println("girilen kitap no :" + each + " kitap :" + kitapMapi.get(no));
                kontrol = false;
                islemler();
            }
        }
        if (kontrol) {
            System.out.println("böyle bir kitap bulunmamaktadir.");
            islemler();
        }

    }

    private void ekle() {
        scan.nextLine();
        System.out.println("Kitabın adını giriniz");
        String ad = scan.nextLine();
        System.out.println("Kitabın yazarını giriniz");
        String yazar = scan.nextLine();
        System.out.println("kitabın fiyatini giriniz");
        int fiyat = scan.nextInt();
        Kitap kitap = new Kitap(ad, yazar, fiyat);
        List<Kitap> liste = new ArrayList<>();
        liste.add(kitap);
        kitapMapi.put(kitapNo++, liste);
        System.out.println(kitapMapi);
        islemler();
    }
}
