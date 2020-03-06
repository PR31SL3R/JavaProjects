import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class MyExceptions{
    public static void main(String[] args) {
        System.out.println("enter filename");
        Scanner userInputScanner = new Scanner(System.in);
        String filePath = userInputScanner.nextLine();
        File fileToRead = new File(filePath);
        ArrayList<String>fileAsList=new ArrayList<>();

        try{
            if(!fileToRead.exists()){
                throw new FileNotFoundException("could not find file");
            }
            Scanner textScanner = new Scanner(fileToRead);
            while(textScanner.hasNextLine()){
                fileAsList.add(textScanner.nextLine());
            }
            System.out.println(fileAsList.size());
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("random error");
        }
    }
}