/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author alumno
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;
    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance, double protect){
        super(balance);
        overdraftProtection = protect;
    }
    public boolean withdraw(double restar){
        if(restar > balance + overdraftProtection){
                return false;
        }
        else{
            balance =(balance+overdraftProtection) - restar;
            return true;
        }
    }
}
