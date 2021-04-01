package Ch12.anony;

public class AnonyDemo {
    public static void main(String[] args) {
        final int a=10;

        new Object(){
            int b=100;
            public void show(){
                System.out.println("Anonymous Class");
                System.out.println("this -> b= "+b);
                System.out.println("main() -> a= "+a);
            }
        }.show();
    }

}
