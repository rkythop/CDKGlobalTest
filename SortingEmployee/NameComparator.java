package SortingEmployee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
    public int compare(Employee emp, Employee emp1)
    {
        return emp.name.compareTo(emp1.name);
    }
}
