import com.fasterxml.jackson.databind.ObjectMapper;
import data.Student;

import java.io.File;

/**
 * Created by Suthanth.DK on 22-08-2018.
 */

public class ApplicationDemo {

    public static void main(String args[]) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("D:\\Personel\\SpringExmaples\\SpringJsonToPojoExample\\src\\jsonFiles\\sample-full.json"),Student.class);
            System.out.println("Student Name : "+ student.getFirstName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
