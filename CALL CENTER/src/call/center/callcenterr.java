package call.center;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import call.center.Llamada;
public class callcenterr extends Cola<Llamada> {
  
double tiempototal;


    Cola<Llamada> llama = new Cola<>();
    LinkedList<Llamada> puntuaciones = new LinkedList<>();
    
    public void recibirllamada(Llamada dato){
          if (dato.obtenertipollamada() == Llamada.tipo.prioritaria) {
        llama.enqueueprioritario(dato);
    } else {
        llama.enqueue(dato);
    }

    }
    
    public void atenderllamada(){
     Llamada dato = llama.dequeue();

    if (dato != null) {
        puntuaciones.add(dato);
        dato.asignarpuntuacion();
    }   
       System.out.println("Llamada atendida: " + dato);
    } 
    
    public void cancelarllamada(){
       llama.dequeue();
    }
    public void mostrarcola(){
         JOptionPane.showMessageDialog(null, llama.peek());
    }
    
    public double tiempototalpendiente(){
          tiempototal = 0;

    for (Llamada dato : llama.obtenerElementos()) {
        tiempototal += dato.getDuracion();
    }

    return tiempototal;
    }
    
    public int llamadaspendientes(){
       return llama.size();
    }
    
    public void atendertodas(){
       while (!llama.empty()) {
        atenderllamada();
    }
    }
    public int obtenerpromedio(){
           if (puntuaciones.isEmpty()) {
        return 0;
    }

    int suma = 0;

    for (Llamada dato : puntuaciones) {
        suma += dato.obtenerpuntuacion();
    }

    return suma / puntuaciones.size();
    }
}
