package exercise2;
//Exercise class 4 - object-oriented programming with Java

public class RunApplication {

    public static void main(String[] args) {

        //New employee object
        Employee employee = new Employee();

        //Implicit upcast
        Employee janitor = new Janitor();
        Employee manager = new Manager();
        Employee seller = new Seller();

        //Explicit downcast
        //Downcast should be avoided as much as possible when using object orientation
        Janitor janitor1 = (Janitor)new Employee();
        //Manager manager1 = new Employee(); //downcast must always specify the child class that will become parent class
        Seller seller1 = (Seller)new Employee();

    }
}
