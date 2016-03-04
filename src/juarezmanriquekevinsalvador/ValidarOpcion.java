
package juarezmanriquekevinsalvador;


public class ValidarOpcion {
 
    public static Pregunta[] obtenerPregunta(){
         Pregunta[] preguntas=new Pregunta[3];
     preguntas[0]=new Pregunta("Pregunta 1",
                  new Opciones("Contenido de la pregunta",false,"Moscu","Paris","Florencia","Londres"));
     preguntas[1]=new Pregunta("Pregunta 1",
                  new Opciones("Contenido de la pregunta",false,"Brasil","Peru","Mexico","Madrid"));
     preguntas[2]=new Pregunta("Pregunta 1",
                  new Opciones("Contenido de la pregunta",false,"Mexico","espeña","Argentina",""));
    return preguntas;
    }
 }    

