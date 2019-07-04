import java.util.Scanner;

public class LCMGCD {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Tim UCLN va BCNN cua hai so\nNhap so thu nhat:");
            int a = LCMGCD.scanner.nextInt();
            System.out.println("Nhap so thu hai:");
            int b = LCMGCD.scanner.nextInt();
            if (a == 0 || b == 0) System.out.println("UCLN va BCNN cua " + a + " va " + b + " lan luot la " + Math.abs(a + b) + " va 0");
            else {
                if (a < b) {
                    int c;
                    c = a;
                    a = b;
                    b = c;
                }
                int lcm = LCM(a, b);
                int gcd = Math.abs(a * b) / lcm;
                System.out.println("UCLN va BCNN cua " + a + " va " + b + " lan luot la " + lcm + " va " + gcd);
            }
        }
    }

    private static int LCM(int a, int b) {
        for (; ; ) {
            int x = a % b;
            if (x == 0) break;
            else {
                a = b;
                b = x;
            }
        }
        return Math.abs(b);
    }
}
