public class ArrayExamples {

    public static void main(String[] args) {

        double [] prices;
        prices = new double[4];

        //the size of the array can be either a literal (like in
        // the example above), a constant, or a variable.

//        final int NUMBER_OF_BEATLES = 4;
//        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];
//
//        int numberOfBugs = (int) Math.floor(Math.random() * 100);
//        Bug[] mycode = new Bug[numberOfBugs];


        // *** Working with Array Elements *** \\

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);


        // In here we're using the array initializer syntax
//        String[] beatles = {"John", "Paul", "Ringo"};
//
//        System.out.println(beatles.length);
//
//        System.out.println(beatles[0]);
//        System.out.println(beatles[1]);
//        System.out.println(beatles[2]);

        //ArrayIndexOutOfBoundsException !
//        beatles[3] = "George";


        // *** Iterating *** \\
        // Like we've seen in JavaScript, we can use the 'length'
        // property of any array in combination with a looping construct
        // to iterate over it.

//        String[] languages = {"html", "css", "javascript", "java"};

//        for (int i = 0; i < languages.length; i += 1){
//            System.out.println(languages[i]);
//        }

        // in addition to the traditional 'for' loop, java provides
        // an enhanced 'for' that is similar to a 'forEach' in
        // JavaScript. It is useful when we want to do something
        // for every item in an array.

//        String[] languages = {"html", "css", "javascript", "java"};
//        for (String language: languages){
//            System.out.println(language);

            //This is the output for both 'for' loops:
            //html
            //css
            //javascript
            //java

        // Be specific when using enhanced 'for' loop. we have to
        // specify what collection we are iterating over, a variable
        // to hold each element, and the type of each element
        // in the collection.

        int[] numbers = {1,2,3,4,5};
        for (int n : numbers){
            System.out.println(n);

            //output is all the numbers in in the int numbers array.
        }

    }

}
