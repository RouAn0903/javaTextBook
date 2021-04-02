package Ch14.account;

import java.io.IOException;

public class Account {
    private long balance;

    public Account(long money){
        balance=money;
    }

    public void deposit(long money) throws AccountError{
        if(money<0){
            throw new AccountError("Deposit can't negative");
        }else{
            balance+=money;
        }
    }

    public void withdraw(long money) throws AccountError{
        if(money>balance){
            throw new AccountError("There's not enough money");
        }else{
            balance-=money;
        }
    }

    public long checkBalance(){
        return balance;
    }
}
