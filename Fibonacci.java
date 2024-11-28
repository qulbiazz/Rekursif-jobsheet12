import java.util.Scanner;

public class Fibonacci {
    static int hitungMarmut(int bulan){
        if (bulan == 1) {
            return 1; 
        }
        if (bulan == 2) {
            return 1;
        }
        return hitungMarmut(bulan-1) + hitungMarmut(bulan-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-" );
        int bulan = input.nextInt();

        if (bulan<0) {
            System.out.println("bulan tidak valid");
        }else{
            int pasanganMarmut = hitungMarmut(bulan);
            System.out.println("Jumlah pasangan marmut pada bulan ke-" +bulan+" sebanyak: " +pasanganMarmut);
        }
    }
}
