import java.util.Scanner;

public class fibonacci {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Tinh so Fibonacci thu n\nNhap so n");
            int n = fibonacci.scanner.nextInt();
            calc(n);
        }
    }

    private static void calc(int n) {
        if (n == 1) System.out.println(0);
        else if (n == 2) System.out.println(1);
        else if (n > 2) {
            int f0 = 0, f1 = 1, f2 = 0;
            for (int i = 2; i < n; i++) {
                f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            System.out.println(f2);
        } else System.out.println("Nhap lai");
    }
}
