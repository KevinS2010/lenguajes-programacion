/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juarezmanriquekevinsalvador;

/**
 *
 * @author T-101
 */
public class Opciones {
   private String titulo;
   private String opcion1;
   private String opcion2;
   private String opcion3;
   private String opcion4;
   private boolean estatus;
   private int numopciones;
   
   public Opciones(){
       //Costructor por defecto
   }
   public Opciones(String titulo,boolean estatus, String opcion1, String opcion2, String opcion3, String opcion4){
       //Constructor que inicializa los atributos
       this.titulo=titulo;
       this.estatus=estatus;
       this.opcion1=opcion1;
       this.opcion2=opcion2;
       this.opcion3=opcion3;
       this.opcion1=opcion4;
       
   }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the estatus
     */
    public boolean isEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    /**
     * @return the opcion1
     */
    public String getOpcion1() {
        return opcion1;
    }

    /**
     * @param opcion1 the opcion1 to set
     */
    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    /**
     * @return the opcion2
     */
    public String getOpcion2() {
        return opcion2;
    }

    /**
     * @param opcion2 the opcion2 to set
     */
    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    /**
     * @return the opcion3
     */
    public String getOpcion3() {
        return opcion3;
    }

    /**
     * @param opcion3 the opcion3 to set
     */
    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    /**
     * @return the opcion4
     */
    public String getOpcion4() {
        return opcion4;
    }

    /**
     * @param opcion4 the opcion4 to set
     */
    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    /**
     * @return the numopciones
     */
    public int getNumopciones() {
        return numopciones;
    }

    /**
     * @param numopciones the numopciones to set
     */
    public void setNumopciones(int numopciones) {
        this.numopciones = numopciones;
    }
}
