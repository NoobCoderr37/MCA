package DaysArrayList;

import java.util.*;


public class DaysArrayList {
public static void main(String[] args) {
ArrayList<String> daysList = new ArrayList<String>();
daysList.add("Mon");
daysList.add("Tue");
daysList.add("Wed");
daysList.add("Thu");
daysList.add("Fri");
daysList.add("Sat");
daysList.add("Sun");
System.out.println("Size of the list: " + daysList.size());

Iterator<String> iterator = daysList.iterator();
System.out.println("All days in the list:");
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

if (daysList.contains("Wed")) {
    System.out.println("Wed is present in the list");
} else {
    System.out.println("Wed is not present in the list");
}

daysList.remove(2);
daysList.remove(3);

System.out.println("Size of the list after removing 3rd and 5th day: " + daysList.size());
System.out.println("All days in the list after removing 3rd and 5th day:");
iterator = daysList.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
}
}