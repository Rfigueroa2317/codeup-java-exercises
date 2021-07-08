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


//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);


        String[] beatles = {"John", "Paul", "Ringo"};

        System.out.println(beatles.length);

        System.out.println(beatles[0]);
        System.out.println(beatles[1]);
        System.out.println(beatles[2]);


    }

}
