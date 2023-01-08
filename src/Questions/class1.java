package Questions;

import java.util.ArrayList;
import java.util.List;

public class class1 {
    String ulke = "";
    String isim = "";
    String tur = "";
    String cikisTarihi = "";
    String yonetmen = "";
    List<String> oyuncular = new ArrayList<>();
    public void Movie(String ulke, String isim, String tur, String cikisTarihi, String yonetmen, List<String> oyuncular){
        this.ulke = ulke;
        this.isim = isim;
        this.tur = tur;
        this.cikisTarihi = cikisTarihi;
        this.yonetmen = yonetmen;
        this.oyuncular = oyuncular;
    }
    public String oyuncu (List<String> oyuncular){
        String oyuncu="";
        for (String each:oyuncular) {
            oyuncu += each+ ", ";
        }
        return oyuncu;
    }
    @Override
    public String toString() {
        return  " Ülke= " + ulke + "\n" +
                " isim= " + isim + "\n" +
                " Tür= " + tur + "\n" +
                " ÇikisTarihi= " + cikisTarihi + "\n" +
                " Yonetmen= " + yonetmen + "\n" +
                " Oyuncular= " + oyuncu(this.oyuncular);
    }
}
