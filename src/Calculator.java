import java.util.InputMismatchException;

public class Calculator {

    public int add(int a, int b) throws InputMismatchException{
        if(a>1000 || b>1000){
            throw new InputMismatchException("wrong input");
        }

        return a+b;
    }

    public boolean isEven(int a) throws IllegalArgumentException{
         if (a < 0 || a > 1000){
             throw new IllegalArgumentException("wrong input");
         }
        return (a%2==0);
    }

}
