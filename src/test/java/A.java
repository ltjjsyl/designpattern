import java.io.IOException;

public class A <T>{
    /*public A ()throws IOException{
        Exception a = new Exception();
        a.initCause(new RuntimeException());
    }*/

   private T a;

   public A(){
      // a = x;
   }

   private T get(){
       System.out.println(a.getClass().getSimpleName());
       return a;
   }

    private void set(T x){
        a= x;

    }

    public static void main(String[] args) {
        A xx =  new A();
        xx.set("ss");
        System.out.println(xx.get());
    }
}
