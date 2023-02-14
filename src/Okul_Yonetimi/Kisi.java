package Okul_Yonetimi;

public class Kisi {
    /*
    Ad-Syoda, kimlik No, yas
     */

    private String ad;

    private String Sad;

    private String tcNo;

    private int yas;

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", Sad='" + Sad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas ;
    }

    public Kisi(String ad, String sad, String tcNo, int yas) {
        this.ad = ad;
        Sad = sad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSad() {
        return Sad;
    }

    public void setSad(String sad) {
        Sad = sad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
