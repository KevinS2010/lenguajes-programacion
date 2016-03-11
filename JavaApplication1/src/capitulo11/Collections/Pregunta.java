
package capitulo11.Collections;
import java.util.*;

public class Pregunta {
   private String titulo;
   private ArrayList<Opcion>opciones;
   //La mas debil es la que depende unicamente de los parametros que r ecibe
   //Esta es una clase moderada
   //Cuando incluye extends la clase

    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }
}
