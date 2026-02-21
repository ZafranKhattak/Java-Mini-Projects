/*
Task : Student Profile Management

Requirements: Create a class named StudentProfile with the following private fields:

id (int)
name (String)
age (int)
cgpa (double)
Requirements:

Create setters and getters for all fields
Validate age (15–60) and cgpa (0.0–4.0)
If invalid data is provided, do not update the value and display a message
Create an instance method display() to print complete student information

*/

class StudentProfile {
    private int id;
    private String name;
    private int age;
    private double cgpa;

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {

        if (age >14 && age <61)
        {
        this.age = age;
        }
        else
        {
            System.out.println("Invalid Age");
        }
    }

    int getAge() {
        return age;
    }

    void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa<=4)
        {
        this.cgpa = cgpa;
        }
        else
        {
            System.out.println("Invalid Cgpa");
        }
    }

    double getCgpa() {
        return cgpa;
    }

    void displayInfo() {
        System.out.println("Student Name: " + getName() + "\n" +
                "ID: " + getId() + "\n" +
                "Age: " + getAge() + "\n" +
                "CGPA: " + getCgpa());
    }

    public static void main(String[] args) {

        StudentProfile obj = new StudentProfile();

        obj.setName("Zafran Khan");
        obj.setId(6);
        obj.setAge(20);
        obj.setCgpa(3.60);

        obj.displayInfo();
    }
}