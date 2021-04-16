/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import My_List.ArrayList;

/**
 *
 * @author User
 */
public class Employee   {
    
    public int Id;
    public String  LastNames ;
    public String  Names;
    public int salary;
    public int idCity;
    public int idEducation;
    
    //constructor
    public Employee(int ids, String LastNames_Employee, String NameEmployee, int salaryEmployee,
            int IdCity, int IdEducation){
        
        this.Id = ids;
        this.LastNames = LastNames_Employee;
        this.Names = NameEmployee;
        this.salary = salaryEmployee;
        this.idCity = IdCity;
        this.idEducation = IdEducation;
    }
    
    public String Imprimir(){
        String s = "ID: " + Id + " " + "Apellidos: " +LastNames+ " " + "Nombres: "+ Names + " " 
                + "Salario: " + salary+ " " + "IdCiudad: "+idCity+ " "+ "IdEducacion: "+idEducation; 
        return s;
    }
    
    
    public int Get_Salary(){
        return salary;
    }
    
    public int Get_Id(){
        return Id;
    }
    public String Get_LastNames(){
        return LastNames;
    }
    
    public String Get_Names(){
        return Names;
    }
    
    public int Get_idCity(){
        return idCity;
    }
    
    public int Get_idEducation(){
        return idEducation;
    }
}
