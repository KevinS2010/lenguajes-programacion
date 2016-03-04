
package juarezmanriquekevinsalvador;


public class Pregunta {
    private String titulo;
    private Opciones opciones;
    public Pregunta(){
        
    }
    public Pregunta(String titulo,Opciones opciones){
        this.titulo=titulo;
        this.opciones=opciones;
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
     * @return the opciones
     */
    public Opciones getOpciones() {
        return opciones;
    }

    /**
     * @param opciones the opciones to set
     */
    public void setOpciones(Opciones opciones) {
        this.opciones = opciones;
    }
}
