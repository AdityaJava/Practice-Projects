package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1l,"Aditya"));
        employeeList.add(new Employee(5l,"Narayan"));
        employeeList.add(new Employee(2l,"Krishna"));
        employeeList.add(new Employee(10l,"Govinda"));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("---------------------------------------------------");
        Collections.sort(employeeList);
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("---------------------------------------------------");

        Collections.sort(employeeList, (Employee  e1, Employee e2)->{
            if (e1.getEmployeeId() > e2.getEmployeeId()) {
                return 1;
            } else if (e1.getEmployeeId() < e2.getEmployeeId()) {
                return -1;
            }
            return 0;
        });
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
