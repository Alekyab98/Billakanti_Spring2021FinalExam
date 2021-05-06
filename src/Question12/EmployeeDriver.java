/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Alekya Billakanti
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee E1 = new Employee(5,"Alekya",15000.0);
        Employee E2 = new Employee(4,"Priyanka",4600.0);
        Employee E3 = new Employee(7,"Sunaina",3200.0);
        Employee E4 = new Employee(2,"Chitra",7500.0);
        Employee E5 = new Employee(3,"Sameeksha",4000.0);
        
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(E1);
        employees.add(E2);
        employees.add(E3);
        employees.add(E4);
        employees.add(E5);
        System.out.println("List Order without sorting");
        for(Employee e : employees){
        // original List
        System.out.println(e);
        }
        System.out.println("After sorting based on employee Id");
        Collections.sort(employees);
        printList(employees);
        Collections.sort(employees, new Comparator<Employee>()
        {
            public int compare(Employee e1, Employee e2)
            {
                if(e1.getEmpSalary() < e2.getEmpSalary())
                    return -1;
                else if (e1.getEmpSalary() == e2.getEmpSalary())
                    return 0;
               else
                    return +1;
            }
        });
        
        System.out.println("After Sorting based on employee salary");
        for(Employee e : employees)
		{
			System.out.println(e);
		}
        System.out.println("After Sorting based on employee name"); 
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } 
                else {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } 
                
            }
            
        });
        printList(employees);
        
                   
    }

    private static void printList(List<Employee> employees) {
        for(Employee e : employees){
            System.out.println(e); 
       }
    }
    
           
}