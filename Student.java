public class Student {
    private String nama;
    private int kredit, sks;
    private double ipk, pointkualitas;


    public Student(String n, int k, double pk, int s, double i) {
        nama = n;
        kredit = k;
        sks = s;
        ipk = i;
        pointkualitas = pk;

    }

    // menghitung rata-rata nilai
    public double hitungRataRata() {
        return sks / kredit;
    }

    public void tambahKredit(int tambahanKredit) {
        kredit += tambahanKredit;
    }

    public char getPoinKualitas() {
        return ipk > 75 ?
                'A' : 'B';
    }

    public String toString() {
        return "Nama: " + nama + ", Kredit: " + kredit + ", IPK: " + ipk + ", Poin Kualitas: " + getPoinKualitas();
    }
}