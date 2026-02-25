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

double processGPAs(double[] gpas)
{
    double highest = -1;

    for (double gpa : gpas)
    {
        if (gpa > 4.0)
        {
            System.out.println("Found Invalid GPA");
            break; // stop immediately
        }
        
        if (gpa < 1.0)
        {
            continue; // skip low GPAs
        }
        
        if (gpa > highest)
        {
            highest = gpa; // update highest valid GPA
        }
    }

    return highest;
}
    
    double calculateAverage(double[] grades)
    {
        double sum = 0.0;
        int leng = grades.length;

        for (int i=0; i<grades.length; i++)
        {
            sum+= grades[i];
        }

        double average = sum/leng;

        return average;
    }
    boolean findGradeInArray(char[] grades, char target)
    {
        boolean found = false;

        for (int i=0; i<grades.length; i++)
        {
            if (grades[i] == target)
            {
                found = true;
                break;
            }
        }
        if(!found)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    void modifyArray(int[] numbers)
    {
        for (int i=0; i<numbers.length; i++)
        {
            numbers[i] *=2;
        }
        System.out.println(numbers);
    }
    char [] getGradeArray(int count)
    {
        char [] character = {'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i=0; i<count; i++)
        {
            System.out.print(character[i] + " ");
        }

        return character;
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

    double[] arr = {1.3, 3.4, 2.56, 4.0};
    System.out.println("Highest GPA: " + std1.processGPAs(arr));

    double[] arr1 = {75, 85, 90, 95};
    System.out.println("Average: " + std1.calculateAverage(arr1));

    char[] grades = {'A', 'B', 'C', 'D', 'F'};
    char target = 'A';
    System.out.println("Grade A found: " + std1.findGradeInArray(grades, target));

    int[] numbers = {1, 2, 3, 4, 5};
    std1.modifyArray(numbers);
    for (int num : numbers) {
        System.out.print(num + " ");
    }
    System.out.println();
}
}