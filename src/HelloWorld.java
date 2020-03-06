import java.util.*;

public class HelloWorld {


    public boolean arrayTester(ArrayList a, String b){

        //String input = b;
        //ArrayList<String> tester = new ArrayList<String>();
        

        if(b == (null)){
            System.out.println("null is not a value");
            return false;

        }

        for (int i =0; i < a.size(); i++){

            if (a.get(i).equals(b)){
                System.out.println(a.get(i) + " already in array");
                return false;
            }



        }

        a.add(b);
        System.out.println(b + " added");
        return true;


    }

    public static void main(String[] args){

        HelloWorld test = new HelloWorld();
        ArrayList<String> arlist = new ArrayList<String>();
        arlist.add("bob");
        arlist.add("bob1");
        arlist.add("bob2");
        arlist.add("bob3");
        arlist.add("bob4");
        test.arrayTester(arlist,"bob5");


    }


}
