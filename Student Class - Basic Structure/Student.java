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

    void displayInfo()
    {
        System.out.println(
                            "Student ID: " + getStudentId() + "\n" +
                            "Student Name: " + getName() + "\n" +
                            "CGPA: " + getCgpa()
        );
    }

    public static void main(String[] args) {
        
        Student std = new Student();
        System.out.println("Student Information:");
        std.displayInfo();
        System.out.println("=================================================");

        Student std1 = new Student(101, "Zafran Khattak", 3.60);
        System.out.println("Student Information:");
        std1.displayInfo();
        System.out.println("=================================================");

        Student std2 = new Student();
        System.out.println("Student Information:");
        std2.setStudentId(102);
        std2.setName("Nimra Khattak");
        std2.setCgpa(3.56);
        std2.displayInfo();

    }
}