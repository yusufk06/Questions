package Hastane;

public class Hemsire extends Hastane {

    public Hemsire(String adSoyad, String tcNo, String bolum, boolean sigorta) {
        super(adSoyad, tcNo, bolum);
        this.sigorta = sigorta;
    }

    public Hemsire() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "sigorta=" + sigorta;
    }

    public boolean isSigorta() {
        return sigorta;
    }

    public void setSigorta(boolean sigorta) {
        this.sigorta = sigorta;
    }

    private boolean sigorta;



}
