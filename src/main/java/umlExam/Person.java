package umlExam;

public class Person {
    private String name;
    private char size;

    public Person(String name, char size) {
        this.name = name;
        this.size = size;
    }
   //Parameterized constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    public void printInfo (){

    }
}
