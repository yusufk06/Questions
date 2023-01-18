package Hastane;

public class Doktor extends Hastane{


    private int sicilNo;

    public Doktor() {
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return super.toString()+
                " sicilNo=" + sicilNo +
                ", maas=" + maas +
                '}';
    }

    private int maas;

    public Doktor(String adSoyad, String tcNo, String bolum, int sicilNo, int maas) {
        super(adSoyad, tcNo, bolum);
        this.sicilNo = sicilNo;
        this.maas = maas;
    }
}
