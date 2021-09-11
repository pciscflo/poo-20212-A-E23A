package excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utilitario {
    public static void leerFile(String path) throws Exception {
        Scanner sc = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);//checked exception
            sc = new Scanner(fis);    //file to be scanned
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());      //returns the line that was skipped
            }
        } catch (FileNotFoundException e) {
           // e.printStackTrace();//al log al programador
           throw new Exception("Disculpe la molestia, intente de nuevo");//al cliente
       }
    }
}
