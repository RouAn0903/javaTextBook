package Ch12.lambda;

public class LambdaFace {
    public static void main(String[] args) {
        Face1 c1 = () -> System.out.println("^ M ^");
        c1.smile();
    }
}
