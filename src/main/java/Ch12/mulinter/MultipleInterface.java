package Ch12.mulinter;

public class MultipleInterface implements Child1{
    @Override
    public void showI() {
        System.out.println("i ="+i);
    }

    @Override
    public void showJ() {
        System.out.println("j ="+j);
    }

    @Override
    public void show() {
        showI();
        showJ();
    }

    public static void main(String[] args) {
        MultipleInterface m = new MultipleInterface();
        m.show();
    }
}
