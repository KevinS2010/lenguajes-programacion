
package capitulo6.threads;

public class ProbarMisThreads {
    public static void main(String[] args) {
        //Ciclo de vida del thread sin contar pausa
        //1.Creado
        MiPrimerThread t1=new MiPrimerThread();
        //2. Inicializado
        t1.setName("Loba");
        t1.start();
        //3.En Ejecucion (cuando corras este programa!! y se active 
        //su metodo run
        //5.Muerte cuando complete la tarea que tiene del 
        //metodo run.
        
        
    }
    
}
