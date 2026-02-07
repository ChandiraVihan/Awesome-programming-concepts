import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {
    
    // K (Key) is String (studentID), V (Value) is the Student object
    private Map<String, Student> studentMap = new HashMap<>();

    
    public void addStudent(Student s) {
        studentMap.put(s.studentId, s);
    }

    
    public Student findStudentById(String studentId) {
        return studentMap.get(studentId);
    }

    public static void main(String[] args){

    StudentDatabase db = new StudentDatabase();

        // Create some student objects to add to the database.
        Student student1 = new Student("S101", "Alice", 3.8);
        Student student2 = new Student("S102", "Bob", 3.4);
        Student student3 = new Student("S103", "Charlie", 3.9);

        // Call the addStudent method with a Student object as an argument.
        db.addStudent(student1);
        db.addStudent(student2);
        db.addStudent(student3);

        System.out.println("\n--- Finding Students ---");

        //  Find a student that exists ---
        System.out.println("Searching for ID S102...");
        Student foundStudent = db.findStudentById("S102");
        System.out.println("Found: " + foundStudent); // Uses the toString() method

        //  Find a student that does NOT exist ---
        System.out.println("\nSearching for ID S999...");
        Student notFoundStudent = db.findStudentById("S999");
        System.out.println("Found: " + notFoundStudent); // This will print "null"
    
}
}
