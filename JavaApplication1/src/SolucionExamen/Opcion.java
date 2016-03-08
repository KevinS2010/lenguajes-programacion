/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author T-101
 */
public class Opcion {
   private String titulo;
   private boolean estatus;

    /**
     * @return the titulo
     */
   public Opcion(String titulo,boolean estatus){
       this.titulo=titulo;
       this.estatus=estatus;
       
   }
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
     * @return the opcion
     */
    public boolean isEstatus() {
        return estatus;
    }

    /**
     * @param opcion the opcion to set
     */
    public void setEstatus(boolean opcion) {
        this.estatus = estatus;
    }
}
