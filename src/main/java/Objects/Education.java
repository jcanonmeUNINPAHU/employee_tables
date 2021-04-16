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
public class Education extends Employee{
    
    public int Id;
    public String  Range;
    
    //Constructor
    
    //constructor
 
    public Education( int ids, String LastNames_Employee, String NameEmployee, int salaryEmployee,
            int IdCity, int IdEducation, int id2, String range){
        super(ids, LastNames_Employee, NameEmployee, salaryEmployee, IdCity, IdEducation);
        this.Id=id2;
        this.Range=range;
        
    }
    
    public String ImprimirEducacion(){
        String s2 = "ID: " + Id + " " + "Apellidos: " +LastNames+ " " + "Nombres: "+ Names + " " 
                + "Salario: " + salary+ " " + "IdCiudad: "+idCity+ " "+  "ID "+Id+" "+"Rango "+Range;
        
        return s2;
    }
    
    public String Get_Range(){
        return Range;
    }
}
