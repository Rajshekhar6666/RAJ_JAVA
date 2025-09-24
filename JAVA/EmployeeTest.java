class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee No   : " + empNo);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + empBasic);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Rahul Sharma", 45000);

        System.out.println("Employee Number: " + emp1.getEmpNo());
        System.out.println("Employee Name  : " + emp1.getEmpName());
        System.out.println("Basic Salary   : " + emp1.getEmpBasic());

        System.out.println("\n--- Employee Details ---");
        emp1.displayEmployeeDetails();
    }
}
