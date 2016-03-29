/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.Collections;

import java.io.*;
import java.util.*;
public class PersistenciaUsuario {
    ArrayList<Usuario>usuarios;

    public PersistenciaUsuario() {
        usuarios =new ArrayList<>();
    }
    
    //Primero el metodo de buscar todos
    ArrayList<Usuario>buscarTodos()throws Exception{
        
       //Paso numero 1:Leemos el archivo donde esta guardado el ArrayList
       File f=new File("archivaldo.raton"); 
       //Leemos el contenido
       FileInputStream fis=new FileInputStream(f);
       //Descomprimimos el contenido
       ObjectInputStream ois=new ObjectInputStream(fis);
       usuarios=(ArrayList<Usuario>) ois.readObject();
       return usuarios;                  
    }
    public void guardar(Usuario u)throws Exception{
        File f=new File("archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
}
