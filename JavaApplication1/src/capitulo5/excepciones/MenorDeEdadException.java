package capitulo5.excepciones;


public class MenorDeEdadException extends Exception{
    public MenorDeEdadException(){
        super("No puedo dar de alta a un menor de 18 años");
    }
}
