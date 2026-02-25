/*
Modify your Student class from Task 2 by adding the following methods:

Requirements:

Method formatName() that returns the name in "Last, First" format (assume name is "First Last")
Use string methods: substring(), indexOf(), toUpperCase(), toLowerCase()
Method getInitials() that returns the initials of the name (e.g., "John Doe" → "JD")
Method validateName() that returns true if name contains only letters and spaces
Method getStudentInfoArray() that returns a String array with [name, studentId as String, gpa as String]
Use type conversion to convert int and double to String
Method displayFormattedInfo() that displays information using formatted strings
Note: Update your Main class to test all string handling methods. Use for-each loop to iterate through the
array returned by getStudentInfoArray().
*/

class Student {
    private int studentId;
    private String name;
    private double cgpa;

    Student() {
        this.studentId = 0;
        this.name = "Unknown";
        this.cgpa = 0.0;
    }

    Student(int studentId, String name, double cpga) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cpga;
    }

    void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    int getStudentId() {
        return studentId;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    double getCgpa() {
        return cgpa;
    }

    char calculateGrade() {
        if (getCgpa() >= 3.7) {
            return 'A';
        } else if (getCgpa() >= 3.0) {
            return 'B';
        } else if (getCgpa() >= 2.0) {
            return 'C';
        } else if (getCgpa() >= 1.0) {
            return 'D';
        } else {
            return 'F';
        }
    }

    char getGradeLetter() {
        char grade = calculateGrade();

        switch (grade) {
            case 'A':
                return 'A';
            case 'B':
                return 'B';
            case 'C':
                return 'C';
            case 'D':
                return 'D';
            default:
                return 'F';
        }
    }

    boolean isHonorStudent() {
        if (getCgpa() >= 3.5) {
            return true;
        } else {
            return false;
        }
    }

    String getStatus()
    {
      if (getCgpa() >= 3.7) {
            return "Outsanding";
        } else if (getCgpa() >= 3.0) {
            return "Excellent" ;
        } else if (getCgpa() >= 2.0) {
            return "Good";
        } else if (getCgpa() >= 1.0) {
            return "Fair";
        } else {
            return "Need";
        }   
    }

    String formatName(String fullName)
    {
        // String[] last = fullName.split(" ");
        int space = fullName.indexOf(" ");
        String first= fullName.substring(0 , space);
        String last = fullName.substring((space+1));

        // return last[1] + " " + last[0];
        // return last.toUpperCase() + " " + first.toUpperCase();
        return last.toLowerCase() + ", " + first.toLowerCase();
    }
    String getInitials(String fullName)
    {
        int space = fullName.indexOf(" ");

        String first = fullName.substring(0,1);
        String last = fullName.substring((space+1) , (space+2));

        return first+last;
    }
    boolean validateName(String fullName)
    {
        char[] arry = fullName.toCharArray();
        boolean found= false;
        for (int i=0; i<arry.length; i++)
        {
            if (!((arry[i] >= 'A' && arry[i] <= 'Z') || (arry[i] >='a' && arry[i] <='z') || arry[i] == ' '))
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            return false;
        }
        else{
            return true;
        }
    }
    String[] getStudentInfoArray() {
        String[] arr = {
            String.valueOf(this.studentId),
            this.name,
            String.valueOf(this.cgpa)
        };
        return arr;
    }
    void displayInfo() {
        System.out.println(
                "Is Honered Student: " + isHonorStudent() + "\n" +
                        "Student ID: " + getStudentId() + "\n" +
                        "Student Name: " + getName() + "\n" +
                        "CGPA: " + getCgpa() + "\n" +
                        "Grade: " + calculateGrade()
                            
                    );
                    }
                    void displayFormattedInfo()
                    {
                        System.out.println("==========  Formatted Student Info ============");

                        String [] info = getStudentInfoArray();

                        System.out.println(
        "ID: " + info[0] + " | Name: " + info[1] + " | GPA: " + info[2]
    );
                    }
    public static void main(String[] args) {

        Student std1 = new Student(101, "Zafran Khattak", 3.7);

        System.out.println("======= Student Information =======");
        System.out.println("Formatted Name: " + std1.formatName("Zafran Khattak"));
        System.out.println("Initials: " + std1.getInitials("Zafran Khattak"));
        System.out.println("Valid Name: " + std1.validateName("Zafran Khattak"));
        std1.displayInfo();
        
        std1.displayFormattedInfo();
}
}