import java.util.Scanner;

// .1

 public class Person {
     private String name;
    public static void main(String[] args) {


    }

    public Person(){}

     public Person(String name) {
         this.name = name;
     }

     public String getName(){
        return this.name;
        // TODO: return the person's name
    }

    public void setName(String name){
        // TODO: change the name property to the passed value
        this.name = name;

    }

    public void sayHello(){
        // TODO: print a message to the console using
        //  the person's name
        System.out.println("Hello!, my name is %s!" + name);

    }


}
