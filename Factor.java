import java.util.Scanner;

public class Factor {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("\nPhan tich thua so nguyen to. Nhap so n:");
            int n = Factor.scanner.nextInt();
            calc(n);
        }
    }

    private static void calc(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && check(i)) {
                System.out.print(i);
                if (!check(n)) System.out.print(" x ");
                n /= i;
                i--;
            }
        }
    }

    private static boolean check(int n) {
        double sq = Math.sqrt(n);
        for (int i = 2; i <= sq; i++) if (n % i == 0) return false;
        return true;
    }
}
