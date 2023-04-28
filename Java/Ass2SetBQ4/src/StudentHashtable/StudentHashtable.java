package StudentHashtable;
import java.util.Hashtable;
public class StudentHashtable {
public static void main(String[] args) {
Hashtable<Integer, String> student = new Hashtable<Integer, String>();
student.put(101, "John");
student.put(102, "Mary");
student.put(103, "Peter");
student.put(104, "David");
student.put(105, "Sarah");
System.out.println("Hashtable elements: " + student);

student.remove(101);
System.out.println("After removing John: " + student);
}
}