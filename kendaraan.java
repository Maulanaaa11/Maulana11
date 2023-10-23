public class kendaraan {

    // Deklarasi public static
    public static  String MAKE = "Augur";
    public static int jmlKendaraan = 0;

    // Deklarasi variabel instance
    private String noChassis;
    private String model;

    // Konstruktor jumlah kendaraan
    public kendaraan (String model) {
        jmlKendaraan++;
        this.noChassis = "ch" + jmlKendaraan;
        this.model = model;
        System.out.println("Vehicle Manufactured");
    }

    // setter dan geter
    public void setnoChassis (String noChassis){
        this.noChassis = noChassis;
    }
    public void setmodel (String model) {
        this.model = model;
    }
    public String getnoChassis() {
        return noChassis;
    }
    public String getmodel() {
        return model;
    }

    public String toString() {
        return "Kendaraan ini diproduksi oleh: " + MAKE + "\njenis model: " + model + "\nnomor sasis: " + noChassis;
    }

}
