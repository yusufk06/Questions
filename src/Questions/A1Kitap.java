package Questions;

import java.util.*;

public class A1Kitap {
    public A1Kitap() {
    }


    public A1Kitap(String kitapAdi, String yazarAdi, int yayinYili, int fiyat) {

        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
    }

    /*
     * Bir kitapci icin program yapalim
     *
     * Kitap no 1000'den baslayarak sirali no olsun Her kitap icin kitapAdi,
     * yazarAdi,yayinYili,fiyati bilgilerini girelim
     *
     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
     * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
     * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- Bitir
     */
    int kitapNo = 999;
    String kitapAdi;
    String yazarAdi;
    int yayinYili;
    int fiyat;
    Scanner scan = new Scanner(System.in);
    Map<Integer, List<A1Kitap>> kitapci = new TreeMap<>();


    public void islemler() {
        System.out.println("======hosgeldiniz");
        System.out.println("yapmak istediginiz islemi giriniz\n1-Kitap Ekleme\n2- numara ile kitap goruntule\n " +
                "3-bilgi ile kitap görüntüle\n4- no ile kitap sil\n5-kitaplari listele\n0- Cikis");

        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                kitapEkle();
                break;
            }
            case 0: {
                System.out.println("güle güle");
                break;
            }
            case 2: {
                noileKitap();
                break;
            }
            case 4: {
                noIlesil();
                break;
            }
            case 3: {
                bilgiKitap();
                break;
            }
            case 5: {
                liste();
                break;
            }
            default:
                System.out.println("yanlis giriş");
                break;
        }


    }

    private void noIlesil() {
        System.out.println("silmek istediğiniz kitao no yu giriniz");
        int kitapno = scan.nextInt();
        kitapci.remove(kitapno);
        System.out.println(kitapci);
        islemler();
    }

    private void liste() {

        Set<Map.Entry<Integer, List<A1Kitap>>> setMap = kitapci.entrySet();
        for (Map.Entry<Integer, List<A1Kitap>> each : setMap
        ) {
            System.out.println(each.getKey() + " " + each.getValue());

        }
        islemler();
    }


    private void bilgiKitap() {
        scan.nextLine();
        System.out.println("aramak istediğiniz kitabın yazar veya ismini giriniz");
        String isim = scan.nextLine();
        Set<Map.Entry<Integer, List<A1Kitap>>> setMap = kitapci.entrySet();
        for (Map.Entry<Integer, List<A1Kitap>> each : setMap
        ) {
            for (A1Kitap w : each.getValue()
            ) {
                if (w.kitapAdi.equalsIgnoreCase(isim) || w.yazarAdi.equalsIgnoreCase(isim)) {
                    System.out.println(each);
                }
            }
        }
        islemler();
    }

    @Override
    public String toString() {
        return kitapAdi+" "+yazarAdi+" "+yayinYili+" "+fiyat;
    }

    private void noileKitap() {
        System.out.println("aramak istediğiniz kitabın no sunu giriniz");
        int no = scan.nextInt();
        System.out.println(kitapci.get(no));

        islemler();
    }
    private void kitapEkle() {
        this.kitapNo++;
        scan.nextLine();
        System.out.println("ktiap adini giriniz");
        String kitapadi1=scan.nextLine();
        System.out.println("yazar adini giriniz");
        String yazaAdi1=scan.nextLine();
        System.out.println("Yayin yili");
        int yil=scan.nextInt();
        System.out.println("fiyatini giriniz");
        int fiyat=scan.nextInt();
        List<A1Kitap> kitapListesi = new ArrayList<>();
        A1Kitap kitaplar=new A1Kitap(kitapadi1,yazaAdi1,yil,fiyat);
        kitapListesi.add(kitaplar);
        kitapci.put(kitapNo,kitapListesi);


        islemler();
    }


}








