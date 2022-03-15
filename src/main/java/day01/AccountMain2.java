/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01;

/**
 *
 * @author MB-study
 */
public class AccountMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Account ac1 = new Account();
        ac1.name = "A01";
        ac1.deposit(100);
        ac1.print();
        
        ac1.deposit(50);
        ac1.print();
        
        ac1.deposit(10);
        ac1.print();
    }
    
}
