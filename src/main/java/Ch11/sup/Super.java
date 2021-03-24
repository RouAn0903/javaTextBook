package Ch11.sup;

public class Super {
    public static void main(String[] args) {
        Child c=new Child();
        c.show();

        Parent p=c;
        System.out.println(p.i);

    }
}
