package javaapplication8;
class Human{
    string name;
    int age;
    private int sotien;
}
class SV extends Human{
    double GPA;
}
class Using{
    public static void main(String[] args) {
        Human h;
        SV s;
        h = new Human();
        h = new SV();
        
    }
}
//class Demo{
//    boolean x;
//    String s;
//    public Demo(int x){
//        System.out.println("da goi 1 constructor kieu int");
//    }
//    public Demo(){
//        
//    }
//    public Demo(byte x){
//        System.out.println("da goi kieu byte");
//    }
//    public Demo(float x){
//        System.out.println("da goi kieu float");     
//    }
//}
//class Using{
//    public static void main(String[] args) {
//        float a = 5;
//        Demo d = new Demo(a);
//        System.out.println("gia tri mac dinh cua x = " + d.x);
//        System.out.println("gia tri mac dinh cua s = " + d.s);
//        
//    }
//}

//class Human {
//
//    private int tien;
//
//    public int getTien() {
//        return tien * 2;
//    }
//
//    public int getThuc() {
//        return tien;
//    }
//
//    public void setTien(int tien) {
//        this.tien = tien;
//    }
//
//    public void kiemtien(int tienkiemdc) {
//        tien += tienkiemdc;
//    }
//
//    public void tieutien(int tientieu) {
//        tien -= tientieu;
//    }
//
//}
//
//class UsingHuman {
//
//    public static void main(String[] args) {
//        Human Kien = new Human();
//        Kien.setTien(1000);
//        System.out.println("Kien co " + Kien.getTien());
//        System.out.println("So tien that " + Kien.getThuc());
//        Kien.kiemtien(500);
//        Kien.tieutien(300);
//        Kien.kiemtien(200);
//        System.out.println("Kien con " + Kien.getTien());
//        System.out.println("So tien thuc la " + Kien.getThuc());
//
//    }
//}
//class sv {
//
//    String id, name;
//    double gpa;
//
//    public double takeclass(String ythuc) {
//        if (ythuc.equals("T")) {
//            return 10;
//        }
//        if (ythuc.equals("K")) {
//            return 7;
//        }
//        if (ythuc.equals("TB")) {
//            return 5;
//        }
//        if (ythuc.equals("Y")) {
//            return 3;
//        } else {
//            return 0;
//        }
//
//    }
//
//    public double calcgpa(String y1, int hs1, String y2, int hs2, String y3, int hs3) {
//        return (takeclass(y1) * hs1 + takeclass(y2) * hs2 + takeclass(y3) * hs3) / (hs1 + hs2 + hs3);
//    }
//}
//
//class usingsv {
//
//    public static void main(String[] args) {
//        sv sv1 = new sv();
//        sv1.id = "hs140001";
//        sv1.name = "Nguyen Van A";
//        System.out.println("Sinh vien " + sv1.name + " hoc mon PRO192 co ket qua " + sv1.takeclass("K"));
//        sv1.gpa = sv1.calcgpa("T", 5, "K", 4, "TB", 10);
//        System.out.println("Sinh vien " + sv1.name + " co ket qua GPA la " + sv1.gpa);
//    }
//}
//
////public class JavaApplication8 {
////
////    public static void main(String[] args) {
////
////    }
////}
