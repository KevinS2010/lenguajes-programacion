
package capitulo6.threads;
/*
*Creacion de un Thread heredando la clase thread
*/

public class MiPrimerThread extends Thread{

    @Override
    public void run() {
        System.out.println("Soy un thread y me llamo "+this.getName());
        
    }
    
}
