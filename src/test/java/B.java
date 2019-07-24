import java.io.IOException;

public class B {
    public B() throws Exception {

    }

    public static void main(String[] args) {
       
        try{
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("catch："+ e.getCause());
            throw new RuntimeException();

        }
    }
}
