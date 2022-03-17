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
    
    //提款程序
    public void withdrawal(int amount){
        if(amount<=0){
            System.out.println("金額錯誤");
            return;//中斷方法
        }
        if(balance >= amount){
            balance-=amount;
        }else{
            System.out.println("餘額不足");
        }
        
    }
    //印出帳戶餘額
    public void print(){
        System.out.printf("%s $%,d %n",name,balance);
    }
}
