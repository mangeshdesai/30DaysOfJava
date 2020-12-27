import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) throws Exception {
        String basePath = "C:\\Users\\mdesai\\workspace\\java\\30daysjava\\MySweetProgram\\src\\";
        String testFilename = basePath + "test";
        String studentFilename = basePath + "students.txt";
        Scanner in; // = new Scanner(new File(testFilename));

        List<String> students = new ArrayList<>();

//        while(in.hasNextInt()) {
//            System.out.println(in.nextInt());
//        }
//
//        in.close();
        in = new Scanner(new File(studentFilename));

        while (in.hasNextLine()) {
            students.add(in.nextLine());
        }

        for(String student : students) {
            System.out.println(student);
        }


//        System.out.println("Enter array size.");
//        int size = in.nextInt();
//
//        int[] grades = new int[5];
//
//        System.out.println("Enter " + size + " numbers.");
//
//        for(int i = 0; i < 5; i++) {
//            grades[i] = in.nextInt();
//        }
//
        in.close();
//
//        for(int i = 0; i < 5; i++) {
//            System.out.println(grades[i]);
//        }
    }
}
