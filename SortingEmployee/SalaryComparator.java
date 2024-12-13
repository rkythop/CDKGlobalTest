package SortingEmployee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

    public int compare(Employee emp, Employee emp1)
    {
        return emp.salary - emp1.salary;
    }
    
}
