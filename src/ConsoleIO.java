public class ConsoleIO {

    public static void main(String[] args) {
//        System.out.println("My name is Ricardo");// My name is Ricardo \n
//        // \n will add a line between souts.
//        System.out.println("Hey look! New line!");

        String name = "Ricardo";
//        System.out.printf("My name is %s", name);
        // making the 's' to 'S' will turn your string in all capital letters.

//        String mySentence = String.format("My name is %s", name);
//        System.out.println(mySentence);

        String role = "student";
        String hobby = "Music";

        String sentence = String.format("My name is %s\n. I'm a %s at Codeup and I play %s  in my down time.", name, role, hobby);
        // work on this one. start with just one and then keep adding to it.

        float currencyInPennies = 1000;

        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies);
    }
}
