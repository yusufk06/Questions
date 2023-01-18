package day02_karisikmikarisik;

public class Islemler {

    String isim;
    String soyIsim;
    String bolum;

    @Override
    public String toString() {
        return "Islemler{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", bolum='" + bolum + '\'' +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public Islemler(String isim, String soyIsim, String bolum) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.bolum = bolum;
    }
}
