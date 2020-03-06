import java.util.HashMap;
import java.util.Objects;

public class Maps {

    HashMap<String,String> words = new HashMap<>();
        /*

        Skriv en metode der hedder contains3 som tager en liste af Strings som parameter og returnerer true
        hvis der i listen findes bare en String som forekommer mindst 3 gange i listen.
        Ellers returneres false.
        Brug en map som datastruktur.

        key = word
        value = occurance

         */

        public boolean contains3 (String[] s){

            for (int i = 0; i < s.length; i++){

                System.out.println(s[i]);


            }

            return true;
        }

    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<>();
        countries.put("France","Paris");
        countries.put("Denmark","Copenhagen");
        countries.put("Italy","Rome");

        System.out.println(countries.toString());
        System.out.println(countries.size());
        System.out.println(countries.isEmpty());

        String[] s = {"a","b","c","d","e","f","g"};














    }
}
