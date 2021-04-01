package Ch14.catcha;

public class CatchOutOfBound {
    public static void main(String[] args) {
         int[] a={10, 20, 30, 40};

         try{
             for(int i=0; i<=a.length; i++){
                 System.out.println("a["+i+"]: "+a[i]);
             }
         }catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Exception: "+e);
             System.out.println("Out of range");
         }
         System.out.println("This have to be execute");

    }
}
