package Ch14.account;

public class Account {
    private long balance;

    public Account(long money){
        balance=money;
    }

    public void deposit(long money) throws AccountError{
        if(money<0){
            System.out.print("Deposit money can't be negative");
        }else{
            balance+=money;
        }
    }

    public void withdraw(long money) throws AccountError{
        if(balance<money){
            System.out.println("There is't enough money");
        }else{
            balance-=money;
        }
    }

    public long checkBalance(){
        return balance;
    }
}
