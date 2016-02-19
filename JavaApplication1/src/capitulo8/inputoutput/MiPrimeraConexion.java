
package capitulo8.inputoutput;

import java.net.*;
import java.io.*;
public class MiPrimeraConexion {
    public static void main(String[] args) throws Exception{
      //primero vamos a usar una clase que se llama URL
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();
        
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);
        String lineaActual="No ha leido nada";
        boolean encontrado=false;
        int miLinea=0;
        while((lineaActual=reader.readLine())!=null){
            if(encontrado && miLinea<=0){
                //Vamos a despedazar la linea
                int indice=lineaActual.indexOf(">");
                int indice2=lineaActual.indexOf("</");
                String tempActual=lineaActual.substring(indice+1,indice2);
                System.out.println(tempActual);
                miLinea++;
                
            }
            if(lineaActual.contains("Outside Temp")){
                encontrado=true;
                System.out.println("Dato encontrado!!");
                
            }
       }
       /*String hola="<td width=class summary_data>21.2 C</td>"; 
       int indice1=hola.indexOf("summary_data");
       int indice2=hola.indexOf("</td>");
       String nuevo=hola.substring(indice1, indice2);
        System.out.println(nuevo);
        String temp="<td colspan=6 class=summary_timestamp>Current Conditions as of> 18:54 Monday, February 15, 2016</td>";
      int indice3=temp.indexOf("<td colspan=6 class=summary_timestamp>Current Conditions as of>");
      int indice4=temp.indexOf("Monday, February 15, 2016</td>");
      String segundo=temp.substring(indice3, indice4);
        System.out.println(segundo);
   */
   }      
}
