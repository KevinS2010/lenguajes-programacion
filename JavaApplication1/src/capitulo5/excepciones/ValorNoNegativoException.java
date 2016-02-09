
package capitulo5.excepciones;

import javax.swing.JOptionPane;


public class ValorNoNegativoException extends Exception{
    public ValorNoNegativoException(){
        super("No puedes meter un valor negativo");
        
    }
}
