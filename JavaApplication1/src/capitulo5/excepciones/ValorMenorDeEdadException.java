
package capitulo5.excepciones;


public class ValorMenorDeEdadException extends Exception{
    public ValorMenorDeEdadException(){
        super("Tienes que tener mas de 18 años");
    }
}
