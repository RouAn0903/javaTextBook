package Ch12.inter;

public class SimpleInheritance implements Child{
    @Override
    public void show() {
        System.out.println("i ="+i);
    }

    @Override
    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        SimpleInheritance s = new SimpleInheritance();
        s.show();
    }
}
