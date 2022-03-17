/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day02;

/**
 *
 * @author MB-study
 */
public class CircleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.setR(7.5);
        c1.print();
        c1.calcAndPrintArea();
        double area = c1.calcArea();
        System.out.printf("area = %.2f%n",area);
    }
    
}
