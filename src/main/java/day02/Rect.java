/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day02;

/**
 *
 * @author MB-study
 */
public class Rect {
    private int width;
    private int high;
    private int area;
    
    void setWidthAndHigh(int w, int h) {
        width = w;
        high = h;
        area = w * h;
    }
    
    int getArea() {
        return area;
    }
    
}
