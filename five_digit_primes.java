public class five_digit_primes {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to co 5 chu so la:");
        lietke();
    }
    private static void lietke() {
        for (int i = 10007; i <= 99991; i++) if (check(i) == true) System.out.print(i + " ");
    }

    private static boolean check(int n) {
        double sq = Math.sqrt(n);
        for (int i = 2; i <= sq; i++) if (n % i == 0) return false;
        return true;
    }
}
