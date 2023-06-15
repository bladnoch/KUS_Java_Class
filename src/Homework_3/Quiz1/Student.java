
package Homework_3.Quiz1;

/**
 * Student.java
 * @author DoungukKim
 * @since 6/4/2023
 * @version v0.0.1
 */

import java.util.Random;

public class Student{
    private String department;
    private String studentID;
    private boolean isMale;
    private double height;
    private double weight;
    private static int count=1;
    private static Random rd=new Random();

    /**
     * Student() constructor
     * no parameter in this constructor
     */
    public Student() {
        this("undecided", "studentID",rd.nextBoolean() , 0.0, 0.0);
    }

    /**
     * Student() constructor. three param contains
     * @param isMale: sets gender by boolean true is male
     * @param height: student's height
     * @param weight: student's weight
     */
    public Student( boolean isMale, double height, double weight) {
        this("undecided", "", isMale, height, weight);
    }

    /**
     * Student() constructor five param contains
     * @param department: department of student. default is "undecided"
     * @param studentID: sets student ID
     * @param isMale: sets isMale by boolean true is male
     * @param height: sets height
     * @param weight: sets weight
     */
    public Student(String department, String studentID, boolean isMale, double height, double weight) {
        this.department = department;
        this.studentID = String.format("Student_%05d", count++);
        this.isMale = isMale;
        setHeight(isMale);
        this.height = getHeight();
        setWeight(isMale);
        this.weight = getWeight();
    }

    /**
     * getDepartment() method
     * @return String type department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * getStudnetID() method
     * @return student ID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * isMale() method
     * @return gender by boolean (male: true, female: false)
     */
    public boolean isMale() {
        return isMale;
    }

    /**
     * seHeight() method
     * @param isMale: gender of the variable
     * seting height by isMale if isMale is true +173 on height, if it's false +162 on height
     */
    public void setHeight(boolean isMale){
        double meanHeight = isMale ? 173.0 : 162.0;
        this.height = rd.nextGaussian()+ meanHeight;
    }

    /**
     * getHeight() method
     * @return height of the student
     */
    public double getHeight() {
        return height;
    }
    /**
     * seWeight() method
     * @param isMale: gender of the variable
     * seting height by isMale if isMale is true +68 on height, if it's false +52 on height
     */
    public void setWeight(boolean isMale){
        double meanWeight = isMale ? 68 : 52;
        this.weight = rd.nextGaussian()+ meanWeight;
    }
    /**
     * getWeight() method
     * @return Weight of the student
     */
    public double getWeight() {
        return weight;
    }
}
