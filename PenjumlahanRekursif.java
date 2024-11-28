import java.util.Scanner;

public class PenjumlahanRekursif {
    static int hitungPenjumlahan(int jumlah) {
        if (jumlah == 1) {
            return 1;
        } else {
            return jumlah + hitungPenjumlahan(jumlah - 1);
        }
    }
    static String deret (int nilai){
        if (nilai == 1) {
            return "1";
        }else{
            return deret(nilai-1)+ "+" +nilai;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang dijumlahkan: ");
        int nilai = input.nextInt();

        if (nilai < 1) {
            System.out.println("angka tidak valid");
        }else{
            String deret = deret(nilai);
            int hasil = hitungPenjumlahan(nilai);
            System.out.println("Deret: " +deret);
            System.out.println("Hasil: " +hasil);
        }
    }
}
