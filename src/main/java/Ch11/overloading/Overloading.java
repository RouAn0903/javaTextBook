package Ch11.overloading;

public class Overloading {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show("I'm child");
        c.show();

    }
}
