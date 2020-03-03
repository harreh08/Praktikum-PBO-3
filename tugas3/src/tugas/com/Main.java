package tugas.com;

public class Main {

    public static void main(String[] args) {

        Persegi persegi = new Persegi(12);
        System.out.println("\n == Persegi");
        System.out.println("Luas : " + persegi.l());
        System.out.println("Keliling : " + persegi.k());

        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("\n == Lingkaran");
        System.out.println("Luas : " + lingkaran.l());
        System.out.println("Keliling : " + lingkaran.k());

        PersegiPanjang persegiPanjang = new PersegiPanjang(8,6);
        System.out.println("\n == Persegi Panjang");
        System.out.println("Luas : " + persegiPanjang.l());
        System.out.println("Keliling : " + persegiPanjang.k());

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(8);
        segitiga.setTinggi(12);
        System.out.println("\n == Segitiga");
        System.out.println("Luas : " + segitiga.l());
        System.out.println("Keliling : " + segitiga.k());

        Kubus kubus = new Kubus(persegi.getSisi());
        System.out.println("\n == Kubus");
        System.out.println("Volume : " + kubus.volume());

        Balok balok = new Balok(persegiPanjang.getPanjang(),persegiPanjang.getLebar());
        balok.setTinggi(10);
        System.out.println("\n == Balok");
        System.out.println("Volume : " + balok.volume());

        Silinder silinder = new Silinder(lingkaran.getR());
        silinder.setTinggi(5);
        System.out.println("\n == Silinder");
        System.out.println("Volume : " + silinder.volume());
    }
}
