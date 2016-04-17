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
        
        Opcion o1p3=new Opcion("a)Kioto",false);
        Opcion o2p3=new Opcion("b)Osaka",false);
        Opcion o3p3=new Opcion("c)Nagoya",false);
        Opcion o4p3=new Opcion("d)Tokio",true);
        
        Opcion o1p4=new Opcion("a)Ottawa",true);
        Opcion o2p4=new Opcion("b)Toronto",false);
        Opcion o3p4=new Opcion("c)Montreal",false);
        Opcion o4p4=new Opcion("d)Vancouver",false);
        
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
        
        ArrayList<Opcion>opcionesp3=new ArrayList<Opcion>();
        opcionesp3.add(o1p3);
        opcionesp3.add(o2p3);
        opcionesp3.add(o3p3);
        opcionesp3.add(o4p3);
        
        ArrayList<Opcion>opcionesp4=new ArrayList<Opcion>();
        opcionesp4.add(o1p4);
        opcionesp4.add(o2p4);
        opcionesp4.add(o3p4);
        opcionesp4.add(o4p4);
        
        Pregunta p1=new Pregunta("Capital de Rusia", opciones);
        Pregunta p2=new Pregunta("Capital de China", opcionesp2);
        Pregunta p3=new Pregunta("Capital de Japon", opcionesp3);
        Pregunta p4=new Pregunta("Capital de Canada", opcionesp4);
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
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
    public static float calificacion(Pregunta p, JRadioButton[]radios){
      boolean respuesta=false;
      float calificacion=0;
        String seleccion="";
        for(JRadioButton radio:radios){
            if(radio.isSelected()){
                seleccion= radio.getText();
            }
        }
        for(Opcion o:p.getOpciones()){
            if(o.isEstatus()){
                if(o.getTitulo().equals(seleccion))respuesta=true;
                calificacion+=2.5;
            }
        }  
        return calificacion;
    }
}

