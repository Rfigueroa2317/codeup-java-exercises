public class ValueVsReferenceExample {

    //Casey's note:

//   TODO: it's okay if value vs reference isn't clear yet.
//    What will make it more clear is as move forward into
//    making our own objects and collections.
//    The basics of what you need to know is that all objects,
//    when passed as parameters to a method,
//    are shallow copies (copy of the original object's address)
//    of their original.


//    ie (PUT THIS IN YOUR CODE AND PLAY AROUND WITH IT):
public static void main(String[] args) {
    changingThings();
}
    public static void changingThings(){
        Object myObj = new Object(); // new object is created, and a pointer is created to let our system know where to find it in our memory.
        // You can see that pointer by using .hashCode() or System.identityHashCode().
        // Alternatively, you can simply print out the object itself.
        System.out.println("\nOriginal object BEFORE myMethod runs: \n" + myObj);
        Object myObj2 = myMethod(myObj);
        System.out.println("\nOriginal object AFTER myMethod runs: \n" + myObj);
        System.out.println("\nNEW object AFTER myMethod runs: \n" + myObj2);
        // This will print out "Casey" because the OBJECT we pass in to myMethod only creates
        // a 'shallow copy' of the original objects pointer (its place in your memory heap)
    }
    public static Object myMethod(Object obj){
        System.out.println("\nParameter object id: \n" + obj);
        obj = new Object(); // create a NEW Object. This Object type is immutable. Meaning, once it is created, the object itself cannot be altered.
        // The properties and fields on the Object type can be changed, just not the whole object.
        // Therefore when we assign new Object() to obj, we are actually creating a whole new object in memory, NOT changing the original.
        System.out.println("\nNew object created and assigned to parameter: \n" + obj);
        return obj;
        // This will create a NEW object in memory and assign it to the parameter obj.
        // However, it will not change the object sitting at the original memory address
    }
//  TODO:  Note that when we talk about this 'pass by value'
//   what we are really saying is that by passing in an argument
//   to myMethod, we are creating a copy of the pointer to its
//   place in our memory heap. When myMethod assigns a
//   new Object to the parameter obj, it is NOT changing myObj
//   but rather creating a new place in memory for a NEW object.
//    If you change the value of an immutable object (let's say, a String, Integer, or Object) you are actually creating a NEW object in memory, therefore you will see the hashcode (or object id) change because the value of those objects is final (can't be changed). However, the original objects pointer still exists and its original value is still in memory.
//    There is much more to this, but we will talk more about that when we begin making our own classes and using them as objects.
}
