package ch6_interfaces;

import java.util.*;

/**
 * This program demo the use of the Comparable interface.
 * @version 20210421
 * @author amo
 */

public class EmployeeSortTest {
    public static void main(String[] args) {
        //var staff = new Employee[3];
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("Harry",35000);
        staff[1]=new Employee("Carl",75000);
        staff[2]=new Employee("Tony",300000);

        Arrays.sort(staff);

        for(Employee e:staff)
            System.out.println("name:"+e.getName()+",Salary:"+e.getSalary());
    }
}
