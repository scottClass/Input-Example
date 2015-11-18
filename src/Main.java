
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johns6971
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //an array list to store classes
        ArrayList<Class> classes = new ArrayList<>();

        //Used to read a file
        FileReader file = null;
        try {
            file = new FileReader("students/students.txt");
        } catch (Exception e) {
            //Prints error message
            e.printStackTrace();
            //stops program
            System.exit(0);
        }
        
        Scanner input = new Scanner(file);
        
        //keep scanning as long as there is something to scan
        while(input.hasNext()) {
            //creating a class from the file
            Class c = new Class(input);
            //adding the class for the list
            classes.add(c);
        }
        
        for(int i = 0; i < classes.size(); i ++) {
            Class c = classes.get(i);
            System.out.println(c.getCourseCode());
        }
        
    }
}
