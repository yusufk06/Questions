package Hastane;

public class HastaBakici extends Hastane {

    String ogrenimDurumu;
   int baslamaTarihi;

    public HastaBakici() {
    }

    public String getOgrenimDurumu() {
        return ogrenimDurumu;
    }

    public void setOgrenimDurumu(String ogrenimDurumu) {
        this.ogrenimDurumu = ogrenimDurumu;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ogrenimDurumu='" + ogrenimDurumu + '\'' +
                ", baslamaTarihi=" + baslamaTarihi ;
    }

    public int getBaslamaTarihi() {
        return baslamaTarihi;
    }

    public void setBaslamaTarihi(int baslamaTarihi) {
        this.baslamaTarihi = baslamaTarihi;
    }

    public HastaBakici(String adSoyad, String tcNo, String bolum, String ogrenimDurumu, int baslamaTarihi) {
        super(adSoyad, tcNo, bolum);
        this.ogrenimDurumu = ogrenimDurumu;
        this.baslamaTarihi = baslamaTarihi;
    }
}
