import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter first int");

        try {
            while (!s.hasNextInt()) {

                System.out.println("not int");

                s.next();
        }
            int number = s.nextInt();

            System.out.println("enter second int");
            while(!s.hasNextInt()){
                System.out.println("not int");
                s.next();

            }

            int number2 = s.nextInt();

            System.out.println("first number is " + number + "\nSecond number is " + number2);

            if(number2 == 0){
                System.out.println("not divide by zero");

            }
            else{
                System.out.println(number/number2);
            }

           


            
        }

        catch(InputMismatchException e){
        }

    }
}
