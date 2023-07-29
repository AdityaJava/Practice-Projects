package ComparableComparator;

public class Employee implements Comparable<Employee> {
    private Long employeeId;
    private String employeeName;

    public Employee(Long employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.employeeId < o.employeeId) {
            return 1;
        } else if (this.employeeId > o.employeeId) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
