package umlExam;

public class HourlyEmployee extends Student{
//    public HourlyEmployee(int id, double hoursWorked, double hourlyPay) {
//        super(id);
//        this.hoursWorked = hoursWorked;
//        this.hourlyPay = hourlyPay;
//    }

    public HourlyEmployee(String name, String size, ShoppingBag[] shoppingBag, double hoursWorked, double hourlyPay) {
        super(name, size, shoppingBag);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }

    private double hoursWorked;
    private double hourlyPay;

    public HourlyEmployee(double hoursWorked, double hourlyPay) {
        super(hourlyPay , hoursWorked);

        // super(phoursWorked, hourlyPay);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;



        if (hoursWorked > 0) {
            this.hoursWorked = hoursWorked;
        }else {
            //System.out.println("Error.HoursWorked must be greater than 0");
        }
//
////            if(age > 0 ){
////                this.age = age;
////            }else{
////                System.out.println("Error.Age must be greater than 0");
////            }
//
//
   }
    public double calculatePay (){
        return hoursWorked * hourlyPay;
    }
}
