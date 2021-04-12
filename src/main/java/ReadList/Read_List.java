/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadList;
import My_List.*;
import Objects.*;
import Objects.Employee.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Read_List {
    
    public static void main (String [ ] args){
        
        ArrayList<Employee> Consultaempleados = new ArrayList<>();
        //LISTA DE EMPLEADOS 
        Consultaempleados.add(new Employee(1001, "ARDILA GOMEZ", "DIEGO", 2904854, 4, 2));
        Consultaempleados.add(new Employee(1002, "ARGUELLO TIQUE", "JIMMY ANDRES", 4380110, 2, 4));
        Consultaempleados.add(new Employee(1003, "BERMUDEZ PENA", "SOLANGI PAOLA", 2955944, 6, 2));
        Consultaempleados.add(new Employee(1004, "BOLIVAR CUCHIGAY", "EDISSON ARLEY", 3732732, 6, 4));
        Consultaempleados.add(new Employee(1005, "ESPINOSA GARZON", "DANIEL", 3460562, 5, 1));
        Consultaempleados.add(new Employee(1006, "GAMBOA IBARRA", "DANIELA", 1577222, 3, 5));
        Consultaempleados.add(new Employee(1007, "HERRERA CAICEDO", "JORGE ALEXANDER", 3014490, 3, 5));
        Consultaempleados.add(new Employee(1008, "MARTINEZ GOMEZ", "JENNY PAOLA", 3137294, 3, 5));
        Consultaempleados.add(new Employee(1009, "MEDINA ACUNA", "MANUELA JULIETH", 4407138, 5, 3));
        
        System.out.println("PROGRAM developed by : JEFERSON CAÑON AND CATHERINE CAPERA " ); 
        System.out.println("CHOOSE CONSULT TYPE TO EMPLOYEE SALARIES " );
        System.out.println("1. SALARY LESS THAN " );
        System.out.println("2. SALARY GREATER THAN " );
        System.out.println("3. SALARY BETWEEN A RANGE OF ");
        Scanner primeraCondicion = new Scanner(System.in);
        int condicion = primeraCondicion.nextInt();
        
        
        
            System.out.println("ENTER THE FIRST NUMBER SALARY");
            Scanner salario = new Scanner(System.in);
            int salario_empleado = salario.nextInt();
            
        for(Employee e : Consultaempleados){
            if(condicion == 1){

                if(e.Get_Salary() < salario_empleado){
                    System.out.println("los empleados que cumplen con el menor salario son : " + e.Imprimir());
                }
            }
             if(condicion == 2){
               
              
                if(e.Get_Salary() > salario_empleado){
                    System.out.println("los empleados que cumplen con el mayor salario son : " + e.Imprimir());
                }
            }
        
             
        }
        
       
        if(condicion == 3){
            System.out.println("ENTER THE SECOND NUMBER SALARY");
             Scanner salario2 = new Scanner(System.in);
             int salario_empleado2 = salario2.nextInt();
        for(Employee o : Consultaempleados){
            
                if(o.Get_Salary() > salario_empleado && o.Get_Salary() < salario_empleado2){
             System.out.println("los empleados que cumplen con el rango solicitado de salario son : " + o.Imprimir());
              }
           }
        }
        /*int longitudaux = Consultaempleados.Get_Size();
        int [] temp = new int [longitudaux];
        int contadoraux =0;
        
        for(int i = 0; i <Consultaempleados.Get_Size(); i++){
            temp [contadoraux] = i;
            contadoraux ++;
                    System.out.println(i);
               /*if(){
                   
               }*/
        
        
            
            
        /*
        if(condicion == 1){
            System.out.println("ENTER THE NUMBER SALARY");
            Scanner menor = new Scanner(System.in);
            int menorque = menor.nextInt();
            
            int aux = menorque;
            
            for(int  i = 0; i < menorque; i++){
                aux = i;
                System.out.println(Consultaempleados);
            }   
        }*/
 
        
        
    }
    
    
}
