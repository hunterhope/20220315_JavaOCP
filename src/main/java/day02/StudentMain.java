/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day02;

/**
 *
 * @author MB-study
 */
public class StudentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setHeight(170);
        s1.setWeight(60);
        s1.setScore(90);
        s1.print();
        Student s2 = new Student();
        s2.setName("Mary");
        s2.setHeight(180);
        s2.setWeight(50);
        s2.setScore(100);
        s2.print();
               
    }
    
}
