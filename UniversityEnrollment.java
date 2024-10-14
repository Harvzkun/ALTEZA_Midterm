class Person {
    // Fields for name and age
    protected String name;
    protected int age;

    // To initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // To display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Student 
class Student extends Person {
    // Fields for student-specific data
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000;

    // To initialize all fields
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // To calculate total fees based on units and feePerUnit
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Overriding the displayInfo method to include student details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method to display name and age
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fees: " + calculateFees());
    }
}

// Subclass: Instructor 
class Instructor extends Person {
    // Fields for instructor-specific data
    private String employeeID;
    private String department;
    private double salary;

    // To initialize all fields
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); 
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overriding the displayInfo method to include instructor details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method to display name and age
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the program
public class UniversityEnrollment {
    // Accepting a Person object
    public static void printDetails(Person p) {
        p.displayInfo();  
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Harvy", 18, "231005017", "Computer Engineering", 23);
        Student student2 = new Student("Jessa", 20, "231005267", "Computer Engineering", 19);

        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Engr. Bargo", 27, "I983", "Mechanical Engineering", 75000);
        Instructor instructor2 = new Instructor("Engr. Velitario", 28, "I984", "Electrical Engineering", 80000);

        // To print information for each person
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
