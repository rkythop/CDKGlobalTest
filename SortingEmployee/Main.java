package SortingEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(“Rakesh”, 200));
        empList.add(new Employee(“Sharma”, 300));
        empList.add(new Employee(“Talari”, 800));

        // Method 1: Using streams and lamda expration
        // sorting by name
        List<Employee> sortedByNameList = empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        // sorting by salary
        List<Employee> sortedBySalaryList = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
        
        // Method 2: Using comparator interface
        // sorting by name
        Collections.sort(empList, new NameComparator());
        // sorting by salary
        Collections.sort(empList, new NameComparator());

 
    
    
}
