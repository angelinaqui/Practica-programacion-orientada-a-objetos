/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

public class Bank {
    private Customer[] customers;
    private int numOfCustomer = 0;
    public Bank(){
        this.customers = new Customer[5];
    }
    public void addCustomer(String firstName, String lastName){
        Customer client = new Customer(firstName, lastName);
        customers[numOfCustomer]=client;
        numOfCustomer++;
    }
    public int getNumOfCustomers(){
        return this.numOfCustomer;
    }
    public Customer getCustomer(int index){
        return customers[index];
    }
}