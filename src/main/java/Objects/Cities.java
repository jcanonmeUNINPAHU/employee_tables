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
public class Cities extends Employee{
    public int Id_City;
    public String  NameCity;
    
    //Constructor
    public Cities( int ids, String LastNames_Employee, String NameEmployee, int salaryEmployee,
            int IdCity, int IdEducation,int id1, String city ){
        super(ids, LastNames_Employee, NameEmployee, salaryEmployee, IdCity, IdEducation);
        this.Id_City=id1;
        this.NameCity=city;
        
    }
    
    public String ImprimirCiudad(){
        String s1 = "ID: " + Id + " " + "Apellidos: " +LastNames+ " " + "Nombres: "+ Names + " " 
                + "Salario: " + salary+ " " +  "IdEducacion: " +idEducation + "ID "+Id_City+" "+"Nombre Ciudad "+ NameCity;
        
        return s1;
    }
    
    public int Get_City(){
        return Id_City;
    }
}
