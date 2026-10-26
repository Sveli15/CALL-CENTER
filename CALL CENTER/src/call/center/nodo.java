package call.center;
public class nodo<T> {
    T dato;
    nodo<T> sig;
  
    public nodo(T dato){
        this.dato = dato;
        this.sig = null;
      
    }
}
