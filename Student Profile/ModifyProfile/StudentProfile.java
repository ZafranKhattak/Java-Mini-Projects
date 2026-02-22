/*
Modify your StudentProfile class:
 Requirements:

Create a constructor that takes:
id
name
age
cgpa
Initialize all attributes using the constructor.
Keep getter methods.
In main(), create the object using the constructor.
Print the details.
*/

class StudentProfile {
    private int id;
    private String name;
    private int age;
    private double cgpa;

    StudentProfile(int id  , String name , int age , double cgpa)
    {

        if (age < 0 || cgpa < 0.0 || cgpa > 4.0 )
        {
            System.out.println("Ivalid Data Entry");
            return ;
        }
            this.id = id;
            this.name = name;
            this.age = age;
            this.cgpa = cgpa;
    }


    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    double getCgpa()
    {
        return cgpa;
    }

    void displayInfo()
    {
        System.out.println("ID: " + id + "\n"+
                           "Name: " + name + "\n" +
                           "Age: " + age + "\n" +
                           "CGPA: " + cgpa
    );
        
    }
    public static void main(String[] args) {
        
        StudentProfile obj = new StudentProfile(6, "Zafran Khan", -6, -3.60);
       
        obj.displayInfo();
    }
    }
