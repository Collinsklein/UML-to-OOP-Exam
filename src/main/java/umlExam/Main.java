package umlExam;

public class Main {
    public static void main(String[] args) {
 ShoppingBag clothingItem1 = new ShoppingBag("Small",20.00);
 ShoppingBag clothingItem2 = new ShoppingBag("medium",8.00);
 ShoppingBag clothingItem3 = new ShoppingBag("large",2.00);

 ShoppingBag[] shoppingBag = {clothingItem1,clothingItem2,clothingItem3};

 Student student1 = new Student("Mike", "large",shoppingBag);
 Student student2 = new Student("Jane", "Small", shoppingBag);

 double subTotal = student1.calculateSubTotal();
         subTotal = clothingItem1.price + clothingItem2.price + clothingItem3.price;
         ShoppingBag.getPrice(shoppingBag);

         Student[] listOfStudents = {student1, student2};

         for(Student student : listOfStudents){
             student.printInfo();
         }
         Student.studentCounter();
       // System.out.println();
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex","Small", shoppingBag , 40 ,20.00);

    }

}
