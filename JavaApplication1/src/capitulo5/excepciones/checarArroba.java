package capitulo5.excepciones;


public class checarArroba extends Exception{
    public  checarArroba(){
        super("Tu correo no contiene un @");
    }
}
