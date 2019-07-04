import java.util.Scanner;

public class conv {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Chuyen doi he co so tu decimal\nNhap mot so trong he decimal");
            int n = conv.scanner.nextInt();
            System.out.println("Nhap he co so (tu 2 den 32)");
            int he = conv.scanner.nextInt();
            chuyendoi(n, he);
        }
    }

    private static void chuyendoi(int n, int he) {
        if (n < 0 || he < 2 || he > 32) System.out.println("Nhap lai");
        else {
            StringBuilder kq = new StringBuilder();//muon xep vao string thi dung ham nay?
            while (n > 0) {
                int du = n % he;
                if (du < 10) kq.append(du);//nhap vao string
                else kq.append((char) (55 + du));//ep kieu char
                n /= he;
            }
            kq.reverse();//reverse
            System.out.println(kq);//in ra string ko can ""
        }
    }
}
