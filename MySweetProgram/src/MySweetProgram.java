import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) throws Exception {
        String basePath = "C:\\Users\\mdesai\\workspace\\java\\30daysjava\\MySweetProgram\\src\\";
        List<String> students = new ArrayList<>();
        Scanner in = new Scanner(new File(basePath + "students.txt"));

        while (in.hasNextLine()) {
            students.add(in.nextLine());
        }

        for(String student : students) {
            System.out.println(student);
        }
        in.close();
    }
}
