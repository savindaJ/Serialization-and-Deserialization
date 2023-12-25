package lk.ijse.example.Deserialization;

import com.google.gson.Gson;
import lk.ijse.example.Student;

/**
 * @author : savindaJ
 * @date : 12/25/2023
 * @since : 0.1.0
 **/
public class JsonToObj {
    public static void main(String[] args) {
        // json String
        String json = "{\"studentId\":\"S001\",\"studentName\":\"savinda\",\"studentAddress\":\"Matara\",\"studentAge\":21}";

        Gson gson = new Gson();
        Student student = gson.fromJson(json, Student.class);
        System.out.println(student);
    }
}
