package Okul_Yonetimi;

public class Ogrenci extends Kisi{
    // Ad-Soyad, kimlik No, yas, numara, sinif

    private int numara;
    private String sinif;

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public Ogrenci(String ad, String sad, String tcNo, int yas, int numara, String sinif) {
        super(ad, sad, tcNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public Ogrenci() {
    }

    public String getSinif() {
        return sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "numara=" + numara +
                ", sinif='" + sinif ;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
