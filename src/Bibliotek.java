import java.util.ArrayList;

public class Bibliotek {


    //public void checker(obj[]){

    public boolean arraytester(ArrayList<Bog> E, Bog testbog){

        System.out.println(E);
        for (Bog tester: E
             ) {
            if(tester.getISBN()==testbog.getISBN()){
                System.out.println("hej hej");
                return false;

            }



        }



        return true;
    }




    public static void main(String[] args) {
        ArrayList<Bog>test= new ArrayList<>();
        test.add(new Bog(123,"test",1964));


        Bog harrypotter1 = new Bog(1234,"test",1965);
        Bog harrypotter2 = new Bog(12345,"test",1966);
        Bog harrypotter3 = new Bog(123456,"test",1967);
        Bog harrypotter4 = new Bog(1234567,"test",1968);
        test.add(harrypotter1);
        test.add(harrypotter2);
        test.add(harrypotter3);
        test.add(harrypotter4);

        Bibliotek bob = new Bibliotek();
        bob.arraytester(test,new Bog(1234,"test",1965));







    }
}
