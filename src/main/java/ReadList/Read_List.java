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
        
        
        ArrayList<Cities> ConsultaCiudad = new ArrayList<>();
        
        ConsultaCiudad.add(new Cities (1, "BOGOTA"));
        ConsultaCiudad.add(new Cities (2, "MEDELLIN"));
        ConsultaCiudad.add(new Cities (3, "CALI"));
        ConsultaCiudad.add(new Cities (4, "CARTAGENA"));
        ConsultaCiudad.add(new Cities (5, "PASTO"));
        
        ArrayList<Education>ConsultaEducacion = new ArrayList<>();
        
        ConsultaEducacion.add(new Education (1,"TECNICO"));
        ConsultaEducacion.add(new Education (2,"TECNOLOGO"));
        ConsultaEducacion.add(new Education (3,"PROFESIONAL"));
        ConsultaEducacion.add(new Education (4,"ESPECIALISTA"));
        ConsultaEducacion.add(new Education (5,"MAGISTER"));
        ConsultaEducacion.add(new Education (6,"DOCTOR"));
        
        System.out.println("PROGRAM developed by : JEFERSON CAÑON AND CATHERINE CAPERA " ); 
        System.out.println(" ");
        System.out.println("WHICH OPTION DO YOU WANT TO CONSULT?");
        System.out.println(" ");
        System.out.println("1. CITY");
        System.out.println(" ");
        System.out.println("2. EDUCATION");
        System.out.println(" ");
        System.out.println("3. SALARY");
       
        Scanner CondicionesSeleccionada = new Scanner(System.in);
        int condicion1 = CondicionesSeleccionada.nextInt();
        
        if(condicion1 == 1){
            System.out.println("cuidad por la cual quieres filtrar");
            Scanner CondicionesSeleccionada1 = new Scanner(System.in);
            String condicion11 = CondicionesSeleccionada.nextLine();
             
            for(Cities c : ConsultaCiudad){
            if(condicion11 == "BOGOTA"){

                if(c.Get_City() == condicion11){
                    System.out.println("los empleados que cumplen con el menor son : " + c.ImprimirCiudad());
                }
            }
             if(condicion11 == "MEDELLIN"){
               
              
                if(c.Get_City() == condicion11){
                    System.out.println("los empleados que cumplen son : " + c.ImprimirCiudad());
                }
            }
             
             if(condicion11 == "CARTAGENA"){

                if(c.Get_City() == condicion11){
                    System.out.println("los empleados que cumplen  son : " + c.ImprimirCiudad());
                }
            }
             if(condicion11 == "PASTO"){
               
              
                if(c.Get_City() == condicion11){
                    System.out.println("los empleados que cumplen con son : " + c.ImprimirCiudad());
                }
            }      
          }
        }
            
            if(condicion1 == 1){
            System.out.println("educacion por la cual quieres filtrar");
            Scanner CondicionesSeleccionada11 = new Scanner(System.in);
            String condicion111 = CondicionesSeleccionada11.nextLine();
             
            for(Education n : ConsultaEducacion){
            if(condicion111 == "TECNICO"){

                if(n.Get_Range() == condicion111){
                    System.out.println("los empleados que cumplen con el menor son : " + n.ImprimirEducacion());
                }
            }
             if(condicion111 == "TECNOLOGO"){
               
              
                if(n.Get_Range() == condicion111){
                    System.out.println("los empleados que cumplen son : " + n.ImprimirEducacion());
                }
            }
             
             if(condicion111 == "PROFESIONAL"){

                if(n.Get_Range() == condicion111){
                    System.out.println("los empleados que cumplen  son : " + n.ImprimirEducacion());
                }
            }
             if(condicion111 == "ESPECIALISTA"){
               
              
                if(n.Get_Range() == condicion111){
                    System.out.println("los empleados que cumplen con son : " + n.ImprimirEducacion());
                }
            }
            if(condicion111 == "MAGISTER"){

                if(n.Get_Range() == condicion111){
                    System.out.println("los empleados que cumplen  son : " + n.ImprimirEducacion());
                }
            }
             if(condicion111 == "DOCTOR"){
               
              
                if(n.Get_Range() == condicion111){
                    System.out.println("los empleados que cumplen con son : " + n.ImprimirEducacion());
                }
            }
        
             
        }
            
        }
            
        if(condicion1 == 3){
               
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
      }
    }     
  } 
    
