
package capitulo5.excepciones;


public class Cliente {
    private String email;
    private int edad;

    public Cliente() {
    }
    /**
     * 
     * @param email
     * @param edad 
     */

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    /**
     * Este metodo nos regresa el email que ya previamente
     * se debio haber proporcionado por el metodo set correspondiente 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Este metodo necesita que proporciones un String 
     * que va a ser el email que le vas asignar al cliente
     * @param email Aqui debes de poner el String correspondiente al email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException {
        ValidarEdad validar=new ValidarEdad();
        validar.checarEdadNegativa(edad);
        this.edad = edad;
    }
    
}
