public class TestKendaraan {
    public static void main (String[] args) {
        System.out.println("Produsen" + kendaraan.MAKE);
        System.out.println("Jumlah kendaraan yang dapat diproduksi" + kendaraan.jmlKendaraan);

        kendaraan vehicle1 = new kendaraan("Vision");
        System.out.println("Kendaraan yang diproduksi");
        System.out.println(vehicle1);

        kendaraan vehicle2 = new kendaraan("Edict");
        System.out.println("Kendaraan yang diproduksi");
        System.out.println(vehicle2);

        System.out.println("Jumlah kendaraan yang diproduksi: " + kendaraan.jmlKendaraan);
    }
}
