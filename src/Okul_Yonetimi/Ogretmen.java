package Okul_Yonetimi;

public class Ogretmen extends  Kisi{
    //Ad-Soyad, kimlik No, yas bolum, sicil No

    private String bolum;
    private  int sicilNo;

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String ad, String sad, String tcNo, int yas, String bolum, int sicilNo) {
        super(ad, sad, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    @Override
    public String toString() {
        return super.toString()+" " + " bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo ;
    }
}
