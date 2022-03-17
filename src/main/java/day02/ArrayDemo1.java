/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day02;

import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0]=100;
        scores[1]=90;
        scores[2]=80;
        
        System.out.println("陣列長度:"+scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
//        System.out.println(scores[3]);
        IntStream.range(0, scores.length).forEach(i->System.out.println(scores[i]+" "));
        
    }
}
