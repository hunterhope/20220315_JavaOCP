/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day02;

public class Student {

    private String name;
    private double height;
    private double weight;
    private int score;

    void setHeight(double h) {
        if (h <= 0 || h > 250) {
            throw new IllegalArgumentException("身高資料錯誤");
        }
        height = h;
    }

    void setWeight(double w) {
        if (w <= 0 || w > 300) {
            throw new IllegalArgumentException("體重資料錯誤");
        }
        weight = w;
    }

    void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("分數資料錯誤");
        }
        this.score = score;
    }

    void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.printf("name=%s height=%.1f weight=%.1f score=%d%n", name, height, weight, score);
    }
}
