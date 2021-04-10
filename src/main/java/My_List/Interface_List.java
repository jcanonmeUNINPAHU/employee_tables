/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_List;

/**
 *
 * @author User
 */
public interface Interface_List <T>{
    
    //esta vacio
    boolean Is_Empty();
    
    //añadir objetos
    void Add_Item(T obj);
    void Add_Item(T obj, int index);
    
    //obtener el tamaño
    int Get_Size();
    
    //objeto con su indice
    T GetObject_Index(int index);
    
    //eliminar objetos
    T DeleteObject();
    T DeleteObject(int index);
    
    //obtener indices
    int IndexOf(T obj);
    public int[] IndexesOf(T obj);
}
