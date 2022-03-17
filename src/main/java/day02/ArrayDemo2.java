/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores={100,90,87};
        
        IntSummaryStatistics result = Arrays.stream(scores)
                .summaryStatistics();
        System.out.println(result);
    }
}
