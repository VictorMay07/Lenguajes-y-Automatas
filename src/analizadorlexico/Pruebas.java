package analizadorlexico;

public class Pruebas {
    public enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }//Cierra enum
    
    public static void main(String []args ){
        DiaSemana diaActual = DiaSemana.SABADO;
        
        if (diaActual == DiaSemana.SABADO || diaActual == DiaSemana.DOMINGO) {
            System.out.println("Fin de Semana");
        }else{
            System.out.println("Dia Laboral");
            
        }//cierra else 
        System.out.println("_______________________________");
        for(DiaSemana dia: DiaSemana.values()){
            System.out.println(dia);
        }//cierra for
        
    }//cierra metodo main 
}//cierra clase prueba 
