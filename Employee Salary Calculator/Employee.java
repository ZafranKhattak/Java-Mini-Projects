class Employee {
    private int employeeId;
    private String name;
    private double basicSalary;

    void setEmployeeId(int employeeId) {

        this.employeeId = employeeId;
    }

    int getEmployeeId() {
        return employeeId;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setBasicSalary(double basicSalary) {
        if (basicSalary >= 30000) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Basic salary is less than 30000");
        }
    }

    double getBasicSalary() {
        return basicSalary;
    }

    double hra() {
        return basicSalary * 0.20;
    }

    double tax() {
        return basicSalary * 0.05;
    }

    double netSalary() {
        return ((basicSalary + hra()) - tax());
    }

    void printSlip() {
        System.out.println("Employee Id: " + employeeId + "\n" +
                "Name: " + name + "\n" +
                "Net Salary: " + netSalary());
    }

    public static void main(String[] args) {
        Employee inp = new Employee();

        inp.setEmployeeId(100);
        inp.setName("Zafran Khan");
        inp.setBasicSalary(34000);

        inp.printSlip();

        System.out.println("============================================");

        Employee emp = new Employee();

        emp.setEmployeeId(101);
        emp.setName("Nimra Khattak");
        emp.setBasicSalary(30000);

        emp.printSlip();
    }

}