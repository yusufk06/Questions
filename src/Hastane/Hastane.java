package Hastane;

public class Hastane {

    private String adSoyad;
    private  String tcNo;
    private  String bolum;

    @Override
    public String toString() {
        return "adSoyad='" + adSoyad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", bolum='" + bolum + '}';
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public Hastane() {
    }

    public Hastane(String adSoyad, String tcNo, String bolum) {
        this.adSoyad = adSoyad;
        this.tcNo = tcNo;
        this.bolum = bolum;
    }
}
