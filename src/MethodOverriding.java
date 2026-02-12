class Employee {
    void display(){
        System.out.println("Name of class is Employee");
    } 
}

class Engineer extends Employee {
    void display(){
        System.out.println("Name of class is Engineer");
        super.display();
    }
    // TODO: Override display() method
    // 1. Print "Name of class is Engineer"
    // 2. Call super.display() to print the parent's message
}

public class MethodOverriding {
        public static void main(String[] args) {
            Engineer engineer=new Engineer();
            engineer.display();
        }
        // TODO: Create an Engineer object
        // TODO: Call the display() method
}
