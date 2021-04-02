package Ch14.input;

public class TestInput {
    public static void main(String[] args) {
        int[] secret = {123,456,789,1234,2345};
        System.out.println("There are five secret numbers, choose one");

        Input.value();

        if(Input.quit){
            System.out.println("Bye");
        }else{
            System.out.println("Number "+Input.sel+" is "+secret[Input.sel-1]);
        }
    }
}
