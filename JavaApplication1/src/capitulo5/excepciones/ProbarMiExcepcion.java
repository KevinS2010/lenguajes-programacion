
package capitulo5.excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProbarMiExcepcion {
    public static void main(String[] args) {
        try {
            Cliente c=new Cliente();
            c.setEdad(16);
            //ValidarEdad valida=new ValidarEdad();
            //valida.checarEdadNegativa(-19);
        } catch (ValorNoNegativoException ex) {
            System.out.println(ex.getMessage());
        }catch(MenorDeEdadException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Este siempre se ejcuta se lance o no la e");
        }
        
    }
}
