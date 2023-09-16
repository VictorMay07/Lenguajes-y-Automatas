
package analizadorlexico;


 
public class PruebasT1 {
     public enum Mes {
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }

    public static void main(String[] args) {
        Mes mesActual = Mes.ABRIL;

        switch (mesActual) {
            case ENERO:
            case FEBRERO:
            case MARZO:
                System.out.println("Estamos en el primer trimestre.");
                break;
            case ABRIL:
            case MAYO:
            case JUNIO:
                System.out.println("Estamos en el segundo trimestre.");
                break;
            case JULIO:
            case AGOSTO:
            case SEPTIEMBRE:
                System.out.println("Estamos en el tercer trimestre.");
                break;
            case OCTUBRE:
            case NOVIEMBRE:
            case DICIEMBRE:
                System.out.println("Estamos en el cuarto trimestre.");
                break;
            default:
                System.out.println("Mes no válido.");
                break;
        }

        System.out.println("_______________________________");

        for (Mes mes : Mes.values()) {
            System.out.println(mes);
       }
    }
}

