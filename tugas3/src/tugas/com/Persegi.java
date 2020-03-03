package tugas.com;

public class Persegi extends BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    @Override
    public double l() {
        return sisi*sisi;
    }

    @Override
    public double k() {
        return 4*sisi;
    }

    public Persegi(double sisi){
        this.sisi = sisi;
    }
}
