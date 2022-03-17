/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class ArrayDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = {40,90,100,50,35,80,60};
        System.out.println(Arrays.toString(scores));
        IntSummaryStatistics result = Arrays.stream(scores).summaryStatistics();
        System.out.println(result);
    }
    
}
