package umlExam;

public class Manager extends Student{
    public Manager(int listOfStudents, String name, String size, ShoppingBag[] shoppingBag,double salary) {
        super(listOfStudents, name, size, shoppingBag);

    }

    public Manager(double hourlyPay, double hoursWorked) {
        super(hourlyPay, hoursWorked);
    }

    public Manager(String name, String size, ShoppingBag[] shoppingBag) {
        super(name, size, shoppingBag);
    }
    
    public void printInfo() {
        super.printInfo();
    }
}
