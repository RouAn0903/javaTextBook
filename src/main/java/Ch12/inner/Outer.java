package Ch12.inner;

public class Outer {
    private int i=1, j=2;
    static int k=3;

    class Inner{
        int j=4, k=5;
        void print(){
            System.out.print(i);
            System.out.print(Outer.this.j);
            System.out.print(Outer.k);
            System.out.print(j);
        }
    }

    void callInner(){
        Inner in = new Inner();
        in.print();
    }
}
