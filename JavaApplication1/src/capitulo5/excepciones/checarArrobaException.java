package capitulo5.excepciones;


public class checarArrobaException extends Exception{
    public  checarArrobaException(){
        super("Tu correo no contiene un @");
    }
}
