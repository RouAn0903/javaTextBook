package Ch14.account;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAccount {
    public static void main(String[] args) throws IOException {
        System.out.println("Simple account simulation calculation");
        System.out.println("To open the account, deposit 100 dollars first");
        Account myAccount = new Account(100);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        try{
            while(true){
                System.out.println("You want (1)deposit (2)withdraw -> ");
                str= br.readLine();
                int choice = Integer.parseInt(str);
                System.out.println("Please enter the money -> ");
                str=br.readLine();
                int money =Integer.parseInt(str);

                if(choice ==1){
                    myAccount.deposit(money);
                    System.out.println("Deposit "+money+", account left ");
                    System.out.println(myAccount.checkBalance()+" dollars");
                }else if(choice ==2){
                    myAccount.withdraw(money);
                    System.out.println("Withdraw"+money+", account left ");
                    System.out.println(myAccount.checkBalance()+" dollars");
                }
            }
        }catch (AccountError e){
            System.out.println(e);
        }
    }

}
