/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areageometrica;

/**
 *
 * @author Alumno
 */
public class AreaGeometrica {
        String figura;
        double area;
        double med1;
        double med2;

    
    public AreaGeometrica(String fig, double area, double mede1, double mede2){
        this.figura = fig;
        this.area = area;
        this.med1 = mede1;
        this.med2 = mede2;
    }
    public void esco(){
        System.out.println("Caculando area... ");
    }

    public static void main(String[] args) {
       AreaGeometrica fega = new AreaGeometrica("Triangulo", 0,0,0);
       AreaGeometrica sw = new AreaGeometrica("Rectangulo", 0, 0,0);
       
       fega.esco();
        System.out.println("Cueal es la medida del la base: ");
        fega.med1 = input.next();
                
    }
}
