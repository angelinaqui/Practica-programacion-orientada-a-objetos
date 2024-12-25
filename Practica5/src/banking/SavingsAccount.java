/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author alumno
 */
public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;   
    }
}
