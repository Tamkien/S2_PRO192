import java.util.Scanner;

public class factorial {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Tinh giai thua cua n. Nhap so tu nhien n:");
            int n = factorial.scanner.nextInt();
            calc(n);
        }
    }

    private static void calc(int n) {
        if (n < 1) System.out.println("Nhap mot so tu nhien lon hon 0");
        else {
            int N = 1;
            for (int i = 1; i <= n; i++) N *= i;
            System.out.printf("n! = %d%n", N);
        }
    }
}
