/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Expression Tamkien is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class Main implements Sharp2D {

    Sharp2D S  = new Tamgiac(7.0, 6.0, 4.0);

    System.out.println ("Chu vi tam giac " + S.tinhchuvi());
    System.out.println ("Dien tich tam giac " + S.tinhdientich());
     
    Sharp2D S  = new Hinhchunhat(5, 6);

    System.out.println ("Chu vi hinh chu nhat" + S.tinhchuvi());
    System.out.println ("Dien tich hinh chu nhat" + S.tinhdientich());

    @Override
    public double tinhchuvi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double tinhdientich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
