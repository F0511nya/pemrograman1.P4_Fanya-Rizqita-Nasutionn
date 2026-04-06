public class Latihan3 {
    public static void main(String[] args) {

        double makan = 35000;
        double transport = 20000;
        double belanja = 45000;

        double total, diskon, totalBayar;

        // Hitung total
        total = makan + transport + belanja;

        // Hitung diskon 10%
        diskon = total * 10 / 100;

        // Total setelah diskon
        totalBayar = total - diskon;

        // Output
        System.out.println("Total sebelum diskon : " + total);
        System.out.println("Diskon (10%)         : " + diskon);
        System.out.println("Total bayar          : " + totalBayar);
    }
}