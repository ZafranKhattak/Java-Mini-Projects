/*
Task 5: Add Method Overloading and Multi-dimensional Arrays
Modify your Student class from Task 4 by adding the following methods:

Requirements:

Method Overloading: Create multiple versions of calculateTotal():
calculateTotal(int a, int b) - returns int
calculateTotal(double a, double b) - returns double
calculateTotal(int a, int b, int c) - returns int
Method process2DArray(int[][] matrix) that:
Takes a 2D array and finds the maximum value
Returns the maximum value
Uses nested loops
Method getStudentGrades2D() that returns a 2D array representing grades for multiple assignments:
Returns a 3x4 array (3 students, 4 assignments) with sample data
Method displayGradeTable(int[][] grades) that displays grades in table format
Method calculateRowAverage(int[][] grades, int row) that returns average of a specific row
Method calculateColumnAverage(int[][] grades, int col) that returns average of a specific column
Note: Update your Main class to test method overloading with different parameter types and counts. Test 2D array methods with sample data.

Expected Output:

Sum (int): 8
Sum (double): 8.7
Sum (3 ints): 10
Max value: 9
Grade Table:
Student 0: 85 90 88 92
Student 1: 78 82 80 85
Student 2: 92 95 90 93
Row 0 average: 88.75
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

    // char calculateGrade() {
    //     if (getCgpa() >= 3.7) {
    //         return 'A';
    //     } else if (getCgpa() >= 3.0) {
    //         return 'B';
    //     } else if (getCgpa() >= 2.0) {
    //         return 'C';
    //     } else if (getCgpa() >= 1.0) {
    //         return 'D';
    //     } else {
    //         return 'F';
    //     }
    // }

    // char getGradeLetter() {
    //     char grade = calculateGrade();

    //     switch (grade) {
    //         case 'A':
    //             return 'A';
    //         case 'B':
    //             return 'B';
    //         case 'C':
    //             return 'C';
    //         case 'D':
    //             return 'D';
    //         default:
    //             return 'F';
    //     }
    // }

    // boolean isHonorStudent() {
    //     if (getCgpa() >= 3.5) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // String getStatus()
    // {
    //   if (getCgpa() >= 3.7) {
    //         return "Outsanding";
    //     } else if (getCgpa() >= 3.0) {
    //         return "Excellent" ;
    //     } else if (getCgpa() >= 2.0) {
    //         return "Good";
    //     } else if (getCgpa() >= 1.0) {
    //         return "Fair";
    //     } else {
    //         return "Need";
    //     }   
    // }

    // String formatName(String fullName)
    // {
    //     // String[] last = fullName.split(" ");
    //     int space = fullName.indexOf(" ");
    //     String first= fullName.substring(0 , space);
    //     String last = fullName.substring((space+1));

    //     // return last[1] + " " + last[0];
    //     // return last.toUpperCase() + " " + first.toUpperCase();
    //     return last.toLowerCase() + ", " + first.toLowerCase();
    // }
    // String getInitials(String fullName)
    // {
    //     int space = fullName.indexOf(" ");

    //     String first = fullName.substring(0,1);
    //     String last = fullName.substring((space+1) , (space+2));

    //     return first+last;
    // }
    // boolean validateName(String fullName)
    // {
    //     char[] arry = fullName.toCharArray();
    //     boolean found= false;
    //     for (int i=0; i<arry.length; i++)
    //     {
    //         if (!((arry[i] >= 'A' && arry[i] <= 'Z') || (arry[i] >='a' && arry[i] <='z') || arry[i] == ' '))
    //         {
    //             found = true;
    //             break;
    //         }
    //     }
    //     if (found)
    //     {
    //         return false;
    //     }
    //     else{
    //         return true;
    //     }
    // }
    // String[] getStudentInfoArray() {
    //     String[] arr = {
    //         String.valueOf(this.studentId),
    //         this.name,
    //         String.valueOf(this.cgpa)
    //     };
    //     return arr;
    // }

// double processGPAs(double[] gpas)
// {
//     double highest = -1;

//     for (double gpa : gpas)
//     {
//         if (gpa > 4.0)
//         {
//             System.out.println("Found Invalid GPA");
//             break; // stop immediately
//         }
        
//         if (gpa < 1.0)
//         {
//             continue; // skip low GPAs
//         }
        
//         if (gpa > highest)
//         {
//             highest = gpa; // update highest valid GPA
//         }
//     }

//     return highest;
// }
    
//     double calculateAverage(double[] grades)
//     {
//         double sum = 0.0;
//         int leng = grades.length;

//         for (int i=0; i<grades.length; i++)
//         {
//             sum+= grades[i];
//         }

//         double average = sum/leng;

//         return average;
//     }
//     boolean findGradeInArray(char[] grades, char target)
//     {
//         boolean found = false;

//         for (int i=0; i<grades.length; i++)
//         {
//             if (grades[i] == target)
//             {
//                 found = true;
//                 break;
//             }
//         }
//         if(!found)
//         {
//             return false;
//         }
//         else
//         {
//             return true;
//         }
//     }

//     void modifyArray(int[] numbers)
//     {
//         for (int i=0; i<numbers.length; i++)
//         {
//             numbers[i] *=2;
//         }
//         System.out.println(numbers);
//     }
//     char [] getGradeArray(int count)
//     {
//         char [] character = {'A', 'B', 'C', 'D', 'E', 'F'};

//         for (int i=0; i<count; i++)
//         {
//             System.out.print(character[i] + " ");
//         }

//         return character;
//     }
    // void displayInfo() {
    //     System.out.println(
                // "Is Honered Student: " + isHonorStudent() + "\n" +
                        // "Student ID: " + getStudentId() + "\n" +
                        // "Student Name: " + getName() + "\n" +
                        // "CGPA: " + getCgpa() + "\n" +
                        // "Grade: " + calculateGrade()
                        
    //                 );
    //                 }

    //                 void displayFormattedInfo()
    //                 {
    //                     System.out.println("==========  Formatted Student Info ============");

    //                     String [] info = getStudentInfoArray();

    //                     System.out.println(
    //     "ID: " + info[0] + " | Name: " + info[1] + " | GPA: " + info[2]
    // );
    //                 }

    int calculateTotal(int a, int b)
    {
        return a+b;
    }
    double calculateTotal(double a, double b)
    {
        return a + b;
    }
    int calculateTotal(int a, int b , int c)
        {
            return a + b + c;
        }

    int process2DArray(int[][] matrix)
    {
        int maximum = matrix[0][0];

        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                if (maximum < matrix[i][j])
                {
                    maximum = matrix[i][j];
                }
            }
        }
        return maximum;
    }

    int [][] getStudentGrades2D() 
    {
        int [][] StudentAssignemnt = {
                                            {85, 90, 88, 92},
                                            {78, 82, 80, 85},
                                            {92, 95, 90, 93}
                                                                };

            return StudentAssignemnt;
    }
    void displayGradeTable(int[][] grades)
{
    System.out.println("Grade Table:");
    for (int i = 0; i < grades.length; i++)
    {
        System.out.print("Student " + i + ": ");
        for (int j = 0; j < grades[i].length; j++)
        {
            System.out.print(grades[i][j] + " ");
        }
        System.out.println();
    }
}
double calculateRowAverage(int[][] grades, int row) 
{
    double sum = 0;

    for (int j = 0; j < grades[row].length; j++) 
    {
        sum += grades[row][j];
    }

    return sum / grades[row].length;
}
double calculateColAverage(int[][] grades, int col)
{
    double sum = 0.0;

    for (int i = 0; i < grades.length; i++) 
    {
        sum += grades[i][col];
    }

    return sum / grades.length;
}
    public static void main(String[] args) {

        Student std1 = new Student(101, "Zafran Khattak", 3.7);

        System.out.println("======= Student Information =======");
        // System.out.println("Formatted Name: " + std1.formatName("Zafran Khattak"));
        // System.out.println("Initials: " + std1.getInitials("Zafran Khattak"));
        // System.out.println("Valid Name: " + std1.validateName("Zafran Khattak"));
        // std1.displayInfo();
        // std1.displayFormattedInfo();

        // double[] arr = {1.3, 3.4, 2.56, 4.0};
        // System.out.println("Highest GPA: " + std1.processGPAs(arr));

        // double[] arr1 = {75, 85, 90, 95};
        // System.out.println("Average: " + std1.calculateAverage(arr1));

        // char[] grades = {'A', 'B', 'C', 'D', 'F'};
        // char target = 'A';
        // System.out.println("Grade A found: " + std1.findGradeInArray(grades, target));

        // int[] numbers = {1, 2, 3, 4, 5};
        // std1.modifyArray(numbers);
        // for (int num : numbers) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();

        System.out.println("Sum: "  + std1.calculateTotal(2,5));

        System.out.println("Sum of double: "  +std1.calculateTotal(3.4 , 2.5));
        System.out.println("Sum of 3 int: "  +std1.calculateTotal(2,4,5));

                int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
                        };

        System.out.println("Maximum value is: " +std1.process2DArray(matrix));
        int[][] grades1 = std1.getStudentGrades2D();
            std1.displayGradeTable(grades1);

        int [][] grades = {
                                            {85, 90, 88, 92},
                                            {78, 82, 80, 85},
                                            {92, 95, 90, 93}
                                                                };

        System.out.println(std1.calculateRowAverage(grades , 1));
        System.out.println(std1.calculateColAverage(grades , 1));
}
}