package call.center;
public class CALLCENTER {
    public static void main(String[] args) {
       
       callcenterr hola = new callcenterr();
       
       Llamada llamada1 = new Llamada(1,"Elisa", 5.5, Llamada.tipo.normal,0);
       Llamada llamada2 = new Llamada(2,"Jefe", 8.7, Llamada.tipo.prioritaria,0);
       Llamada llamada3 = new Llamada(5,"Tatiano", 6.7, Llamada.tipo.normal,0);
       Llamada llamada4 = new Llamada(8,"tatianis", 1.6, Llamada.tipo.normal,0);
       Llamada llamada5 = new Llamada(10,"Eli", 1.6, Llamada.tipo.normal,0);
       Llamada llamada8 = new Llamada(2,"supertatiano", 8.7, Llamada.tipo.prioritaria,0);
    
       hola.recibirllamada(llamada4);
       hola.recibirllamada(llamada3);
       hola.recibirllamada(llamada1);
       hola.recibirllamada(llamada2);
       hola.recibirllamada(llamada5);
       hola.recibirllamada(llamada8);
       
        System.out.println("Llamadas salientes: " + hola.llamadaspendientes());
        System.out.println("Tiempo restante: "+ hola.tiempototalpendiente());
        
        hola.mostrarcola();
        
        hola.atenderllamada();
        
        System.out.println("llamadas pendientes al atender una: "+ hola.llamadaspendientes());
         
        hola.atendertodas();
          
        System.out.println("llamadas pendientes al atender todas: "+ hola.llamadaspendientes()); 
        System.out.println("promedio de puntuaciones: "+ hola.obtenerpromedio()); 
        
        
    }
    
}
