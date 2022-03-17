/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day02;

/**
 *
 * @author MB-study
 */
public class RectMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setWidthAndHigh(30, 50);
        int area = rect.getArea();
        System.out.printf("area = %,d\n", area);
    }

}
