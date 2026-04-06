import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float realisasi, kehadiran, tugas, uts, uas;
        float b_kehadiran, b_tugas, b_uts, b_uas, total;

        System.out.println("Realisasi Disesuaikan Dengan jumlah Pertemuan Mata Kuliah Per SKS");
        System.out.print("Masukan Realisasi : ");
        realisasi = input.nextFloat();

        if (realisasi == 0) {
            System.out.println("Realisasi tidak boleh 0!");
            return ;
        }

        System.out.print("Masukkan Kehadiran : ");
        kehadiran = input.nextFloat();

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextFloat();

        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextFloat();

        b_kehadiran = (kehadiran / realisasi) * 10;
        b_tugas = tugas * 20 / 100;
        b_uts = uts * 30 / 100;
        b_uas = uas * 40 / 100;

        total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("\n=== HASIL ===");
        System.out.println("Realisasi: " + realisasi);
        System.out.println("Kehadiran: " + kehadiran);
        System.out.println("Tugas: " + tugas);
        System.out.println("UTS: " + uts);
        System.out.println("UAS: " + uas);
        System.out.printf("\nTotal Nilai : \n", total);
      
      input.close();
    }
}