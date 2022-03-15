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
public class AccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "A01";
        ac1.balance = 100;
        System.out.printf("%s $%,d %n", ac1.name, ac1.balance);
        ac1.balance+=50;
        System.out.printf("%s $%,d %n", ac1.name, ac1.balance);
        ac1.balance=10;
        System.out.printf("%s $%,d %n", ac1.name, ac1.balance);
    }

}
