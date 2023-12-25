package lk.ijse.example.Serialization;

import com.google.gson.Gson;
import lk.ijse.example.Student;

/**
 * @author : savindaJ
 * @date : 12/25/2023
 * @since : 0.1.0
 **/
public class ObjToJson {
    public static void main(String[] args) {
        Student student = new Student("S001", "savinda", "Matara", 21);

        String json = new Gson().toJson(student);

        long l = System.currentTimeMillis();

        System.out.println("Gson Output :"+json+" "+(System.currentTimeMillis()-l+"ms"));



    }
}
