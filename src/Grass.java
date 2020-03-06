
/*
Hvor tit skal græsset slås
Om sommeren vokser græsset ca. 0,8 cm om dagen.
Skriv en metode, der tager imod 2 inputparametre: hvor langt græsset er lige nu og hvor højt det må være for at skulle slås. Metoden skal beregne og returnere hvor mange dage der er til, at græsset skal slås næste gang.
Hvor højt græsset er, når det skal slås, kan forstås på 2 måder.
1. Græsset skal overstige denne værdi, før vi starter græsslåmaskinen 2. Græsset skal slås, inden værdien overstiges
Du vælger selv hvilken løsning du vil implementere.
Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen. Alle tal, som bliver udskrevet, bør kun have 2 decimaler efter kommaet.
 */

import java.lang.*;
import java.util.Scanner;

public class Grass{

    Scanner s = new Scanner(System.in);
    double howHigh;
    double cutLimit = 1.0;
    double avgGrowth = 0.1;
    boolean condition = false;

    boolean checker (){

        System.out.println("how high is the grass");
        while (!s.hasNextDouble()){
            System.out.println("please enter double");
            s.next();
        }
        howHigh = s.nextDouble();

        if(howHigh > cutLimit){

            System.out.println("initiate robot madness");
            return true;
        }

        if(howHigh-cutLimit == 0){
            System.out.println("no need for cutting today");
            return false;
        }

        double temp = Math.abs((cutLimit - howHigh));
        int result = (int)(temp / avgGrowth);
        System.out.println("no need for cutting before " + result + " days");

        return false;

    }

    public static void main(String[] args) {
        Grass house = new Grass();
        house.checker();
    }


}