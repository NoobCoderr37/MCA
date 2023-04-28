package ColorLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ColorLinkedList {
public static void main(String[] args) {
LinkedList<String> colors = new LinkedList<String>();
colors.add("Red");
colors.add("Green");
colors.add("Blue");
colors.add("Yellow");
ListIterator<String> iterator = colors.listIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

colors.addFirst("Orange");
colors.addFirst("Purple");

colors.removeLast();

System.out.println("Updated List:");
iterator = colors.listIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
}
}