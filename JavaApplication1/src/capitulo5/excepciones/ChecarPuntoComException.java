
package capitulo5.excepciones;


public class ChecarPuntoComException extends Exception{
    public ChecarPuntoComException(){
        super("Tu correo no contiene un .com");
    }
}
