public class VehicleTester {
    public static void main (String[] args){

        BangunRuang Balok = new BangunRuang();


        BangunRuang.setPanjang (Integer.parseInt("5"));
        BangunRuang.setLebar(Integer.parseInt("3"));
        BangunRuang.setTinggi(Integer.parseInt("4"));

        int Panjang= BangunRuang.getPanjang();
        int Lebar= BangunRuang.getLebar();
        int Tinggi= BangunRuang.getTinggi();

        System.out.println("Bangun Ruang: "+ Balok.getPanjang() * Balok.getLebar() * Balok.getTinggi());
    }
}
