package javaapplication12;

public class JavaApplication12 {
    public static void main(String[] args) {
        Sharp2D S;
        S = new Tamgiac(5.0, 3.0, 4.0);
        System.out.println("Chu vi tam giac " + S.chuvi());
        System.out.println("Dien tich tam giac " + S.dientich());
        S = new Hinhtron(69);
        System.out.println("Chu vi hinh tron " + S.chuvi());
        System.out.println("Dien tich hinh tron " + S.dientich());
        S = new Hinhchunhat(9, 6);
        System.out.println("Chu vi hinh chu nhat " + S.chuvi());
        System.out.println("Dien tich hinh chu nhat " + S.dientich());
    }

}
