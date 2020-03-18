package app;

public class Teacher extends Person{
    // Variables
    private int numCourses;
    private String[] courses;
    private int max = 30;

    // Constructor
    public Teacher(String name, String address){
        super(name, address);
        numCourses = 0;
        courses = new String[max];
    }

    // ** Other methods

    public boolean addCourse(String course){
        // Temp necessary bool variable
        boolean courseExist = false;
        // No possibility of adding more courses
        if(numCourses >= max){
            System.out.println("Max number of courses reached!");
        }else{
            // Foreach course
            for (String c : courses) {
                // If coincidence, send message, turn bool variable into true and exit
                if(course == c){
                    System.out.println("Course already exists!");
                    courseExist = true;
                    break;
                }
            }
            // If there is no coincidence, append course
            if(courseExist == false){
                courses[numCourses] = course;
            }
        }
        // Augment counter for courses and return bool
        numCourses++;
        return courseExist;
    }
    public boolean removeCourse(String course){
        // New string array to store the courses to keep, its counter, and temp bool
        int i = 0;
        String[] courses_prime = new String[max];
        boolean coincidence = false;
        // For each course in original list
        for (String c : courses) {
            // If there is no coincidence, store course in new array
            if(course != c){
                courses_prime[i] = c;
            }else{
                // If coincidence, not incorporate it
                i--;
                coincidence = true;
            }
            i++;
        }
        courses = courses_prime;
        // If course was not fount, print message
        if(coincidence == false){
            System.out.println("Course does not exist!");
        }
        return coincidence;
    }

    // To String
    @Override
    public String toString(){
        return ("Teacher: " + super.getName() +"(" + super.getAddress() + ")");
    }
}