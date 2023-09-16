
package analizadorlexico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pruebas1 {
    public static void main (String[] arg){
        String texto = "el dia de hoy es sabado del 2023-09-09";
        String regex = "[a-z0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        while (matcher.find()){
            String match = matcher.group();
            System.out.println("La coincidencia es: "+match);
        }//cierra while
    }//cierramain 
    
}//cierra clase prueba
