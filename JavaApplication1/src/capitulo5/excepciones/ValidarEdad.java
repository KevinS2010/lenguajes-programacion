
package capitulo5.excepciones;


public class ValidarEdad {
    public void checarEdadNegativa(int edad)throws ValorNoNegativoException{
       if(edad<0)throw new ValorNoNegativoException();
           
       
    }
}
