package Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class soru2 {
    /*
       1.	Karayollarinda bulunan mobesa kameralarinin mevcut araclarda ki
        plakalari okuyup bize arac hakkinda bilgi vermesini isteyen bir program tasarliyoruz.
2.	Kameradan okuma kismini kullanicidan plaka alarak simule – test edecegiz.

3.	Kullanici bir arac plakasi girdigi zaman veritabaninda olan ozellikleri
bir class ta yaziniz.(Plaka bilgisi, isim-soysisim, arac markasi, adres, arac durumu, vs gibi bilgiler)

4.	3. Maddede belirtilen ozelliklerde 10 tane nesne uretiniz ve bunlari bir dizi veya listede saklayiniz.

5.	Kullanicidan alacagimiz plakayi mevcut plakalarla kiyaslayiniz ve supheli-calinti araclari ekranda yazdiriniz.

Bu odevin hedefleri
1.	Classlari kullanarak nesne uretmek,
        */
    public class Kayit {
        String plaka = "";
        String adSoyad = "";
        String aracMarkasi = "";
        int yas = 0;

        public Kayit() {
        }

        public Kayit(String plaka, String adSoyad, String aracMarkasi, int yas) {
            this.plaka = plaka;
            this.adSoyad = adSoyad;
            this.aracMarkasi = aracMarkasi;
            this.yas = yas;
        }

        @Override
        public String toString() {
            return
                    "\nplaka :" + plaka +
                            "\nadSoyad :" + adSoyad +
                            "\naracMarkasi :" + aracMarkasi +
                            "\nyas :" + yas;
        }

        public String getPlaka() {
            return plaka;
        }

        public void setPlaka(String plaka) {
            this.plaka = plaka;
        }

        public String getAdSoyad() {
            return adSoyad;
        }

        public void setAdSoyad(String adSoyad) {
            this.adSoyad = adSoyad;
        }

        public String getAracMarkasi() {
            return aracMarkasi;
        }

        public void setAracMarkasi(String aracMarkasi) {
            this.aracMarkasi = aracMarkasi;
        }

        public int getYas() {
            return yas;
        }

        public void setYas(int yas) {
            this.yas = yas;
        }
    }

    public class Menu {
        static ArrayList<Kayit> liste = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        void plaka() {
            Kayit arac1 = new Kayit("15lf200", "ali veli", "toyota", 2000);
            liste.add(arac1);
            Kayit arac2 = new Kayit("16lf200", "ali vel", "toyot", 2001);
            liste.add(arac2);
            Kayit arac3 = new Kayit("18lf200", "ali ve", "toyo", 2002);
            liste.add(arac3);
            Kayit arac4 = new Kayit("19lf200", "ali ve", "toyota", 2005);
            liste.add(arac4);
        }


        void islemler() {

            plaka();

            System.out.println("----ISLEMLER--------");
            System.out.println("Yapmak istediginiz islemi giriniz\n1-Ekleme\n2-SORGULA\n3-Listeleme\n0-Cikis");
            int islem = scan.nextInt();

            switch (islem) {

                case 1: {
                    ekleme();
                }
                case 2: {
                    sorgula();
                }
                case 3: {
                    listeleme();
                }
                case 0: {
                    System.out.println("iyi yolculuklar");
                    break;
                }
                default:
                    System.out.println("hatalı plaka");
                    islemler();


            }


        }

        private void listeleme() {
            for (Kayit each : liste
            ) {
                System.out.println(each);
            }
            islemler();
        }

        private void sorgula() {
            scan.nextLine();
            System.out.println("sorgulamak istediğiniz calıntı aracın plakasını giriniz");
            String plaka = scan.nextLine().replaceAll(" ", "");
            for (Kayit each : liste
            ) {
                if (each.plaka.equalsIgnoreCase(plaka)) {
                    System.out.println("calıntı" + each);
                }
            }
            islemler();
        }

        private void ekleme() {
            scan.nextLine();
            System.out.println("eklemek istediginiz plakayı giriniz");
            String plaka = scan.nextLine().replaceAll(" ", "");
            System.out.println("isim soyisim");
            String adsoyad = scan.nextLine();
            System.out.println("arac markasi");
            String marka = scan.nextLine();
            System.out.println("arac yili");
            int yas = scan.nextInt();
            Kayit arac = new Kayit(plaka, adsoyad, marka, yas);
            liste.add(arac);
            System.out.println(liste);
            islemler();

        }
    }

    public class RUNNER {

        public void main(String[] args) {

            Menu obj1 = new Menu();
            obj1.islemler();

        }
    }
}