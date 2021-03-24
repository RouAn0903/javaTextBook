package Ch11.poly;

public class Polymorphism {
    public static void main(String[] args) {
        Parent p= new Parent();
        p.show();
        Child c = new Child();
        c.show();
        c.show("I'm good");

    }
}
