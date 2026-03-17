package tuto_1;
public interface Account {
    int deposit(int amount);
    boolean withdraw(int amount);
}

class BankAccount implements Account{
    int balance;
    BankAccount(int balance){
        this.balance=balance;
    }
    @Override
    public boolean withdraw(int amount){
        if(balance<amount){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public int deposit(int amount){
        return balance+amount;
    }
    
}
