
package capitulo11.Collections;


public class LeerUsuarios {
    
    public static void main(String[] args)throws Exception{
    //Creamos un objeto de clase PersistenciaUsuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        //Invocamos el metodo buscarTodos
        System.out.println(p.buscarTodos().size());
        for(Usuario u: p.buscarTodos()){
            System.out.println("Login: "+u.getLogin()+"\nPassword: "+u.getPassword());
        }
    }
}
