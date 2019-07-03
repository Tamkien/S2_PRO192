import  java.util.Scanner;
public class ptrinh {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for (;;){
        System.out.println("Nhap he so bac 2: ");
        double a = ptrinh.scanner.nextDouble();
        System.out.println("Nhap he so bac 1: ");
        double b = ptrinh.scanner.nextDouble();
        System.out.println("Nhap hang so: ");
        double c = ptrinh.scanner.nextDouble();
        ptrinh.solve(a,b,c);
        }
    }
    public static void solve(double a, double b, double c){
        double delta  = b*b-4*a*c;
        if (delta<0) {
            System.out.println("Phuong trinh vo nghiem!");
        }
        else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            if (delta==0){
                System.out.println("Phuong trinh co nghiem duy nhat la " + x1);
            }
            else {
                System.out.println("Phuong trinh co hai nghiem la " + x1 + " va "+ x2);
            }
        }
    }
}
