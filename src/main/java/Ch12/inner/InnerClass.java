package Ch12.inner;

public class InnerClass {
    public static void main(String[] args) {
        Outer o =new Outer();
        o.callInner();
        System.out.println();
    /*
        Outer.Inner i = new Outer().new Inner(); // outer constuct inner object
        i.print();

     */
        new Outer().new Inner().print();
    }
}
