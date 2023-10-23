public class Konstruktor {
    private int Panjang;
    private int Tinggi;
    private int Lebar;

    public Konstruktor(int p, int l, int t) {
        Panjang = p;
        Lebar = l;
        Tinggi = t;

         System.out.println("Hasil dari volume balok adalah"+ p * l * t);
    }
}
