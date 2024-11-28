import java.util.Scanner;

class DeretDescendingRekursif {
    public static void deretRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        deretRekursif(n - 1);
    }

    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak deret: ");
        int n = input.nextInt();
        
        System.out.println("Deret dengan Rekursif:");
        deretRekursif(n);

        System.out.println("\n\nDeret dengan Iteratif:");
        deretIteratif(n);
    }
}
