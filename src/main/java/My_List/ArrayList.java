/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_List;

import Objects.Employee;

/**
 *
 * @author User
 */
public class ArrayList <T> implements Interface_List <T>  {
    
    private int size;
    private T[] objects;
   
   
    
    private final int initialArray_Capacity = 2;
    
    public ArrayList(){
        
        size = 0;
        objects = (T[]) new Object[initialArray_Capacity];
    }
    
    /*====================
    Interface methods
    =====================*/
    
    @Override
    public void add( T objectAdd){
        
        if(size == objects.length){
            T[] newobjects = (T[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newobjects, 0, objects.length);
            objects = newobjects;
        }
        
        objects[size] = objectAdd;
        size++;
    }
    
    @Override
    public int Get_Size(){
        return size;
    }
    
    @Override
    public T GetObject_Index(int index){
        return objects[index];
    }
    
    @Override
    public T DeleteObject(){
        
        T obj = objects[size];
        size--;
        
        return obj;
    }
    
    public T DeleteObject(boolean a){
        
        T obj = objects[0];
        objects[0] = null;
        for(int i = 1; i < size; i++){
            objects[i-1] = objects[i];
        }
        size--;
        
        return obj;
    }
    
    @Override
    public T DeleteObject(int index){
        T obj = objects[index];
        
        //eliminar onbjeto
        objects[index] = null;
        
        //correr  las posiciones 
        for(int i = index+1; i<size; i++){
            objects[i-1] = objects[i];
        }
        
        objects[size] = null;
        size--;
        return obj;
    }
    
    @Override
    public int IndexOf(T obj){
        int result = -1;
        for(int i = 0; i<size; i++){
            if(objects[i].equals(obj)){
                result = i;
            }
        }
        return result;
    }
    
    @Override
     public boolean Is_Empty() {
        return size > 0;
    }
     
     @Override
     public void add( T obj, int index){
         if(size == objects.length){
             T[] newobjects = (T[]) new Object[objects.length * 2];
             System.arraycopy(objects, 0, newobjects, 0, objects.length);
              objects = newobjects;
         }
         
         if(index >= size-1){
             objects[size-1] = obj;
             size++;
         }
         
         if(index < size-1){
             for(int i = size-1; i< index; i--){
                 if(i == index)
                     objects[i] = obj;
                 else
                     objects[i+1] = objects[i];
             }
             size++;
         }
       }
     
     @Override
     public int[] IndexesOf(T obj){
         int [] resultados = new int[size];
         for(int i = 0; i < size; i++){
            if(objects[i].equals(obj)){
                  resultados[i] = i;
            }else{
                resultados[i] = -1;
            }
        }
        return resultados;
        }
     
    
    
     
      public int[] Salary(T obj){
          int [] resultados_salario = new int[size];
          for(int i = 0; i < size; i++){
             
                  resultados_salario[i] = i;
              }
          return resultados_salario;
          }
      }

     
         
    
 
