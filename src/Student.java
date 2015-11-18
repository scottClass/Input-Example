
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Student {
    private String name;
    private String homeRoom;
    private int studentNumber;
    private boolean isSpecialist;
    private String specialist;
    
    
    public Student(Scanner input) {
        name = input.next();
        homeRoom = input.next();
        studentNumber = input.nextInt();
        String check = input.next();
        if(check.equals("Y")) {
            isSpecialist = true;
            specialist = input.nextLine();
        } else {
            isSpecialist = false;
            input.nextLine();
        }
    }
    
    
    /**
     * 
     * @return student's name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * 
     * @return student number
     */
    public int getStudentNumber() {
        return this.studentNumber;
    }
    
    /**
     * 
     * @return homeroom code
     */
    public String getHomeRoom() {
        return this.homeRoom;
    }
    
    /**
     * 
     * @return if student is specialist
     */
    public boolean isSpecialist() {
        return this.isSpecialist;
    }
    
    /**
     * 
     * @return specialist type
     */
    public String getSpecialist() {
        return this.specialist;
    }
}
