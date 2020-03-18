package app;

public class Student extends Person {
    // Variables
    private final int max = 30;
    private int numCourses;
    private final String[] courses;
    private int[] grades;

    // Constructor
    public Student(final String name, final String address){
        super(name, address);
        numCourses = 0;
        courses = new String[max];
        grades = new int[max];
    }

    // Other methods
    public void addCourseGrade(final String course, final int grade){
        numCourses++;  // Interesante forma de ir aumentando el índice, fuera de un bucle for también se puede hacer esto
        if(numCourses >= max){
            System.out.println("Maximum number of courses reached!");
        }else{
        courses[numCourses - 1] = course;
        grades[numCourses - 1] = grade;
        }
    }
    public void printGrades(){
        for(int i = 0; i < numCourses; i++){
            System.out.println("Course: " + courses[i] + ". Grade: " + grades[i]);
        }
    }
    public double getAverageGrade(){
        double mean = 0;
        for(double grade : grades){
            mean += grade;
        }
        mean /= numCourses;
        return mean;
    }

    // toString
    @ Override
    public String toString(){
        return ("Student: " + this.getName() + "(" + this.getAddress() + ")");
    }
}