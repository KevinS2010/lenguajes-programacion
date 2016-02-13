
package capitulo5.excepciones;


public class ValidarEmail {
    
  public static void revisarArroba(String email)throws checarArrobaException{
      if(email.contains("@")){//throw new checarArrobaException();
          System.out.println();
      }else throw  new checarArrobaException();
  }
  public static void revisarPunto(String email) throws ChecarPuntoComException{
      if(!email.contains(".com"))throw new ChecarPuntoComException();
  }
}
