package day01_karisik;

public class Ogrenci {

    String adSoyad;
    int kimlikNo;
    int yas;
    int numara;
    String sinif;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo=" + kimlikNo +
                ", yas=" + yas +
                ", numara=" + numara +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public Ogrenci(String adSoyad, int kimlikNo, int yas, int numara, String sinif) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }
}
