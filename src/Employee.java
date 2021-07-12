public class Employee {

  private String firstName;
  private String lastName;

//    scope return-type name-of-method (parameters-or-arguments){}


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Employee(String firstName) {
        this.firstName = firstName;
    }

    void printFirstName(){
        System.out.println(firstName);
    }

}
