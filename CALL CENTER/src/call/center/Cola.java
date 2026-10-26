package call.center;

import java.util.LinkedList;

public class Cola <T>{

    private nodo<T> inicio;
    private nodo<T> fin;
    int cantidad;
    
    public Cola(){
        inicio = null;
        fin = null;
        cantidad = 0;
    }
    
    //*INSERTA UN ELEMENTO AL FINAL DE LA COLA
    public void enqueue(T dato){
      nodo<T> nuevo = new nodo<T>(dato);
        if(empty()){
          inicio = nuevo;
          fin = nuevo;
      }else{
           fin.sig = nuevo;
           fin = nuevo;
        }
        cantidad++;
    }
    
    //*EXTRAER EL PRIMER ELEMENTO DE LA COLA
    public T dequeue(){
       
        if(empty()){
            return null;
        }
        T dato = inicio.dato;
          inicio = inicio.sig;
          cantidad --;
          
        if(inicio ==null){
            fin = null;
        }
         return dato;      
    }
    //*CONSULTA UN ELEMENTO DEL INICIO DE LA COLA SINN EXTRAERLO
    public T peek(){
        if(empty()){
            return null;
        }
       T dato = inicio.dato;
        return dato ; 
    }
    
    //*REVISAR SI ESTA VACIO
    public boolean empty(){
       return cantidad == 0;
    }
    
    //*REVISAR LA CANTIDAD DE ELEMENTOS
    public int size(){
      return cantidad;  
    }
    
    //*INSERTAR AL INICIO DE LA COLA
    public void enqueueprioritario(T dato){
        nodo<T> nuevo = new nodo<T>(dato);
        
       nuevo.sig = inicio;
       inicio = nuevo;
       
       if(fin == null){
           fin = nuevo;
       }
 
         cantidad++;
        
    }
    
    public LinkedList<T> obtenerElementos() {
    LinkedList<T> elementos = new LinkedList<>();
    nodo<T> actual = inicio;

    while (actual != null) {
        elementos.add(actual.dato);
        actual = actual.sig;
    }

    return elementos;
}
    
}
