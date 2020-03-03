package tugas.com;

public class Lingkaran extends BangunDatar {
    private double r;

    public double getR() {
        return r;
    }
    public Lingkaran(double r){
        this.r = r;
    }

    @Override
    public double l() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double k() {
        return Math.PI*(2*r);
    }
}
