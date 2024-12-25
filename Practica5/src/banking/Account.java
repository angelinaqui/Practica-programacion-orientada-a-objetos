package banking;
public class Account {
    protected double balance;
    
    public Account(double initBalance)
    {
        balance = initBalance;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public boolean deposit(double agregar)
    {
        balance += agregar;
        return true;
    }
    
    public boolean withdraw(double restar){
        if(restar > balance){
            return false;
        }else{
            balance -= restar;
            return true;
        }
    }
}

