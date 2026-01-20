/*
 * Project: Galactic High Student Constructors
 * Description: Create a Student class with private instance variables and two constructors
 *              (constructor overloading). This file is intentionally incomplete.
 */

public class Student
{
    // =========================================================
    private String name;
    private int studentId;
    private int age;
    
    // =========================================================


    // =========================================================
    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
        this.age=0;
    }
        
        public Student(String name, int studentId, int age){
            this.name = name;
            this.studentId = studentId;
            this.age = age;
        }
    
    // =========================================================


    // Accessor methods (getters) are provided for you.
    // We'll focus on writing these later, but you can use them now.
    public String getName()
    {
        return name;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public int getAge()
    {
        return age;
    }
}
