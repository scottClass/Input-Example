
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Class {

    private String courseCode;
    private int numStudents;
    private Student[] students;

    public Class(Scanner input) {
        numStudents = input.nextInt();
        courseCode = input.nextLine();
        input.nextLine();
        students = new Student[numStudents];
        //create the students
        for(int i = 0; i < numStudents; i++) {
            //create a student
            Student s = new Student(input);
            //put student in list
            students[i] = s;
        }
    }
    
    
    
    /**
     * Returns the course code for the class
     *
     * @return String course code
     */
    public String getCourseCode() {
        return this.courseCode;
    }

    /**
     * Returns the number of students in the class
     *
     * @return the number of students
     */
    public int getNumOfStudents() {
        return this.numStudents;
    }
    
    public String getStudentname(int position) {
        return students[position].getName();
    }
}
