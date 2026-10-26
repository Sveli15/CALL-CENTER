package call.center;
public class Llamada {
   int id;
   String cliente;
   enum tipo{normal, prioritaria}
   double duracion;
   tipo tipollamada;
   int puntuacion;

    public Llamada(int id, String cliente, double duracion, tipo llamada, int puntuacion) {
        this.id = (int)(Math.random() * 100) + 1;
        this.cliente = cliente;
        this.duracion = duracion;
        this.tipollamada = llamada;
        this.puntuacion = puntuacion;
    }
    
    public tipo obtenertipollamada(){
        return tipollamada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "id: " + id + " cliente: " + cliente + " duracion: " + duracion;
    }
    
     
public int obtenerpuntuacion(){
       
       return puntuacion;
   }
   public void asignarpuntuacion(){
       puntuacion  = (int)(Math.random()*10)+1;
   
   }
}
