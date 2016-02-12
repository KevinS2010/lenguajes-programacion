
package capitulo5.excepciones;


public class ValidarEdad {
    public static void checarEdadNegativa(int edad)throws ValorNoNegativoException{
       if(edad<0)throw new ValorNoNegativoException();
             
    }
    public static void checarMenorEdad(int edad)throws MenorDeEdadException{
        if(edad<18)throw  new MenorDeEdadException();
    }
}
