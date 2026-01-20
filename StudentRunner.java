/*
 * Project: Galactic High Student Constructors
 * Description: Runner program that creates Student objects and prints their data
 *              using accessor methods. Focus: testing your constructors.
 */

public class StudentRunner
{
    public static void main(String[] args)
    {
        // These two objects are here to help you test BOTH constructors.
        Student student1 = new Student("Avery", 48219);
        Student student2 = new Student("Riley", 90311, 17);

        // TODO: Create student3 using the 2-parameter constructor.
        // Required values: name "Jordan", studentId 13579
        Student student3 = new Student("Jordan", 13579);

        // Full example of using accessor methods (getters):
        System.out.println("Student 1: name=" + student1.getName()
                + ", id=" + student1.getStudentId()
                + ", age=" + student1.getAge());

        System.out.println("Student 2: name=" + student2.getName()
                + ", id=" + student2.getStudentId()
                + ", age=" + student2.getAge());

        // TODO: Print student3 in the same format as the lines above.
        
        System.out.println("Student 3: name=" + student3.getName()
         + ", id=" + student3.getStudentId()
         + ", age=" + student3.getAge());
    }
}
