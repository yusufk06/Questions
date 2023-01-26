package Questions;

public class ilkTest {
    public static void main(String[] args) {

        // gittigimiz web sayfasindan aldigimiz
        //String arama sonuclarinda
        //arama sayisinin 50den fazla oldugunu test edin

        String input = "1-48 of 87 results for \"nutella\"";

        int indexOf = input.indexOf("of");
        int indexResults = input.indexOf("results");
        String sonucSayisiString = input.substring(indexOf + 3, indexResults - 1);

        int sonucSayisiInt = Integer.parseInt(sonucSayisiString);
        // ustteki parsin stringi inte ceviriyor
        if (sonucSayisiInt > 50) {
            System.out.println("Nutella arama tesi PASSED");
        } else {
            System.out.println("istenen kadar sonuc yok nutella arama testi Failed");
        }


    }
}

