import java.io.File;
import java.util.*;

public class MySweetProgram {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");

        ListIterator<String> it = names.listIterator();
        it.next();
        it.next();
        it.add("Susan");

//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        for(String s : names) {
            System.out.println(s);
        }
    }
}
