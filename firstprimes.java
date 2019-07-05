import java.util.Scanner;

public class firstprimes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("\nLiet ke n so nguyen to dau tien\nNhap n:");
            int n = firstprimes.scanner.nextInt();
            calc(n);
        }
    }

    private static void calc(int n) {
        int i = 2, k = 1;
        while (k <= n) {
            if (check(i) == true) {
                System.out.print(i + " ");
                k++;
            }
            i++;
        }
    }

    private static boolean check(int n) {
        double sq = Math.sqrt(n);
        for (int i = 2; i <= sq; i++) if (n % i == 0) return false;
        return true;
    }
}
