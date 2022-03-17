/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day02;

/**
 *
 * @author MB-study
 */
public class Circle {
    private double r;
    private double area;
    
    void setR(double r){
        if(r<0){
            throw new IllegalArgumentException("半徑資料錯誤");
        }
        this.r=r;
    }
    
    void calcAndPrintArea(){
        double area = Math.PI*Math.pow(r, 2);
         System.out.printf("area = %.1f%n",area);
    }
    double calcArea(){
        return Math.PI*Math.pow(r, 2);
    }
    
    void print(){
        System.out.printf("r = %.1f%n",r);
    }
}
