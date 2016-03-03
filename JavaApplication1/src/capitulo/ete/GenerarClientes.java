package capitulo.ete;

import javax.swing.JOptionPane;

public class GenerarClientes {
    
  public static Cliente[] obtenerClientes(){
         Cliente clientes[] =new Cliente[3];
            clientes[0]=new Cliente("Ana","Lopez", 20, 20000, 
                        new Direccion("sur 11", 20, "Ecatepunk","28947939"));
            clientes[1]=new Cliente("Pedro","Matinez", 45, 14000, 
                        new Direccion("Mexico", 122, "Nezayork","35739457"));
            clientes[2]=new Cliente("Laura","Gomez", 30, 70000, 
                        new Direccion("R-1", 43, "Cloacalco","5530385803"));                
            for(int i=0;i<clientes.length;i++){
                JOptionPane.showMessageDialog(null,"Nombre: "+clientes[i].getNombre()+"\n Apellido: "+clientes[i].getaPaterno()
                +"\n Edad: "+clientes[i].getEdad()+"\n Sueldo"+clientes[i].getSueldo()
                +"\n Direccion "+"\nCalle: "+clientes[i].getDireccion().getCalle()
                +"\n Numero: "+clientes[i].getDireccion().getNumero()
                +"\nMunicipio: "+clientes[i].getDireccion().getMunicipio()
                +"\nTelefono: "+clientes[i].getDireccion().getTelefono());   
            }         
            return clientes;           
    }
           
}
