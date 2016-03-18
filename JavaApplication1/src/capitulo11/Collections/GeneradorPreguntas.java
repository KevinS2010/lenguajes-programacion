/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.Collections;
import java.util.*;
import javax.swing.JRadioButton;
/**
 *
 * @author T-101
 */
public class GeneradorPreguntas {
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //Vamos a crear una sola pregunta con 3 opciones
        Opcion op1=new Opcion("a)Moscu",true);
        Opcion op2=new Opcion("b)Florencia",false);
        Opcion op3=new Opcion("c)Paris",false);
        Opcion op4=new Opcion("d)Mexico",false);
        
        Opcion o1p2=new Opcion("a)Tokio",false);
        Opcion o2p2=new Opcion("b)Beiging",true);
        Opcion o3p2=new Opcion("c)Seul",false);
        Opcion o4p2=new Opcion("d)Pyunging",false);
        
        ArrayList<Opcion>opciones=new ArrayList<Opcion>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        
        ArrayList<Opcion>opcionesp2=new ArrayList<Opcion>();
        opcionesp2.add(o1p2);
        opcionesp2.add(o2p2);
        opcionesp2.add(o3p2);
        opcionesp2.add(o4p2);
        
        Pregunta p1=new Pregunta("Capital de Rusia", opciones);
        Pregunta p2=new Pregunta("Capital de China", opcionesp2);
        
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        
        return preguntas;
    }
    public static boolean checarRespuesta(Pregunta p, JRadioButton[]radios){
        boolean respuesta=false;
        String seleccion="";
        for(JRadioButton radio:radios){
            if(radio.isSelected()){
                seleccion= radio.getText();
            }
        }
        for(Opcion o:p.getOpciones()){
            if(o.isEstatus()){
                if(o.getTitulo().equals(seleccion))respuesta=true;
            }
        }
        
        return respuesta;
    }
}