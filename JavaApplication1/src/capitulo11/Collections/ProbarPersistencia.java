
package capitulo11.Collections;


public class ProbarPersistencia {
    public static void main(String[] args)throws Exception{
        //Primero creamos un usuario con su login y password
        Usuario u1=new Usuario();
        u1.setLogin("tu");
        u1.setPassword("5678");
        //Ahora usaremos la clase persistencia usuario para persistir a este usuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        p.guardar(u1);
        System.out.println("Usuario guardado con exito");
    }
}
