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
public class SoloUnaCorrectaExcepction extends Exception{
    public SoloUnaCorrectaExcepction(){
        super("Solo se puede asignar una opcion correcta");
    }
}
