package Ch14.account;

public class Account {
    private long balance;

    public Account(long money){
        balance=money;
    }

    public void deposit(long money) throws AccountError{
        if(money <0){
            throw new AccountError("Deposit cannot be negative");
        }else{
            balance +=money;
        }
    }

    public void withdraw(long money) throws AccountError{
        if(money >balance){
            throw new AccountError("Insufficient deposit");
        }else{
            balance-=money;
        }
    }

    public long checkBalance(){
        return balance;
    }
}
