// File: Assignment5/Medium/DeserializeStudent.java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) in.readObject();
            System.out.println("Reading from file...");
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student GPA: " + student.getGpa());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while reading student: " + e.getMessage());
        }
    }
}
