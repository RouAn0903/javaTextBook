package Ch14.input;

import java.util.Scanner;

public class Input {
    public static boolean quit=false;
    public static int sel=0;
    public static String str=null;

    public static void value(){
        Scanner sc = new Scanner(System.in);
        while(true){
            if(sc.hasNextInt()){
                sel = sc.nextInt();
                if(sel>1 & sel<=5){
                    break;
                }else{
                    System.out.println("Please enter 1-5 ");
                    continue;
                }
            }else if(sc.hasNext()){
                str = sc.next();
            }if(str.equalsIgnoreCase("q")){
                quit=true;
                break;
            }else{
                System.out.println("Please enter 1-5 ");
                continue;
            }
        }
    }
}
