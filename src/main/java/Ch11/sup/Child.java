package Ch11.sup;

public class Child extends Parent{
    int i=20;

    void show(){
        System.out.println("child:"+i);
       super.show();
    }
}
