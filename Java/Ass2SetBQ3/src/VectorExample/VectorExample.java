package VectorExample;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a new Vector object
        Vector<Object> vector = new Vector<Object>();

        // Print the initial capacity of the vector
        System.out.println("Initial capacity of vector: " + vector.capacity());

        // Check if the vector is empty
        System.out.println("Is vector empty? " + vector.isEmpty());

        // Add 4 objects to the vector
        vector.add(10);
        vector.add(3.14f);
        vector.add("Hello");
        vector.add(new StringBuffer("World"));

        // Display all elements of the vector
        System.out.println("Elements of vector: ");
        for (Object obj : vector) {
            System.out.println(obj);
        }
        System.out.println("Is vector empty after deletion? " + vector.isEmpty());
        // Delete all elements of the vector
        vector.clear();

        // Check if the vector is empty after deletion
        System.out.println("Is vector empty after deletion? " + vector.isEmpty());
    }
}
