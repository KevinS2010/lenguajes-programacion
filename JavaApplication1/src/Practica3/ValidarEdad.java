package Practica3;

public class ValidarEdad {
public void checarEdadNegativa(int edad)throws ValorNoNegativoException{
 if(edad<0)throw new ValorNoNegativoException();
}    
}
