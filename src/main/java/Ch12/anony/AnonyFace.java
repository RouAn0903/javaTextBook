package Ch12.anony;

public class AnonyFace {
    public static void main(String[] args) {
        /*
        Face c = new Face() {
            @Override
            public void shile() {
                System.out.println("^ M ^");
            }
        };
        c.shile();

         */
        new Face(){
            @Override
            public void shile() {
                System.out.println("^ M ^");
            }
        }.shile();
    }
}
