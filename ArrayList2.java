/*2. Write a Java program to create ArrayList of user defined objects called Person with
name and age as parameters and perform few operations mentioned in question1.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define the Person class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() to print Person objects nicely
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class PersonArrayListOperations {
    public static void main(String[] args) {
        // Create ArrayList of Person objects
        ArrayList<Person> people = new ArrayList<>();

        // Add some Person objects
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Diana", 28));
        people.add(new Person("Evan", 40));
        people.add(new Person("Fiona", 22));
        people.add(new Person("George", 33));

        System.out.println("Original list: " + people);

        // Insert a new Person at first position
        people.add(0, new Person("Zara", 27));
        System.out.println("After adding Zara at first position: " + people);

        // Remove the fifth element (index 4)
        if (people.size() > 4) {
            Person removed = people.remove(4);
            System.out.println("Removed 5th person: " + removed + "\nNew list: " + people);
        }

        // Retrieve element at specified index (e.g., 5)
        int retrieveIndex = 5;
        if (retrieveIndex < people.size()) {
            Person p = people.get(retrieveIndex);
            System.out.println("Person at position " + (retrieveIndex + 1) + ": " + p);
        }

        // Update element at index 2
        int updateIndex = 2;
        if (updateIndex < people.size()) {
            people.set(updateIndex, new Person("Hannah", 29));
            System.out.println("After updating index " + updateIndex + ": " + people);
        }

        // Search for a Person named "Alice"
        boolean found = false;
        for (Person person : people) {
            if ("Alice".equals(person.name)) {
                found = true;
                break;
            }
        }
        System.out.println("Is 'Alice' found? " + found);

        // Test if list is empty
        System.out.println("Is list empty? " + people.isEmpty());

        // Print all elements with their positions
        System.out.println("All people with positions:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Position " + i + ": " + people.get(i));
        }

        // Extract a portion of the list (index 2 to 5)
        int fromIndex = 2;
        int toIndex = 5;
        if (fromIndex >= 0 && toIndex <= people.size() && fromIndex < toIndex) {
            List<Person> subList = people.subList(fromIndex, toIndex);
            System.out.println("Extracted portion (index " + fromIndex + " to " + (toIndex - 1) + "): " + subList);
        }

        // Find the number of elements
        System.out.println("Number of elements in the list: " + people.size());

        // Sort the list by name (alphabetically)
        Collections.sort(people, Comparator.comparing(person -> person.name));
        System.out.println("List after sorting by name: " + people);

        // Shuffle the list
        Collections.shuffle(people);
        System.out.println("List after shuffle: " + people);

        // Reverse the list
        Collections.reverse(people);
        System.out.println("List after reverse: " + people);
    }
}
