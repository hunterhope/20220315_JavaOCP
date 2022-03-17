/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day01;

/**
 *
 * @author MB-study
 */
public class AccountMain4 {
    public static void main(String[] args) {
        Account act1=new Account();
        act1.name="John";
        act1.deposit(1000);        
        Account act2=new Account();
        act2.name="Mary";
        act2.deposit(1000);
        act1.print();
        act2.print();
        System.out.println("轉帳");
        act1.transfer(300, act2);
        act1.print();
        act2.print();
        System.out.println("轉帳2");
        Account.transfer(700, act2, act1);
        act1.print();
        act2.print();
    }
}
