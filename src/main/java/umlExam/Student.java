package umlExam;

public class Student {

   private int listOfStudents;

    public Student(int listOfStudents, String name, String size, ShoppingBag[] shoppingBag) {
        studentCounter++;
        this.listOfStudents = listOfStudents;
        this.name = name;
        this.size = size;
        this.shoppingBag = shoppingBag;
    }

    public Student(double hourlyPay, double hoursWorked) {
    }


    public int getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(int listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public static int getStudentCounter() {
        return studentCounter;
    }

    public static void setStudentCounter(int studentCounter) {
        Student.studentCounter = studentCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ShoppingBag[] getShoppingBag() {
        return shoppingBag;
    }

    public void setShoppingBag(ShoppingBag[] shoppingBag) {
        this.shoppingBag = shoppingBag;
    }


    private static int studentCounter = 0;
    String name;
    String size;
    ShoppingBag[] shoppingBag;

    public Student(String name, String size, ShoppingBag[] shoppingBag) {
        studentCounter++;
        this.listOfStudents = studentCounter;
        this.name = name;
        this.size = size;
        this.shoppingBag = shoppingBag;
    }
    public double calculateSubTotal (){
        double subtotal = 0.0 ;
       return subtotal;
    }
     public void printInfo(){
         //System.out.println("Student Name:" + name + "Size" );
     }
     public static void studentCounter (){

     }
}
