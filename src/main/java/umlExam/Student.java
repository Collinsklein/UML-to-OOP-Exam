package umlExam;

public class Student {
   private int listOfStudents;
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
        subtotal += 
    }
     return subtotal;
}
