/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;
import java.net.*;
import java.io.*;
/**
 *
 * @author T-101
 */
public class Consultas {
    public static String revision()throws Exception{
             URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);
        int renglones=0;
        while(reader.readLine()!=null){
        renglones ++;
       }
       String hola="<td width=class summary_data>21.2 C</td>"; 
       int indice1=hola.indexOf("summary_data");
       int indice2=hola.indexOf("</td>");
       String nuevo=hola.substring(indice1, indice2);
        System.out.println(nuevo);
        return nuevo;
    }
    public static String revisa()throws Exception{
          URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);
        int renglones=0;
        while(reader.readLine()!=null){
        renglones ++;
       }
        String temp="<td colspan=6 class=summary_timestampCurrent Conditions as of> 18:54 Monday, February 15, 2016</td>";
        int indice3=temp.indexOf("<td colspan=6 class=summary_timestampCurrent Conditions as of>");
        int indice4=temp.indexOf("Monday, February 15, 2016</td>");
        String segundo=temp.substring(indice3, indice4);
        System.out.println(segundo);
        return segundo;
    }
      
   } 
 

