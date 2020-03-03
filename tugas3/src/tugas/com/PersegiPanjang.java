package tugas.com;

public class PersegiPanjang extends BangunDatar {
    private double p;
    private double l;

    public double getPanjang() {
        return p;
    }

    public double getLebar() {
        return l;
    }

    @Override
    public double l() {
        return p*l;
    }

    @Override
    public double k() {
        return 2*(p*l);
    }

    public PersegiPanjang(double p, double l)
    {
        this.p = p;
        this.l = l;
    }

}
