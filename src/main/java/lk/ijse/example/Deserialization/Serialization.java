package lk.ijse.example.Deserialization;

import lk.ijse.example.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author : savindaJ
 * @date : 12/25/2023
 * @since : 0.1.0
 **/
public class Serialization {
    public static void main(String[] args) {
        Student student = new Student("S001", "savinda", "Matara", 21);

        try {
            FileOutputStream out = new FileOutputStream("student.txt");

            ObjectOutputStream obj = new ObjectOutputStream(out);

            obj.writeObject(student);

            obj.flush();

            obj.close();

            System.out.println("Succsess !");


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
