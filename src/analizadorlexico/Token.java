package analizadorlexico;


public class Token {
    
    private String valor;
    private Tipos tipo;
   
    enum Tipos{
        Numero ("[0-9]+\\b"),
        Operador ("[*|/|+|-]"),
        Variable ("[w|x|y|z]"),
        Constante ("\\b(pi|e)"),
        Desconocido("");
        
        public final String patron;
        
        Tipos(String s){
            this.patron=s;
        }//cierre constructor tipos

    
    }//cierre enum

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Tipos getTipo() {
        return tipo;
    }
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
}

