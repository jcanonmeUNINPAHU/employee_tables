/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadList;
import My_List.*;
import Objects.*;
import Objects.Employee.*;
import Objects.Cities.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Read_List2 {
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
        
        ConsultaCiudad.add(new Cities (1001, "ARDILA GOMEZ", "DIEGO", 2904854, 4, 2,4, "CARTAGENA"));
        ConsultaCiudad.add(new Cities (1002, "ARGUELLO TIQUE", "JIMMY ANDRES", 4380110, 2, 4,2, "MEDELLIN"));
        ConsultaCiudad.add(new Cities (1003, "BERMUDEZ PENA", "SOLANGI PAOLA", 2955944, 6, 2,6, "NO ASIGNADO"));
        ConsultaCiudad.add(new Cities (1004, "BOLIVAR CUCHIGAY", "EDISSON ARLEY", 3732732, 6, 4,6, "NO ASIGNA"));
        ConsultaCiudad.add(new Cities (1005, "ESPINOSA GARZON", "DANIEL", 3460562, 5, 1,5, "PASTO"));
        ConsultaCiudad.add(new Cities (1006, "GAMBOA IBARRA", "DANIELA", 1577222, 3, 5, 3, "CALI"));
        ConsultaCiudad.add(new Cities (1007, "HERRERA CAICEDO", "JORGE ALEXANDER", 3014490, 3, 5,3, "CALI" ));
        ConsultaCiudad.add(new Cities (1008, "MARTINEZ GOMEZ", "JENNY PAOLA", 3137294, 3, 5, 3, "CALI"));
        ConsultaCiudad.add(new Cities (1009, "MEDINA ACUNA", "MANUELA JULIETH", 4407138, 5, 3, 5, "PASTO"));
        
        ArrayList<Education>ConsultaEducacion = new ArrayList<>();
        
        ConsultaEducacion.add(new Education (1001, "ARDILA GOMEZ", "DIEGO", 2904854, 4, 2,2, "TECNOLOGO"));
        ConsultaEducacion.add(new Education (1002, "ARGUELLO TIQUE", "JIMMY ANDRES", 4380110, 2, 4,4, "ESPECIALISTA"));
        ConsultaEducacion.add(new Education (1003, "BERMUDEZ PENA", "SOLANGI PAOLA", 2955944, 6, 2,2, "TECNOLOGO"));
        ConsultaEducacion.add(new Education (1004, "BOLIVAR CUCHIGAY", "EDISSON ARLEY", 3732732, 6, 4,4, "ESPECIALISTA"));
        ConsultaEducacion.add(new Education (1005, "ESPINOSA GARZON", "DANIEL", 3460562, 5, 1,1, "TECNICO"));
        ConsultaEducacion.add(new Education (1006, "GAMBOA IBARRA", "DANIELA", 1577222, 3, 5, 5, "MAGISTER"));
        ConsultaEducacion.add(new Education (1007, "HERRERA CAICEDO", "JORGE ALEXANDER", 3014490, 3, 5,5, "MAGISTER" ));
        ConsultaEducacion.add(new Education (1008, "MARTINEZ GOMEZ", "JENNY PAOLA", 3137294, 3, 5, 5, "MAGISTER"));
        ConsultaEducacion.add(new Education (1009, "MEDINA ACUNA", "MANUELA JULIETH", 4407138, 5, 3, 3, "PROFESIONAL"));
        
        System.out.println("PROGRAM developed by : JEFERSON CAÑON AND CATHERINE CAPERA " ); 
        System.out.println(" ");
        System.out.println("WHICH OPTION DO YOU WANT TO CONSULT?");
        System.out.println(" ");
        System.out.println("1. CITY AND EDUCATION");
        System.out.println(" ");
        System.out.println("2.  CITY AND SALARY");
        System.out.println(" ");
        System.out.println("3.  EDUCATION AND SALARY");
        System.out.println(" ");
        
        Scanner CondicionesSeleccionada = new Scanner(System.in);
        int condicion1 = CondicionesSeleccionada.nextInt();
        
        
        if(condicion1 == 1){
            
            System.out.println(" ");
            System.out.println("BOGOTA 1");
            System.out.println(" ");
            System.out.println("MEDELLIN 2");
            System.out.println(" ");
            System.out.println("CALI 3");
            System.out.println(" ");
            System.out.println("CARTAGENA 4");
            System.out.println(" ");
            System.out.println("PASTO 5");
            System.out.println(" ");
            System.out.println("Escriba el id de la cuidad por la cual quieres filtrar");
            Scanner CondicionesSeleccionada1_Ciudad = new Scanner(System.in);
            int condicion11 = CondicionesSeleccionada1_Ciudad.nextInt();
               System.out.println("==============================");
             
             System.out.println(" ");
                System.out.println("TECNICO 1");
                System.out.println(" ");
                System.out.println("TECNOLOGO 2");
                System.out.println(" ");
                System.out.println("PROFESIONAL 3");
                System.out.println(" ");
                System.out.println("ESPECIALISTA 4");
                System.out.println(" ");
                System.out.println("MAGISTER 5");
                System.out.println(" ");
                System.out.println("DOCTOR 6");
                System.out.println(" ");
                System.out.println("Escriba el id de la educación por la cual quieres filtrar");
                 System.out.println("==============================");
                
            Scanner CondicionesSeleccionada11 = new Scanner(System.in);
            int condicion111 = CondicionesSeleccionada11.nextInt();
            
 
           /*for(Employee e :  Consultaempleados){
              
               if (condicion11 != e.Get_idCity()&& condicion111 != e.Get_idEducation()){
                   System.out.println("no se encunetran ningun empleado  con esas caracterisitcas");
                   System.out.println("================================");
                   
               }else if(condicion11 == e.Get_idCity()&& condicion111 == e.Get_idEducation()){
                   System.out.println("LOS EMPLEADOS QUE CUMPLEN SON  : " + e.Imprimir());
                    System.out.println("================================");
               }
                    
           }*/
           
            for(Cities c : ConsultaCiudad){
                for(Education n : ConsultaEducacion){
                    
                    if(condicion11 == c.Get_City() && condicion111 == n.Get_Range()){
                    System.out.println("los empleados que cumplen son : " + c.ImprimirCiudad());
                    System.out.println("================================");
                      break;
                    }
                 }
              }
          }
        
         if(condicion1 == 2){
            
            System.out.println(" ");
            System.out.println("BOGOTA 1");
            System.out.println(" ");
            System.out.println("MEDELLIN 2");
            System.out.println(" ");
            System.out.println("CALI 3");
            System.out.println(" ");
            System.out.println("CARTAGENA 4");
            System.out.println(" ");
            System.out.println("PASTO 5");
            System.out.println(" ");
            System.out.println("Escriba el id de la cuidad por la cual quieres filtrar");
            Scanner CondicionesSeleccionada11_Ciudad = new Scanner(System.in);
            int condicion1111 = CondicionesSeleccionada11_Ciudad.nextInt();
               System.out.println("==============================");
             
        System.out.println("CHOOSE CONSULT TYPE TO EMPLOYEE SALARIES " );
        System.out.println("1. SALARY LESS THAN " );
        System.out.println("2. SALARY GREATER THAN " );
        System.out.println("3. SALARY BETWEEN A RANGE OF ");
        Scanner primeraCondicion = new Scanner(System.in);
        int condicion = primeraCondicion.nextInt();
        
        System.out.println("ENTER THE FIRST NUMBER SALARY");
        Scanner salario = new Scanner(System.in);
        int salario_empleado = salario.nextInt();
        
        if(condicion == 1){
         for(Employee e : Consultaempleados){  
                if( e.Get_Salary() < salario_empleado && condicion1111 == e.Get_idCity()){
                    System.out.println("los empleados que cumplen  son : " + e.Imprimir());
                     System.out.println("================================");     
                }
             } 
         }
        if(condicion == 2){
         for(Employee e : Consultaempleados){  
                if( e.Get_Salary() > salario_empleado && condicion1111 == e.Get_idCity()){
                    System.out.println("los empleados que cumplen  son : " + e.Imprimir());
                     System.out.println("================================");          
                }
            } 
         }
        
        if(condicion == 3){
            System.out.println("ENTER THE SECOND NUMBER SALARY");
             Scanner salario2 = new Scanner(System.in);
             int salario_empleado2 = salario2.nextInt();
             System.out.println("==============================");
          System.out.println("los que cumplen con la primera condicion: "); 
             
        for(Employee o : Consultaempleados){
            
                if(o.Get_Salary() > salario_empleado && o.Get_Salary() < salario_empleado2 &&  condicion1111 == o.Get_idCity()){
                System.out.println("los empleados que cumplen  son : " + o.Imprimir());
              }
           }
            
        }
      }
         
       if(condicion1 == 3){
            
           System.out.println(" ");
                System.out.println("TECNICO 1");
                System.out.println(" ");
                System.out.println("TECNOLOGO 2");
                System.out.println(" ");
                System.out.println("PROFESIONAL 3");
                System.out.println(" ");
                System.out.println("ESPECIALISTA 4");
                System.out.println(" ");
                System.out.println("MAGISTER 5");
                System.out.println(" ");
                System.out.println("DOCTOR 6");
                System.out.println(" ");
                System.out.println("Escriba el id de la educación por la cual quieres filtrar");
                 System.out.println("==============================");
                
            Scanner CondicionesSeleccionada11 = new Scanner(System.in);
            int condicion111 = CondicionesSeleccionada11.nextInt();
             
        System.out.println("CHOOSE CONSULT TYPE TO EMPLOYEE SALARIES " );
        System.out.println("1. SALARY LESS THAN " );
        System.out.println("2. SALARY GREATER THAN " );
        System.out.println("3. SALARY BETWEEN A RANGE OF ");
        Scanner primeraCondicion = new Scanner(System.in);
        int condicion = primeraCondicion.nextInt();
        
        System.out.println("ENTER THE FIRST NUMBER SALARY");
        Scanner salario = new Scanner(System.in);
        int salario_empleado = salario.nextInt();
        
        if(condicion == 1){
         for(Employee e : Consultaempleados){  
                if( e.Get_Salary() < salario_empleado && condicion111 == e.Get_idCity()){
                    System.out.println("los empleados que cumplen  son : " + e.Imprimir());
                     System.out.println("================================");     
                }
             } 
         }
        if(condicion == 2){
         for(Employee e : Consultaempleados){  
                if( e.Get_Salary() > salario_empleado && condicion111 == e.Get_idCity()){
                    System.out.println("los empleados que cumplen  son : " + e.Imprimir());
                     System.out.println("================================");          
                }
            } 
         }
        
        if(condicion == 3){
            System.out.println("ENTER THE SECOND NUMBER SALARY");
             Scanner salario2 = new Scanner(System.in);
             int salario_empleado2 = salario2.nextInt();
             System.out.println("==============================");
          System.out.println("los que cumplen con la primera condicion: "); 
             
        for(Employee o : Consultaempleados){
            
                if(o.Get_Salary() > salario_empleado && o.Get_Salary() < salario_empleado2 &&  condicion111 == o.Get_idCity()){
                System.out.println("los empleados que cumplen  son : " + o.Imprimir());
              }
           }
            
        }
      }
   }   
 }

  
