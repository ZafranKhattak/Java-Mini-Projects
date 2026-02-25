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

    void displayInfo() {
        System.out.println(
                "Is Honered Student: " + isHonorStudent() + "\n" +
                        "Student ID: " + getStudentId() + "\n" +
                        "Student Name: " + getName() + "\n" +
                        "CGPA: " + getCgpa() + "\n" +
                        "Grade: " + calculateGrade() + "\n" +
                        "Grade: " + getGradeLetter() + "\n" + "Status: " + getStatus());
    }

    public static void main(String[] args) {

        Student std = new Student();
        System.out.println("          Student Information:          ");
        std.displayInfo();
        System.out.println("=================================================");

        Student std1 = new Student(101, "Zafran Khattak", 3.70);
        System.out.println("          Student Information:          ");

        std1.displayInfo();
        System.out.println("=================================================");

        Student std2 = new Student();
        System.out.println("          Student Information:          ");

        std2.setStudentId(102);
        std2.setName("Nimra Khattak");
        std2.setCgpa(3.0);
        std2.displayInfo();
        System.out.println("=================================================");

        Student std3 = new Student();
        System.out.println("          Student Information:          ");

        std3.setStudentId(103);
        std3.setName("Anum Khan");
        std3.setCgpa(2.0);
        std3.displayInfo();
        System.out.println("=================================================");

        Student std4 = new Student();
        System.out.println("          Student Information:          ");

        std4.setStudentId(104);
        std4.setName("Irfan Khattak");
        std4.setCgpa(1.0);
        std4.displayInfo();
        System.out.println("=================================================");

        Student std5 = new Student();
        System.out.println("          Student Information:          ");

        std5.setStudentId(105);
        std5.setName("Kamran Uthamzaye");
        std5.setCgpa(0.9);
        std5.displayInfo();
    }
}