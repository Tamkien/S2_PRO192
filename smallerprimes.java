import java.util.Scanner;

public class smallerprimes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("\nLiet ke cac so nguyen to nho hon n\nNhap n:");
            int n = smallerprimes.scanner.nextInt();
            lietke(n);
        }
    }

    private static void lietke(int n) {
        for (int i = 2; i <= n; i++) if (check(i) == true) System.out.print(i + " ");
    }

    private static boolean check(int n) {
        double sq = Math.sqrt(n);
        for (int i = 2; i < sq; i++) if (n % i == 0) return false;
        return true;
    }
}
