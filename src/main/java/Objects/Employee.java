/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author User
 */
public class Employee {
    
    protected int Id;
    protected String [] Names = new String[2];
    protected String [] LastNames = new String[2];
    protected int salary;
    
    //constructor
    public Employee(int ids, String[] NameEmployee, String[] LastNames_Employee, int salaryEmployee){
        
        this.Id = ids;
        this.Names = NameEmployee;
        this.LastNames = LastNames_Employee;
        this.salary = salaryEmployee;
    }
    
    
    
}
