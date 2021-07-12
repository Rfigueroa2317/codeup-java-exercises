import java.util.ArrayList;

public class CollectionsExamples {
    public static void main(String[] args) {

        // *** Collections *** \\

        //Collection = A data structure that can be used to group,
        // or collect objects. The 'Java standard library', a
        // collection of code that comes with the Java language,
        // contains many collections to help with common
        // programming tasks.

        // The collection classes come from the 'java.util' package.
        // The two most common are 'Arraylist', and 'HashMaps'.


        // *** Array Lists *** \\

        // ArrayList = a class that represents an array that can change
        // it's size. All elements in an 'ArrayList' must be objects,
        // and they must have the same type. Arrays in Java have a fixed
        // length; meaning that once they are created they cannot change
        // their length. In order to "add" an item to an array, you must
        // make a copy of the array with a length bigger than the original.
        // Think of an 'ArrayList' as a wrapper around the native Java array
        // that handles the details of resizing the array to add elements
        // for you.

        // 'ArrayList's are used a little differently than arrays are; they
        // have methods that handle common array operations, as opposed to
        // using the Arrays helper class and passing the instance.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20); // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);

        System.out.println(numbers); // [21,20,22]

        numbers.size(); // 3
        numbers.get(2); // 22

        numbers.indexOf(20); // 1
        numbers.indexOf("cat"); // -1

        // Some things to note in this example:
        // .We specify the type of each element in the collection with
        //  angle brackets, (<>).

        // .Because 'ArrrayList' must contain objects, we specify 'Integer'
        //  instead of int.

        // .The 'add' method is overloaded; we can specify either an element
        //  to add, or an element to add, and the index of where to add it.

        //  .'ArrayList' don't have a length property, instead we use the size
        //  method to find out how many elements are in the collection.

        //  .Unlike native Java arrays, we can use 'System.out.println' to
        //  show the content of the array.Java collections all have 'toString'
        //  methods on them that allow us to easily inspect their contents.


        // We'll start by defining an array list and adding some items to it
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts);

        // There are some common methods for working with 'ArrayList':

        //  .contains = checks if a collection contains a given element.

            roasts.contains("dark"); // true
            roasts.contains("espresso"); // false

        //  .lastIndexOf = finds the last index of the given element,
        //      -1 if not found.

            roasts.lastIndexOf("medium"); // 2

        //  .isEmpty = checks if the list is empty.

            roasts.isEmpty(); // false
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.isEmpty();

        //  .remove = remove the first occurrence of an item, or an
        //      item at a given index.

            roasts.remove("espresso"); // false
            roasts.remove("medium"); // true
            System.out.println(roasts); // [light, medium, dark]

            roasts.remove(2); // "dark"
            System.out.println(roasts); // [light, medium]

        // Note that the return value of '.remove' depends on how it is invoked.

        // When an index is passed, the removed element is returned. When and
        //  object is passed, a boolean indicating whether an item was removed
        //  is returned.


        // *** Hash Maps *** \\

        // A hash map is a data structure for key-value pairs, implemented with
        //  the HashMap class in Java. These are similar to objects in JavaScript.
        //  All the keys in the hash map must be of the same type, and all the values
        //  must be of the same type, but the keys and the values don't necessarily
        //  have to be the same type.

        //  Here are some basic methods for working with has maps:
    }
}
