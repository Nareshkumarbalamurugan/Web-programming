/*1. Write a Java program to create a new array list, add some elements (string) and print out
the collection and perform the following operations,
 insert an element into the array list at the first position
 remove the fifth element from a array list
 retrieve an element (at a specified index) from a given array list
 update specific array element by given element
 search an element in a array list
 test an array list is empty or not
 print all the elements of a Array List using the position of the elements
 extract a portion of a array list
 find the number of elements present in an ArrayList
 Using, Collections method perform the following,
o sort a given array list
o shuffle elements in a array list
o reverse elements in a array list
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        
        System.out.println("Original List: " + list);
        
        // Insert at first position
        list.add(0, "Blueberry");
        System.out.println("After adding an element at the first position, the list is: " + list);
        
        // Remove the 5th element (index 4)
        int deleteElementIndex = 4;
        if (deleteElementIndex < list.size()) {
            String removed = list.remove(deleteElementIndex);
            System.out.println("Removed 5th element: " + removed + "\nNew list is: " + list);
        } else {
            System.out.println("Index out of range for removal.");
        }
        
        // Retrieve element at specified index (5)
        int specifiedIndex = 5;
        if (specifiedIndex < list.size()) {
            String element = list.get(specifiedIndex);
            System.out.println("The element in the position " + (specifiedIndex + 1) + " is: " + element);
        } else {
            System.out.println("Index out of range for retrieval.");
        }
        
        // Update specific element at index 2
        int updateIndex = 2;
        if (updateIndex < list.size()) {
            list.set(updateIndex, "Pineapple");
            System.out.println("After updating index " + updateIndex + ": " + list);
        } else {
            System.out.println("Update index is out of range.");
        }
        
        // Search for element "Blueberry"
        String searchElement = "Blueberry";
        if (list.contains(searchElement)) {
            System.out.println("Element '" + searchElement + "' found");
        } else {
            System.out.println("Element '" + searchElement + "' not found");
        }
        
        // Check if list is empty
        boolean emptyCheck = list.isEmpty();
        System.out.println("Is list empty? " + emptyCheck);
        
        // Print all elements with their positions
        System.out.println("All elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
        
        // Extract a portion of the list from index 2 to 5 (exclusive)
        int fromIndex = 2;
        int toIndex = 5;
        if (fromIndex >= 0 && toIndex <= list.size() && fromIndex < toIndex) {
            List<String> subList = list.subList(fromIndex, toIndex);
            System.out.println("Extracted portion of list from index " + fromIndex + " to " + (toIndex - 1) + ": " + subList);
        } else {
            System.out.println("Invalid indices for sublist extraction.");
        }
        
        // Sort the list
        Collections.sort(list);
        System.out.println("List after sort: " + list);
        
        // Shuffle the list
        Collections.shuffle(list);
        System.out.println("List after shuffle: " + list);
        
        // Reverse the list
        Collections.reverse(list);
        System.out.println("List after reverse: " + list);
    }
}
