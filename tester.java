import java.util.Scanner;

    public class tester {

        private static String n;
        private int k, s;
        private double pk, i;
        public static void main(String[] args) {
            Scanner tester = new Scanner(System.in);

            System.out.print("Masukkan nama mahasiswa: ");
            String n = tester.nextLine();

            System.out.print("Masukkan jumlah kredit: ");
            int k = tester.nextInt();

            System.out.print("Silahkan masukan sks: ");
            int s = tester.nextInt();

            Student mahasiswa = new Student(n, k, s);

            System.out.println("Rata-rata poin nilai saat ini: " + mahasiswa.hitungRataRata());

            System.out.print("Masukkan jumlah tambahan kredit: ");
            int tambahanKredit = tester.nextInt();
            mahasiswa.tambahKredit(tambahanKredit);

            System.out.println("Kredit setelah penambahan: " + mahasiswa.toString());

        }
    }