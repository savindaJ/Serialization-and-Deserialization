package lk.ijse.example.Deserialization;

import lk.ijse.example.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author : savindaJ
 * @date : 12/25/2023
 * @since : 0.1.0
 **/
public class Deserialization {
    public static void main(String[] args) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("G:\\WorkZone\\Serialization\\Serialization-01\\src\\main\\resources\\student.txt"));

            Student student = (Student) input.readObject();

            System.out.println(student);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
