import java.io.File;
import java.util.*;

public class MySweetProgram {

    public static void main(String[] args) {
        // Stack - using LinkedList

        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");

        // names.remove() - remove elements from front i.e. FIFO
        // names.removeLast() - remove elements from end i.e. LIFO
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
    }
}
