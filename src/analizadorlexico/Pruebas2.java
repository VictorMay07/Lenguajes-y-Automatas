
package analizadorlexico;

import analizadorlexico.Token.Tipos;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pruebas2 {
    
      public static void main (String[] arg){
          
         String entrada = "11 + 22 - 33 a ";
         ArrayList<Token> tokens = lex(entrada);
         
         for (Token token : tokens){
             System.out.println(token.getTipo()+" : " + token.getValor());
         }
          
      }//cierra main 
    private static ArrayList<Token>lex(String entrada){
        final ArrayList<Token> tokens = new ArrayList();
        final StringTokenizer st = new StringTokenizer(entrada); 
        
        while (st.hasMoreTokens()){
            String palabra = st.nextToken();
            boolean banderas = false;
            
            for (Tipos tokenTipo: Tipos.values()){
                
                Pattern patron = Pattern.compile(tokenTipo.patron);
                Matcher busqueda = patron.matcher(palabra);
                
                if (busqueda.find()){
                    Token token = new Token();
                    token.setTipo(tokenTipo);
                    token.setValor(palabra);
                    tokens.add(token);
                    banderas = true;
                }//cierra if 
            }//cierra for 
            
            
            if (!banderas){
                throw new RuntimeException("Token inavalido");
                
            }
        }//cierra while
        
        return tokens; 
       
    }//cierra llave
    
}//cierra clase prueba
