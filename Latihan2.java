@@ -0,0 +1,35 @@
package Latihan;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double makan, transport, belanja, total;
        double p_makan, p_transport, p_belanja;

        // S1
        System.out.print("Masukkan Pengeluaran makan: ");
        makan = input.nextDouble();

        System.out.print("Masukkan Pengeluaran transport: ");
        transport = input.nextDouble();

        System.out.print("Masukkan Pengeluaran belanja: ");
        belanja = input.nextDouble();

        // P1
        total = makan + transport + belanja;

        p_makan = (makan / total) * 100;
        p_transport = (transport / total) * 100;
        p_belanja = (belanja / total) * 100;

        // S2
        System.out.println("\n=== Total Pengeluaran dan Presentase ===");
        System.out.printf("Total Pengeluaran: %.0f\n", total);
        System.out.printf("Makan: %.2f%%\n", p_makan);
        System.out.printf("Transport: %.2f%%\n", p_transport);
        System.out.printf("Belanja: %.2f%%\n", p_belanja);
    }
}