package Company;

// extends keyword to create subclass of the Employee abstract class
public class Manager extends Employee {
    // every child class must define the method

    public String Manager(){
        doWork();
        return "Do work";
    }

    public static void main(String[] args) {
//        Manager manager = new Manager();
        Manager Susy = new Manager();
        Susy.nameOfEmployee = "Susy";
        Susy.department = "Marketing";
//        System.out.println(Susy.doWork());
        System.out.println(Susy.nameOfEmployee + "works as a manager" + "the:" + Susy.department);

        // we don't know what the implementation of this is yet
//        EmployeeTwo Bob;
//        //logic goes here;
//        Bob = new ManagerTwo();
//        Bob.nameOfEmployee = "Bob";
//        Bob.department = "Sales";
//        System.out.println(Bob.nameOfEmployee + "works as a manager"+ "the: " + Bob.department);
    }


}
