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
public class Account {
    String name;
    int balance;
    
    //amount : 存款金額
    public void deposit(int amount){
        balance+=amount;
    }
    //印出帳戶餘額
    public void print(){
        System.out.printf("%s $%,d %n",name,balance);
    }
}
