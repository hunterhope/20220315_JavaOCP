/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day02;
public class Student {
    String name;
    double height;
    double weight;
    int score;
    
    void setHeight(double h){
        height=h;
    }
    
    void setWeight(double w){
        weight=w;
    }
    
    void setScore(int score){
        this.score=score;
    }
    void setName(String name){
        this.name=name;
    }
    
    void print(){
        System.out.printf("name=%s height=%.1f weight=%.1f score=%d%n",name,height,weight,score);
    }
}
